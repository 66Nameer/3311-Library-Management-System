package gui.panels;


import api.Database;

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

    public LoginPanel() {
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
    }


    public void actionPerformed(ActionEvent e) {
        String email = usernameField.getText();
        String password = new String(passwordField.getPassword());




        boolean isVerified = Database.authenticateUser(email, password);
        if (isVerified) {
            // If
            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        }else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
