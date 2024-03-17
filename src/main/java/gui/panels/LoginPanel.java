package src.main.java.gui.panels;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class LoginPanel extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel loginLabel;
    private JButton registerButton; // Register button

    public LoginPanel() {
        // Set the layout manager for this panel
        setLayout(new BorderLayout(10, 10));

        // panel to hold all the form elements
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        // username label and text field
        usernameField = new JTextField(15);
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        usernamePanel.add(new JLabel("Username:"));
        usernamePanel.add(usernameField);

        // password label and password field
        passwordField = new JPasswordField(15);
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPanel.add(new JLabel("Password:"));
        passwordPanel.add(passwordField);

        // register button
        registerButton = new JButton("Register");
        // Later: add an ActionListener to handle the registration logic

        // login button
        loginButton = new JButton("Login");
        // Later: add an ActionListener to handle the login logic

        // Panel to hold buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);

        // Add components to the form panel
        formPanel.add(usernamePanel);
        formPanel.add(passwordPanel);
        formPanel.add(buttonPanel); // Add the button panel here, not the individual buttons

        // Create a label at the top
        loginLabel = new JLabel("Login", SwingConstants.CENTER);

        // Add the form panel and the login label to this LoginPanel
        add(loginLabel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
    }
}
