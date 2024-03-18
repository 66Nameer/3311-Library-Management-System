package src.main.java;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public final class Database {

    private static Database INSTANCE;

    private final String userData = "";
    private final String itemData = "";
    private final String rentalData = "";

    private Database() {}

    public static Database getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Database();
        }
        return INSTANCE;
    }

    public ArrayList<Rental> fetchRentals(String userID) {
        return new ArrayList<>();
    }

    public Item fetchItem(int itemID) {
        return null;
    }

    public User fetchUser(String userID) {
        return null;
    }

    public void updateStock() {


    }

    public void prioritizeRequests() {


    }


    // Authentication for the GUI

    public static boolean authenticateUser(String email, String password) {
        try (
                // Use the class loader to get the CSV file as an InputStream
                InputStream inputStream = Database.class.getResourceAsStream("/users.csv");
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
        return false; // Authentication failed
    }


}
