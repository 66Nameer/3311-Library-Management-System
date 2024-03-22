package api;

import java.util.ArrayList;

public class CD extends PhysicalItem {
	
	public String artist;
	public ArrayList<String> songs;
	
	
	// default constructor
	public CD() {
		this(null);
	}
	
	public CD(ItemAttributes attributes) {
        super(attributes);
		this.location = (String) attributes.getAdditionalAttributes().get("location");
		this.artist = (String) attributes.getAdditionalAttributes().get("artist");
		this.songs =  (ArrayList<String>) attributes.getAdditionalAttributes().get("songs");
	}
	

}
