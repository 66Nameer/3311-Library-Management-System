package src.main.java.notification;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// Acts as the observable class
public class NotificationManager {

    private final Map<NotifyType, List<MessageListener>> notifyTypeListMap;

    public NotificationManager() {
        notifyTypeListMap = new HashMap<>();
        this.initializeMap(notifyTypeListMap);
    }

    public void addNotification(NotifyType type, MessageListener listener) {
        Optional.of(notifyTypeListMap.get(type)).ifPresent(messageListeners -> messageListeners.add(listener));
    }

    public void removeNotification(NotifyType type, MessageListener listener) {
        Optional.of(notifyTypeListMap.get(type)).ifPresent(messageListeners -> messageListeners.remove(listener));
    }

    public void clearNotifications(NotifyType type) {
        Optional.of(notifyTypeListMap.get(type)).ifPresent(List::clear);
    }

    public void notify(NotifyType type) {
        Optional.of(notifyTypeListMap.get(type)).ifPresent(messageListeners -> messageListeners.forEach(listener -> listener.update(type)));
    }

    private void initializeMap(Map<NotifyType, List<MessageListener>> map) {
        for (NotifyType type : NotifyType.values()) {
            map.put(type, List.of());
        }
    }
}
