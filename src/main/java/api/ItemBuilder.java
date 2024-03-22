package api;

public class ItemBuilder {
     String name;
     int ID;
     int count;
     double price;
     boolean canPurchase;
     boolean canRent;
     boolean discounted;

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


}
