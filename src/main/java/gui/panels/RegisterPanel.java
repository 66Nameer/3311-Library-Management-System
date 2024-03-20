package gui.panels;


import api.*;
import com.opencsv.CSVWriter;
import gui.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;



public class RegisterPanel extends JPanel implements ActionListener {

    private JTextField usernameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JComboBox<String> userTypeComboBox;
    private JButton create; // Register button
    private MainFrame mainFrame;
    private JButton back;


    public RegisterPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout(10, 10)); // Use BorderLayout for the panel


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(Box.createVerticalStrut(50));

        // Add some space at the top
        centerPanel.add(Box.createVerticalGlue()); // This will push the elements towards the center



        // Email panel
        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        emailField = new JTextField(15);
        emailPanel.add(new JLabel("Email:"));
        emailPanel.add(emailField);

        // Password panel
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        passwordField = new JPasswordField(15);
        passwordPanel.add(new JLabel("Password:"));
        passwordPanel.add(passwordField);

        JPanel userTypePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        String[] userTypes = {"Student", "Faculty", "Staff", "Visitor", "Manager"};
        userTypeComboBox = new JComboBox<>(userTypes);
        userTypePanel.add(new JLabel("User Type:"));
        userTypePanel.add(userTypeComboBox);

        // Add username, email, and password panels to the center panel

        centerPanel.add(emailPanel);
        centerPanel.add(passwordPanel);
        centerPanel.add(userTypePanel);


        // Register button
        create = new JButton("Create Account");
        back=new JButton("Back");
        create.addActionListener(this);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showCard("LoginPanel");
            }
        });
        create.setAlignmentX(Component.CENTER_ALIGNMENT); // This will align the button to the center of the X axis
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Add the create account button directly under the password panel
        JPanel createButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        createButtonPanel.add(create);
        centerPanel.add(createButtonPanel);

        JPanel backButton=new JPanel(new FlowLayout(FlowLayout.CENTER));
        backButton.add(back);
        centerPanel.add(backButton);

        // Add the center panel to the main panel
        add(centerPanel, BorderLayout.CENTER);



        emailField.setBackground(Color.WHITE);
        emailField.setForeground(Color.BLACK);
        passwordField.setBackground(Color.WHITE);
        passwordField.setForeground(Color.BLACK);
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == create) {

            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String userType = (String) userTypeComboBox.getSelectedItem();

            Database instance = Database.getInstance();

            // Validate input fields
            if ( email.isEmpty() && !password.isEmpty()) {


                switch (userType) {
                    case "Student" -> {
                        if (instance.pushUser(new Student(email, password), userType)) {
                            // Registration successful
                            JOptionPane.showMessageDialog(this, "Registration successful!");
                            clearFields(); // Clear input fields after successful registration
                        } else {
                            JOptionPane.showMessageDialog(this, "Registration incomplete: ERROR", "Registration Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                    case "Faculty" -> {
                        if (instance.pushUser(new Faculty(email, password), userType)) {
                            // Registration successful
                            JOptionPane.showMessageDialog(this, "Registration successful!");
                            clearFields(); // Clear input fields after successful registration
                        } else {
                            JOptionPane.showMessageDialog(this, "Registration incomplete: ERROR", "Registration Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                    case "Staff" -> {
                        if (instance.pushUser(new Staff(email, password), userType)) {
                            // Registration successful
                            JOptionPane.showMessageDialog(this, "Registration successful!");
                            clearFields(); // Clear input fields after successful registration
                        } else {
                            JOptionPane.showMessageDialog(this, "Registration incomplete: ERROR", "Registration Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                    case "Visitor" -> {
                        if (instance.pushUser(new Visitor(email, password), userType)) {
                            // Registration successful
                            JOptionPane.showMessageDialog(this, "Registration successful!");
                            clearFields(); // Clear input fields after successful registration
                        } else {
                            JOptionPane.showMessageDialog(this, "Registration incomplete: ERROR", "Registration Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                    case "Manager" -> {
                        if (instance.pushUser(new Manager(email, password), userType)) {
                            // Registration successful
                            JOptionPane.showMessageDialog(this, "Registration successful!");
                            clearFields(); // Clear input fields after successful registration
                        } else {
                            JOptionPane.showMessageDialog(this, "Registration incomplete: ERROR", "Registration Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }

                }

                // Optionally, switch back to the login panel after successful registration
                mainFrame.showCard("LoginPanel");
            } else {
                // Display error message if any field is empty
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }



    private void clearFields() {
        emailField.setText("");
        passwordField.setText("");
    }
}

// Set the layout manager for this panel

