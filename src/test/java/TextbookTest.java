import api.ItemAttributes;
import api.ItemAttributesBuilder;
import api.Textbook;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TextbookTest {

    @Test
    public void testDefaultConstructor() {
        Textbook textbook = new Textbook(new ItemAttributes(new ItemAttributesBuilder())); // Invoking default constructor

        // Verify that default attributes are initialized
        assertNull(textbook.name);
        assertEquals(0, textbook.ID); // Assuming default ID is 0
        assertNull(textbook.authors);
    }

    @Test
    public void testConstructorWithLocationEditionAndAuthors() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Test Location");
        additionalAttributes.put("edition", "Test Edition");
        ArrayList<String> authors = new ArrayList<>();
        authors.add("Author 1");
        authors.add("Author 2");
        additionalAttributes.put("authors", authors);

        Textbook textbook = new Textbook(new ItemAttributesBuilder()
                .setAdditionalAttributes(additionalAttributes)
                .build());

        assertEquals("Test Location", textbook.location);
        assertEquals("Test Edition", textbook.edition);
        assertEquals(authors, textbook.authors);
    }

    @Test
    public void testGetLocation() {
        Textbook textbook = new Textbook(new ItemAttributesBuilder()
                .addAdditionalAttribute("location", "Test Location")
                .build());
        assertEquals("Test Location", textbook.location);
    }

    @Test
    public void testGetEdition() {
        Textbook textbook = new Textbook(new ItemAttributesBuilder()
                .addAdditionalAttribute("edition", "Test Edition")
                .build());
        assertEquals("Test Edition", textbook.edition);
    }

    @Test
    public void testGetAuthors() {
        ArrayList<String> authors = new ArrayList<>();
        authors.add("Author 1");
        authors.add("Author 2");
        Textbook textbook = new Textbook(new ItemAttributesBuilder()
                .addAdditionalAttribute("authors", authors)
                .build());
        assertEquals(authors, textbook.authors);
    }

    @Test
    public void testEqualsSameObject() {
        Textbook textbook = new Textbook(new ItemAttributesBuilder().build());
        assertTrue(textbook.equals(textbook));
    }

    @Test
    public void testEqualsDifferentObject() {
        Textbook textbook1 = new Textbook(new ItemAttributesBuilder().build());
        Textbook textbook2 = new Textbook(new ItemAttributesBuilder().build());
        assertTrue(textbook1.equals(textbook2));
    }

    @Test
    public void testHashCodeConsistency() {
        Textbook textbook = new Textbook(new ItemAttributesBuilder().build());
        int hashCode1 = textbook.hashCode();
        int hashCode2 = textbook.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeWithDifferentAttributes() {
        Textbook textbook1 = new Textbook(new ItemAttributesBuilder().addAdditionalAttribute("edition", "Edition").build());
        Textbook textbook2 = new Textbook(new ItemAttributesBuilder().addAdditionalAttribute("edition", "Edition").build());
        assertEquals(textbook1.hashCode(), textbook2.hashCode());
    }

    @Test
    public void testHashCodeWithDifferentEditions() {
        Textbook textbook1 = new Textbook(new ItemAttributesBuilder().addAdditionalAttribute("edition", "Edition1").build());
        Textbook textbook2 = new Textbook(new ItemAttributesBuilder().addAdditionalAttribute("edition", "Edition2").build());
        assertNotEquals(textbook1.edition, textbook2.edition);
    }

    @Test
    public void testEqualsWithNull() {
        Textbook textbook = new Textbook(new ItemAttributesBuilder().build());
        assertFalse(textbook.equals(null));
    }
}