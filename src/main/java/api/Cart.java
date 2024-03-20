package api;

import java.util.HashMap;


public class Cart {
	
private HashMap<Item, Integer> items;

	public void addItem(int itemId, int quantity) {
	
	
}
	
	public void removeItem(int itemId, int quantity) {
		
		
		
	}
	
	public int getItemQuantity(int itemId) {
		
		return 0;
	}
	
	public void displayCart() {
		
		
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
