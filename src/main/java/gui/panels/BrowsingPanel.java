package gui.panels;

import api.Cart;
import api.Book;
import api.ItemAttributes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class BrowsingPanel extends JPanel {
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton addToCartButton;
    private Cart userCart; // The cart object

    public BrowsingPanel(Cart cart) {
        this.userCart = cart; // Reference to the cart object
        setLayout(new BorderLayout());

        // Define the table model with columns
        String[] columnNames = {"ID", "Name", "Price", "ISBN"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel) {
            // So you cannot edit the cells
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Initialize and add the Add to Cart button
        addToCartButton = new JButton("Add to Cart");
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    // Assuming the first column is ID, second is Name, third is Price, and fourth is ISBN
                    String name = (String) table.getValueAt(selectedRow, 1);
                    String isbn = (String) table.getValueAt(selectedRow, 3);
                    double price = Double.parseDouble((String) table.getValueAt(selectedRow, 2));
                    int id = Integer.parseInt((String) table.getValueAt(selectedRow, 0)); // ID
                    // Create a Book object and add it to the cart
                    // You'll need to define how you create a Book instance from the selected row
                    // Create an ItemAttributes object for the Book
                    Map<String, Object> additionalAttributes = new HashMap<>();
                    additionalAttributes.put("Location", ""); // Assuming location is not in the table, set a default or retrieve if available
                    additionalAttributes.put("ISBN", isbn);
                    ItemAttributes attributes = new ItemAttributes(name, id, 2, price, true,
                            false, true, additionalAttributes); // Adjust boolean values according to your design
                    Book book = new Book(attributes);
                    cart.addItem(book, 1);
                    JOptionPane.showMessageDialog(BrowsingPanel.this, name + " added to cart!");
                    cart.displayCart();
                } else {
                    JOptionPane.showMessageDialog(BrowsingPanel.this, "Please select a book to "
                                                                                                            +
                                                                                                    "add to the cart.");
                }
            }
        });

        // Add the table and the button to the panel
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(addToCartButton, BorderLayout.SOUTH);

        // Load the books from the CSV into the table
        loadBooksFromCSV("src/main/java/DatabaseFiles/Items.csv");
    }

    // Method to load books from the CSV file and add them to the table model
    private void loadBooksFromCSV(String csvFilePath) {
        // Implementation for loading books from CSV file and adding to the table

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bookData = line.split(","); // Assuming the CSV file uses comma as a separator
                tableModel.addRow(bookData); // Add the parsed data to the table model
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading books from CSV file: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
