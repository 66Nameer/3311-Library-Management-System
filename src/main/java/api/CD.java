package api;

import java.util.ArrayList;

public class CD extends PhysicalItem {
	
	public String artist;
	public ArrayList<String> songs;
	
	
	// default constructor
	public CD() {
		this(null);
	}
	
	public CD(ItemAttributes attributes) {
		this.name = attributes.name;
		this.ID = attributes.ID;
		this.count = attributes.count;
		this.price = attributes.price;
		this.canPurchase = attributes.canPurchase;
		this.canRent = attributes.canRent;
		this.discounted = attributes.discounted;
		this.location = (String) attributes.additionalAttributes.get("location");
		this.artist = (String) attributes.additionalAttributes.get("artist");
		this.songs =  (ArrayList<String>) attributes.additionalAttributes.get("songs");
	}
	

}
