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
    
    
    
    public LocalDate getDueDate() {
    	return this.dueDate;
    }
    
    /*
    public void extendDueDate(int days) {						// give users option to extend due dates?
    	this.dueDate = this.dueDate.plusDays(days);
    }
    */
    
    
    
    
    
    
}
