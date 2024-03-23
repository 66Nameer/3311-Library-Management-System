package gui.panels;

import api.*;
import gui.MainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
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
    private JTextField searchField;
    private JButton searchButton;

    public BrowsingPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout());
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));

        searchField = new JTextField(20);
        searchButton = new JButton("Search");


        // =================================================
        //                   Table Setup
        // =================================================
        String[] columnNames = { "ID","Name", "Price", "Type"};
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
                    int id = Integer.parseInt((String) table.getValueAt(selectedRow, 0));
                    Item currentItem = Database.getInstance().fetchItem(id);
                    // Get the User and their cart
                    api.Database databaseInstance = new api.Database();
                    User currentUser = api.SessionManager.getInstance().getCurrentUser();
                    api.Cart currentCart = api.SessionManager.getInstance().getCurrentCart();
                    // Add the selected book to the cart
                    currentCart.addItem(currentItem, 1);
                    // Run a check to see if the cart was saved
                    boolean cartSaved = databaseInstance.saveUserCart(currentUser, currentCart);
                    if (cartSaved) {
                        System.out.println("Saved Cart");
                    } else {
                        System.out.println("Saved Not Cart");
                    }
                    JOptionPane.showMessageDialog(BrowsingPanel.this, currentItem.name + " added to cart!");
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
        returnToDashboard = new JButton("Back");
        returnToDashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showUserDashboard();
            }
        });

        // Add the table and the button to the panel
        add(topPanel, BorderLayout.NORTH); // Add the search panel at the top
        add(new JScrollPane(table), BorderLayout.CENTER);
        bottomPanel.add(addToCartButton);
        topPanel.add(returnToDashboard);
        topPanel.add(new JLabel("Search: "));
        topPanel.add(searchField);
        topPanel.add(searchButton);
        bottomPanel.add(viewCartButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Load the books from the CSV into the table

        loadBooksFromCSV();

        searchButton.addActionListener(e -> filterItems(searchField.getText()));
    }


    // Method to load books from the CSV file and add them to the table model
    private void loadBooksFromCSV() {
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
                tableModel.addRow(new String[]{bookData[0], bookData[1], bookData[2], bookData[4],});
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading books from CSV file: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

private void filterItems(String query) {
    TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(tableModel);
    table.setRowSorter(rowSorter);

    if (query.trim().length() == 0) {
        rowSorter.setRowFilter(null);
    } else {
        // Assuming book name is in the 2nd column (index 1)
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + query, 1));
    }
}}
