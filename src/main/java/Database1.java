package src.main.java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public final class Database1 {

    private static Database1 INSTANCE;

    private final static String userData = "";
    private final String itemData = "";
    private final String rentalData = "";

    private Database1() {}

    public static Database1 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Database1();
        }
        return INSTANCE;
    }

    
    
    // rentalData CSV format
    // userID,itemID,dueDate ???
    
    public ArrayList<Rental> fetchRentals(String userID) {
    	
    	ArrayList<Rental> userRentals = new ArrayList<Rental>();
    	
    	try {
    		CSVReader reader = new CSVReader(new FileReader(rentalData));
    		
    		String[] nextLine;
    		
    		while ((nextLine = reader.readNext()) != null) {
    			if (nextLine[0].equals(userID)) {
    				
    				//userRentals.add(new Rental(userID, nextLine[1], nextLine[2]));		How are we returning a rental? Do we generate a new User and PhysicalItem everytime we fetch rental info from the DB?
    				
    			}
    		}

    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
        return userRentals;
    }
    
    
    
    public void pushRental(User user, Rental rental) {
    	
    	// Whenever a User rents an item, this Rental must be added to the DB
    	
    }
    
    

    public Item fetchItem(int itemID) {
        return null;
    }
    
    

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
        			
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}

    }

    
    public void prioritizeRequests() {


    }


    // Authentication for the GUI

    public static boolean authenticateUser(String email, String password) {
        /*try (
                // Use the class loader to get the CSV file as an InputStream
                InputStream inputStream = Database1.class.getResourceAsStream("/users.csv");
                // InputStreamReader to read from the InputStream
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                // OpenCSV CSVReader to read the CSV data
                CSVReader reader = new CSVReader(inputStreamReader)
        ) {
            List<String[]> allUsers = reader.readAll();
            for (String[] user : allUsers) {
                if (user[0].equalsIgnoreCase(email) && user[1].equals(password)) {
                    return true; // Authentication successful
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Authentication failed */
        
        
        
        // userData CSV format
        // userID (email),password ???
        // Going to have to include type of User in the file so that the object can be recreated when necessary
        
        try {
        	
        	CSVReader reader = new CSVReader(new FileReader(userData));
        	String[] nextLine;
        	
        	while((nextLine = reader.readNext()) != null) {								// reader.hasNext() ??
        		if (nextLine[0].equals(email) && nextLine[1].equals(password)) {
        			return true;
        		}
        	}
        	return false;
        	
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        
        
        
    }


}
