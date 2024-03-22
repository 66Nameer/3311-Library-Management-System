package api;

import java.util.ArrayList;

public  class eBookBuilder extends Item.ItemBuilder {
     String author;
     ArrayList<String> courses = new ArrayList<>();

    public void author(String author) {
        this.author = author;

    }

    public void course(String course) {
        this.courses.add(course);

    }


    @Override
    public eBook build() {
        return new eBook(this);
    }

    @Override
    protected eBookBuilder self() {
        return this;
    }
}