import api.ItemAttributes;
import api.ItemAttributesBuilder;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ItemAttributesBuilderTest {

    @Test
    public void testSetName() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setName("TestName");
        assertEquals("TestName", builder.build().getName());
    }

    @Test
    public void testSetID() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setID(123);
        assertEquals(123, builder.build().getID());
    }

    @Test
    public void testSetCount() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setCount(5);
        assertEquals(5, builder.build().getCount());
    }

    @Test
    public void testSetPrice() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setPrice(20.0);
        assertEquals(20.0, builder.build().getPrice());
    }

    @Test
    public void testSetCanPurchase() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setCanPurchase(true);
        assertTrue(builder.build().isCanPurchase());
    }

    @Test
    public void testSetCanRent() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setCanRent(true);
        assertTrue(builder.build().isCanRent());
    }

    @Test
    public void testSetDiscounted() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setDiscounted(true);
        assertTrue(builder.build().isDiscounted());
    }

    @Test
    public void testSetISBN() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setISBN("1234567890");
        assertEquals("1234567890", builder.build().getISBN());
    }

    @Test
    public void testSetAdditionalAttributes() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("author", "TestAuthor");
        additionalAttributes.put("genre", "Fiction");
        builder.setAdditionalAttributes(additionalAttributes);
        assertEquals(additionalAttributes, builder.build().getAdditionalAttributes());
    }

    @Test
    public void testAddAdditionalAttribute() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.addAdditionalAttribute("author", "TestAuthor");
        builder.addAdditionalAttribute("genre", "Fiction");
        assertEquals("TestAuthor", builder.build().getAdditionalAttributes().get("author"));
        assertEquals("Fiction", builder.build().getAdditionalAttributes().get("genre"));
    }

    @Test
    public void testBuild() {
        ItemAttributesBuilder builder = new ItemAttributesBuilder();
        builder.setName("TestName")
                .setID(123)
                .setCount(5)
                .setPrice(20.0)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(true)
                .setISBN("1234567890");

        ItemAttributes attributes = builder.build();

        assertNotNull(attributes);
        assertEquals("TestName", attributes.getName());
        assertEquals(123, attributes.getID());
        assertEquals(5, attributes.getCount());
        assertEquals(20.0, attributes.getPrice());
        assertTrue(attributes.isCanPurchase());
        assertTrue(attributes.isCanRent());
        assertTrue(attributes.isDiscounted());
        assertEquals("1234567890", attributes.getISBN());
    }
}