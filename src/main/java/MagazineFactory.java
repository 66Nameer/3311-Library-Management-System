package src.main.java;

public class MagazineFactory implements BaseItemFactory{

    @Override
    public Item createItem(ItemAttributes attributes) {
       
        return new Magazine(attributes);
    }
    
}
