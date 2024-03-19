package api;

import java.util.ArrayList;

public class eBook extends VirtualItem {
	
	public String author;
	public ArrayList<String> courses;
	
	// default constructor
	public eBook() {
		this(null);
	}
	
	
	public eBook (ItemAttributes attributes) {
		this.name = attributes.name;
		this.ID = attributes.ID;
		this.price = attributes.price;
		this.canPurchase = attributes.canPurchase;
		this.canRent = attributes.canRent;
		this.discounted = attributes.discounted;
		this.author = (String) attributes.additionalAttributes.get("author");
		this.courses = (ArrayList<String>) attributes.additionalAttributes.get("courses");
	}
	
	
	/*public void addCourse (String course) {
		this.courses.add(course);
	}*/

	
}
