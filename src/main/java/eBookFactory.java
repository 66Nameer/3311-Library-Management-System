package src.main.java;

public class eBookFactory implements BaseItemFactory{

    @Override
    public Item createItem(ItemAttributes attributes) {
        
        return new eBook(attributes);
    }
    
}
