package api;

public class SubscriptionData {
    private User user;
    private Subscription subscription;
    private static SubscriptionData instance=new SubscriptionData();

    public SubscriptionData(){}

    public static SubscriptionData getInstance() {
        return instance;
    }


    public void loginUser(User user) {
        this.user = user;
        this.user.setSubscriptions(SubscriptionManager.loadSubscriptions(user.getEmail()));
        this.subscription = new Subscription(); 
    }

    public void logoutUser() {
        if(this.user!=null){
            SubscriptionManager.saveSubscriptions(this.user);
        }
        this.user = null;
        this.subscription = null;
     
    }
    public User getUser() {
        return user;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void addSubscription(Subscription subscription) {
        if (user != null) {

            user.addSubscription(subscription);

        }
    }

    public void removeSubscription(String serviceName) {
        if (user != null) {
            user.removeSubscription(serviceName);
            this.user.setSubscriptions(SubscriptionManager.loadSubscriptions(user.getEmail()));
        }
    }
}
