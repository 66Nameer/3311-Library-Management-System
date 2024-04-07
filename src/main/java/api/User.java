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
	ArrayList<Subscription> sub=new ArrayList<>();
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

	public void makeRequests(Item item) {
		if(item instanceof Textbook){
			priority = 1;
		}
		else {
			priority = 2;
		}
		Request req=new Request(item, this, priority);
		request.add(req);
	}
	
	
	public void rentItem(PhysicalItem item) {
		
		if (item.canRent) {									// Need a checker of api.User's outstanding rentals/penalties in case they've lost rental privileges
			
			LocalDate today = LocalDate.now();
			LocalDate due = today.plusDays(3);
			Database db = Database.getInstance();
			
			try {
				db.updateStock(item.getID(), -1);				
			} catch (Exception e) {								// Item out of stock, can't rent
				System.out.println(e.getMessage());
				return;
			}
			
			Rental rent = new Rental(this, item, due);			// Otherwise the rental goes through
			rentals.add(rent);
			db.pushRental(rent);
			
		}
	}
	
	
	public void returnItem(Rental rental) {
		rentals.remove(rental);
		Database db = Database.getInstance();
		db.removeRental(rental);
	}
	
	
	public void openItem(Item item) {
	
	}

	public void subscribe(String page) {
	
	}

	public NotificationManager getNotificationService() {
		return notificationService;
	}


	public void addSubscription(Subscription subscription) {
		boolean contain = false;
		for(Subscription sub2: sub){
			if(sub2.getServiceName().equals(subscription.getServiceName())){
				contain=true;
			}
		}
		if(!contain){
			sub.add(subscription);
		}
	}


	public void removeSubscription(String serviceName) {
		for(Subscription sub2: sub){
			if(sub2.getServiceName().equals(serviceName)){
				sub.remove(sub2);
			}
		}
	}
	

	public ArrayList<Subscription> getSubscriptions(){
		return new ArrayList<>(this.sub);
	}

	public ArrayList<Rental> getRentals(){
		return new ArrayList<>(this.rentals);
	}

	public void setSubscriptions(List<Subscription> loadSubscriptions) {
		this.sub = new ArrayList<>(loadSubscriptions);
	}
}
