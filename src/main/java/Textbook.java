package src.main.java;
import java.util.ArrayList;

public class Textbook extends PhysicalItem {
	
	public int edition;
	public ArrayList<String> authors;
	
	// default constructor
	public Textbook() {
		this("", 0, 0.00, false, false, false, "");
	}
	
	
	public Textbook(String name, int ID, double price, boolean canPurchase, boolean canRent, boolean discounted, String location) {
		this.name = name;
		this.ID = ID;
		this.price = price;
		this.canPurchase = canPurchase;
		this.canRent = canRent;
		this.discounted = discounted;
		this.location = location;
	}
	

}
