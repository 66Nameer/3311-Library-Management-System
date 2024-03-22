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
    private JButton read=new JButton("Read");
    private JButton listSubscriptionsButton = new JButton("List My Subscriptions");
    private JLabel feedbackLabel = new JLabel(" ");
    private MainFrame mainFrame; 

    private Subscription sub;



    public SubscriptionPanel(MainFrame mainFrame) {
        HashMap<String, String> newsStationUrls = new HashMap<>();
        newsStationUrls.put("CNN", "https://www.cnn.com");
        newsStationUrls.put("NY Times", "https://www.nytimes.com");
        newsStationUrls.put("Fox News", "https://www.foxnews.com");
        newsStationUrls.put("CTV", "https://www.ctvnews.ca");
        this.mainFrame = mainFrame;


        setLayout(new BorderLayout(10, 10));

    
        JPanel stationPanel = new JPanel(new GridLayout(0, 1)); 

   
        String[] stations = {"CNN", "NY Times", "Fox News", "CTV"};

        for (String station : stations) {
            JRadioButton stationButton = new JRadioButton(station);
            stationButton.setActionCommand(station); 
            stationGroup.add(stationButton); 
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
            boolean subexist =  SubscriptionManager.subscriptionExists(SubscriptionData.getInstance().getUser().getEmail(), selectedStation);
            if(subexist==true){
                feedbackLabel.setText("You already subscribed to this!");
                return;
            }

            if (selectedStation != null && newsStationUrls.containsKey(selectedStation)) {
                String url = newsStationUrls.get(selectedStation);
                try {

                    SubscriptionDialog dialog = new SubscriptionDialog(
                            (Frame)SwingUtilities.getWindowAncestor(this), 
                            "Subscription Confirmation", 
                            true, // Modal
                            selectedStation, 
                            url,
                            mainFrame
                    );
                    dialog.setVisible(true);

                    sub=new Subscription(selectedStation,true);
                    SubscriptionData.getInstance().addSubscription(sub);



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

        read.addActionListener(e-> {
                String selectedStation = stationGroup.getSelection().getActionCommand();
                boolean subexist1 =  SubscriptionManager.subscriptionExists(SubscriptionData.getInstance().getUser().getEmail(), selectedStation);
                if(subexist1==false){
                    feedbackLabel.setText("You have to subscribe to read this!");
                    return;
                }

                if (selectedStation != null && newsStationUrls.containsKey(selectedStation)) {
                    String url = newsStationUrls.get(selectedStation);
                    try {


                        EventQueue.invokeLater(() -> {
                            WebBrowserWindow browserWindow = new WebBrowserWindow(url);
                            browserWindow.setVisible(true);
                        });
                    } catch (Exception ex) {
                        feedbackLabel.setText("Failed to open " + selectedStation + ".");
                    }
                } else {
                    feedbackLabel.setText("Please select a station to read.");
                }

        });

    
        JPanel actionPanel = new JPanel();
        actionPanel.add(subscribeButton);
        actionPanel.add(read);
        actionPanel.add(back);
        actionPanel.add(listSubscriptionsButton);
        actionPanel.add(feedbackLabel);
        actionPanel.add(cancelButton); 


        listSubscriptionsButton.addActionListener(e -> listUserSubscriptions());
        add(actionPanel, BorderLayout.SOUTH);
    }






    private void cancelSubscription() {


     
        if(SubscriptionData.getInstance().getUser().getSubscriptions().isEmpty()){
            feedbackLabel.setText("You have no subscription to cancel!!");
            return;
        }
        cancelButton.addActionListener(e -> {
            String selectedStation = stationGroup.getSelection().getActionCommand();
            if (selectedStation != null && confirmCancellation()) {
               SubscriptionManager.removeSubscription(SubscriptionData.getInstance().getUser().getEmail(), selectedStation);
                SubscriptionData.getInstance().removeSubscription( sub.getServiceName());
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
                        .append("<br>"); 
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
