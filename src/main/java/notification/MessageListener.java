package notification;

// Acts as the observer interface
public interface MessageListener {
    void update(NotifyType type);
}
