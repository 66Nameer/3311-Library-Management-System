import api.*;
import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CartTest{

   @Test
    public void testSaveAndUndo2() {
        Cart cart = new Cart();

        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);
        Book book2 = new Book(attributes);

        // Add initial item and save state
        cart.addItem(book1, 1);
        CartMemento savedState = cart.save();

        // Modify cart by adding another item
        cart.addItem(book2, 2);

        // Undo to saved state
        cart.undo(savedState);
        assertEquals("Cart should revert to containing only the initially added item after undo.", cart.getItems().size(), 1);
        assertTrue("Cart should contain the initial item after undo.", cart.getItems().containsKey(book1));
        assertEquals("Initial item's quantity should remain unchanged after undo.", (int) cart.getItems().get(book1), 1);
    }

    @Test
    public void testGetItems() {
        Cart cart = new Cart();
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);

        Map<String, Object> additionalAttributes2 = new HashMap<>();
        additionalAttributes2.put("location", "Library Shelf 1");
        additionalAttributes2.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes2 = ItemAttributes.builder()
                .setName("Effective C")
                .setID(2)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes2)
                .setISBN("123-4567890232")
                .setType(ItemType.BOOK)
                .build();

        Book book2 = new Book(attributes2);

        // Add two items to the cart
        cart.addItem(book1, 1);
        cart.addItem(book2, 2);

        // Verify the cart's content and item quantities

        assertEquals("The quantity of the first item should be correctly reported.", (int) cart.getItems().get(book1), 1);
        assertEquals("The quantity of the second item should be correctly reported.", (int) cart.getItems().get(book2), 2);
    }

    @Test
    public void testGetLastAdded() {
        Cart cart = new Cart();



        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);



        Map<String, Object> additionalAttributes2 = new HashMap<>();
        additionalAttributes2.put("location", "Library Shelf 1");
        additionalAttributes2.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes2 = ItemAttributes.builder()
                .setName("Effective C")
                .setID(2)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes2)
                .setISBN("123-4567890232")
                .setType(ItemType.BOOK)
                .build();

        Book book2 = new Book(attributes2);


        cart.addItem(book1, 1);
        cart.addItem(book2, 1);

        assertSame("The last added item should be book2.", cart.getLastAdded(), book2);
    }

    @Test
    public void testGetItemQuantity() {
        Cart cart = new Cart();
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);
        cart.addItem(book1, 2); // Add book1 twice

        assertEquals("The quantity of book1 (ID: 1) should be 2.", cart.getItemQuantity(1), 2);
    }

    @Test
    public void testGetItemQuantity2() {
        Cart cart = new Cart();
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);
        cart.addItem(book1, 2); // Add book1 twice
        cart.removeItem(book1,2);

        assertEquals("The quantity of book1 (ID: 1) should be 2.", cart.getItemQuantity(1), 0);
    }



    @Test
    public void testGetCartContentsAsString() {
        Cart cart = new Cart();
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);
        cart.addItem(book1, 1);

        String expected = "Effective Java - Quantity: 1\n";
        assertEquals("adasdasdasd", cart.displayCart(),expected);
    }


    @Test
    public void testGetCartContentsAsString2() {
        Cart cart = new Cart();
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
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);
        cart.addItem(book1, 1);

        String expected = "Effective C - Quantity: 1\n";
        assertEquals("adasdasdasd", cart.displayCart(),expected);
    }


    @Test
    public void testGetCartContentsAsString3() {
        Cart cart = new Cart();
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
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);
        cart.addItem(book1, 1);

        String expected = "Effective Python - Quantity: 1\n";
        assertEquals("adasdasdasd", cart.displayCart(),expected);
    }
    @Test
    public void testSaveAndUndo3() {
        Cart cart = new Cart();
        CartCaretaker caretaker = new CartCaretaker();
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);



        Map<String, Object> additionalAttributes2 = new HashMap<>();
        additionalAttributes2.put("location", "Library Shelf 1");
        additionalAttributes2.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes2 = ItemAttributes.builder()
                .setName("Effective C")
                .setID(2)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(false)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes2)
                .setISBN("123-4567890232")
                .setType(ItemType.BOOK)
                .build();

        Book book2 = new Book(attributes2);

        // Initial state with book1
        cart.addItem(book1, 1);
        caretaker.save(cart);

        // Change state by adding book2
        cart.addItem(book2, 1);

        // Undo to previous state
        caretaker.undo(cart);

        assertEquals("1", cart.getItems().size(), 1);
        assertTrue("Cart should contain book1 after undo.", cart.getItems().containsKey(book1));
        assertEquals("a", (int) cart.getItems().get(book1), 1);
    }

    @Test
    public void testUndoWithEmptyHistory() {
        Cart cart = new Cart();
        CartCaretaker caretaker = new CartCaretaker();

        // Attempt to undo without any saved states
        caretaker.undo(cart);

        assertTrue("Cart should remain unchanged if undo is called with an empty history.", cart.getItems().isEmpty());
    }
  
}
