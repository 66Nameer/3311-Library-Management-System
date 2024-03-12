package src.main.java;

import src.main.java.notification.NotificationManager;

import java.util.*;



public abstract class User {

	private String password;
	private String email;
	private NotificationManager notificationService = new NotificationManager();
	protected Cart cart;
	private int priority;
	ArrayList<Item> rentals = new ArrayList<>();
	ArrayList<Request> request = new ArrayList<>();

	public ArrayList<Request> requests(){
		return this.request;
	
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

	public void openItem(Item item) {
	
	}

	public void subscribe(String page) {
	
	}

	public NotificationManager getNotificationService() {
		return notificationService;
	}

}
