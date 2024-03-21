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
		this.name = attributes.getName();
		this.ID = attributes.getID();
		this.price = attributes.getPrice();
		this.canPurchase = attributes.isCanPurchase();
		this.canRent = attributes.isCanRent();
		this.discounted = attributes.isDiscounted();
		this.author = (String) attributes.getAdditionalAttributes().get("author");
		this.courses = (ArrayList<String>) attributes.getAdditionalAttributes().get("courses");
	}
	
	
	/*public void addCourse (String course) {
		this.courses.add(course);
	}*/

	
}
