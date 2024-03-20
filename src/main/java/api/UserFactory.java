package api;

public class UserFactory {
    public static User createUser(String userType, String email, String password) {
        switch (userType.toLowerCase()) {
            case "Manager":
                return new Manager(email, password);
            case "Student":
                return new Student(email, password);
            case "Saculty":
                return new Faculty(email, password);
            case "Visitor":
                return new Visitor(email, password);
            case "Staff":
                return  new Staff(email, password);
            default:
                throw new IllegalArgumentException("Unknown user type: " + userType);
        }
    }
}
