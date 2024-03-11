package src.main.java;
public interface ItemFactory {
    public Item createItem(String type, String name, int ID, double price, boolean canPurchase, boolean canRent, boolean discounted);
}