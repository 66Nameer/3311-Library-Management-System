package api;

public  class BookBuilder extends Item.ItemBuilder{
     String ISBN;
     String location;

    public BookBuilder setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }

    public BookBuilder setLocation(String location) {
        this.location = location;
        return this;
    }
    @Override
    public Book build() {
        return new Book(this);
    }

    @Override
    protected BookBuilder self() {
        return this;
    }



}