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


	public Item(ItemBuilder builder) {
		this.name = builder.name;
		this.ID = builder.ID;
		this.count = builder.count;
		this.price = builder.price;
		this.canPurchase = builder.canPurchase;
		this.canRent = builder.canRent;
		this.discounted = builder.discounted;
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

	public static abstract  class ItemBuilder {
		String name;
		int ID;
		int count;
		double price;
		boolean canPurchase;
		boolean canRent;
		boolean discounted;

		public ItemBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public ItemBuilder setID(int ID) {
			this.ID = ID;
			return this;
		}

		public ItemBuilder setCount(int count) {
			this.count = count;
			return this;
		}

		public ItemBuilder setPrice(double price) {
			this.price = price;
			return this;
		}

		public ItemBuilder setCanPurchase(boolean canPurchase) {
			this.canPurchase = canPurchase;
			return this;
		}

		public ItemBuilder setCanRent(boolean canRent) {
			this.canRent = canRent;
			return this;
		}

		public ItemBuilder setDiscounted(boolean discounted) {
			this.discounted = discounted;
			return this;
		}

		public abstract Item build();
		protected abstract ItemBuilder self();

	}

}
