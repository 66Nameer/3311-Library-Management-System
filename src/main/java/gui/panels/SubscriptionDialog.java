package gui.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import api.*;
import gui.MainFrame;

public class SubscriptionDialog extends JDialog {
    private JButton confirmButton;
    private JButton cancelButton;
    private JLabel messageLabel;
    private MainFrame main;

    public SubscriptionDialog(Frame owner, String title, boolean modal, String stationName, String url, MainFrame mainFrame) {
        super(owner, title, modal);
        this.main=mainFrame;
        setSize(300, 200); // Set dialog size or pack() for automatic sizing based on contents
        setLocationRelativeTo(owner); // Center the dialog relative to the owner

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

//            subscriptionManager.subscribe(stationName, SubscriptionData.getInstance());
            // Optionally: Load the content in the main application window

            dispose(); // Close the dialog
            EventQueue.invokeLater(() -> {
                PaymentMethodDialog paymentDialog = new PaymentMethodDialog((Frame) SubscriptionDialog.this.getOwner(), stationName,url);
                paymentDialog.setVisible(true);
            });
//           JOptionPane.showMessageDialog(this, "Subscribed successfully to " + stationName);
        });

        cancelButton.addActionListener(e -> dispose()); // Just close the dialog without subscribing
    }


}
