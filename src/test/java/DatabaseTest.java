import api.*;
import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.*;



public class DatabaseTest {
	
	
	 @Test
	    public void testCreation() {
	    	assertTrue(Database.getInstance() != null);
	    }
	    
	    
	    @Test
	    public void testRentalPushFetch() {
	    	
	    	Map<String, Object> additionalAttributes = new HashMap<>();
	        additionalAttributes.put("location", "Test Section");
	        additionalAttributes.put("ISBN", "111-1111111111");

	        ItemAttributes attributes = ItemAttributes.builder()
	                .setName("Test Book 1")
	                .setID(1)
	                .setCount(5)
	                .setPrice(12.34)
	                .setCanPurchase(true)
	                .setCanRent(true)
	                .setDiscounted(true)
	                .setAdditionalAttributes(additionalAttributes)
	                .setISBN("111-1111111111")
	                .setType(ItemType.BOOK)
	                .build();
	        
	        
	        Book book1 = new Book(attributes);
	        
	        SimpleUserFactory factory = new SimpleUserFactory();
	        User user = factory.createUser("faculty@email.com", "pass", UserType.FACULTY);

	        user.rentItem(book1);												// pushRental() called in rentItem()
	        	
	        Rental rent1 = user.getRentals().get(0);								// fetchRentals() called in getRentals()
	        assertEquals(book1, rent1.getItem());
	        assertEquals(user.getEmail(), rent1.getUser().getEmail());
	        assertEquals(LocalDate.now().plusDays(3), rent1.getDueDate());

	    }
	    
	    
	    @Test
	    public void testItemPushFetch() {
	    	
	    	Map<String, Object> additionalAttributes = new HashMap<>();
	        additionalAttributes.put("location", "Test Section");
	        additionalAttributes.put("ISBN", "111-1111111111");

	        ItemAttributes attributes = ItemAttributes.builder()
	                .setName("TestBook")
	                .setID(1)
	                .setCount(5)
	                .setPrice(14.99)
	                .setCanPurchase(true)
	                .setCanRent(true)
	                .setDiscounted(true)
	                .setAdditionalAttributes(additionalAttributes)
	                .setISBN("111-1111111111")
	                .setType(ItemType.BOOK)
	                .build();
	        
	        
	        Book book1 = new Book(attributes);
	        
	        Database db = Database.getInstance();
	        db.pushItem(book1);
	    	
	    	Item test1 = db.fetchItem(1);						// This is returning null for some reason
	    	
	    	assertEquals(book1.getID(), test1.ID);
	    	assertEquals(book1.ISBN, test1.ISBN);
	    	assertEquals(book1.name, test1.name);
	    	assertEquals(String.valueOf(book1.price), String.valueOf(test1.price));
	    	
	    }
	    
	    
	    
	    @Test
	    public void testUserPushFetch() throws Exception {
	    	
	    	SimpleUserFactory factory = new SimpleUserFactory();
	    	User user1 = factory.createUser("testuser@email.com", "testpass", UserType.STUDENT);
	    	Database db = Database.getInstance();
	    	
	    	db.pushUser(user1);
	    	
	    	User test1 = db.fetchUser("testuser@email.com");
	    	
	    	assertEquals(user1.getEmail(), test1.getEmail());
	    	assertEquals(user1.getPassword(), test1.getPassword());
	    	assertEquals(user1.getUserType(), test1.getUserType());

	    }
	    
	    
	    @Test
	    public void testStockUpdateSuccess() throws Exception {
	    	
	    	Map<String, Object> additionalAttributes = new HashMap<>();
	        additionalAttributes.put("location", "Test Section");
	        additionalAttributes.put("ISBN", "111-1111111111");

	        ItemAttributes attributes = ItemAttributes.builder()
	                .setName("Test Book 1")
	                .setID(1)
	                .setCount(5)
	                .setPrice(12.34)
	                .setCanPurchase(true)
	                .setCanRent(true)
	                .setDiscounted(true)
	                .setAdditionalAttributes(additionalAttributes)
	                .setISBN("111-1111111111")
	                .setType(ItemType.BOOK)
	                .build();
	        
	        
	        Book book1 = new Book(attributes);
	        
	        Database db = Database.getInstance();
	        db.pushItem(book1);
	    	
	    	db.updateStock(1, -1);					// update should go through since book1 was successfully created and pushed to the DB, so there'll be 20 in stock before this update
	        
	    }
	    
	    
	    @Test(expected = Exception.class)
	    public void testStockUpdateFailure() throws Exception {
	    	
	    	Map<String, Object> additionalAttributes = new HashMap<>();
	        additionalAttributes.put("location", "Test Section");
	        additionalAttributes.put("ISBN", "111-1111111111");

	        ItemAttributes attributes = ItemAttributes.builder()
	                .setName("Test Book 1")
	                .setID(1)
	                .setCount(5)
	                .setPrice(12.34)
	                .setCanPurchase(true)
	                .setCanRent(true)
	                .setDiscounted(true)
	                .setAdditionalAttributes(additionalAttributes)
	                .setISBN("111-1111111111")
	                .setType(ItemType.BOOK)
	                .build();
	        
	        
	        Book book1 = new Book(attributes);
	        
	        Database db = Database.getInstance();
	        db.pushItem(book1);
	    	
	    	db.updateStock(1, -21);					// update should go through since book1 was successfully created and pushed to the DB, so there'll be 20 in stock before this update
	        
	    }
	    
	    
	    @Test
	    public void testAuthenticationSuccess() {
	    	
	    	SimpleUserFactory factory = new SimpleUserFactory();
	    	User user1 = factory.createUser("testuser@email.com", "testpass", UserType.STUDENT);
	    	
	    	assertTrue(Database.authenticateUser(user1.getEmail(), user1.getPassword()));
	    	
	    }
	    
	    
	    @Test
	    public void testAuthenticationFailure() {
	    	
	    	SimpleUserFactory factory = new SimpleUserFactory();
	    	User user1 = factory.createUser("testuser@email.com", "testpass", UserType.STUDENT);
	    	Database db = Database.getInstance();
	    	
	    	db.pushUser(user1);
	    	
	    	assertFalse(Database.authenticateUser("wronguser@email.com", "wrongpass"));
	    	
	    }
	    
	    
	    @Test
	    public void testCartSave() {
	    	
	    	Cart cart1 = new Cart();
	    	
	    	SimpleUserFactory factory = new SimpleUserFactory();
	    	User user1 = factory.createUser("testuser@email.com", "testpass", UserType.STUDENT);
	    	
	    	Database db = Database.getInstance();
	    	
	    	Map<String, Object> additionalAttributes = new HashMap<>();
	        additionalAttributes.put("location", "Test Section");
	        additionalAttributes.put("ISBN", "111-1111111111");

	        ItemAttributes attributes = ItemAttributes.builder()
	                .setName("Test Book 1")
	                .setID(1)
	                .setCount(20)
	                .setPrice(12.34)
	                .setCanPurchase(true)
	                .setCanRent(true)
	                .setDiscounted(true)
	                .setAdditionalAttributes(additionalAttributes)
	                .setISBN("111-1111111111")
	                .setType(ItemType.BOOK)
	                .build();
	        
	        
	        Book book1 = new Book(attributes);
	        
	        Map<String, Object> additionalAttributes1 = new HashMap<>();
	        additionalAttributes.put("location", "Test Section2");
	        additionalAttributes.put("ISBN", "111-1111111112");

	        ItemAttributes attributes1 = ItemAttributes.builder()
	                .setName("Test Textbook 1")
	                .setID(2)
	                .setCount(20)
	                .setPrice(56.78)
	                .setCanPurchase(true)
	                .setCanRent(true)
	                .setDiscounted(true)
	                .setAdditionalAttributes(additionalAttributes1)
	                .setISBN("111-1111111112")
	                .setType(ItemType.TEXTBOOK)
	                .build();
	        
	        
	        Textbook tbook1 = new Textbook(attributes1);
	        
	        cart1.addItem(book1, 1);
	        cart1.addItem(tbook1, 1);
	        
	        db.saveUserCart(user1, cart1);
	    	
	    }
	    
	    
	    @Test
	    public void testUserRemovalSuccess() throws Exception {
	    	
	    	SimpleUserFactory factory = new SimpleUserFactory();
	    	User user1 = factory.createUser("testuser@email.com", "testpass", UserType.STUDENT);
	    	Database db = Database.getInstance();
	    	
	    	db.pushUser(user1);
	    	
	    	db.removeUser(user1);
	    	
	    	User test1 = db.fetchUser(user1.getEmail());				// Should throw Exception because User was successfully removed from DB
	    	
	    }
	    
	    
	    @Test(expected = Exception.class)
	    public void testUserRemovalFailure() throws Exception {
	    	
	    	SimpleUserFactory factory = new SimpleUserFactory();
	    	User user1 = factory.createUser("testuser@email.com", "testpass", UserType.STUDENT);
	    	Database db = Database.getInstance();
	    	
	    	db.removeUser(user1);							// Should throw Exception because User was never in the DB to begin with
	    	
	    }
	    
	    
	    @Test
	    public void testRentalRemovalSuccess() {
	    	
	    	Map<String, Object> additionalAttributes = new HashMap<>();
	        additionalAttributes.put("location", "Test Section");
	        additionalAttributes.put("ISBN", "111-1111111111");

	        ItemAttributes attributes = ItemAttributes.builder()
	                .setName("Test Book 1")
	                .setID(1)
	                .setCount(5)
	                .setPrice(12.34)
	                .setCanPurchase(true)
	                .setCanRent(true)
	                .setDiscounted(true)
	                .setAdditionalAttributes(additionalAttributes)
	                .setISBN("111-1111111111")
	                .setType(ItemType.BOOK)
	                .build();
	        
	        
	        Book book1 = new Book(attributes);
	        
	        SimpleUserFactory factory = new SimpleUserFactory();
	        User user = factory.createUser("faculty@email.com", "pass", UserType.FACULTY);
	        
	        LocalDate today = LocalDate.now();
			LocalDate due = today.plusDays(3);
			Database db = Database.getInstance();
			
			try {
				db.updateStock(book1.getID(), -1);				
			} catch (Exception e) {								// Item out of stock, can't rent
				System.out.println(e.getMessage());
				return;
			}
			
			Rental rent = new Rental(user, book1, due);			// Otherwise the rental goes through
			db.pushRental(rent);
			
			
	    	
	    	
	    }
	    
	
	    @Test(expected = Exception.class)
	    public void testRentalRemovalFailure() {
	    	
	    	
	    }
	

}
