package api;

import java.util.ArrayList;

public  class TextbookBuilder extends Item.ItemBuilder {
     int edition;
     ArrayList<String> authors = new ArrayList<>();

    public void setEdition(int edition) {
        this.edition = edition;

    }

    public void setAuthor(ArrayList<String> authors) {
        this.authors = authors;

    }


    @Override
    public Textbook build() {
        return new Textbook(this);
    }

    @Override
    protected TextbookBuilder self() {
        return this;
    }
}