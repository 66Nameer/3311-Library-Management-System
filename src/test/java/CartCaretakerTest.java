import api.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class CartCaretakerTest {

@Test
public void testUndoWithEmptyHistory2() {
    Cart cart = new Cart();
    CartCaretaker caretaker = new CartCaretaker();

    // Attempt to undo without any saved states
    caretaker.undo(cart);

    assertTrue(cart.getItems().isEmpty(), "Cart should remain unchanged if undo is called with an empty history.");
}
    @Test
    public void testSaveAndUndo4() {
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

        assertEquals(1, cart.getItems().size());
        assertTrue(cart.getItems().containsKey(book1), "Cart should contain book1 after undo.");
        assertEquals(1, (int) cart.getItems().get(book1));
    }
    @Test
    public void testSaveAndUndo5() {
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
                .setName("Effective Pearl")
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

        assertEquals(1, cart.getItems().size());
        assertTrue(cart.getItems().containsKey(book1), "Cart should contain book1 after undo.");
        assertEquals(1, (int) cart.getItems().get(book1));
    }
    @Test
    public void testSaveAndUndo6() {
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
                .setName("Effective JavaScript")
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

        assertEquals(1, cart.getItems().size());
        assertTrue(cart.getItems().containsKey(book1), "Cart should contain book1 after undo.");
        assertEquals(1, (int) cart.getItems().get(book1));
    }
    @Test
    public void testSaveAndUndo7() {
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
                .setName("Effective Kotlin")
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

        assertEquals(1, cart.getItems().size());
        assertTrue(cart.getItems().containsKey(book1), "Cart should contain book1 after undo.");
        assertEquals(1, (int) cart.getItems().get(book1));
    }
    @Test
    public void testSaveAndUndo8() {
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
                .setName("Effective SQL")
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

        assertEquals(1, cart.getItems().size() );
        assertTrue(cart.getItems().containsKey(book1), "Cart should contain book1 after undo.");
        assertEquals(1, (int) cart.getItems().get(book1) );
    }


    @Test
    public void testUndoWithEmptyHistory3() {
        Cart cart = new Cart();
        CartCaretaker caretaker = new CartCaretaker();

        // Attempt to undo without any saved states
        caretaker.undo(cart);

        assertTrue(cart.getItems().isEmpty(), "Cart should remain unchanged if undo is called with an empty history.");
    }
    @Test
    public void testUndoWithEmptyHistory4() {
        Cart cart = new Cart();
        CartCaretaker caretaker = new CartCaretaker();

        // Attempt to undo without any saved states
        caretaker.undo(cart);

        assertTrue(cart.getItems().isEmpty(), "Cart should remain unchanged if undo is called with an empty history.");
    }
    @Test
    public void testUndoWithEmptyHistory5() {
        Cart cart = new Cart();
        CartCaretaker caretaker = new CartCaretaker();

        // Attempt to undo without any saved states
        caretaker.undo(cart);

        assertTrue(cart.getItems().isEmpty(), "Cart should remain unchanged if undo is called with an empty history.");
    }
    @Test
    public void testUndoWithEmptyHistory6() {
        Cart cart = new Cart();
        CartCaretaker caretaker = new CartCaretaker();

        // Attempt to undo without any saved states
        caretaker.undo(cart);

        assertTrue(cart.getItems().isEmpty(), "Cart should remain unchanged if undo is called with an empty history.");
    }

}
