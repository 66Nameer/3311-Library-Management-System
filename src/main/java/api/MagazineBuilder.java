package api;

import java.time.LocalDate;

public  class MagazineBuilder extends Item.ItemBuilder {
     String publisher;
     LocalDate dateIssued;

    public void publisher(String publisher) {
        this.publisher = publisher;

    }

    public void dateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;

    }


    @Override
    public Magazine build() {
        return new Magazine(this);
    }

    @Override
    protected MagazineBuilder self() {
        return this;
    }
}