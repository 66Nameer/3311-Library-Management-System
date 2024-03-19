package gui.panels;

import api.Manager;
import api.Textbook;

import javax.swing.*;
import java.awt.*;
public class PrivilegeUI extends Container {
    private JTextField itemIdField, itemNameField, messageField;

    // Buttons for different actions
    private JButton addButton, enableButton, editButton, disableButton, validateButton, notificationButton;

    public PrivilegeUI(Manager manager) {
        // Set the layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Padding

        // Initialize components
        itemIdField = new JTextField(20);
        itemNameField = new JTextField(20);
        messageField = new JTextField(20);

        addButton = new JButton("Add api.Item");
        enableButton = new JButton("Enable api.Item");
        editButton = new JButton("Edit api.Item");
        disableButton = new JButton("Disable api.Item");
        validateButton = new JButton("Validate Registration");
        notificationButton = new JButton("Notify");

        // Add components to the panel
        add(new JLabel("api.Item ID:"), gbc);
        add(itemIdField, gbc);
        add(new JLabel("api.Item Name/Details:"), gbc);
        add(itemNameField, gbc);
        add(addButton, gbc);

        add(new JLabel("Message for Notification:"), gbc);
        add(messageField, gbc);
        add(notificationButton, gbc);

        add(enableButton, gbc);
        add(editButton, gbc);
        add(disableButton, gbc);
        add(validateButton, gbc);

        // Action listeners
/*
        addButton.addActionListener(e -> manager.AddItem(new Textbook(itemIdField.getText(), itemNameField.getText())));
*/
        enableButton.addActionListener(e -> manager.EnableItemForRent(Integer.parseInt(itemIdField.getText())));
        editButton.addActionListener(e -> manager.EditItemDetails(Integer.parseInt(itemIdField.getText()), itemNameField.getText()));
        disableButton.addActionListener(e -> manager.DisableItemForRent(Integer.parseInt(itemIdField.getText())));
        validateButton.addActionListener(e -> manager.ValidateRegistration());
        notificationButton.addActionListener(e -> manager.DisplayNotification(messageField.getText()));

    }
 

}
