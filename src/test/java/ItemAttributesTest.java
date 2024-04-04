import api.ItemAttributes;
import api.ItemAttributesBuilder;
import api.ItemType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ItemAttributesTest {

    @Test
    public void testItemAttributesBuilderWithValidAttributes() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library");
        additionalAttributes.put("ISBN", "1234567890");

        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setName("TestItem").setID(1).setCount(5).setPrice(10.99).setCanPurchase(true)
                .setCanRent(true).setDiscounted(false).setType(ItemType.BOOK).setISBN("1234567890")
                .setAdditionalAttributes(additionalAttributes);

        ItemAttributes attributes = builder.build();

        assertEquals("TestItem", attributes.getName());
        assertEquals(1, attributes.getID());
        assertEquals(5, attributes.getCount());
        assertEquals(10.99, attributes.getPrice());
        assertTrue(attributes.isCanPurchase());
        assertTrue(attributes.isCanRent());
        assertFalse(attributes.isDiscounted());
        assertEquals(ItemType.BOOK, attributes.getType());
        assertEquals("1234567890", attributes.getISBN());
        assertEquals("Library", attributes.getAdditionalAttributes().get("location"));
    }

    @Test
    public void testItemAttributesBuilderWithDefaultValues() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        ItemAttributes attributes = builder.build();

        assertNull(attributes.getName());
        assertEquals(0, attributes.getID());
        assertEquals(0, attributes.getCount());
        assertEquals(0.0, attributes.getPrice());
        assertFalse(attributes.isCanPurchase());
        assertFalse(attributes.isCanRent());
        assertFalse(attributes.isDiscounted());
        assertNull(attributes.getType());
        assertNull(attributes.getISBN());
        assertTrue(attributes.getAdditionalAttributes().isEmpty());
    }

    @Test
    public void testItemAttributesBuilderWithAdditionalAttributes() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("author", "TestAuthor");
        additionalAttributes.put("genre", "Fiction");

        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setName("TestBook").setID(1).setCount(5).setPrice(10.99).setCanPurchase(true)
                .setCanRent(true).setDiscounted(false).setType(ItemType.BOOK).setISBN("1234567890")
                .setAdditionalAttributes(additionalAttributes);

        ItemAttributes attributes = builder.build();

        assertEquals("TestBook", attributes.getName());
        assertEquals(1, attributes.getID());
        assertEquals(5, attributes.getCount());
        assertEquals(10.99, attributes.getPrice());
        assertTrue(attributes.isCanPurchase());
        assertTrue(attributes.isCanRent());
        assertFalse(attributes.isDiscounted());
        assertEquals(ItemType.BOOK, attributes.getType());
        assertEquals("1234567890", attributes.getISBN());
        assertEquals("TestAuthor", attributes.getAdditionalAttributes().get("author"));
        assertEquals("Fiction", attributes.getAdditionalAttributes().get("genre"));
    }

    @Test
    public void testItemAttributesBuilderWithAdditionalAttributesNull() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setAdditionalAttributes(null);
        ItemAttributes attributes = builder.build();

        assertNull(attributes.getAdditionalAttributes());
    }

    @Test
    public void testItemAttributesBuilderWithAdditionalAttributesEmpty() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setAdditionalAttributes(new HashMap<>());
        ItemAttributes attributes = builder.build();

        assertTrue(attributes.getAdditionalAttributes().isEmpty());
    }

    @Test
    public void testItemAttributesBuilderWithAdditionalAttributesModification() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("author", "TestAuthor");
        additionalAttributes.put("genre", "Fiction");

        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setAdditionalAttributes(additionalAttributes);
        ItemAttributes attributes = builder.build();

        // Modifying the additionalAttributes map after setting it in the builder
        additionalAttributes.put("publisher", "TestPublisher");

        // Check if modification affects the item attributes
        assertTrue(attributes.getAdditionalAttributes().containsKey("publisher"));
        assertEquals("TestPublisher", attributes.getAdditionalAttributes().get("publisher"));
    }

    @Test
    public void testItemAttributesBuilderWithAdditionalAttributesCloning() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("author", "TestAuthor");
        additionalAttributes.put("genre", "Fiction");

        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setAdditionalAttributes(new HashMap<>(additionalAttributes));
        ItemAttributes attributes = builder.build();

        // Check if the item attributes map is independent of the original map
        additionalAttributes.put("publisher", "TestPublisher");
        assertFalse(attributes.getAdditionalAttributes().containsKey("publisher"));
    }


    @Test
    public void testItemAttributesBuilderWithAdditionalAttributesSize() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("author", "TestAuthor");
        additionalAttributes.put("genre", "Fiction");

        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setAdditionalAttributes(additionalAttributes);
        ItemAttributes attributes = builder.build();

        assertEquals(2, attributes.getAdditionalAttributes().size());
    }

    @Test
    public void testItemAttributesBuilderWithAdditionalAttributesContainsKey() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("author", "TestAuthor");
        additionalAttributes.put("genre", "Fiction");

        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setAdditionalAttributes(additionalAttributes);
        ItemAttributes attributes = builder.build();

        assertTrue(attributes.getAdditionalAttributes().containsKey("author"));
        assertTrue(attributes.getAdditionalAttributes().containsKey("genre"));
    }

    @Test
    public void testItemAttributesBuilderWithAdditionalAttributesContainsValue() {
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("author", "TestAuthor");
        additionalAttributes.put("genre", "Fiction");

        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setAdditionalAttributes(additionalAttributes);
        ItemAttributes attributes = builder.build();

        assertTrue(attributes.getAdditionalAttributes().containsValue("TestAuthor"));
        assertTrue(attributes.getAdditionalAttributes().containsValue("Fiction"));
    }
}