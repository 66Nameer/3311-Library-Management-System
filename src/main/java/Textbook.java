package src.main.java;
import java.util.ArrayList;

public class Textbook extends PhysicalItem {
	
	public int edition;
	public ArrayList<String> authors;
	
	// default constructor
	public Textbook() {
	
		this(null);
	}
	
	
	public Textbook(ItemAttributes attributes) {
		this.name = attributes.name;
		this.ID = attributes.ID;
		this.price = attributes.price;
		this.canPurchase = attributes.canPurchase;
		this.canRent = attributes.canRent;
		this.discounted = attributes.discounted;
		this.location = (String) attributes.additionalAttributes.get("location");
	}
	

}
