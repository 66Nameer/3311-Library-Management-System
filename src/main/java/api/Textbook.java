package api;

import java.util.ArrayList;

public class Textbook extends PhysicalItem {
	
	public int edition;
	public ArrayList<String> authors;
	
	// default constructor


	public Textbook(TextbookBuilder builder) {
		super(builder);
		this.edition = builder.edition;
		this.authors = builder.authors;
	}
	

}
