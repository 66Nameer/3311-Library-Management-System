package api;

import java.util.Map;

public class ItemAttributes {
    // Common fields
    String name;
    int ID;
    int count;
    double price;
    boolean canPurchase;
    boolean canRent;
    boolean discounted;
    
    // Additional attributes as a map to accommodate various types
    Map<String, Object> additionalAttributes;

    // Constructor for CommonItemAttributes
    public ItemAttributes(String name, int ID, int count, double price, boolean canPurchase, boolean canRent, boolean discounted, Map<String, Object> additionalAttributes) {
        this.name = name;
        this.ID = ID;
        this.count = count;
        this.price = price;
        this.canPurchase = canPurchase;
        this.canRent = canRent;
        this.discounted = discounted;
        this.additionalAttributes = additionalAttributes;
    }
}