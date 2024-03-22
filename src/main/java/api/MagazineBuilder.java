package api;

import java.time.LocalDate;

public  class MagazineBuilder extends ItemBuilder {
     String publisher;
     LocalDate dateIssued;

    public void publisher(String publisher) {
        this.publisher = publisher;

    }

    public void dateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;

    }


}