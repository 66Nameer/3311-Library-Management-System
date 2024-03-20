package api;

public class SimpleUserFactory {

    public User createUser(String email, String password, UserType type) {
        return switch (type) {
            case STUDENT -> new Student(email, password);
            case FACULTY -> new Faculty(email, password);
            case VISITOR -> new Visitor(email, password);
            case STAFF -> new Staff(email, password);
            case MANAGER -> new Manager(email, password);
        };
    }
}
