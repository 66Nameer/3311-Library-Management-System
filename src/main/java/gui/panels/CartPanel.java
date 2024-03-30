package gui.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.Map;
import api.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
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
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(0, 2));

        JButton checkoutButton = new JButton("Checkout");

        inputPanel.add(checkoutButton);

        cartContents = new JTextArea(10, 30);
        cartContents.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cartContents);


        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        displayCart();

        //=======================
        //  Checkout Button
        //=======================
        checkoutButton.addActionListener(e -> {
            // Extract just the item names from the cartContents
            List<String> itemNames = Arrays.asList(cartContents.getText().split("\n"));
            double total = calculateTotalPrice(itemNames);
            JOptionPane.showMessageDialog(this, "Total Price: $" + String.format("%.2f", total),
                    "Checkout", JOptionPane.INFORMATION_MESSAGE);

            // Confirm button -  If the user presses yes, then clear their cart
            int confirm = JOptionPane.showConfirmDialog(this, "Proceed to checkout?", "Confirm Checkout", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                clearUserCart(currentUser.getEmail());
                cartContents.setText(""); // Clear the cart display
                 EventQueue.invokeLater(() -> {
                    PaymentMethodDialog paymentDialog = new PaymentMethodDialog(this, "User Cart", null);
                    paymentDialog.setVisible(true);
                });
            }
        });
    }

    private void showCart(ActionEvent actionEvent) {

        displayCart();



    }

    private void displayCart() {
        String userEmail = currentUser.getEmail();
        List<String> itemsForUser = new ArrayList<>();

        String fileName = "src/main/java/DatabaseFiles/userCart.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> allRows = reader.readAll();
            // Loop through all rows in the CSV
            for (String[] row : allRows) {
                // Check if the first element is the user's email
                if (row[0].equalsIgnoreCase(userEmail)) {
                    // Skip the email and go through the items
                    for (int i = 1; i < row.length; i += 2) {
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

                itemPrices.put(item[1].trim(), Double.parseDouble(item[2]));
            }

            // Calculate the total price by looking up the price for each item name
            for (String itemName : items) {
                String cleanItemName = itemName.split(",")[0].trim();
                if (itemPrices.containsKey(cleanItemName)) {
                    totalPrice += itemPrices.get(cleanItemName); // Add the price to the total
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return totalPrice;

    }


    // Also this method should also be added to the database class, but it is here for testing
    private void clearUserCart(String userEmail) {
        String fileName = "src/main/java/DatabaseFiles/userCart.csv";
        List<String[]> allRowsWithoutUser = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> allRows = reader.readAll();
            // Filter out the rows that don't belong to the current user
            for (String[] row : allRows) {
                if (!row[0].equalsIgnoreCase(userEmail)) {
                    allRowsWithoutUser.add(row);
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        // Rewrite the file without the user's rows
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {
            writer.writeAll(allRowsWithoutUser);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
