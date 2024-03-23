package api;

import java.time.LocalDate;


public class Rental {

    private User user;
    private PhysicalItem item;
    private LocalDate dueDate;
    
    
    // default constructor
    public Rental() {
    	this(null, null, null);
    }
    
    
    public Rental(User user, PhysicalItem item, LocalDate dueDate) {
    	this.user = user;
    	this.item = item;
    	this.dueDate = dueDate;
    }


    public PhysicalItem getItem() {
        return this.item;
    }

    public User getUser() {
        return this.user;
    }
    
    
    
    public LocalDate getDueDate() {
    	return this.dueDate;
    }
    
}
