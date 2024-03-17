package src.main.java;

public class CdFactory implements BaseItemFactory{

    @Override
    public Item createItem(ItemAttributes attributes) {
        
        return new CD(attributes);
    }
    
}
