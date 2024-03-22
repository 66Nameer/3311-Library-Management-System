package api;



import notification.NotificationManager;

import java.util.*;
import java.time.LocalDate;


public abstract class User {

	private String password;
	private String email;

	private UserType userType;
	private NotificationManager notificationService = new NotificationManager();
	protected Cart cart;
	private int priority;
	ArrayList<Rental> rentals = new ArrayList<>();
	ArrayList<Request> request = new ArrayList<>();

	public User(String email, String password, UserType type) {
		this.email = email;
		this.password = password;
		this.userType = type;
		this.cart = new Cart();
	}

	public ArrayList<Request> requests(){
		return this.request;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return this.email;
	}

	public UserType getUserType() {
		return userType;
	}

	public Cart getCart() {
		return cart;
	}

	public void makeRequests(Item item) {
		if(item instanceof Textbook){
			priority = 1;
		     }
		else{
			priority = 2;
		    }
			Request req=new Request(item, this, priority);
			request.add(req);
	}
	
	
	
	public void rentItem(PhysicalItem item) {
		if (item.canRent) {								// Need a checker of api.User's outstanding rentals/penalties in case they've lost rental privileges
			
			LocalDate today = LocalDate.now();
			LocalDate due = today.plusDays(3);
			
			Rental rent = new Rental(this, item, due);
			rentals.add(rent);
			
			// update stock of item in DB to reflect item being rented
			//api.Database.updateStock(item.getID(), -1);
			
			
			
		}
	}
	
	

	public void openItem(Item item) {
	
	}

	public void subscribe(String page) {
	
	}

	public NotificationManager getNotificationService() {
		return notificationService;
	}

}
