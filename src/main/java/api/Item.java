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
