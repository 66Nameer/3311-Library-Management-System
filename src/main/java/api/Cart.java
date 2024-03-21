package api;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class Cart extends JPanel {
	
private HashMap<Item, Integer> items;

	public Cart() {
		items = new HashMap<>();
	}

	public void addItem(Item item, int quantity) {
		// Check if the item already exists in the cart
		if (items.containsKey(item)) {
			// If it does, increase the quantity
			int currentQuantity = items.get(item);
			items.put(item, currentQuantity + quantity);
		} else {
			// If it doesn't, add it to the cart with the given quantity
			items.put(item, quantity);
		}
	}
	
	public void removeItem(int itemId, int quantity) {
		
		
		
	}
	
	public int getItemQuantity(int itemId) {
		
		return 0;
	}
	
	public void displayCart() {
		StringBuilder cartContents = new StringBuilder();
		for(Map.Entry<Item, Integer> entry : items.entrySet()) {
			cartContents.append(entry.getKey().name)
					.append(" - Quantity: ")
					.append(entry.getValue())
					.append("\n");
		}

		if(cartContents.length() == 0) {
			cartContents.append("Your cart is empty.");
		}

		System.out.println(cartContents);

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
