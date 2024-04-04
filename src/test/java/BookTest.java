import api.Book;
import api.ItemAttributes;
import api.ItemAttributesBuilder;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testDefaultConstructor() {
        Book book = new Book(new ItemAttributes(new ItemAttributesBuilder())); // Invoking default constructor

        // Verify that default attributes are initialized
        assertNull(book.name);
        assertEquals(0, book.ID); // Assuming default ID is 0
        assertNull(book.location);
        assertNull(book.ISBN);

    }

    @Test
    public void testConstructorWithNameAndID() {
        Book book = new Book(new ItemAttributesBuilder()
                .setName("Test Book")
                .setID(123)
                .build());
        assertEquals("Test Book", book.name);
        assertEquals(123, book.ID);
    }

    @Test
    public void testConstructorWithLocationAndISBN() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Test Location");
        additionalAttributes.put("ISBN", "1234567890");

        Book book = new Book(new ItemAttributesBuilder()
                .setName("Test Book")
                .setID(123)
                .setAdditionalAttributes(additionalAttributes)
                .build());
        assertEquals("Test Book", book.name);
        assertEquals(123, book.ID);
        assertEquals("Test Location", book.location);
        assertEquals("1234567890", book.ISBN);
    }

    @Test
    public void testGetName() {
        Book book = new Book(new ItemAttributesBuilder().setName("Test Name").build());
        assertEquals("Test Name", book.name);
    }

    @Test
    public void testGetID() {
        Book book = new Book(new ItemAttributesBuilder().setID(123).build());
        assertEquals(123, book.getID());
    }

    @Test
    public void testGetLocation() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Test Location");

        Book book = new Book(new ItemAttributesBuilder().setAdditionalAttributes(additionalAttributes).build());
        assertEquals("Test Location", book.location);
    }

    @Test
    public void testGetISBN() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("ISBN", "1234567890");

        Book book = new Book(new ItemAttributesBuilder().setAdditionalAttributes(additionalAttributes).build());
        assertEquals("1234567890", book.ISBN);
    }

    @Test
    public void testEqualsSameObject() {
        Book book = new Book(new ItemAttributesBuilder().setName("Test Book").build());
        assertTrue(book.equals(book));
    }

    @Test
    public void testEqualsDifferentObject() {
        Book book1 = new Book(new ItemAttributesBuilder().setName("Test Book").build());
        Book book2 = new Book(new ItemAttributesBuilder().setName("Test Book").build());
        assertTrue(book1.equals(book2));
    }



    @Test
    public void testHashCodeConsistency() {
        Book book = new Book(new ItemAttributesBuilder().setName("Test Book").build());
        int hashCode1 = book.hashCode();
        int hashCode2 = book.hashCode();
        assertEquals(hashCode1, hashCode2);
    }
}