package src.main.java;

public class Newsletter extends VirtualItem {
	
	public String publisher;
	

	// default constructor
	public Newsletter() {
		this("", 0, 0.00, false, false, false, "");
	}
	
	
	public Newsletter (String name, int ID, double price, boolean canPurchase, boolean canRent, boolean discounted, String publisher) {
		this.name = name;
		this.ID = ID;
		this.price = price;
		this.canPurchase = canPurchase;
		this.canRent = canRent;
		this.discounted = discounted;
		this.publisher = publisher;
	}
	
	

}
