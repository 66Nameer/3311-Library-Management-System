package src.main.java;

public class TextbookFactory implements BaseItemFactory{

    @Override
    public Item createItem(ItemAttributes attributes) {
        
        return new Textbook(attributes); 
    }
    
}