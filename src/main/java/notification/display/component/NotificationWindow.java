package notification.display.component;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NotificationWindow extends JFrame {

    // Single Instance so that only ONE notification window can appear at a time
    private static NotificationWindow INSTANCE;
    private final NotificationPanel notificationPanel;

    private NotificationWindow() {
        setTitle("Notifications");
        setSize(300, 400); // Set desired size (don't think this is needed due to the pack() method)
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        notificationPanel = new NotificationPanel();
        JScrollPane scrollPane = new JScrollPane(notificationPanel);
        add(scrollPane);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Clear all notifications
                NotificationWindow.this.clearNotifications();
            }
        });
    }

    public static NotificationWindow getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NotificationWindow();
        }
        return INSTANCE;
    }

    public void pushNotification(String message) {
        notificationPanel.addNotification(message);
        pack();
    }

    public void clearNotifications() {
        notificationPanel.removeAll();
        notificationPanel.revalidate();
        notificationPanel.repaint();
    }
}
