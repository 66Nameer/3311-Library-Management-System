package api;

import java.time.LocalDate;

public class Magazine extends PhysicalItem {
	
	public String publisher;
	public LocalDate dateissued;
	
	
	// default constructor
	public Magazine() {
		this(null);
	}
	
	
	public Magazine(ItemAttributes attributes) {
		this.name = attributes.name;
		this.ID = attributes.ID;
		this.price = attributes.price;
		this.canPurchase = attributes.canPurchase;
		this.canRent = attributes.canRent;
		this.discounted = attributes.discounted;
		this.location = (String) attributes.additionalAttributes.get("location");
		this.publisher = (String) attributes.additionalAttributes.get("publisher");
		this.dateissued = (LocalDate) attributes.additionalAttributes.get("dateissued");
	}
	
	

}
