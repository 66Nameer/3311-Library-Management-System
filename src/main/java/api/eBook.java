package api;

import java.util.ArrayList;

public class eBook extends VirtualItem {
	
	public String author;
	public ArrayList<String> courses;
	
	// default constructor



	private eBook(eBookBuilder builder) {
		super(builder);
		this.author = builder.author;
		this.courses = builder.courses;
	}
	
	
	/*public void addCourse (String course) {
		this.courses.add(course);
	}*/

	
}
