package src.main.java;
import java.time.LocalDate;

public class Magazine extends PhysicalItem {
	
	public String publisher;
	public LocalDate dateissued;
	
	
	// default constructor
	public Magazine() {
		this("", 0, 0.00, false, false, false, "", "", null);
	}
	
	
	public Magazine(String name, int ID, double price, boolean canPurchase, boolean canRent, boolean discounted, String location, String publisher, LocalDate dateissued) {
		this.name = name;
		this.ID = ID;
		this.price = price;
		this.canPurchase = canPurchase;
		this.canRent = canRent;
		this.discounted = discounted;
		this.location = location;
		this.publisher = publisher;
		this.dateissued = dateissued;
	}
	
	

}
