package api;

public class Newsletter extends VirtualItem {
	
	public String publisher;
	

	// default constructor
	public Newsletter() {
		this(null);
	}
	
	
	public Newsletter (ItemAttributes attributes) {
		this.name = attributes.getName();
		this.ID = attributes.getID();
		this.price = attributes.getPrice();
		this.canPurchase = attributes.isCanPurchase();
		this.canRent = attributes.isCanRent();
		this.discounted = attributes.isDiscounted();
		this.publisher = (String) attributes.getAdditionalAttributes().get("publisher");
	}
	
	

}
