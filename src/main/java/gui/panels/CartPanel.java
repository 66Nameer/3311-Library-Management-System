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
        JButton checkoutButton = new JButton("Checkout");

        inputPanel.add(new JLabel("Item Name:"));
        inputPanel.add(itemNameField);
        inputPanel.add(new JLabel("Quantity:"));
        inputPanel.add(quantityField);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);
        inputPanel.add(undoButton);
        inputPanel.add(showCartButton);
        inputPanel.add(checkoutButton);

        cartContents = new JTextArea(10, 30);
        cartContents.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cartContents);

//        addButton.addActionListener(this::addItem);
//        removeButton.addActionListener(this::removeItem);
//        undoButton.addActionListener(this::undoLastAction);
        showCartButton.addActionListener(this::showCart);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        //=======================
        //  Checkout Button
        //=======================
        checkoutButton.addActionListener(e -> {
            // Extract just the item names from the cartContents
            List<String> itemNames = Arrays.asList(cartContents.getText().split("\n"));
            double total = calculateTotalPrice(itemNames);
            JOptionPane.showMessageDialog(this, "Total Price: $" + String.format("%.2f", total), "Checkout", JOptionPane.INFORMATION_MESSAGE);
        });

        //setVisible(true);

    }

    private void showCart(ActionEvent actionEvent) {
//        JDialog cartDialog = new JDialog(this, "Cart Contents", true); // true for modal
//        cartDialog.setSize(300, 200);
//        JTextArea cartContentArea = new JTextArea(10, 25);
//        cartContentArea.setEditable(false);
//
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry<Item, Integer> entry : cart.getItems().entrySet()) {
//            sb.append(entry.getKey()).append(" - Quantity: ").append(entry.getValue()).append("\n");
//        }
//
//        cartContentArea.setText(sb.toString());
//        JScrollPane scrollPane = new JScrollPane(cartContentArea);
//        cartDialog.add(scrollPane);
//
//        cartDialog.setLocationRelativeTo(this);
//        cartDialog.setVisible(true);
        displayCart();



    }

    private void displayCart() {
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


    // We should probably add this method in the Database, but I am leaving it here for now
        // in case there is some importing issues - Just for Testing
    private double calculateTotalPrice(List<String> items) {
        double totalPrice = 0.0;
        String itemsFileName = "src/main/java/DatabaseFiles/Items.csv";
        try (CSVReader itemsReader = new CSVReader(new FileReader(itemsFileName))) {
            List<String[]> allItems = itemsReader.readAll();
            Map<String, Double> itemPrices = new HashMap<>();

            // Process the Items.csv and store item prices in a map
            for (String[] item : allItems) {
                // Assuming that the item CSV structure is: ID, Name, Price, Other
                itemPrices.put(item[1].trim(), Double.parseDouble(item[2]));
            }

            // Calculate the total price by looking up the price for each item name
            for (String itemName : items) {
                String cleanItemName = itemName.split(",")[0].trim(); // Clean item name without quantity
                if (itemPrices.containsKey(cleanItemName)) {
                    totalPrice += itemPrices.get(cleanItemName); // Add the price to the total
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return totalPrice;

    }
}
