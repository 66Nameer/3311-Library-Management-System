import api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemFactoryTest {

    @Test
    public void testGetItemWithBookType() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.BOOK)
                .setName("Test Book")
                .setID(123)
                .setCount(1)
                .setPrice(20.0)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(false)
                .setISBN("1234567890");

        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof Book);
    }

    @Test
    public void testGetItemWithTextBookType() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.TEXTBOOK)
                .setName("Test TextBook")
                .setID(123)
                .setCount(1)
                .setPrice(20.0)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(false);

        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof Textbook);
    }

    @Test
    public void testGetItemWithBookType2() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.BOOK);
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof Book);
    }

    @Test
    public void testGetItemWithMagazineType() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.MAGAZINE);
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof Magazine);
    }

    @Test
    public void testGetItemWithMagazineType2() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.MAGAZINE)
                .setName("Test Magazine")
                .setID(153)
                .setCount(1)
                .setPrice(5.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true);
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof Magazine);
    }

    @Test
    public void testGetItemWithCDType() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.CD);
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof CD);
    }

    @Test
    public void testGetItemWithCDType2() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.CD)
                .setName("Test CD")
                .setID(147)
                .setCount(1)
                .setPrice(12.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true);
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof CD);
    }

    @Test
    public void testGetItemWithEBookType() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.EBOOK);
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof eBook);
    }

    @Test
    public void testGetItemWithEBookType2() {
        // Create item attributes builder with eBook type
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.EBOOK)
                .setName("Test eBook")
                .setID(456)
                .setCount(1)
                .setPrice(10.0)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setISBN("9876543210");

        // Create item factory and get the item
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        // Verify that item is of type eBook
        assertTrue(item instanceof eBook);
    }

    @Test
    public void testGetItemWithNewsletterType() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.NEWSLETTER);
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof Newsletter);
    }

    @Test
    public void testGetItemWithNewsletterType2() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setType(ItemType.NEWSLETTER)
                .setName("Test NewsLetter")
                .setID(321)
                .setCount(2)
                .setPrice(7.25)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true);
        ItemFactory factory = new ItemFactory();
        Item item = factory.getItem(builder.build());

        assertTrue(item instanceof Newsletter);
    }



}