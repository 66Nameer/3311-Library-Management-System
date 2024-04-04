import api.CD;
import api.ItemAttributes;
import api.ItemAttributesBuilder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CDTest {

    @Test
    public void testDefaultConstructor() {
        CD cd = new CD(new ItemAttributes(new ItemAttributesBuilder())); // Invoking default constructor

        // Verify that default attributes are initialized
        assertNull(cd.name);
        assertEquals(0, cd.ID); // Assuming default ID is 0
        assertNull(cd.location);
    }

    @Test
    public void testConstructorWithNameAndID() {
        CD cd = new CD(new ItemAttributesBuilder()
                .setName("Test CD")
                .setID(123)
                .build());
        assertEquals("Test CD", cd.name);
        assertEquals(123, cd.ID);
    }

    @Test
    public void testConstructorWithLocationAndArtist() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Test Location");
        additionalAttributes.put("artist", "Test Artist");

        CD cd = new CD(new ItemAttributesBuilder()
                .setName("Test CD")
                .setID(123)
                .setAdditionalAttributes(additionalAttributes)
                .build());
        assertEquals("Test CD", cd.name);
        assertEquals(123, cd.ID);
        assertEquals("Test Location", cd.location);
        assertEquals("Test Artist", cd.artist);
    }

    @Test
    public void testGetName() {
        CD cd = new CD(new ItemAttributesBuilder().setName("Test Name").build());
        assertEquals("Test Name", cd.name);
    }

    @Test
    public void testGetID() {
        CD cd = new CD(new ItemAttributesBuilder().setID(123).build());
        assertEquals(123, cd.getID());
    }

    @Test
    public void testGetLocation() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Test Location");

        CD cd = new CD(new ItemAttributesBuilder().setAdditionalAttributes(additionalAttributes).build());
        assertEquals("Test Location", cd.location);
    }

    @Test
    public void testGetArtist() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("artist", "Test Artist");

        CD cd = new CD(new ItemAttributesBuilder().setAdditionalAttributes(additionalAttributes).build());
        assertEquals("Test Artist", cd.artist);
    }

    @Test
    public void testGetSongs() {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Song 1");
        songs.add("Song 2");

        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("songs", songs);

        CD cd = new CD(new ItemAttributesBuilder().setAdditionalAttributes(additionalAttributes).build());
        assertEquals(songs, cd.songs);
    }

    @Test
    public void testEqualsSameObject() {
        CD cd = new CD(new ItemAttributesBuilder().setName("Test CD").build());
        assertTrue(cd.equals(cd));
    }

    @Test
    public void testEqualsDifferentObject() {
        CD cd1 = new CD(new ItemAttributesBuilder().setName("Test CD").build());
        CD cd2 = new CD(new ItemAttributesBuilder().setName("Test CD").build());
        assertTrue(cd1.equals(cd2));
    }



    @Test
    public void testHashCodeConsistency() {
        CD cd = new CD(new ItemAttributesBuilder().setName("Test CD").build());
        int hashCode1 = cd.hashCode();
        int hashCode2 = cd.hashCode();
        assertEquals(hashCode1, hashCode2);
    }
}