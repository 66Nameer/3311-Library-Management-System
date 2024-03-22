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
     Map<String, Object> additionalAttributes = new HashMap<>();

    public void setName(String name) {
        this.name = name;

    }

    public void setID(int ID) {
        this.ID = ID;

    }

    public void setCount(int count) {
        this.count = count;

    }

    public void setPrice(double price) {
        this.price = price;

    }

    public void setCanPurchase(boolean canPurchase) {
        this.canPurchase = canPurchase;

    }

    public void setCanRent(boolean canRent) {
        this.canRent = canRent;

    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;

    }

    public void setAdditionalAttributes(Map<String, Object> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;

    }

    public void addAdditionalAttribute(String key, Object value) {
        this.additionalAttributes.put(key, value);

    }
}


