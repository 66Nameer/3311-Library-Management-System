import api.*;
import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
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

        assertTrue("User's subscriptions should include the new subscription.",
                user.getSubscriptions().contains(newSubscription));
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

        assertTrue("User's subscriptions should include the new subscription.",
                user.getSubscriptions().contains(newSubscription));
    }

    @Test
    public void testLoginAndLogoutUser3() {
        SubscriptionData subscriptionData = SubscriptionData.getInstance();
        User user = new User("user@example.com", "password", UserType.STUDENT) {
            // Implement necessary methods if abstract
        };
        subscriptionData.loginUser(user);

        assertSame("The logged in user should match the user set in SubscriptionData.", user, subscriptionData.getUser());
        assertNotNull("A subscription object should be created upon login.", subscriptionData.getSubscription());

        // Now test logout functionality
        subscriptionData.logoutUser();

    }

    @Test
    public void testSingletonInstance3() {
        SubscriptionData firstInstance = SubscriptionData.getInstance();
        SubscriptionData secondInstance = SubscriptionData.getInstance();
        assertSame("There should only be one instance of SubscriptionData.", secondInstance, firstInstance);
    }

    @Test
    public void testSingletonInstance4() {
        SubscriptionData firstInstance = SubscriptionData.getInstance();
        SubscriptionData secondInstance = SubscriptionData.getInstance();
        assertSame("There should only be one instance of SubscriptionData.", secondInstance, firstInstance);
    }

    @Test
    public void testSingletonInstance5() {
        SubscriptionData firstInstance = SubscriptionData.getInstance();
        SubscriptionData secondInstance = SubscriptionData.getInstance();
        assertSame("There should only be one instance of SubscriptionData.", secondInstance, firstInstance);
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

        assertTrue("User's subscriptions should be empty after removing the subscription.",
                user.getSubscriptions().isEmpty());
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

        assertTrue("User's subscriptions should be empty after removing the subscription.",
                user.getSubscriptions().isEmpty());
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

        assertTrue("User's subscriptions should be empty after removing the subscription.",
                user.getSubscriptions().isEmpty());
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

        assertTrue("User's subscriptions should be empty after removing the subscription.",
                user.getSubscriptions().isEmpty());
    }
}
