package api;

import java.util.ArrayList;

public class CDBuilder extends ItemBuilder{
     String artist;
     ArrayList<String> songs = new ArrayList<>();

    public void setArtist(String artist) {
        this.artist = artist;

    }

    public void setSong(ArrayList<String> songs) {
        this.songs = songs;

    }


}