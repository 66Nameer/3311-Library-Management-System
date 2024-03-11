package src.main.java;
public interface ItemFactory {
    public Item createItem(String type, ItemAttributes attributes);
}