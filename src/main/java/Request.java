package src.main.java;

public class Request {
	
	public Item item;
	public User user;
	public int priority;
	
	
	public Request(Item item, User user, int priority) {
		this.item = item;
		this.user = user;
		this.priority = priority;
	}
	
	
	
	public void updatePriority(int newPriority) {
		this.priority = newPriority;
	}
	

}