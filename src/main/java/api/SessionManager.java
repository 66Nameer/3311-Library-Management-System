package api;

public class SessionManager {

    private static SessionManager instance = new SessionManager();

    private static User currentUser;
    private static api.Cart currentCart;



    private SessionManager() { }

    public static SessionManager getInstance() {
        return instance;
    }

    public void loginUser(User user) {
        currentUser = user;
        currentCart = new api.Cart(); // Or retrieve an existing cart for the user

    }




    public void logoutUser() {
        this.currentUser = null;
        this.currentCart = null;
        // Also handle persistence if necessary
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public api.Cart getCurrentCart() {
        return currentCart;
    }
}
