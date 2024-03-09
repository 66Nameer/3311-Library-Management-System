package src.main.java;
import java.util.ArrayList;

public class CD extends PhysicalItem {
	
	public String artist;
	public ArrayList<String> songs;
	
	
	// default constructor
	public CD() {
		this("", 0, 0.00, false, false, false, "", "", null);
	}
	
	
	public CD(String name, int ID, double price, boolean canPurchase, boolean canRent, boolean discounted, String location, String artist, ArrayList<String> songs) {
		this.name = name;
		this.ID = ID;
		this.price = price;
		this.canPurchase = canPurchase;
		this.canRent = canRent;
		this.discounted = discounted;
		this.location = location;
		this.artist = artist;
		this.songs = songs;
	}
	

}
