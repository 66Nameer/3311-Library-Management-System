package api;

public class ItemFactory {

    public static Item getItem(ItemType type, ItemAttributes attributes) {
        switch (type) {
            case TEXTBOOK:
                return new Textbook(attributes);
            case BOOK:
                return new Book(attributes);
            case MAGAZINE:
                return new Magazine(attributes);
            case CD:
                return new CD(attributes);
            case EBOOK:
                return new eBook(attributes);
            case NEWSLETTER:
                return new Newsletter(attributes);
            default:
                throw new IllegalArgumentException("Unknown item type: " + type);
        }
    }
}
