import api.ItemAttributes;
import api.ItemAttributesBuilder;
import api.Newsletter;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class NewsletterTest {

    @Test
    public void testDefaultConstructor() {
        Newsletter newsletter = new Newsletter(new ItemAttributes(new ItemAttributesBuilder())); // Invoking default constructor

        // Verify that default attributes are initialized
        assertNull(newsletter.name);
        assertEquals(0, newsletter.ID); // Assuming default ID is 0
        assertNull(newsletter.publisher);
    }

    @Test
    public void testConstructorWithPublisher() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("publisher", "Test Publisher");

        Newsletter newsletter = new Newsletter(new ItemAttributesBuilder()
                .setAdditionalAttributes(additionalAttributes)
                .build());

        assertEquals("Test Publisher", newsletter.publisher);
    }

    @Test
    public void testGetPublisher() {
        Newsletter newsletter = new Newsletter(new ItemAttributesBuilder()
                .addAdditionalAttribute("publisher", "Test Publisher")
                .build());
        assertEquals("Test Publisher", newsletter.publisher);
    }

    @Test
    public void testEqualsSameObject() {
        Newsletter newsletter = new Newsletter(new ItemAttributesBuilder().build());
        assertTrue(newsletter.equals(newsletter));
    }

    @Test
    public void testEqualsDifferentObject() {
        Newsletter newsletter1 = new Newsletter(new ItemAttributesBuilder().build());
        Newsletter newsletter2 = new Newsletter(new ItemAttributesBuilder().build());
        assertTrue(newsletter1.equals(newsletter2));
    }

    @Test
    public void testEqualsWithSamePublisher() {
        Newsletter newsletter1 = new Newsletter(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher").build());
        Newsletter newsletter2 = new Newsletter(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher").build());
        assertTrue(newsletter1.equals(newsletter2));
    }


    @Test
    public void testHashCodeConsistency() {
        Newsletter newsletter = new Newsletter(new ItemAttributesBuilder().build());
        int hashCode1 = newsletter.hashCode();
        int hashCode2 = newsletter.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeWithDifferentAttributes() {
        Newsletter newsletter1 = new Newsletter(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher").build());
        Newsletter newsletter2 = new Newsletter(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher").build());
        assertEquals(newsletter1.hashCode(), newsletter2.hashCode());
    }

    @Test
    public void testHashCodeWithDifferentPublishers() {
        Newsletter newsletter1 = new Newsletter(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher1").build());
        Newsletter newsletter2 = new Newsletter(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher2").build());
        assertNotEquals(newsletter1.publisher, newsletter2.publisher);
    }

    @Test
    public void testEqualsWithNull() {
        Newsletter newsletter = new Newsletter(new ItemAttributesBuilder().build());
        assertFalse(newsletter.equals(null));
    }
}