package api;

import java.time.LocalDate;

public class Magazine extends PhysicalItem {
	
	public String publisher;
	public LocalDate dateissued;
	
	
	// default constructor
	public Magazine() {
		this(null);
	}
	
	
	public Magazine(ItemAttributes attributes) {
        super(attributes);
		this.location = (String) attributes.getAdditionalAttributes().get("location");
		this.publisher = (String) attributes.getAdditionalAttributes().get("publisher");
		this.dateissued = (LocalDate) attributes.getAdditionalAttributes().get("dateissued");
	}
	
	

}
