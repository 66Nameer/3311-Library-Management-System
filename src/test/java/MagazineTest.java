import api.ItemAttributes;
import api.ItemAttributesBuilder;
import api.Magazine;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MagazineTest {

    @Test
    public void testDefaultConstructor() {
        Magazine magazine = new Magazine(new ItemAttributes(new ItemAttributesBuilder())); // Invoking default constructor

        // Verify that default attributes are initialized
        assertNull(magazine.name);
        assertEquals(0, magazine.ID); // Assuming default ID is 0
        assertNull(magazine.location);
    }

    @Test
    public void testConstructorWithLocationPublisherAndDateIssued() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Test Location");
        additionalAttributes.put("publisher", "Test Publisher");
        additionalAttributes.put("dateissued", LocalDate.of(2022, 1, 1));

        Magazine magazine = new Magazine(new ItemAttributesBuilder()
                .setAdditionalAttributes(additionalAttributes)
                .build());

        assertEquals("Test Location", magazine.location);
        assertEquals("Test Publisher", magazine.publisher);
        assertEquals(LocalDate.of(2022, 1, 1), magazine.dateissued);
    }

    @Test
    public void testGetLocation() {
        Magazine magazine = new Magazine(new ItemAttributesBuilder()
                .addAdditionalAttribute("location", "Test Location")
                .build());
        assertEquals("Test Location", magazine.location);
    }

    @Test
    public void testGetPublisher() {
        Magazine magazine = new Magazine(new ItemAttributesBuilder()
                .addAdditionalAttribute("publisher", "Test Publisher")
                .build());
        assertEquals("Test Publisher", magazine.publisher);
    }

    @Test
    public void testGetDateIssued() {
        LocalDate dateIssued = LocalDate.of(2022, 1, 1);
        Magazine magazine = new Magazine(new ItemAttributesBuilder()
                .addAdditionalAttribute("dateissued", dateIssued)
                .build());
        assertEquals(dateIssued, magazine.dateissued);
    }

    @Test
    public void testEqualsSameObject() {
        Magazine magazine = new Magazine(new ItemAttributesBuilder().build());
        assertTrue(magazine.equals(magazine));
    }

    @Test
    public void testEqualsDifferentObject() {
        Magazine magazine1 = new Magazine(new ItemAttributesBuilder().build());
        Magazine magazine2 = new Magazine(new ItemAttributesBuilder().build());
        assertTrue(magazine1.equals(magazine2));
    }



    @Test
    public void testHashCodeConsistency() {
        Magazine magazine = new Magazine(new ItemAttributesBuilder().build());
        int hashCode1 = magazine.hashCode();
        int hashCode2 = magazine.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCodeWithDifferentAttributes() {
        Magazine magazine1 = new Magazine(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher").build());
        Magazine magazine2 = new Magazine(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher").build());
        assertEquals(magazine1.hashCode(), magazine2.hashCode());
    }

    @Test
    public void testHashCodeWithDifferentPublishers() {
        Magazine magazine1 = new Magazine(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher1").build());
        Magazine magazine2 = new Magazine(new ItemAttributesBuilder().addAdditionalAttribute("publisher", "Publisher2").build());
        assertNotEquals(magazine1.publisher, magazine2.publisher);
    }

    @Test
    public void testEqualsWithNull() {
        Magazine magazine = new Magazine(new ItemAttributesBuilder().build());
        assertFalse(magazine.equals(null));
    }
}