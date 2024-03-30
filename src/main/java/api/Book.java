package api;

public class Book extends PhysicalItem {
	
	public String ISBN;
	
	// default constructor
	public Book() {
		this(null);
	}
	
	public Book(ItemAttributes attributes) {
        super(attributes);
		this.location = (String) attributes.getAdditionalAttributes().get("location");
		this.ISBN = (String) attributes.getAdditionalAttributes().get("ISBN");
	}
	

}
