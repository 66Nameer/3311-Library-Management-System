package src.main.java;

public class ConcreteItemFactory implements ItemFactory {
    public Item createItem(String type, ItemAttributes attributes) {
        switch (type) {
            case "Textbook":
                return new Textbook(attributes);
            case "Book":
                return new Book(attributes);
            case "Magazine":
                return new Magazine(attributes);
            case "CD":
                return new CD(attributes);
            case "eBook":
                return new eBook(attributes);
            case "Newsletter":
                return new Newsletter(attributes);
            default:
                throw new IllegalArgumentException("Item type unknown: " + type);
        }
    }
}