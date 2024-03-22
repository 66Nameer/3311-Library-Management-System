package api;

public class Newsletter extends VirtualItem {
	
	public String publisher;
	

	// default constructor



	public Newsletter(NewsletterBuilder builder) {
		super(builder);
		this.publisher = builder.publisher;
	}
	

}
