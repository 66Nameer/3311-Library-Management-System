package api;

import java.util.Objects;

public abstract class Item {
	
	public String name;
	public int ID;
	public int count;
	public double price;
	public boolean canPurchase;
	public boolean canRent;
	public boolean discounted;

	public ItemType type;

	public String ISBN;


	public Item(ItemAttributes builder) {
		this.name = builder.getName();
		this.ID = builder.getID();
		this.count = builder.getCount();
		this.price = builder.getPrice();
		this.canPurchase = builder.isCanPurchase();
		this.canRent = builder.isCanRent();
		this.discounted = builder.isDiscounted();
		this.type = builder.getType();
		this.ISBN = builder.getISBN();
	}
	
	
	public String getISBN() {
		return this.ISBN;
	}




	// Equals and hashCode methods to correctly display the number of items in the cart
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return ID == item.ID; // or ISBN if that's your unique identifier
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID); // or ISBN
	}



}
