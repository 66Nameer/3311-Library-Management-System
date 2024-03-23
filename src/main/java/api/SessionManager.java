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
        currentCart = new api.Cart();

    }




    public void logoutUser() {
        this.currentUser = null;
        this.currentCart = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public api.Cart getCurrentCart() {
        return currentCart;
    }
}
