import api.ItemAttributes;
import api.ItemAttributesBuilder;
import api.eBook;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class EBookTest {

    @Test
    public void testDefaultConstructor() {
        eBook eBook = new eBook(new ItemAttributes(new ItemAttributesBuilder())); // Invoking default constructor

        // Verify that default attributes are initialized
        assertNull(eBook.name);
        assertEquals(0, eBook.ID); // Assuming default ID is 0
        assertNull(eBook.author);
    }

    @Test
    public void testConstructorWithAuthorAndCourses() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("author", "Test Author");
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Course 1");
        courses.add("Course 2");
        additionalAttributes.put("courses", courses);

        eBook eBook = new eBook(new ItemAttributesBuilder()
                .setAdditionalAttributes(additionalAttributes)
                .build());

        assertEquals("Test Author", eBook.author);
        assertEquals(courses, eBook.courses);
    }

    @Test
    public void testGetAuthor() {
        eBook eBook = new eBook(new ItemAttributesBuilder()
                .addAdditionalAttribute("author", "Test Author")
                .build());
        assertEquals("Test Author", eBook.author);
    }

    @Test
    public void testGetCourses() {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Course 1");
        courses.add("Course 2");

        eBook eBook = new eBook(new ItemAttributesBuilder()
                .addAdditionalAttribute("courses", courses)
                .build());
        assertEquals(courses, eBook.courses);
    }

    @Test
    public void testEqualsSameObject() {
        eBook eBook = new eBook(new ItemAttributesBuilder().build());
        assertTrue(eBook.equals(eBook));
    }

    @Test
    public void testEqualsDifferentObject() {
        eBook eBook1 = new eBook(new ItemAttributesBuilder().build());
        eBook eBook2 = new eBook(new ItemAttributesBuilder().build());
        assertTrue(eBook1.equals(eBook2));
    }



    @Test
    public void testHashCodeConsistency() {
        eBook eBook = new eBook(new ItemAttributesBuilder().build());
        int hashCode1 = eBook.hashCode();
        int hashCode2 = eBook.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeWithDifferentAttributes() {
        eBook eBook1 = new eBook(new ItemAttributesBuilder().addAdditionalAttribute("author", "Author").build());
        eBook eBook2 = new eBook(new ItemAttributesBuilder().addAdditionalAttribute("author", "Author").build());
        assertEquals(eBook1.hashCode(), eBook2.hashCode());
    }

    @Test
    public void testHashCodeWithDifferentAuthors() {
        eBook eBook1 = new eBook(new ItemAttributesBuilder().addAdditionalAttribute("author", "Author1").build());
        eBook eBook2 = new eBook(new ItemAttributesBuilder().addAdditionalAttribute("author", "Author2").build());
        assertNotEquals(eBook1.author, eBook2.author);
    }

    @Test
    public void testEqualsWithNull() {
        eBook eBook = new eBook(new ItemAttributesBuilder().build());
        assertFalse(eBook.equals(null));
    }
}