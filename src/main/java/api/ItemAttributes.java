package api;

import java.util.HashMap;
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

    // Additional attributes as a map to accommodate various types
    private final Map<String, Object> additionalAttributes;

    ItemAttributes(ItemAttributesBuilder builder) {
        this.name = builder.name;
        this.ID = builder.ID;
        this.count = builder.count;
        this.price = builder.price;
        this.canPurchase = builder.canPurchase;
        this.canRent = builder.canRent;
        this.discounted = builder.discounted;
        this.additionalAttributes = builder.additionalAttributes;
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

    public static ItemAttributesBuilder builder() {
        return new ItemAttributesBuilder();
    }


        public static class ItemAttributesBuilder {
            private String name;
            private int ID;
            private int count;
            private double price;
            private boolean canPurchase;
            private boolean canRent;
            private boolean discounted;
            private Map<String, Object> additionalAttributes = new HashMap<>();

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

            public ItemAttributes build() {
                return new ItemAttributes(this);
            }
        }
}