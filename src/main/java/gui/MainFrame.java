package gui;

import api.User;
import gui.panels.*;

import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;


public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private User currentUser;

    public MainFrame() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        ImageIcon icon = new ImageIcon("src/main/java/gui/icon1.png"); 
        setIconImage(icon.getImage());


       
        LoginPanel loginPanel = new LoginPanel(this); 
        cardPanel.add(loginPanel, "LoginPanel");

        
        RegisterPanel registerPanel = new RegisterPanel(this); 
        cardPanel.add(registerPanel, "RegisterPanel");

   
        UserDashboardPanel userDashboardPanel = new UserDashboardPanel(this);
        cardPanel.add(userDashboardPanel, "UserDashboardPanel");

      
        BrowsingPanel browsingPanel = new BrowsingPanel();
        cardPanel.add(browsingPanel, "BrowsingPanel");


        SubscriptionPanel subscribePanel = new SubscriptionPanel(this, subscriptionManager);
        cardPanel.add(subscribePanel, "SubscribePanel");

        NewsletterBrowserPanel browserPanel = new NewsletterBrowserPanel();
        cardPanel.add(browserPanel, "NewsBrowser");

        
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(800, 600));
        this.add(cardPanel);

       
        cardLayout.show(cardPanel, "LoginPanel");
    }

  
    public void showCard(String card) {
        cardLayout.show(cardPanel, card);
    }

    public void showUserDashboard() {
        cardLayout.show(cardPanel, "UserDashboardPanel");
    }

      public void showNewsBrowser(String url) {
        NewsletterBrowserPanel browserPanel = new NewsletterBrowserPanel();
        browserPanel.loadURL(url);
        cardPanel.add(browserPanel, "NewsBrowser");
        cardLayout.show(cardPanel, "NewsBrowser");
    }

    public void showBrowsingPanel() {
        cardLayout.show(cardPanel, "BrowsingPanel");
    }

}
