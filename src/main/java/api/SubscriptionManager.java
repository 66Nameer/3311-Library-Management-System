package api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubscriptionManager {
    // Maps service names to users subscribed to those services
    private Map<String, SubscriptionData> serviceSubscriptions = new HashMap<>();

    private static final SubscriptionManager instance = new SubscriptionManager();

    public  SubscriptionManager() {}

    public static SubscriptionManager getInstance() {
        return instance;
    }

    // Subscribe a user to a service
    public void subscribe(String serviceName, SubscriptionData sub) {
        serviceSubscriptions.put(serviceName,sub);
    }

    // Unsubscribe a user from a service
    public void unsubscribe(String serviceName, SubscriptionData sub) {
        serviceSubscriptions.remove(serviceName,sub);
    }

    // Check if a subscription exists for a given service
    public boolean isSubscribed(String serviceName) {
        return serviceSubscriptions.containsKey(serviceName);
    }

    // Get a subscription for a given service
    public SubscriptionData getSubscription(String serviceName) {
        return serviceSubscriptions.get(serviceName);
    }

    // List all subscriptions
    public Map<String, SubscriptionData> getAllSubscriptions() {
        return new HashMap<>(serviceSubscriptions);
    }

}
