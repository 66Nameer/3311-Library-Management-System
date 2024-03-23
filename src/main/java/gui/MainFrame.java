package gui;

import api.SessionManager;
import gui.panels.*;

import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import api.*;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private User current;
    private RentalsPanel rentalsPanel;
    public MainFrame() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        ImageIcon icon = new ImageIcon("src/main/java/gui/icon1.png"); // Replace "path_to_your_icon_image.png" with the path to your icon image file
        setIconImage(icon.getImage());

        // Initialize the LoginPanel and add it to cardPanel with an identifier
        LoginPanel loginPanel = new LoginPanel(this); // Pass reference to MainFrame
        cardPanel.add(loginPanel, "LoginPanel");


        // Initialize the RegisterPanel and add it to cardPanel with an identifier
        RegisterPanel registerPanel = new RegisterPanel(this); // Pass reference to MainFrame
        cardPanel.add(registerPanel, "RegisterPanel");

        // Initialize the UserDashboardPanel and add it to cardPanel with an identifier
        UserDashboardPanel userDashboardPanel = new UserDashboardPanel(this);
        cardPanel.add(userDashboardPanel, "UserDashboardPanel");

        // Initialize the browsingPanel and add it to cardPanel with an identifier
        BrowsingPanel browsingPanel = new BrowsingPanel(this);
        cardPanel.add(browsingPanel, "BrowsingPanel");

        SubscriptionPanel subscribePanel = new SubscriptionPanel(this);
        cardPanel.add(subscribePanel, "SubscribePanel");

        NewsletterBrowserPanel browserPanel = new NewsletterBrowserPanel();
        browserPanel.loadURL("https://www.nytimes.com"); // Example URL
        cardPanel.add(browserPanel, "NewsBrowser");

        RentalsPanel rentalsPanel = new RentalsPanel(this);
        cardPanel.add(rentalsPanel, "RentalsPanel");

        // Setup the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(800, 600));
        this.add(cardPanel);

        // Show the initial card (the login panel)
        cardLayout.show(cardPanel, "LoginPanel");
    }

    // Methods to switch cards, if necessary
    public void showCard(String card) {
        cardLayout.show(cardPanel, card);
    }

    public void showUserDashboard() {
        cardLayout.show(cardPanel, "UserDashboardPanel");
    }
    public void showBrowsingPanel() {
        cardLayout.show(cardPanel, "BrowsingPanel");
    }
    public void showRentalsPanel(){
        cardLayout.show(cardPanel, "RentalsPanel");
    }



    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
