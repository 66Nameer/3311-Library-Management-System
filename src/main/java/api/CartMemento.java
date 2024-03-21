package api;

import java.util.*;


public class CartMemento {

    private HashMap<Item, Integer> items;

    public CartMemento(HashMap<Item, Integer> items) {
        this.items = new HashMap<>(items.size());
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            this.items.put(entry.getKey(), entry.getValue());
        }
    }

    public HashMap<Item, Integer> getItems(){
        return this.items;
    }
}
