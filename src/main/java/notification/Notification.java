package src.main.java.notification;


/**
 * Use NotificationManager instead
 **/
@Deprecated(forRemoval = true)
public class Notification {

    private String alert;

    public Notification(String alert) {
        this.alert = alert;
    }

    public void showAlert() {

    }
}

