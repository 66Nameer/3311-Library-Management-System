package api;

import java.util.HashMap;
import java.util.Map;

public class SubscriptionManager {
    private Map<String, Subscription> subscriptions = new HashMap<>();

    // Subscribe or update an existing subscription
    public void subscribe(String serviceName, Subscription subscription) {
        subscriptions.put(serviceName, subscription);
    }

    // Check if a subscription exists for a given service
    public boolean isSubscribed(String serviceName) {
        return subscriptions.containsKey(serviceName);
    }

    // Unsubscribe from a given service
    public void unsubscribe(String serviceName) {
        subscriptions.remove(serviceName);
    }

    // Get a subscription for a given service
    public Subscription getSubscription(String serviceName) {
        return subscriptions.get(serviceName);
    }

    // List all subscriptions
    public Map<String, Subscription> getAllSubscriptions() {
        return new HashMap<>(subscriptions);
    }

    // Additional methods as needed...
}
