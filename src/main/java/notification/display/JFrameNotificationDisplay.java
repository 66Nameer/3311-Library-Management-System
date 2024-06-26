package notification.display;


import notification.display.component.NotificationWindow;

public class JFrameNotificationDisplay implements NotificationDisplay {

    @Override
    public void displayNotification(String message) {
        NotificationWindow instance = NotificationWindow.getInstance();
        if (!instance.isVisible()) {
            instance.setVisible(true);
        }
        instance.pushNotification(message);
    }
}
