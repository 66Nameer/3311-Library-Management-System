package gui.panels;

import api.*;
import gui.MainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BrowsingPanel extends JPanel {
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton addToCartButton;
    private JButton viewCartButton;
    private JButton returnToDashboard;
    private MainFrame mainFrame;

    public BrowsingPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        // =================================================
        //                   Table Setup
        // =================================================
        String[] columnNames = { "ID","Name", "Price", "ISBN", "Type"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel) {
            // So you cannot edit the cells
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //=============================================================
        //               Add to Cart button
        //=============================================================
        addToCartButton = new JButton("Add to Cart");
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    // Columns are: ID, Name, Price, ISBN
                    ItemAttributes.ItemAttributesBuilder itemBuilder = new ItemAttributes.ItemAttributesBuilder();
                    int id = Integer.parseInt((String) table.getValueAt(selectedRow, 0)); // ID
                    String name = (String) table.getValueAt(selectedRow, 1);
                    double price = Double.parseDouble((String) table.getValueAt(selectedRow, 2));
                    String isbn = (String) table.getValueAt(selectedRow, 3);
                    String itemType = (String) table.getValueAt(selectedRow, 4);

                    // Create a Book object and add it to the cart
                        // Create an ItemAttributes object for the Book
                    itemBuilder.setName(name);
                    itemBuilder.setID(id);
                    itemBuilder.setPrice(price);
                    itemBuilder.addAdditionalAttribute("Location", ""); // Assuming location is not in the table, set a default or retrieve if available
                    itemBuilder.addAdditionalAttribute("ISBN", isbn);

                    ItemAttributes attributes = new ItemAttributes(itemBuilder); // Adjust boolean values according to your design
                    Item item;
                    switch (itemType) {
                        case " Book":
                            item = new Book(attributes);
                            break;
                        case " Magazine":
                            item = new Magazine(attributes);
                            break;
                        default:
                            JOptionPane.showMessageDialog(BrowsingPanel.this, "Unknown item type.");
                            return; // Exit early if the item type is not recognized
                    }

                    // Get the User and their cart
                    api.Database databaseInstance = new api.Database();
                    User currentUser = api.SessionManager.getInstance().getCurrentUser();
                    api.Cart currentCart = api.SessionManager.getInstance().getCurrentCart();
                    // Add the selected book to the cart
                    currentCart.addItem(item, 1);
                    // Run a check to see if the cart was saved
                    boolean cartSaved = databaseInstance.saveUserCart(currentUser, currentCart);
                    if (cartSaved) {
                        System.out.println("Saved Cart");
                    } else {
                        System.out.println("Saved Not Cart");
                    }

                    JOptionPane.showMessageDialog(BrowsingPanel.this, name + " added to cart!");
                    currentCart.displayCart();
                } else {
                    JOptionPane.showMessageDialog(BrowsingPanel.this, "Please select an item to "
                            + "add to the cart.");
                }
            }
        });

        //=====================================================
        //          View Cart button
        //=====================================================
        viewCartButton = new JButton("View Cart");
        viewCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User currentUser = api.SessionManager.getInstance().getCurrentUser();
                // Switch to the CartPanel using the CardLayout
                gui.panels.CartPanel cartPanel = new gui.panels.CartPanel(currentUser);
                cartPanel.setVisible(true);
            }
        });

        //==========================================
        // Return to DashBoard button
        // ========================================
        returnToDashboard = new JButton("DashBoard");
        returnToDashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showUserDashboard();
            }
        });

        // Add the table and the button to the panel
        add(new JScrollPane(table), BorderLayout.CENTER);
        buttonPanel.add(addToCartButton);
        buttonPanel.add(viewCartButton);
        buttonPanel.add(returnToDashboard);
        add(buttonPanel, BorderLayout.NORTH);

        // Load the books from the CSV into the table

        loadBooksFromCSV();
    }

    // Method to load books from the CSV file and add them to the table model
    private List<String[]> loadBooksFromCSV() {
        // first load the Items.csv file
                // Since we are using a single file to load the items/books, we don't need to pass the file name,
                // rather we can just specify which file we need inside the method
            // loop through it to add information to the columns

        List<String[]> bookDataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/DatabaseFiles/Items.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bookData = line.split(",");
                // Only display the name and the price
                bookDataList.add(bookData);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading books from CSV file: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        return bookDataList;
    }
}
