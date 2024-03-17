package src.main.java.gui;

import javax.swing.*;

import java.awt.*;

import src.main.java.gui.panels.LoginPanel;
public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public MainFrame() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Initialize the LoginPanel and add it to cardPanel with an identifier
        LoginPanel loginPanel = new LoginPanel();
        cardPanel.add(loginPanel, "LoginPanel");

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
}