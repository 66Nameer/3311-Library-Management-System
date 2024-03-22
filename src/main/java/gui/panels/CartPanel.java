package gui.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.Map;
import api.*;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CartPanel  extends  JFrame {
    private Cart cart = new Cart();
    private User currentUser;
    private JTextField itemNameField, quantityField;
    private JTextArea cartContents;

    public CartPanel(User user) {
        this.currentUser = user;
        setTitle("Cart GUI");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(0, 2));
        itemNameField = new JTextField();
        quantityField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");
        JButton undoButton = new JButton("Undo");
        JButton showCartButton = new JButton("Show Cart");

        inputPanel.add(new JLabel("Item Name:"));
        inputPanel.add(itemNameField);
        inputPanel.add(new JLabel("Quantity:"));
        inputPanel.add(quantityField);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);
        inputPanel.add(undoButton);
        inputPanel.add(showCartButton);

        cartContents = new JTextArea(10, 30);
        cartContents.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cartContents);

//        addButton.addActionListener(this::addItem);
//        removeButton.addActionListener(this::removeItem);
//        undoButton.addActionListener(this::undoLastAction);
        showCartButton.addActionListener(this::showCart);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        //setVisible(true);

    }

    private void showCart(ActionEvent actionEvent) {
        JDialog cartDialog = new JDialog(this, "Cart Contents", true); // true for modal
        cartDialog.setSize(300, 200);
        JTextArea cartContentArea = new JTextArea(10, 25);
        cartContentArea.setEditable(false);

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Item, Integer> entry : cart.getItems().entrySet()) {
            sb.append(entry.getKey()).append(" - Quantity: ").append(entry.getValue()).append("\n");
        }

        cartContentArea.setText(sb.toString());
        JScrollPane scrollPane = new JScrollPane(cartContentArea);
        cartDialog.add(scrollPane);

        cartDialog.setLocationRelativeTo(this);
        cartDialog.setVisible(true);
        loadAndDisplayCart();



    }

    private void loadAndDisplayCart() {
        String userEmail = currentUser.getEmail();
        List<String> itemsForUser = new ArrayList<>();

        // Replace this with the actual path to your CSV file
        String fileName = "src/main/java/DatabaseFiles/userCart.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> allRows = reader.readAll();
            // Loop through all rows in the CSV
            for (String[] row : allRows) {
                // Check if the first element is the user's email
                if (row[0].equalsIgnoreCase(userEmail)) {
                    // Skip the email and go through the items
                    for (int i = 1; i < row.length; i += 2) { // Assuming every item is followed by a quantity
                        String itemName = row[i];
                        itemsForUser.add(itemName + ", Quantity: " + row[i + 1]);
                    }
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        // Now display these items in the cartContents text area
        cartContents.setText(String.join("\n", itemsForUser));
    }


    private void addItem(ActionEvent e) {

//        try {
//            int ID = Integer.parseInt(itemNameField.getText());
//            Item cd=new CD(ID, "Item " + ID);
//            int quantity = Integer.parseInt(quantityField.getText());
//            cart.addItem(cd, quantity);
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "Invalid number format");
//        }
    }
}
