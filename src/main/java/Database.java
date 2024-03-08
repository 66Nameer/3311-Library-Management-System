package src.main.java;

public class Database {

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
}
