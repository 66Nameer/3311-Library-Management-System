package gui.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import api.*;

public class SubscriptionDialog extends JDialog {
    private JButton confirmButton;
    private JButton cancelButton;
    private JLabel messageLabel;

    public SubscriptionDialog(Frame owner, String title, boolean modal, String stationName, String url, SubscriptionManager subscriptionManager) {
        super(owner, title, modal);
        setSize(300, 200); 
        setLocationRelativeTo(owner); 

        setLayout(new BorderLayout());

        messageLabel = new JLabel("<html>Confirm subscription to: <b>" + stationName + "</b></html>");
        add(messageLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        confirmButton = new JButton("Confirm");
        cancelButton = new JButton("Cancel");
        buttonPanel.add(confirmButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);

        confirmButton.addActionListener(e -> {
            subscriptionManager.subscribe(stationName, new Subscription(stationName, true));
           
            JOptionPane.showMessageDialog(this, "Subscribed successfully to " + stationName);
            dispose(); 
        });

        cancelButton.addActionListener(e -> dispose()); 
    }
}
