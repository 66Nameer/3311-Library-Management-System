package gui.panels;

import api.Subscription;
import api.*;
import gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class SubscriptionPanel extends JPanel {
    private ButtonGroup stationGroup = new ButtonGroup();
    private JButton subscribeButton = new JButton("Subscribe");
    private JButton cancelButton = new JButton("Cancel Subscription");
    private JButton back=new JButton("Back");
    private JButton listSubscriptionsButton = new JButton("List My Subscriptions");
    private JLabel feedbackLabel = new JLabel(" ");
    private MainFrame mainFrame; // Reference to the main application frame
    private SubscriptionManager subscriptionManager;



    public SubscriptionPanel(MainFrame mainFrame, SubscriptionManager subscriptionManager) {
        HashMap<String, String> newsStationUrls = new HashMap<>();
        newsStationUrls.put("CNN", "https://www.cnn.com");
        newsStationUrls.put("NY Times", "https://www.nytimes.com");
        newsStationUrls.put("Fox News", "https://www.foxnews.com");
        newsStationUrls.put("CTV", "https://www.ctvnews.ca");
        this.mainFrame = mainFrame;
        this.subscriptionManager=subscriptionManager;

        setLayout(new BorderLayout(10, 10));

        // Panel for station buttons
        JPanel stationPanel = new JPanel(new GridLayout(0, 1)); // 1 column, dynamic rows

        // Sample news stations
        String[] stations = {"CNN", "NY Times", "Fox News", "CTV"};

        // Create a radio button for each station
        for (String station : stations) {
            JRadioButton stationButton = new JRadioButton(station);
            stationButton.setActionCommand(station); // Set the action command to the station's name
            stationGroup.add(stationButton); // Add the button to the group for exclusive selection
            stationPanel.add(stationButton);
        }

        add(stationPanel, BorderLayout.CENTER);

        // Subscribe button action
        subscribeButton.addActionListener(e->{
            String selectedStation = stationGroup.getSelection().getActionCommand();
            if (selectedStation != null && newsStationUrls.containsKey(selectedStation)) {
                String url = newsStationUrls.get(selectedStation);
                // Open the subscription dialog

                SubscriptionDialog dialog = new SubscriptionDialog(
                        (Frame) SwingUtilities.getWindowAncestor(this), // Owner window
                        "Subscription Confirmation", // Dialog title
                        true, // Modal
                        selectedStation, // Station name
                        url, // URL
                        subscriptionManager // Subscription manager
                );
                EventQueue.invokeLater(() -> {
                    WebBrowserWindow browserWindow = new WebBrowserWindow(url);
                    browserWindow.setVisible(true);
                });

                dialog.setVisible(true); // Show the dialog
            } else {
                feedbackLabel.setText("Please select a station to subscribe.");
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showCard("UserDashboardPanel");
            }
        });
        cancelButton.addActionListener(e -> cancelSubscription());

        // Panel for subscribe button and feedback label
        JPanel actionPanel = new JPanel();
        actionPanel.add(subscribeButton);
        actionPanel.add(back);
        actionPanel.add(listSubscriptionsButton);
        actionPanel.add(feedbackLabel);
        actionPanel.add(cancelButton); // Add the cancel button to your panel


        listSubscriptionsButton.addActionListener(e -> listUserSubscriptions());
        add(actionPanel, BorderLayout.SOUTH);
    }


    private void cancelSubscription() {
        String selectedStation = stationGroup.getSelection().getActionCommand();
        if (selectedStation != null && confirmCancellation()) {
            subscriptionManager.unsubscribe(selectedStation);
            feedbackLabel.setText(selectedStation + " subscription cancelled.");
            // Refresh subscription list or UI as needed
        } else {
            feedbackLabel.setText("Please select a station to cancel.");
        }
    }

    private boolean confirmCancellation() {
        int response = JOptionPane.showConfirmDialog(null, "Confirm cancellation?", "Confirm", JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.YES_OPTION;
    }

    private void listUserSubscriptions() {
        User currentUser = SubscriptionData.getInstance().getUser();
        if (currentUser != null) {
            StringBuilder subscriptionList = new StringBuilder("<html>");
            for (Subscription subscription : currentUser.getSubscriptions()) {
                subscriptionList.append(subscription.getServiceName())
                        .append(" - ")
                        .append(subscription.isActive() ? "Active" : "Inactive")
                        .append("<br>"); // Adding a line break for HTML formatting
            }
            subscriptionList.append("</html>");

            // Display the subscriptions in a dialog
            JOptionPane.showMessageDialog(this, subscriptionList.toString(), "My Subscriptions", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Handle case where no user is logged in or no subscriptions exist
            JOptionPane.showMessageDialog(this, "No subscriptions found or not logged in.", "My Subscriptions", JOptionPane.WARNING_MESSAGE);
        }
    }

}
