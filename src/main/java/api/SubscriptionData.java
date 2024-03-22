package api;

public class SubscriptionData {
    private User user;
    private Subscription subscription;
    private static SubscriptionData instance=new SubscriptionData();

    private SubscriptionData(){}

    public static SubscriptionData getInstance() {
        return instance;
    }


    public void loginUser(User user) {
        this.user = user;
        this.subscription = new Subscription(); 
    }

    public void logoutUser() {
        this.user = null;
        this.subscription = null;
        // Also handle persistence if necessary
    }
    public User getUser() {
        return user;
    }

    public Subscription getSubscription() {
        return subscription;
    }

  
    public void addSubscription(String serviceName, boolean isActive) {
        if (user != null) {
            Subscription subscription = new Subscription(serviceName, isActive);
            user.addSubscription(subscription);
        }
    }

    public void removeSubscription(String serviceName) {
        if (user != null) {
            user.removeSubscription(new Subscription(serviceName,true));
        }
    }
}
