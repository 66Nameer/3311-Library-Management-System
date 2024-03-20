package api;

public class Book extends PhysicalItem {
	// public int field;	Not sure what this was supposed to be
	
	// default constructor
	public Book() {
		this(null);
	}
	
	public Book(ItemAttributes attributes) {
		this.name = attributes.name;
		this.ID = attributes.ID;
		this.count = attributes.count;
		this.price = attributes.price;
		this.canPurchase = attributes.canPurchase;
		this.canRent = attributes.canRent;
		this.discounted = attributes.discounted;
		this.location = (String) attributes.additionalAttributes.get("location");
		this.ISBN = (String) attributes.additionalAttributes.get("ISBN");
	}
	

}
