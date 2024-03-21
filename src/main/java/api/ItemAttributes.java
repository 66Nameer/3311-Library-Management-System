package api;

import java.nio.ByteBuffer;
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
    public ItemAttributes(String name, int ID, int count, double price, boolean canPurchase, boolean canRent,
                          boolean discounted, Map<String, Object> additionalAttributes) {
        this.name = name;
        this.ID = ID;
        this.count = count;
        this.price = price;
        this.canPurchase = canPurchase;
        this.canRent = canRent;
        this.discounted = discounted;
        this.additionalAttributes = additionalAttributes;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.ID;
    }

    public int getCount() {
        return this.count;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isCanPurchase() {
        return this.canPurchase;
    }

    public boolean isCanRent() {
        return this.canRent;
    }

    public boolean isDiscounted() {
        return this.discounted;
    }

    public Map getAdditionalAttributes() {
        return this.additionalAttributes;
    }
}