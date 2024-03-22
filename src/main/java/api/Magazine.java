package api;

import java.time.LocalDate;

public class Magazine extends PhysicalItem {
	
	public String publisher;
	public LocalDate dateissued;
	
	
	// default constructor



	private Magazine(MagazineBuilder builder) {
		super(builder);
		this.publisher = builder.publisher;
		this.dateissued = builder.dateIssued;
	}
	
	

}
