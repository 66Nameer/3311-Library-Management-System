package api;

public  class NewsletterBuilder extends Item.ItemBuilder {
     String publisher;

    public void setPublisher(String publisher) {
        this.publisher = publisher;

    }


    @Override
    public Newsletter build() {
        return new Newsletter(this);
    }

    @Override
    protected NewsletterBuilder self() {
        return this;
    }
}