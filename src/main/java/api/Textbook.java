package api;

import java.util.ArrayList;

public class Textbook extends PhysicalItem {
	
	public String edition;
	public ArrayList<String> authors;
	
	// default constructor
	public Textbook() {
		this(null);
	}
	
	
	public Textbook(ItemAttributes attributes) {
        super(attributes);
		this.location = (String) attributes.getAdditionalAttributes().get("location");
		this.edition = (String) attributes.getAdditionalAttributes().get("edition");
		this.authors = (ArrayList<String>) attributes.getAdditionalAttributes().get("authors");
	}
	

}
