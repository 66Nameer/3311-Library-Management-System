package src.main.java;

public class NewsletterFactory implements BaseItemFactory{

    @Override
    public Item createItem(ItemAttributes attributes) {
       
        return new Newsletter(attributes);
    }
    
    
}
