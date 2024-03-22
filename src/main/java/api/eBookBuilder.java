package api;

import java.util.ArrayList;

public  class eBookBuilder extends ItemBuilder {
     String author;
     ArrayList<String> courses = new ArrayList<>();

    public void author(String author) {
        this.author = author;

    }

    public void course(String course) {
        this.courses.add(course);

    }


}