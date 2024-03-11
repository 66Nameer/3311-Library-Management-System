package src.main.java;

import src.main.java.notification.NotificationManager;

import java.util.*;



public abstract class User {

	private String password;
	private String email;
	private NotificationManager notificationService = new NotificationManager();
	ArrayList<Item> rentals = new ArrayList<>();

	public ArrayList<Request> requests(){
		return null;
	
	}

	public void makeRequests(Item item) {
	
	}

	public void openItem(Item item) {
	
	}

	public void subscribe(String page) {
	
	}

	public NotificationManager getNotificationService() {
		return notificationService;
	}

}
