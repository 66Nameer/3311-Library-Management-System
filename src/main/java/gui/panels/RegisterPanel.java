package src.main.java.gui.panels;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel loginLabel;
    private JButton registerButton; // Register button

    public LoginPanel(MainFrame mainFrame) {
        setLayout(new BorderLayout(10, 10)); // Use BorderLayout for the panel

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
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT); // This will align the button to the center of the X axis

        // Add the login button directly under the password panel
        JPanel loginButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginButtonPanel.add(loginButton);
        centerPanel.add(loginButtonPanel);

        // Add the center panel to the main panel
        add(centerPanel, BorderLayout.CENTER);

        // Register button at the bottom
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        registerButton = new JButton("Register");
        bottomPanel.add(registerButton);

        // Add the bottom panel with the register button to the south of the main panel
        add(bottomPanel, BorderLayout.SOUTH);


       registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Assuming you have a reference to the MainFrame instance
                mainFrame.showCard("RegisterPanel");
            }
        });
    }


    public void actionPerformed(ActionEvent e) {
        String email = usernameField.getText();
        String password = new String(passwordField.getPassword());


    }



}