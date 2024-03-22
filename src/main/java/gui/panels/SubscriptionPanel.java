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
    private Subscription sub;



    public SubscriptionPanel(MainFrame mainFrame) {
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


        subscribeButton.addActionListener(e -> {
            String selectedStation = stationGroup.getSelection().getActionCommand();
            for(Subscription sub2: SubscriptionData.getInstance().getUser().getSubscriptions() ){
                if(sub2.getServiceName() == selectedStation){
                    feedbackLabel.setText("You already subscribed to this!");
                    return;
                }
            }

            if (selectedStation != null && newsStationUrls.containsKey(selectedStation)) {
                String url = newsStationUrls.get(selectedStation);
                try {
//                    Subscription newSubscription = new Subscription(selectedStation, true);
//                    subscriptionManager.subscribe(selectedStation, SubscriptionData.getInstance());
                    SubscriptionDialog dialog = new SubscriptionDialog(
                            (Frame)SwingUtilities.getWindowAncestor(this), // Owner window
                            "Subscription Confirmation", // Dialog title
                            true, // Modal
                            selectedStation, // Station name
                            url// URL
                    );
                    dialog.setVisible(true); // Show the dialog
                    EventQueue.invokeLater(() -> {
                        WebBrowserWindow browserWindow = new WebBrowserWindow(url);
                        browserWindow.setVisible(true);
                    });
                    sub=new Subscription(selectedStation,true);
                    SubscriptionData.getInstance().addSubscription(sub);
                    System.out.println(SubscriptionData.getInstance().getUser().getSubscriptions());

                    feedbackLabel.setText("Subscribed successfully to " + selectedStation + ".");
                } catch (Exception ex) {
                    feedbackLabel.setText("Failed to subscribe to " + selectedStation + ".");
                }
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


    private void subscribeSubscription(){

    }

    private void cancelSubscription() {
        // Move the action listener setup to the constructor or an initialization method
        if(SubscriptionData.getInstance().getUser().getSubscriptions().isEmpty()){
            feedbackLabel.setText("You have no sub to cancel!!");
            return;
        }
        cancelButton.addActionListener(e -> {
            String selectedStation = stationGroup.getSelection().getActionCommand();
            if (selectedStation != null && confirmCancellation()) {
                SubscriptionData.getInstance().removeSubscription(sub);
                System.out.println(SubscriptionData.getInstance().getUser().getSubscriptions().isEmpty());
//                subscriptionManager.unsubscribe(selectedStation, SubscriptionData.getInstance());
                feedbackLabel.setText(selectedStation + " subscription cancelled.");
            } else {
                feedbackLabel.setText("Please select a station to cancel.");
            }
        });
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
            if(SubscriptionData.getInstance().getUser().getSubscriptions().isEmpty()){
                JOptionPane.showMessageDialog(this, "You do not have any sub", "My Subscriptions", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, subscriptionList.toString(), "My Subscriptions", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No subscriptions found or not logged in.", "My Subscriptions", JOptionPane.WARNING_MESSAGE);
        }
    }

}
