package api;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Does this work now??

public final class Database {

	private static Database INSTANCE;

	private final static String userData = "src/main/java/DatabaseFiles/Users.csv";
	private final static String itemData = "src/main/java/DatabaseFiles/Items.csv";
	private final static String rentalData = "src/main/java/DatabaseFiles/Rentals.csv";
	private final static String userCart = "src/main/java/DatabaseFiles/userCart.csv";

	public Database() {}

	public static Database getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Database();
		}
		return INSTANCE;
	}


	public ArrayList<Rental> fetchRentals(String userID) throws Exception {
		ArrayList<Rental> userRentals = new ArrayList<>();				// List of User's Rentals to be returned after searching Rentals DB
		int itemID;
		User userTemp = fetchUser(userID);
		// fetch each rental associated with the userID
		try {
			CSVReader reader = new CSVReader(new FileReader(rentalData));
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				if (nextLine[0].equals(userID)) {							// if userID found in a rental entry, take the associated itemID and fetchItem() so the Item object can be instantiated and used to create Rental object
					itemID = Integer.parseInt(nextLine[1]);
					Item itemTemp = fetchItem(itemID);
					LocalDate date = LocalDate.parse(nextLine[2]);
					Rental rentalTemp = new Rental(userTemp, (PhysicalItem)itemTemp, date);
					userRentals.add(rentalTemp);
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return userRentals;
	}


	public void pushRental(Rental rental) {
		try {
			String[] newEntry = new String[]{rental.getUser().getEmail(), String.valueOf(rental.getItem().getID()), rental.getDueDate().toString()};
			CSVWriter writer = new CSVWriter(new FileWriter(rentalData, true),
					CSVWriter.DEFAULT_SEPARATOR,
					CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END);
			writer.writeNext(newEntry);
			writer.flush();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void pushItem(PhysicalItem item) {
		try {
			CSVWriter writer = new CSVWriter(new FileWriter(itemData, true),
					CSVWriter.DEFAULT_SEPARATOR,
					CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END);
			String[] newItem = {String.valueOf(item.getID()), item.name, String.valueOf(item.price), item.getISBN(), String.valueOf(item.type), "20"};			// TODO: Need to get ItemType, not currently stored with the PhysicalItem. Use ItemAttributes to implement this if possible, not really sure what it does tbh
			writer.writeNext(newItem);
			writer.flush();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


	public boolean pushUser(User user) {
		// Writing to the Users.csv file


		if (Database.authenticateUser(user.getEmail(), user.getPassword())) {			// Need to ensure User doesn't already exist in the DB
			return false;
		}

		try (Writer writer = new FileWriter(userData, true)) {
			// Create an instance of CSVWriter with specific settings
			//Default Separator: Comma column separator
			// No Quote Character: Will remove quote characters
			// Default Escape Character: If there is a special character that needs to be escaped within an entry
			// Default Line End: Systems default line separator to end lines
			CSVWriter csvWriter = new CSVWriter(writer,
					CSVWriter.DEFAULT_SEPARATOR,
					CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END);
			// Creates an array of String which holds the user's email, password, and type
			String[] record = { user.getEmail(), user.getPassword(), user.getUserType().toString() };
			// Write the record to the CSV file
			csvWriter.writeNext(record);
			csvWriter.flush();
			return true;
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}


	// Item format: ID,name,price,ISBN,type,stock

	public Item fetchItem(int itemID) {
		try {
			CSVReader reader = new CSVReader(new FileReader(itemData));
			String[] nextLine;
			String id = String.valueOf(itemID);
			while ((nextLine = reader.readNext()) != null) {
				if (id.equals(nextLine[0])) {
					String itemName = nextLine[1].trim();
					double price = Double.parseDouble(nextLine[2].trim());
					String isbn = nextLine[3].trim();
					ItemType type = ItemType.valueOf(nextLine[4].trim());
					int count = Integer.parseInt(nextLine[5].trim());
					ItemAttributes attributes = ItemAttributes.builder()
							.setID(itemID)
							.setName(itemName)
							.setPrice(price)
							.setISBN(isbn)
							.setCount(count)
							.setType(type)
							.build();
					ItemFactory fact = new ItemFactory();
					return fact.getItem(attributes);
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return null;        // Item not found in DB
	}


	public User fetchUser(String email) throws Exception {
		try (CSVReader reader = new CSVReader(new FileReader(userData))) {
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				if (email.equalsIgnoreCase(nextLine[0])) {
					String password = nextLine[1];
					UserType userType = UserType.valueOf(nextLine[2]); // This is where the error might occur
					SimpleUserFactory fact = new SimpleUserFactory();
					return fact.createUser(email, password, userType);
				}
			}
			//System.out.println("No user found with email: " + email);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid user type in CSV: " + e.getMessage());
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Error reading from CSV file: " + e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}

		throw new Exception("User not found");
	}


	// itemData CSV format
	// itemID,ItemName,Price,ISBN,ItemType,Stock

	// itemID of item whose stock needs to be updated
	// amount by which the stock needs to be updated (if rented then -1, if returned then +1)
	public void updateStock(int itemID, int amount) throws Exception {
		
		boolean success = true;
		
		String ID = String.valueOf(itemID);
		try {
			CSVReader reader = new CSVReader(new FileReader(itemData));
			List<String[]> file = reader.readAll();

			for (String[] line: file) {									// Find line in itemData file with "itemID"
				if (line[0].trim().equalsIgnoreCase(ID.trim())) {								// When found, update the stock value by adding "amount"
					int newStock = Integer.parseInt(line[5]);
					System.out.println("Current stock: " + newStock);
					System.out.println("amount: " + amount);
					newStock = newStock + amount;
					if (newStock < 0) {
						success = false;
						break;
					}
					line[5] = String.valueOf(newStock);
					break;
				}
			}
			
			CSVWriter writer = new CSVWriter(new FileWriter(itemData),
					CSVWriter.DEFAULT_SEPARATOR,
					CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END);				// Write contents of itemData back into it with updated stock value included
			writer.writeAll(file);
			writer.flush();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}

		if (!success) {
			if (amount < 0) {
				throw new Exception("Stock cannot go below 0.");
			} else {
				throw new Exception("Item not in stock!");
			}
		}
		
	}


	public void prioritizeRequests() {}


	// Authentication for the GUI

	public static boolean authenticateUser(String email, String password) {
		// userData CSV format
		// userID (email),password
		// Going to have to include type of api.User in the file so that the object can be recreated when necessary
		try {
			CSVReader reader = new CSVReader(new FileReader(userData));
			String[] nextLine;

			while((nextLine = reader.readNext()) != null) {
				if (email.equals(nextLine[0]) && password.equals(nextLine[1])) {
					reader.close();
					return true;
				}
			}
			reader.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}


	public boolean saveUserCart(User user, Cart cart) {
		String userEmail = user.getEmail();
		Item lastAddedItem = cart.getLastAdded();

		// If the user did not add anything to their Cart
		if (lastAddedItem == null) {
			return false;
		}

		List<String[]> allCarts = new ArrayList<>();
		String[] cartEntry = new String[] {userEmail, lastAddedItem.name, "1"};

		// Read the existing cart from the userCart csv file
		try (CSVReader reader = new CSVReader(new FileReader(userCart))) {
			allCarts = reader.readAll();
		} catch (IOException | CsvException e) {
			e.printStackTrace();
			return false;
		}

		// We will only write the last item that the user added to their cart
		// With this, we will not be updating the existing cart, rather just keep adding
		// items to a new line everytime the user adds something to their cart
		// To fix the issue of duplicating items(when the user goes through the checkout and adds items again)
		// we can just delete the items associating to the userEmail once the user has paid
		// This will reset their entire cart and start from a fresh cart
		try (CSVWriter writer = new CSVWriter(new FileWriter(userCart, true),
				CSVWriter.DEFAULT_SEPARATOR,
				CSVWriter.NO_QUOTE_CHARACTER,
				CSVWriter.DEFAULT_ESCAPE_CHARACTER,
				CSVWriter.DEFAULT_LINE_END)) {
			writer.writeNext(cartEntry);
			writer.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void removeUser(User user) throws Exception {

		boolean success = false;

		try {
			CSVReader reader = new CSVReader(new FileReader(userData));
			List<String[]> file = reader.readAll();
			String uid = user.getEmail();
			String pass = user.getPassword();
			String type = user.getUserType().toString();					// Have to test this to see if toString matches format of stored type

			for (String[] line: file) {
				if (line[0].equals(uid) && line[1].equals(pass) && line[2].equals(type)) {
					file.remove(line);
					success = true;
					break;
				}
			}
			CSVWriter writer = new CSVWriter(new FileWriter(userData),
					CSVWriter.DEFAULT_SEPARATOR,
					CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END);
			writer.writeAll(file);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (!success) {
			throw new Exception("User not found!");
		}

	}


	public void removeRental(Rental rental) throws Exception {

		boolean success = false;

		try {
			CSVReader reader = new CSVReader(new FileReader(rentalData));
			List<String[]> file = reader.readAll();

			String uid = rental.getUser().getEmail();
			String iid = String.valueOf(rental.getItem().getID());
			String date = rental.getDueDate().toString();

			for (String[] line: file) {
				if (line[0].equals(uid) && line[1].equals(iid) && line[2].equals(date)) {
					file.remove(line);
					success = true;
					break;
				}
			}
			CSVWriter writer = new CSVWriter(new FileWriter(userData),
					CSVWriter.DEFAULT_SEPARATOR,
					CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END);
			writer.writeAll(file);

			this.updateStock(rental.getItem().getID(), 1);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (!success) {
			throw new Exception("Rental not found!");
		}
	}

}
