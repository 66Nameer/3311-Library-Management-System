package api;

public class ItemFactory {

    public Item getItem(ItemType type, ItemAttributes attributes) {
        return switch (type) {
            case TEXTBOOK -> new Textbook(attributes);
            case BOOK -> new Book(attributes);
            case MAGAZINE -> new Magazine(attributes);
            case CD -> new CD(attributes);
            case EBOOK -> new eBook(attributes);
            case NEWSLETTER -> new Newsletter(attributes);
        };
    }
}