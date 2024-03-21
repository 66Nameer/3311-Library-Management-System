package api;

public class Book extends PhysicalItem {
	// public int field;	Not sure what this was supposed to be
	
	// default constructor
	public Book() {
		this(null);
	}
	
	public Book(ItemAttributes attributes) {
		this.name = attributes.getName();
		this.ID = attributes.getID();
		this.count = attributes.getCount();
		this.price = attributes.getPrice();
		this.canPurchase = attributes.isCanPurchase();
		this.canRent = attributes.isCanRent();
		this.discounted = attributes.isDiscounted();
		this.location = (String) attributes.getAdditionalAttributes().get("location");
		this.ISBN = (String) attributes.getAdditionalAttributes().get("ISBN");
	}

}
