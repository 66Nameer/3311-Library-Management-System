package gui.panels;

import api.Cart;
import api.User;
import gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserDashboardPanel extends JPanel {
    private MainFrame mainFrame;
    public UserDashboardPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Create and customize UI components
        JLabel welcomeLabel = new JLabel("Welcome to the User Dashboard!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        JButton rentItemButton = new JButton("Rent Item");
        JButton subscribeNewsletterButton = new JButton("Subscribe to Newsletter");
        JButton searchBooksButton = new JButton("Search for Books");
        buttonPanel.add(rentItemButton);
        buttonPanel.add(subscribeNewsletterButton);
        buttonPanel.add(searchBooksButton);

        JTextArea userInformationTextArea = new JTextArea();
        userInformationTextArea.setEditable(false);
        userInformationTextArea.setText("User Information:\nName: John Doe\nType: Student\nEmail: john.doe@example.com");

        // Add UI components to the panel
        add(welcomeLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(new JScrollPane(userInformationTextArea), BorderLayout.SOUTH);

        // Add additional functionalities according to the requirements
        // For example, action listeners for buttons to perform respective tasks
        // You can also add more UI components based on other requirements

        //--------------------------
        // Switch to Browsing Page
        //--------------------------
        searchBooksButton.addActionListener(e -> {
            mainFrame.showBrowsingPanel();

        });

           subscribeNewsletterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showCard("SubscribePanel");
            }
        });
    }
}
