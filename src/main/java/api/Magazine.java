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
		this.name = attributes.getName();
		this.ID = attributes.getID();
		this.count = attributes.getCount();
		this.price = attributes.getPrice();
		this.canPurchase = attributes.isCanPurchase();
		this.canRent = attributes.isCanRent();
		this.discounted = attributes.isDiscounted();
		this.location = (String) attributes.getAdditionalAttributes().get("location");
		this.publisher = (String) attributes.getAdditionalAttributes().get("publisher");
		this.dateissued = (LocalDate) attributes.getAdditionalAttributes().get("dateissued");
	}
	
	

}
