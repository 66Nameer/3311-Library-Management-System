package api;

import java.util.Objects;

public class Book extends PhysicalItem {
	// public int field;	Not sure what this was supposed to be
	
	// default constructor


	private Book(BookBuilder builder) {
        super(builder);
		this.ISBN = builder.ISBN;
		this.location = builder.location;
	}

}
