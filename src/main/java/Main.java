package src.main.java;

import src.main.java.notification.AppMessageListener;
import src.main.java.notification.NotificationManager;
import src.main.java.notification.NotifyType;
import src.main.java.notification.display.JFrameNotificationDisplay;
import src.main.java.notification.display.component.NotificationWindow;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        User user = new Student();
        user.getNotificationService().addNotification(NotifyType.OVERDUE, new AppMessageListener(new JFrameNotificationDisplay(), "Pumping Textbook"));
        user.getNotificationService().addNotification(NotifyType.OVERDUE, new AppMessageListener(new JFrameNotificationDisplay(), "Pumping Textbook 2"));
        user.getNotificationService().addNotification(NotifyType.OVERDUE, new AppMessageListener(new JFrameNotificationDisplay(), "Pumping Textbook 3"));
        user.getNotificationService().notify(NotifyType.OVERDUE);



    }
}
