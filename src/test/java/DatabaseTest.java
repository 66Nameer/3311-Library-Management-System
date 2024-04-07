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
	    public void testStockUpdate() {
	    	
	    	
	    	
	    	
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
	    	
	    	
	    }
	    
	    
	    @Test(expected = Exception.class)
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
	    public void testRentalRemoval() {
	    	
	    	
	    }
	    
	
	

}
