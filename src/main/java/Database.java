package src.main.java;

import java.util.ArrayList;

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
}
