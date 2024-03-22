package api;

public class Newsletter extends VirtualItem {
	
	public String publisher;
	

	// default constructor
	public Newsletter() {
		this(null);
	}
	
	
	public Newsletter (ItemAttributes attributes) {
        super(attributes);
		this.publisher = (String) attributes.getAdditionalAttributes().get("publisher");
	}
	
	

}
