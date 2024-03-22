package api;

public class SessionManager {

    private static SessionManager instance = new SessionManager();

    private User currentUser;
    private Cart currentCart;

    private SessionManager() { }

    public static SessionManager getInstance() {
        return instance;
    }

    public void loginUser(User user) {
        this.currentUser = user;
        this.currentCart = new Cart(); // Or retrieve an existing cart for the user
    }

    public void logoutUser() {
        this.currentUser = null;
        this.currentCart = null;
        // Also handle persistence if necessary
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public Cart getCurrentCart() {
        return currentCart;
    }

}
