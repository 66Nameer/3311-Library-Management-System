package gui.panels;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class RegisterPanel extends JPanel implements ActionListener {

    private JTextField usernameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton create; // Register button
    private MainFrame mainFrame;


    public RegisterPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
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

        // Add username, email, and password panels to the center panel
        centerPanel.add(usernamePanel);
        centerPanel.add(emailPanel);
        centerPanel.add(passwordPanel);

        // Register button
        create = new JButton("Create Account");
        create.addActionListener(this);
        create.setAlignmentX(Component.CENTER_ALIGNMENT); // This will align the button to the center of the X axis

        // Add the create account button directly under the password panel
        JPanel createButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        createButtonPanel.add(create);
        centerPanel.add(createButtonPanel);

        // Add the center panel to the main panel
        add(centerPanel, BorderLayout.CENTER);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == create) {
            String username = usernameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());



            // Validate input fields
            if (!username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {



                if (saveUserToCSV(username, email, password)) {
                    // Registration successful
                    JOptionPane.showMessageDialog(this, "Registration successful!");
                    clearFields(); // Clear input fields after successful registration
                }
                // Proceed with registration logic
                // For now, simply display a success message


                // Optionally, switch back to the login panel after successful registration
                mainFrame.showCard("LoginPanel");
            } else {
                // Display error message if any field is empty
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean saveUserToCSV(String username, String email, String password) {
        try {
            // Initialize CSVWriter object with FileWriter


            // Initialize CSVWriter object with FileWriter
            CSVWriter csvWriter = new CSVWriter(new FileWriter("src/main/java/Database/Users.csv", true));

            // Create a string array to represent a single record
            String[] record = {username, email, password};

            // Write the record to the CSV file
            csvWriter.writeNext(record);

            // Flush and close the writer
            csvWriter.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void clearFields() {
        usernameField.setText("");
        emailField.setText("");
        passwordField.setText("");
    }
}

// Set the layout manager for this panel

