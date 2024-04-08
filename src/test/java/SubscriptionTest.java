import api.*;


import java.time.LocalDate;
import java.util.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SubscriptionTest{

    @Test
    public void testAddSubscription3() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("ServiceName", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "adasd");


    }

    @Test
    public void testAddSubscription4() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("BBC", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "dadada");


    }
    @Test
    public void testAddSubscription5() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("CNN", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "dadasda");


    }
    @Test
    public void testAddSubscription6() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("CTV", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "adasdasda");


    }
    @Test
    public void testAddSubscription7() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("NYTimes", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "adasdasd");


    }
    @Test
    public void testAddSubscription8() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("Washington", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "dadasda");


    }
    @Test
    public void testAddSubscription9() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("Dallas", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "asdasda");


    }
    @Test
    public void testAddSubscription10() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("Netflix", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "sadadasa");


    }
    @Test
    public void testAddSubscription11() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("Crave", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "DA");


    }
    @Test
    public void testAddSubscription12() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("Amazon", true);
        user.addSubscription(subscription);
        assertEquals(1, user.getSubscriptions().size(), "ADASDA");


    }

}
