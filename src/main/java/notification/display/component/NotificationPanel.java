package src.main.java.notification.display.component;

import javax.swing.*;
import java.awt.*;

public class NotificationPanel extends JPanel {

    public NotificationPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void addNotification(String message) {
        JLabel label = new JLabel(message);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        Font newFont = new Font(label.getName(), label.getFont().getStyle(), 18);
        label.setFont(newFont);
        // Add some styling or additional components to label if necessary
        add(label);
        revalidate();
        repaint();
    }

    public void removeNotification(JLabel label) {
        remove(label);
        revalidate();
        repaint();
    }
}
