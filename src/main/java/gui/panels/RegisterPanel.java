package src.main.java.gui.panels;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterPanel extends JPanel implements ActionListener {

    private JTextField usernameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton create; // Register button
    private MainFrame mainFrame;

    public RegisterPanel(MainFrame mainFrame) {
        this.mainFrame=mainFrame;
        setLayout(new BorderLayout(10, 10)); // Use BorderLayout for the panel

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(Box.createVerticalStrut(50));

        // Add some space at the top
        centerPanel.add(Box.createVerticalGlue()); // This will push the elements towards the center

        // Username panel
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernameField = new JTextField(15);
        usernamePanel.add(new JLabel("Username:"));
        usernamePanel.add(usernameField);

        // Username panel
        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        emailField = new JTextField(15);
        emailPanel.add(new JLabel("Email:"));
        emailPanel.add(emailField);

        // Password panel
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        passwordField = new JPasswordField(15);
        passwordPanel.add(new JLabel("Password:"));
        passwordPanel.add(passwordField);

        // Add username and password panels to the center panel
        centerPanel.add(usernamePanel);
        centerPanel.add(emailPanel);
        centerPanel.add(passwordPanel);




       create = new JButton("Create Account");
        create.addActionListener(this);
        create.setAlignmentX(Component.CENTER_ALIGNMENT); // This will align the button to the center of the X axis

        // Add the login button directly under the password panel
        JPanel loginButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginButtonPanel.add(create);
        centerPanel.add(loginButtonPanel);


        // Add the center panel to the main panel
        add(centerPanel, BorderLayout.CENTER);

        // Register button at the bottom
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == create) {
            String username = usernameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            // Example validation and action, adjust according to your needs
            if (!username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                // Proceed with registration logic, e.g., validation, saving the user, etc.
                JOptionPane.showMessageDialog(this, "Registration successful!");

                // Optionally, switch to another panel upon successful registration
                // mainFrame.showCard("LoginPanel");
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Set the layout manager for this panel

}
