package src.main.java;
import java.util.ArrayList;

public class eBook extends VirtualItem {
	
	public String author;
	public ArrayList<String> courses;
	
	// default constructor
	public eBook() {
		this("", 0, 0.00, false, false, false, "", null);
	}
	
	
	public eBook (String name, int ID, double price, boolean canPurchase, boolean canRent, boolean discounted, String author, ArrayList<String> courses) {
		this.name = name;
		this.ID = ID;
		this.price = price;
		this.canPurchase = canPurchase;
		this.canRent = canRent;
		this.discounted = discounted;
		this.author = author;
		this.courses = courses;
	}
	
	
	/*public void addCourse (String course) {
		this.courses.add(course);
	}*/

	
}
