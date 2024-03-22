package gui.panels;

import api.Subscription;
import api.SubscriptionManager;
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

       
        JPanel stationPanel = new JPanel(new GridLayout(0, 1)); 

     
        String[] stations = {"CNN", "NY Times", "Fox News", "CTV"};

      
        for (String station : stations) {
            JRadioButton stationButton = new JRadioButton(station);
            stationButton.setActionCommand(station); 
            stationGroup.add(stationButton); 
            stationPanel.add(stationButton);
        }

        add(stationPanel, BorderLayout.CENTER);

        subscribeButton.addActionListener(e->{
            String selectedStation = stationGroup.getSelection().getActionCommand();
            if (selectedStation != null && newsStationUrls.containsKey(selectedStation)) {
                String url = newsStationUrls.get(selectedStation);
              

                SubscriptionDialog dialog = new SubscriptionDialog(
                        (Frame) SwingUtilities.getWindowAncestor(this), 
                        "Subscription Confirmation", 
                        true, 
                        selectedStation, 
                        url, 
                        subscriptionManager 
                );
                EventQueue.invokeLater(() -> {
                    WebBrowserWindow browserWindow = new WebBrowserWindow(url);
                    browserWindow.setVisible(true);
                });

                dialog.setVisible(true); 
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

       
        JPanel actionPanel = new JPanel();
        actionPanel.add(subscribeButton);
        actionPanel.add(back);
        actionPanel.add(feedbackLabel);
        actionPanel.add(cancelButton); 

        add(actionPanel, BorderLayout.SOUTH);
    }

    private void subscribeToStation() {
        ButtonModel selectedModel = stationGroup.getSelection();
        if (selectedModel != null) {
            String selectedStation = selectedModel.getActionCommand();
        
            feedbackLabel.setText("Subscribed to " + selectedStation + "!");

        } else {
            feedbackLabel.setText("Please select a station to subscribe.");
        }
    }
    private void cancelSubscription() {
        String selectedStation = stationGroup.getSelection().getActionCommand();
        if (selectedStation != null && confirmCancellation()) {
            subscriptionManager.unsubscribe(selectedStation);
            feedbackLabel.setText(selectedStation + " subscription cancelled.");
            
        } else {
            feedbackLabel.setText("Please select a station to cancel.");
        }
    }

    private boolean confirmCancellation() {
        int response = JOptionPane.showConfirmDialog(null, "Confirm cancellation?", "Confirm", JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.YES_OPTION;
    }

}
