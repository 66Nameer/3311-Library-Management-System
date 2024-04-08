import api.*;


import java.time.LocalDate;
import java.util.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

//TODO: This is a copy of same test, need to modify
public class RentalTest{


    @Test
    public void testRentItem2() {
        Visitor visitor = new Visitor("user@example.com", "securepassword");

        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective C")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);

        visitor.rentItem(book1);
        assertEquals(1, visitor.getRentals().size()); // Verify that the book has been added to rentals

        Rental rental = visitor.getRentals().get(0);
        assertEquals(book1, rental.getItem());
        assertEquals(visitor, rental.getUser());
        assertEquals(LocalDate.now().plusDays(3), rental.getDueDate()); // Assuming rentItem sets a due date 3 days from today
    }


    @Test
    public void testRentItem3() {
        Visitor visitor = new Visitor("user@example.com", "securepassword");

        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective C")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);

        visitor.rentItem(book1);
        assertEquals(1, visitor.getRentals().size()); // Verify that the book has been added to rentals

        Rental rental = visitor.getRentals().get(0);
        assertEquals(book1, rental.getItem());
        assertEquals(visitor, rental.getUser());
        assertEquals(LocalDate.now().plusDays(3), rental.getDueDate()); // Assuming rentItem sets a due date 3 days from today
    }


    @Test
    public void testRentItem4() {
        Visitor visitor = new Visitor("user@example.com", "securepassword");

        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Python")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);

        visitor.rentItem(book1);
        assertEquals(1, visitor.getRentals().size()); // Verify that the book has been added to rentals

        Rental rental = visitor.getRentals().get(0);
        assertEquals(book1, rental.getItem());
        assertEquals(visitor, rental.getUser());
        assertEquals(LocalDate.now().plusDays(3), rental.getDueDate()); // Assuming rentItem sets a due date 3 days from today
    }



    @Test
    public void testRentItem5() {
        Visitor visitor = new Visitor("user@example.com", "securepassword");

        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Script")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);

        visitor.rentItem(book1);
        assertEquals(1, visitor.getRentals().size()); // Verify that the book has been added to rentals

        Rental rental = visitor.getRentals().get(0);
        assertEquals(book1, rental.getItem());
        assertEquals(visitor, rental.getUser());
        assertEquals(LocalDate.now().plusDays(3), rental.getDueDate()); // Assuming rentItem sets a due date 3 days from today
    }


    @Test
    public void testRentItem6() {
        Visitor visitor = new Visitor("user@example.com", "securepassword");

        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Harry Potter")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);

        visitor.rentItem(book1);
        assertEquals(1, visitor.getRentals().size()); // Verify that the book has been added to rentals

        Rental rental = visitor.getRentals().get(0);
        assertEquals(book1, rental.getItem());
        assertEquals(visitor, rental.getUser());
        assertEquals(LocalDate.now().plusDays(3), rental.getDueDate()); // Assuming rentItem sets a due date 3 days from today
    }

    @Test
    public void testDefaultConstructorForRental() {
        Rental rental = new Rental();

        assertNull( rental.getUser());
        assertNull( rental.getItem());
        assertNull( rental.getDueDate());
    }


    @Test
    public void testDefaultConstructorForRenta2() {
        Rental rental = new Rental();

        assertNull( rental.getUser());
        assertNull(rental.getItem());
        assertNull( rental.getDueDate());
    }
    @Test
    public void testDefaultConstructorForRental3() {
        Rental rental = new Rental();

        assertNull( rental.getUser());
        assertNull( rental.getItem());
        assertNull( rental.getDueDate());
    }
    @Test
    public void testDefaultConstructorForRental4() {
        Rental rental = new Rental();

        assertNull( rental.getUser());
        assertNull( rental.getItem());
        assertNull( rental.getDueDate());
    }
    @Test
    public void testDefaultConstructorForRental5() {
        Rental rental = new Rental();

        assertNull( rental.getUser());
        assertNull( rental.getItem());
        assertNull( rental.getDueDate());
    }
}
