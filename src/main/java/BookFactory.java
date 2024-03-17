package src.main.java;


public class BookFactory implements BaseItemFactory{

    @Override
    public Item createItem(ItemAttributes attributes) {
       
        return new Book(attributes);
    }
    
}
