package src.main.java;

public class Book extends PhysicalItem {
	
	public String ISBN;
	// public int field;	Not sure what this was supposed to be
	
	
	// default constructor
	public Book() {
		this("", 0, 0.00, false, false, false, "", "");
	}
	
	
	public Book(String name, int ID, double price, boolean canPurchase, boolean canRent, boolean discounted, String location, String ISBN) {
		this.name = name;
		this.ID = ID;
		this.price = price;
		this.canPurchase = canPurchase;
		this.canRent = canRent;
		this.discounted = discounted;
		this.location = location;
		this.ISBN = ISBN;
	}
	

}
