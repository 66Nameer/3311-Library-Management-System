package api;

import java.util.ArrayList;

public class Textbook extends PhysicalItem {
	
	public int edition;
	public ArrayList<String> authors;
	
	// default constructor
	public Textbook() {
		this(null);
	}
	
	
	public Textbook(ItemAttributes attributes) {
		this.name = attributes.getName();
		this.ID = attributes.getID();
		this.count = attributes.getCount();
		this.price = attributes.getPrice();
		this.canPurchase = attributes.isCanPurchase();
		this.canRent = attributes.isCanRent();
		this.discounted = attributes.isDiscounted();
		this.location = (String) attributes.getAdditionalAttributes().get("location");
	}
	

}
