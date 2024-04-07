import api.*;


import java.time.LocalDate;
import java.util.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class SubscriptionDataTest{
    @Test
    public void testSubscriptionData2() {
        SubscriptionData subscriptionData = SubscriptionData.getInstance();
        User user = new User("user@example.com", "password", UserType.STUDENT) {
            private ArrayList<Subscription> subscriptions = new ArrayList<>();

            @Override
            public void addSubscription(Subscription subscription) {
                subscriptions.add(subscription);
            }

            @Override
            public ArrayList<Subscription> getSubscriptions() {
                return subscriptions;
            }
        };

        subscriptionData.loginUser(user);
        Subscription newSubscription = new Subscription("NewService", true);
        subscriptionData.addSubscription(newSubscription);

        assertTrue(user.getSubscriptions().contains(newSubscription),
                "User's subscriptions should include the new subscription.");
    }


    @Test
    public void testSubscriptionData3() {
        SubscriptionData subscriptionData = SubscriptionData.getInstance();
        User user = new User("user@example.com", "password", UserType.STUDENT) {
            private ArrayList<Subscription> subscriptions = new ArrayList<>();

            @Override
            public void addSubscription(Subscription subscription) {
                subscriptions.add(subscription);
            }

            @Override
            public ArrayList<Subscription> getSubscriptions() {
                return subscriptions;
            }
        };

        subscriptionData.loginUser(user);
        Subscription newSubscription = new Subscription("News", true);
        subscriptionData.addSubscription(newSubscription);

        assertTrue(user.getSubscriptions().contains(newSubscription),
                "User's subscriptions should include the new subscription.");
    }

    @Test
    public void testLoginAndLogoutUser3() {
        SubscriptionData subscriptionData = SubscriptionData.getInstance();
        User user = new User("user@example.com", "password", UserType.STUDENT) {
            // Implement necessary methods if abstract
        };
        subscriptionData.loginUser(user);

        assertSame(user, subscriptionData.getUser(), "The logged in user should match the user set in SubscriptionData.");
        assertNotNull( subscriptionData.getSubscription());

        // Now test logout functionality
        subscriptionData.logoutUser();

    }

    @Test
    public void testSingletonInstance3() {
        SubscriptionData firstInstance = SubscriptionData.getInstance();
        SubscriptionData secondInstance = SubscriptionData.getInstance();
        assertSame(secondInstance, firstInstance, "There should only be one instance of SubscriptionData.");
    }

    @Test
    public void testSingletonInstance4() {
        SubscriptionData firstInstance = SubscriptionData.getInstance();
        SubscriptionData secondInstance = SubscriptionData.getInstance();
        assertSame(secondInstance, firstInstance, "There should only be one instance of SubscriptionData.");
    }

    @Test
    public void testSingletonInstance5() {
        SubscriptionData firstInstance = SubscriptionData.getInstance();
        SubscriptionData secondInstance = SubscriptionData.getInstance();
        assertSame(secondInstance, firstInstance, "There should only be one instance of SubscriptionData.");
    }


    @Test
    public void testRemoveSubscription2() {
        SubscriptionData subscriptionData = SubscriptionData.getInstance();
        User user = new User("user@example.com", "password", UserType.STUDENT) {
            private ArrayList<Subscription> subscriptions = new ArrayList<>();

            {
                // Add initial subscription to simulate existing state
                subscriptions.add(new Subscription("ExistingService", true));
            }

            @Override
            public void removeSubscription(String serviceName) {
                subscriptions.removeIf(s -> s.getServiceName().equals(serviceName));
            }

            @Override
            public ArrayList<Subscription> getSubscriptions() {
                return subscriptions;
            }
        };

        subscriptionData.loginUser(user);
        subscriptionData.removeSubscription("ExistingService");

        assertTrue(user.getSubscriptions().isEmpty(),
                "User's subscriptions should be empty after removing the subscription.");
    }

    @Test
    public void testRemoveSubscription5() {
        SubscriptionData subscriptionData = SubscriptionData.getInstance();
        User user = new User("user@example.com", "password", UserType.STUDENT) {
            private ArrayList<Subscription> subscriptions = new ArrayList<>();

            {
                // Add initial subscription to simulate existing state
                subscriptions.add(new Subscription("Service", true));
            }

            @Override
            public void removeSubscription(String serviceName) {
                subscriptions.removeIf(s -> s.getServiceName().equals(serviceName));
            }

            @Override
            public ArrayList<Subscription> getSubscriptions() {
                return subscriptions;
            }
        };

        subscriptionData.loginUser(user);
        subscriptionData.removeSubscription("Service");

        assertTrue(user.getSubscriptions().isEmpty(),
                "User's subscriptions should be empty after removing the subscription.");
    }

    @Test
    public void testRemoveSubscription3() {
        SubscriptionData subscriptionData = SubscriptionData.getInstance();
        User user = new User("user@example.com", "password", UserType.STUDENT) {
            private ArrayList<Subscription> subscriptions = new ArrayList<>();

            {
                // Add initial subscription to simulate existing state
                subscriptions.add(new Subscription("Existing", true));
            }

            @Override
            public void removeSubscription(String serviceName) {
                subscriptions.removeIf(s -> s.getServiceName().equals(serviceName));
            }

            @Override
            public ArrayList<Subscription> getSubscriptions() {
                return subscriptions;
            }
        };

        subscriptionData.loginUser(user);
        subscriptionData.removeSubscription("Existing");

        assertTrue(user.getSubscriptions().isEmpty(),
                "User's subscriptions should be empty after removing the subscription.");
    }

    @Test
    public void testRemoveSubscription4() {
        SubscriptionData subscriptionData = SubscriptionData.getInstance();
        User user = new User("user@example.com", "password", UserType.STUDENT) {
            private ArrayList<Subscription> subscriptions = new ArrayList<>();

            {
                // Add initial subscription to simulate existing state
                subscriptions.add(new Subscription("ExistService", true));
            }

            @Override
            public void removeSubscription(String serviceName) {
                subscriptions.removeIf(s -> s.getServiceName().equals(serviceName));
            }

            @Override
            public ArrayList<Subscription> getSubscriptions() {
                return subscriptions;
            }
        };

        subscriptionData.loginUser(user);
        subscriptionData.removeSubscription("ExistService");

        assertTrue(user.getSubscriptions().isEmpty(),
                "User's subscriptions should be empty after removing the subscription.");
    }
}
