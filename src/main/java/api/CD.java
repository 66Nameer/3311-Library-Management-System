package api;

import java.util.ArrayList;

public class CD extends PhysicalItem {
	
	public String artist;
	public ArrayList<String> songs;
	


	public CD(CDBuilder builder) {
		super(builder);
		this.artist = builder.artist;
		this.songs = builder.songs;
	}
	

}
