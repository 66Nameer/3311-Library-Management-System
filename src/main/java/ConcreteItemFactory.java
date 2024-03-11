package src.main.java;

public class ConcreteItemFactory implements ItemFactory {
    public Item createItem(String type, String name, int ID, double price, boolean canPurchase, boolean canRent, boolean discounted) {
        switch (type) {
            case "Textbook":
                return new Textbook(name, ID, price, canPurchase, canRent, discounted);
            case "Book":
                return new Book(name, ID, price, canPurchase, canRent, discounted);
            case "Magazine":
                return new Magazine(name, ID, price, canPurchase, canRent, discounted);
            case "CD":
                return new CD(name, ID, price, canPurchase, canRent, discounted);
            case "eBook":
                return new EBook(name, ID, price, canPurchase, canRent, discounted);
            case "Newsletter":
                return new Newsletter(name, ID, price, canPurchase, canRent, discounted);
            default:
                throw new IllegalArgumentException("Item type unknown: " + type);
        }
    }
}