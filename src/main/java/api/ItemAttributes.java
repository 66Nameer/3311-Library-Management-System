package api;

import java.util.Map;

public class ItemAttributes {
    // Common fields
    private final String name;
    private final int ID;
    private final int count;
    private final double price;
    private final boolean canPurchase;
    private final boolean canRent;
    private final boolean discounted;

    private final String ISBN;
    private final ItemType type;

    // Additional attributes as a map to accommodate various types
    private final Map<String, Object> additionalAttributes;

    public ItemAttributes(ItemAttributesBuilder builder) {
        this.name = builder.name;
        this.ID = builder.ID;
        this.count = builder.count;
        this.price = builder.price;
        this.canPurchase = builder.canPurchase;
        this.canRent = builder.canRent;
        this.discounted = builder.discounted;
        this.additionalAttributes = builder.additionalAttributes;
        this.type = builder.type;
        this.ISBN = builder.ISBN;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public boolean isCanPurchase() {
        return canPurchase;
    }

    public boolean isCanRent() {
        return canRent;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    public Map<String, Object> getAdditionalAttributes() {
        return additionalAttributes;
    }

    public ItemType getType()  {
        return this.type;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public static ItemAttributesBuilder builder() {
        return new ItemAttributesBuilder();
    }
}