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
        this.subscription = new Subscription(); // Or retrieve an existing cart for the user
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
}
