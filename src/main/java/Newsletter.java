package src.main.java;

public class Newsletter extends VirtualItem {
	
	public String publisher;
	

	// default constructor
	public Newsletter() {
		this(null);
	}
	
	
	public Newsletter (ItemAttributes attributes) {
		this.name = attributes.name;
		this.ID = attributes.ID;
		this.price = attributes.price;
		this.canPurchase = attributes.canPurchase;
		this.canRent = attributes.canRent;
		this.discounted = attributes.discounted;
		this.publisher = (String) attributes.additionalAttributes.get("publisher");
	}
	
	

}
