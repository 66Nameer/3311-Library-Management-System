package api;

public  class BookBuilder extends ItemBuilder{
     String ISBN;
     String location;

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;

    }

    public void setLocation(String location) {
        this.location = location;

    }


}