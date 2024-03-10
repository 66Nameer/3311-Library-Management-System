package src.main.java;
import java.util.*;


public class CartMemento {

    private HashMap<Item, Integer> items;

    public CartMemento(HashMap<Item, Integer> items) {
        this.items = new HashMap<Item, Integer>(items);
    }

    public HashMap<Item, Integer> getItems(){
        return items;
    }
}
