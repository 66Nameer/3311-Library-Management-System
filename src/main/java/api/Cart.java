package api;

import java.util.*;


public class Cart {
	
private HashMap<Item, Integer> items;

	
	public void addItem(int itemId, int quantity) {
		Database db =Database.getInstance();
		Item item =db.fetchItem(itemId);
		if (item != null) {
			items.put(item, quantity);
			db.updateStock(itemId, item.count-quantity);
		} else {
			System.out.println("Item with ID " + itemId + " not found.");
		}
	}
	
	public void removeItem(int itemId, int quantity) {
		Database db = Database.getInstance();
		Item item = db.fetchItem(itemId);
		if (item != null && items.containsKey(item)) {
			int currentQuantity = items.get(item);
			if (quantity >= currentQuantity) {
				items.remove(item);
			} else {
				items.put(item, currentQuantity - quantity);
			}
		} else {
			System.out.println("Item with ID " + itemId + " not found in the cart.");
		}
	}
	
	public int getItemQuantity(int itemId) {
		Database db = Database.getInstance();
		Item item = db.fetchItem(itemId);
		if (item != null && items.containsKey(item)) {
			return items.get(item);
		}
		return 0;

	}
	
	public void displayCart() {
		if (items.isEmpty()) {
			System.out.println("The cart is empty.");
			return;
		}

		System.out.println("Cart Contents:");
		for (Map.Entry<Item, Integer> entry : items.entrySet()) {
			Item item = entry.getKey();
			Integer quantity = entry.getValue();
			System.out.println("Item ID: " + item.ID + ", Name: " + item.name + ", Quantity: " + quantity);
		}
		
	}



//Memento design pattern method implementation
	     public CartMemento save(){
        		return new CartMemento(this.items);
   	  }

	public void undo(CartMemento memento){
        	this.items=memento.getItems();
	}

	public HashMap<Item, Integer> getItems() {
		return this.items;
    }
}
