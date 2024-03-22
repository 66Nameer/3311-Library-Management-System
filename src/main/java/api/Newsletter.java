package api;

public class Newsletter extends VirtualItem {
	
	public String publisher;
	

	// default constructor



	private Newsletter(NewsletterBuilder builder) {
		super(builder);
		this.publisher = builder.publisher;
	}
	

}
