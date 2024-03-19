package notification;


import notification.display.NotificationDisplay;

// Acts as a concrete observer
public class AppMessageListener implements MessageListener {

    private final NotificationDisplay display;
    private final String message;

    public AppMessageListener(NotificationDisplay display, String message) {
        this.display = display;
        this.message = message;
    }

    @Override
    public void update(NotifyType type) {
        String text = switch (type) {
            case OVERDUE -> "The following item is overdue: ";
            case NEW_TEXTBOOK_STOCK -> "There is a new textbook in stock for ";
            case APPROACHING_OVERDUE -> "The following item is approaching the return deadline: ";
        };
        display.displayNotification(text + message);
    }
}
