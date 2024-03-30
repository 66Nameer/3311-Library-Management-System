package gui.panels;


import api.*;
import gui.MainFrame;
import api.SessionManager;
import api.User;
import notification.AppMessageListener;
import notification.NotificationManager;
import notification.NotifyType;
import notification.display.JFrameNotificationDisplay;

import javax.swing.*;
import java.awt.*;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel loginLabel;
    private JButton registerButton; // Register button
    private MainFrame mainFrame;

    public LoginPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout(20, 20)); // Use BorderLayout for the panel

        // Center panel to hold the username and password fields
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        // Add some space at the top
        centerPanel.add(Box.createVerticalGlue()); // This will push the elements towards the center

        // Username panel
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernameField = new JTextField(15);
        usernamePanel.add(new JLabel("Username:"));
        usernamePanel.add(usernameField);

        // Password panel
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        passwordField = new JPasswordField(15);
        passwordPanel.add(new JLabel("Password:"));
        passwordPanel.add(passwordField);

        // Add username and password panels to the center panel
        centerPanel.add(usernamePanel);
        centerPanel.add(passwordPanel);

        // Login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT); // This will align the button to the center

        // Add the login button directly under the password panel
        JPanel loginButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginButtonPanel.add(loginButton);
        centerPanel.add(loginButtonPanel);

        // Add the center panel to the main panel
        add(centerPanel, BorderLayout.CENTER);

        // Register button at the bottom
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        registerButton = new JButton("Register");

        usernameField.setBackground(Color.WHITE);
        usernameField.setForeground(Color.BLACK);
        passwordField.setBackground(Color.WHITE);
        passwordField.setForeground(Color.BLACK);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        registerButton.setBackground(Color.BLACK);
        registerButton.setForeground(Color.WHITE);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.showCard("RegisterPanel"); // Switch to the RegisterPanel when register button is clicked
            }
        });
        bottomPanel.add(registerButton);

        // Add the bottom panel with the register button to the south of the main panel
        add(bottomPanel, BorderLayout.SOUTH);
    }


    public void actionPerformed(ActionEvent e) {
        String email = usernameField.getText();
        String password = new String(passwordField.getPassword());

        boolean isVerified = Database.authenticateUser(email, password);

        if (isVerified) {
            NotificationManager manager = new NotificationManager();
            manager.addNotification(NotifyType.APPROACHING_OVERDUE, new AppMessageListener(new JFrameNotificationDisplay(),
                    "Example Book"));
            manager.addNotification(NotifyType.APPROACHING_OVERDUE, new AppMessageListener(new JFrameNotificationDisplay(),
                    "Another Book"));
            manager.notify(NotifyType.APPROACHING_OVERDUE);

            // Fetch the user after they're authenticated
        	Database db = Database.getInstance();
        	User user = db.fetchUser(email);
            if (user != null) {
                SessionManager.getInstance().loginUser(user);
                SubscriptionData.getInstance().loginUser(user);
                System.out.println("User Verified");
                mainFrame.showUserDashboard();
            } else {
                JOptionPane.showMessageDialog(this, "User data could not be retrieved.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);

            User user = Database.getInstance().fetchUser(email); // Get the user after successful authentication
            if(user != null){
                SessionManager.getInstance().loginUser(user); // Set the user session
                SubscriptionData.getInstance().loginUser(user);
                System.out.println("User Verified");
                mainFrame.showUserDashboard(); //  to the dashboard
            } else {
                JOptionPane.showMessageDialog(this, "User data could not be retrieved.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }

    }
}
   
