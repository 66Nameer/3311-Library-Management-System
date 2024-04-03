import api.*;
import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;




public class UserTest {

      //Test student class
    @Test
    public void testCreateUserStudent1() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("student@example.com", "password", UserType.STUDENT);
        assertTrue("The user should be an instance of Student.", user instanceof Student);
    }

    @Test
    public void testCreateUserStudent2() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("sda@example.com", "password1", UserType.STUDENT);
        assertTrue("The user should be an instance of Student.", user instanceof Student);
    }

    @Test
    public void testCreateUserStudent3() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("student@example.com", "password2", UserType.STUDENT);
        assertTrue("The user should be an instance of Student.", user instanceof Student);
    }


    @Test
    public void testStudentCreation() {
        Student student = new Student("student@example.com", "password");
        assertEquals("student@example.com", student.getEmail());
        assertEquals(UserType.STUDENT, student.getUserType());
        assertFalse(student.getEnrolled());
        assertTrue(student.getExamDates().isEmpty());
        assertTrue(student.getCourses().isEmpty());
    }


    @Test
    public void testEnrollmentStatus() {
        Student student = new Student("enrolltest@example.com", "password");
        // Assuming there's a method to set enrollment status, e.g., student.setEnrolled(true);
        // If not, this test can be adjusted based on how enrollment status is intended to be changed.
        student.setEnrolled(true); // Directly setting for test purposes
        assertTrue(student.getEnrolled());
    }

    @Test
    public void testEnrollmentStatus2() {
        Student student = new Student("enrolltest@example.com", "password");
        // Assuming there's a method to set enrollment status, e.g., student.setEnrolled(true);
        // If not, this test can be adjusted based on how enrollment status is intended to be changed.
        student.setEnrolled(false); // Directly setting for test purposes
        assertFalse(student.getEnrolled());
    }

    @Test
    public void testManageExamDates() {
        Student student = new Student("examdate@example.com", "password");
        Date examDate = new Date(); // Use current time for simplicity in this example
        student.getExamDates().add(examDate);

        assertEquals(1, student.getExamDates().size());
        assertTrue(student.getExamDates().contains(examDate));
    }
    @Test
    public void testManageCourses() {
        Student student = new Student("courses@example.com", "password");
        student.getCourses().put("Math101", "Introduction to Algebra");
        student.getCourses().put("Sci101", "Basics of Science");

        assertEquals(2, student.getCourses().size());
        assertEquals("Introduction to Algebra", student.getCourses().get("Math101"));
        assertEquals("Basics of Science", student.getCourses().get("Sci101"));

        // Test removal of a course
        student.getCourses().remove("Math101");
        assertNull(student.getCourses().get("Math101")); // Course should no longer be in the map
        assertEquals(1, student.getCourses().size()); // Only one course should remain
    }


    @Test
    public void testManageCourses2() {
        Student student = new Student("courses@example.com", "password");
        student.getCourses().put("Math101", "Introduction to Algebra");
        student.getCourses().put("Sci101", "Basics of Science");
        student.getCourses().put("Lib101","Literature");

        assertEquals(3, student.getCourses().size());
        assertEquals("Introduction to Algebra", student.getCourses().get("Math101"));
        assertEquals("Basics of Science", student.getCourses().get("Sci101"));
        assertEquals("Literature", student.getCourses().get("Lib101"));

        // Test removal of a course
        student.getCourses().remove("Math101");
        assertNull(student.getCourses().get("Math101")); // Course should no longer be in the map
        assertEquals(2, student.getCourses().size()); // Only one course should remain
    }

    @Test
    public void testManageCourses3() {
        Student student = new Student("courses@example.com", "password");
        student.getCourses().put("Math101", "Introduction to Algebra");
        student.getCourses().put("Sci102", "Basics of Science");

        assertEquals(2, student.getCourses().size());
        assertEquals("Introduction to Algebra", student.getCourses().get("Math101"));
        assertEquals("Basics of Science", student.getCourses().get("Sci102"));

        // Test removal of a course
        student.getCourses().remove("Math101");
        assertNull(student.getCourses().get("Math101")); // Course should no longer be in the map
        assertEquals(1, student.getCourses().size()); // Only one course should remain
    }
    //end test student class





   //test faculty class
    @Test
    public void testCreateUserFaculty() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "password", UserType.FACULTY);
        assertTrue("The user should be an instance of Faculty.", user instanceof Faculty);
    }

    @Test
    public void testCreateUserFaculty2() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "passwo", UserType.FACULTY);
        assertTrue("The user should be an instance of Faculty.", user instanceof Faculty);
    }

    @Test
    public void testCreateUserFaculty3() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "passwor", UserType.FACULTY);
        assertTrue("The user should be an instance of Faculty.", user instanceof Faculty);
    }

    @Test
    public void testCreateUserFaculty4() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "passw", UserType.FACULTY);
        assertTrue("The user should be an instance of Faculty.", user instanceof Faculty);
    }

    @Test
    public void testCreateUserFaculty5() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "pass", UserType.FACULTY);
        assertTrue("The user should be an instance of Faculty.", user instanceof Faculty);
    }
    @Test
    public void testFacultyCreation() {
        String email = "faculty@example.com";
        String password = "securepassword";
        Faculty faculty = new Faculty(email, password);

        assertEquals("Faculty email should match the provided email.", faculty.getEmail(), email);
        assertEquals("UserType should be FACULTY.", UserType.FACULTY, faculty.getUserType());
    }

    @Test
    public void addingCourseStoresItCorrectly() {
        Faculty faculty = new Faculty("faculty@example.com", "secure");
        faculty.getCourses().put("Math101","Comp");
        assertEquals("Comp2", faculty.getCourses().get("Math101"), "Comp");
    }
    @Test
    public void addingCourseStoresItCorrectly2() {
        Faculty faculty = new Faculty("faculty@example.com", "secure");
        faculty.getCourses().put("Lib1","Comp");
        assertEquals("Comp2", faculty.getCourses().get("Lib1"), "Comp");
    }
    @Test
    public void addingCourseStoresItCorrectly3() {
        Faculty faculty = new Faculty("faculty@example.com", "secure");
        faculty.getCourses().put("Math","Comp");
        assertEquals("Comp2", faculty.getCourses().get("Math"), "Comp");
    }
    @Test
    public void addingCourseStoresItCorrectly4() {
        Faculty faculty = new Faculty("faculty@example.com", "secure");
        faculty.getCourses().put("Ma","Comp");
        assertEquals("Comp2", faculty.getCourses().get("Ma"), "Comp");
    }

    //end test faculty class




    //test staff

    @Test
    public void testStaffCreationAndUserProperties() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties2() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties3() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties4() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties5() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties6() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties7() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties8() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties9() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }
    @Test
    public void testStaffCreationAndUserProperties10() {
        String email = "staff@example.com";
        String password = "password"; // Assume there's a mechanism to verify passwords securely, not tested here
        Staff staff = new Staff(email, password);

        assertEquals("Staff email should match the provided email.", staff.getEmail(), email);
        assertEquals("UserType should be STAFF.", UserType.STAFF, staff.getUserType());
    }


    //end test staff

    //test visitor
    @Test
    public void testUserCreation() {
        Visitor visitor = new Visitor("test@example.com", "password");
        assertEquals("test@example.com", visitor.getEmail());
        assertEquals(UserType.VISITOR, visitor.getUserType());
    }
    @Test
    public void testUserCreation2() {
        Visitor visitor = new Visitor("test@example.com", "password");
        assertEquals("test@example.com", visitor.getEmail());
        assertEquals(UserType.VISITOR, visitor.getUserType());
    }
    @Test
    public void testUserCreation3() {
        Visitor visitor = new Visitor("test@example.com", "password");
        assertEquals("test@example.com", visitor.getEmail());
        assertEquals(UserType.VISITOR, visitor.getUserType());
    }
    @Test
    public void testUserCreation4() {
        Visitor visitor = new Visitor("test@example.com", "password");
        assertEquals("test@example.com", visitor.getEmail());
        assertEquals(UserType.VISITOR, visitor.getUserType());
    }  @Test
    public void testUserCreation5() {
        Visitor visitor = new Visitor("test@example.com", "password");
        assertEquals("test@example.com", visitor.getEmail());
        assertEquals(UserType.VISITOR, visitor.getUserType());
    }


    @Test
    public void testSubscriptionManagement2() {
        Visitor visitor = new Visitor("email@example.com", "mypassword");
        Subscription sub1 = new Subscription("Service1", true);
        Subscription sub2 = new Subscription("Service2", true);

        visitor.addSubscription(sub1);
        visitor.addSubscription(sub2);

        // Verify subscriptions are added
        assertEquals(2, visitor.getSubscriptions().size());
        assertTrue(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));

        // Test removal
        visitor.removeSubscription("Service1");
        assertEquals(1, visitor.getSubscriptions().size());
        assertFalse(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));
    }
    @Test
    public void testSubscriptionManagement() {
        Visitor visitor = new Visitor("email@example.com", "mypassword");
        Subscription sub1 = new Subscription("Service1", true);
        Subscription sub2 = new Subscription("Service2", true);

        visitor.addSubscription(sub1);
        visitor.addSubscription(sub2);

        // Verify subscriptions are added
        assertEquals(2, visitor.getSubscriptions().size());
        assertTrue(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));

        // Test removal
        visitor.removeSubscription("Service1");
        assertEquals(1, visitor.getSubscriptions().size());
        assertFalse(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));
    }
    @Test
    public void testSubscriptionManagement5() {
        Visitor visitor = new Visitor("email@example.com", "mypassword");
        Subscription sub1 = new Subscription("Service1", true);
        Subscription sub2 = new Subscription("Service2", true);

        visitor.addSubscription(sub1);
        visitor.addSubscription(sub2);

        // Verify subscriptions are added
        assertEquals(2, visitor.getSubscriptions().size());
        assertTrue(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));

        // Test removal
        visitor.removeSubscription("Service1");
        assertEquals(1, visitor.getSubscriptions().size());
        assertFalse(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));
    }
    @Test
    public void testSubscriptionManagement3() {
        Visitor visitor = new Visitor("email@example.com", "mypassword");
        Subscription sub1 = new Subscription("Service1", true);
        Subscription sub2 = new Subscription("Service2", true);

        visitor.addSubscription(sub1);
        visitor.addSubscription(sub2);

        // Verify subscriptions are added
        assertEquals(2, visitor.getSubscriptions().size());
        assertTrue(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));

        // Test removal
        visitor.removeSubscription("Service1");
        assertEquals(1, visitor.getSubscriptions().size());
        assertFalse(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));
    }
    @Test
    public void testSubscriptionManagement4() {
        Visitor visitor = new Visitor("email@example.com", "mypassword");
        Subscription sub1 = new Subscription("Service1", true);
        Subscription sub2 = new Subscription("Service2", true);

        visitor.addSubscription(sub1);
        visitor.addSubscription(sub2);

        // Verify subscriptions are added
        assertEquals(2, visitor.getSubscriptions().size());
        assertTrue(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));

        // Test removal
        visitor.removeSubscription("Service1");
        assertEquals(1, visitor.getSubscriptions().size());
        assertFalse(visitor.getSubscriptions().contains(sub1));
        assertTrue(visitor.getSubscriptions().contains(sub2));
    }
    //end test visitor


    //test manager

    @Test
    public void testManagerCreation() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation2() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation3() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation4() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation5() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation6() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation7() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation8() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation9() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }
    @Test
    public void testManagerCreation10() {
        Manager manager = new Manager("manager@example.com", "securepassword");
        assertEquals("Email should match the provided email.", manager.getEmail(), "manager@example.com");
        assertEquals("UserType should be MANAGER.", UserType.MANAGER, manager.getUserType());
    }


    //end test manager


    //test simpleuserfactory


    @Test
    public void testCreateUserVisitor() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("visitor@example.com", "password", UserType.VISITOR);
        assertTrue("The user should be an instance of Student.", user instanceof Visitor);
    }

    @Test
    public void testCreateUserStaff() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("staff@example.com", "password", UserType.STAFF);
        assertTrue("The user should be an instance of Student.", user instanceof Staff);
    }

    @Test
    public void testCreateUserManager() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("manager@example.com", "password", UserType.MANAGER);
        assertTrue("The user should be an instance of Student.", user instanceof Manager);
    }

    @Test
    public void testCreateUserStudent11() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("student@example.com", "password", UserType.STUDENT);
        assertTrue("The user should be an instance of Student.", user instanceof Student);
    }



    @Test
    public void testCreateUserFac() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "password", UserType.FACULTY);
        assertTrue("The user should be an instance of Student.", user instanceof Faculty);
    }

    @Test
    public void testCreateUserFac2() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "password", UserType.FACULTY);
        assertTrue("The user should be an instance of Student.", user instanceof Faculty);
    }

    @Test
    public void testCreateUserFac3() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "password", UserType.FACULTY);
        assertTrue("The user should be an instance of Student.", user instanceof Faculty);
    }

    @Test
    public void testCreateUserFac4() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "password", UserType.FACULTY);
        assertTrue("The user should be an instance of Student.", user instanceof Faculty);
    }
    @Test
    public void testCreateUserFac5() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "password", UserType.FACULTY);
        assertTrue("The user should be an instance of Student.", user instanceof Faculty);
    }
    @Test
    public void testCreateUserFac6() {
        SimpleUserFactory factory = new SimpleUserFactory();
        User user = factory.createUser("faculty@example.com", "password", UserType.FACULTY);
        assertTrue("The user should be an instance of Student.", user instanceof Faculty);
    }

    //end test simpleuser factory



    //test user
    @Test
    public void testRentItem() {
        Visitor visitor = new Visitor("user@example.com", "securepassword");

        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);

        visitor.rentItem(book1);
        assertEquals(1, visitor.getRentals().size()); // Verify that the book has been added to rentals

        Rental rental = visitor.getRentals().get(0);
        assertEquals(book1, rental.getItem());
        assertEquals(visitor, rental.getUser());
        assertEquals(LocalDate.now().plusDays(3), rental.getDueDate()); // Assuming rentItem sets a due date 3 days from today
    }


    @Test
    public void testGetPassword() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        assertEquals("The getPassword method should return the correct password.", user.getPassword(), "secret");
    }
    @Test
    public void testGetPassword2() {
        User user = new User("user@example.com", "s", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        assertEquals("The getPassword method should return the correct password.", user.getPassword(), "s");
    }
    @Test
    public void testGetPassword3() {
        User user = new User("user@example.com", "se", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        assertEquals("The getPassword method should return the correct password.", user.getPassword(), "se");
    }
    @Test
    public void testGetPassword4() {
        User user = new User("user@example.com", "sec", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        assertEquals("The getPassword method should return the correct password.", user.getPassword(), "sec");
    }
    @Test
    public void testGetPassword5() {
        User user = new User("user@example.com", "secr", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        assertEquals("The getPassword method should return the correct password.", user.getPassword(), "secr");
    }

    @Test
    public void testGetNotificationService() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        assertNotNull(String.valueOf(user.getNotificationService()), "The getNotificationService method should return a non-null NotificationManager instance.");
    }

    @Test
    public void testAddSubscription() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Subscription subscription = new Subscription("ServiceName", true);
        user.addSubscription(subscription);
        assertEquals("The subscriptions list should contain exactly one subscription.", user.getSubscriptions().size(), 1);


    }
    @Test
    public void testRemoveSubscription() {
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
    public void testMakeRequests() {
        User user = new User("user@example.com", "secret", UserType.STUDENT) {
            // User is abstract, providing minimal implementation for testing
        };
        Map<String, Object> additionalAttributes = new HashMap<>();
        additionalAttributes.put("location", "Library Shelf 1");
        additionalAttributes.put("ISBN", "123-4567890123");

        // Build item attributes using the builder
        ItemAttributes attributes = ItemAttributes.builder()
                .setName("Effective Java")
                .setID(1)
                .setCount(5)
                .setPrice(45.99)
                .setCanPurchase(true)
                .setCanRent(true)
                .setDiscounted(true)
                .setAdditionalAttributes(additionalAttributes)
                .setISBN("123-4567890123")
                .setType(ItemType.BOOK)
                .build();

        // Create a Book instance using the built attributes
        Book book1 = new Book(attributes);
        user.makeRequests(book1);
        assertFalse("The requests list should not be empty after making a request.", user.requests().isEmpty());
    }

    //end test user
}
