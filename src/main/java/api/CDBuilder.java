package api;

import java.util.ArrayList;

public class CDBuilder extends Item.ItemBuilder{
     String artist;
     ArrayList<String> songs = new ArrayList<>();

    public void setArtist(String artist) {
        this.artist = artist;

    }

    public void setSong(ArrayList<String> songs) {
        this.songs = songs;

    }


    @Override
    public CD build() {
        return new CD(this);
    }

    @Override
    protected CDBuilder self() {
        return this;
    }
}