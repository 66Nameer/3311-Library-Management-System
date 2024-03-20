package api;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Database {

	private static Database INSTANCE;

	private final static String userData = "src/main/java/DatabaseFiles/Users.csv";
	private final static String itemData = "src/main/java/DatabaseFiles/Items.csv";
	private final static String rentalData = "src/main/java/DatabaseFiles/Rentals.csv";

	private Database() {}

	public static Database getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Database();
		}
		return INSTANCE;
	}

	// rentalData CSV format
	// userID,itemID,dueDate ???

	public ArrayList<Rental> fetchRentals(String userID) {
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


	// I don't think we need user as a method param since rental has the associated data already

	public void pushRental(Rental rental) {
		String ID = String.valueOf(rental.getItem().ID);
		try {
			CSVReader reader = new CSVReader(new FileReader(rentalData));
			List<String[]> file = reader.readAll();
			String[] newEntry = new String[]{
					rental.getUser().getEmail(), ID, rental.getDueDate().toString()
			};
			file.add(newEntry);
			CSVWriter writer = new CSVWriter(new FileWriter(rentalData));
			writer.writeAll(file);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// TODO: Might need to add a "count" field to item
	public void pushItem(PhysicalItem item) {
	}


	public boolean pushUser(User user) {
		// Writing to the Users.csv file
		try (Writer writer = new FileWriter("src/main/java/DatabaseFiles/Users.csv", true)) {
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
			return true;
		}
		catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}


	public Item fetchItem(int itemID) {
		return null;
	}



	// TODO: In order to instantiate users we need to have something in the database that distinguishes them, for example if the user is a student then write something in the db associated with that
	public User fetchUser(String userID) {
		return null;
	}




	// itemData CSV format
	// itemID,stock	???

	// itemID of item whose stock needs to be updated
	// amount by which the stock needs to be updated (if rented then -1, if returned then +1)
	public void updateStock(int itemID, int amount) {
		String ID = String.valueOf(itemID);
		try {
			CSVReader reader = new CSVReader(new FileReader(itemData));
			List<String[]> file = reader.readAll();
			for (String[] line: file) {									// Find line in itemData file with "itemID"
				if (line[0].equals(ID)) {								// When found, update the stock value by adding "amount"
					int newStock = Integer.parseInt(line[1]);
					newStock = newStock + amount;
					line[1] = String.valueOf(newStock);
					break;
				}
			}
			CSVWriter writer = new CSVWriter(new FileWriter(itemData));				// Write contents of itemData back into it with updated stock value included
			writer.writeAll(file);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void prioritizeRequests() {


	}


	// Authentication for the GUI

	public static boolean authenticateUser(String email, String password) {

		// userData CSV format
		// userID (email),password ???
		// Going to have to include type of api.User in the file so that the object can be recreated when necessary

		try {
			CSVReader reader = new CSVReader(new FileReader(userData));
			String[] nextLine;

			while((nextLine = reader.readNext()) != null) {								// reader.hasNext() ??
				if (email.equalsIgnoreCase(nextLine[0]) && password.equals(nextLine[1])) {
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
}