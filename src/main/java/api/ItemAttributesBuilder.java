package api;

import java.util.HashMap;
import java.util.Map;

public class ItemAttributesBuilder {
    String name;
    int ID;
    int count;
    double price;
    boolean canPurchase;
    boolean canRent;
    boolean discounted;
    String ISBN;
    Map<String, Object> additionalAttributes = new HashMap<>();
    ItemType type;

    public ItemAttributesBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ItemAttributesBuilder setID(int ID) {
        this.ID = ID;
        return this;
    }

    public ItemAttributesBuilder setCount(int count) {
        this.count = count;
        return this;
    }

    public ItemAttributesBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ItemAttributesBuilder setCanPurchase(boolean canPurchase) {
        this.canPurchase = canPurchase;
        return this;
    }

    public ItemAttributesBuilder setCanRent(boolean canRent) {
        this.canRent = canRent;
        return this;
    }

    public ItemAttributesBuilder setDiscounted(boolean discounted) {
        this.discounted = discounted;
        return this;
    }

    public ItemAttributesBuilder setAdditionalAttributes(Map<String, Object> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }

    public ItemAttributesBuilder addAdditionalAttribute(String key, Object value) {
        this.additionalAttributes.put(key, value);
        return this;
    }

    public ItemAttributesBuilder setISBN(String isbn) {
        this.ISBN = isbn;
        return this;
    }

    public ItemAttributesBuilder setType(ItemType type) {
        this.type = type;
        return this;
    }

    public ItemAttributesBuilder self() {
        return this;
    }

    public ItemAttributes build() {
        return new ItemAttributes(this);
    }
}