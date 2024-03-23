package gui.panels;

import api.User;
import api.SessionManager;
import gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.StringJoiner;

public class RentalsPanel extends JPanel {
    private JTable rentalsTable;
    private DefaultTableModel rentalsTableModel;
    private MainFrame mainFrame;
    private JButton rentSelectedItemButton;
    private JButton viewRentedItemsButton;


    public RentalsPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout());
        rentSelectedItemButton = new JButton("Rent Selected Item");
        viewRentedItemsButton = new JButton("View Rented Items");
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2, 10, 0)); // 10 is the horizontal gap between buttons

        // Add the buttons to the buttonsPanel
        buttonsPanel.add(rentSelectedItemButton);
        buttonsPanel.add(viewRentedItemsButton);

        // Add the buttonsPanel to the bottom of the main panel
        add(buttonsPanel, BorderLayout.SOUTH);
        initRentalsTable();
        loadAndDisplayRentals();

        //===============================
        //  Rent the Item button
        //===============================
        rentSelectedItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = rentalsTable.getSelectedRow();
                if (selectedRow >= 0) {
                    // Get the name of the item and the due date.
                    // Write these to the csv file, with the user email
                    String name = (String) rentalsTable.getValueAt(selectedRow, 0);
                    String dueDate = (String) rentalsTable.getValueAt(selectedRow, 1);
                    User currentUser = api.SessionManager.getInstance().getCurrentUser();
                    writeToRentalsCsv(currentUser.getEmail(), name, dueDate);

                }
            }
        });

        //==============================
        //  View Rented Items
        //=============================

        viewRentedItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open a new page that will take a User parameter
                    // Using the User parameter, get the user email and display everything associated with that email
                User currentUser = api.SessionManager.getInstance().getCurrentUser();
                gui.panels.UserRentalsPanel userRentals = new gui.panels.UserRentalsPanel(currentUser);
                userRentals.setVisible(true);
            }
        });

        //=================================
        // Go Back to DashBoard
        //=================================

    }

    private void initRentalsTable() {
        String[] columnNames = {"Name", "Due Date"};
        rentalsTableModel = new DefaultTableModel(columnNames, 0);
        rentalsTable = new JTable(rentalsTableModel) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Disable table editing
            }
        };
        add(new JScrollPane(rentalsTable), BorderLayout.CENTER);
    }

    public void loadAndDisplayRentals() {
        String fileName = "src/main/java/DatabaseFiles/Items.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                String[] rentalData = line.split(",");
                // Add to the table model
                if ("PHYSICAL".equals(rentalData[6].trim())) {
                    rentalsTableModel.addRow(new String[]{rentalData[1].trim(), rentalData[7].trim()});
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading rental data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void writeToRentalsCsv(String userEmail, String itemName, String dueDate) {
        String fileName = "src/main/java/DatabaseFiles/Rentals.csv";
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(userEmail + "," + itemName + "," + dueDate);
        } catch (IOException ioException) {
            JOptionPane.showMessageDialog(null, "Error writing to Rentals file: " + ioException.getMessage(), "I/O Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
