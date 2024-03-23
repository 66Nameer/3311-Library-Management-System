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
        super(attributes);
		this.author = (String) attributes.getAdditionalAttributes().get("author");
		this.courses = (ArrayList<String>) attributes.getAdditionalAttributes().get("courses");
	}
	
}
