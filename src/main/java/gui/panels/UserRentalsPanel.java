package gui.panels;

import api.User;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRentalsPanel extends JFrame {
    private User currentUser;
    private JTextArea rentalsContents;

    private JTable rentalsTable;
    private DefaultTableModel rentalsTableModel;


    public UserRentalsPanel(User user) {
        this.currentUser = user;
        setTitle("Rentals GUI");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize the rentals table model
        String[] columnNames = {"Item Name", "Due Date"};
        rentalsTableModel = new DefaultTableModel(columnNames, 0);
        rentalsTable = new JTable(rentalsTableModel);
        JScrollPane scrollPane = new JScrollPane(rentalsTable);

        rentalsContents = new JTextArea(10, 30);
        rentalsContents.setEditable(false);

        JButton viewRentalsButton = new JButton("Refresh Rentals");
        JButton returnButton = new JButton("Return Selected Item");

        JPanel buttonPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        buttonPanel.add(viewRentalsButton);
        buttonPanel.add(returnButton);

        add(buttonPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.CENTER);



        // Implement logic for returnButton which involves removing items from the Rentals.csv
//        returnButton.addActionListener(this::returnRentalItem);

        viewRentalsButton.addActionListener(this::loadAndDisplayRentals);
        returnButton.addActionListener(this::returnRentalItem);

        // Load rentals when the panel is opened
        loadAndDisplayRentals(null);
    }

    private void loadAndDisplayRentals(ActionEvent e) {
        // Clear the table
        rentalsTableModel.setRowCount(0);

        // Load rentals from the file
        String userEmail = currentUser.getEmail();
        String fileName = "src/main/java/DatabaseFiles/Rentals.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine[0].equalsIgnoreCase(userEmail)) {
                    rentalsTableModel.addRow(new Object[]{nextLine[1], nextLine[2]});
                }
            }
        } catch (IOException | CsvException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading rentals: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void returnRentalItem(ActionEvent e) {
        int selectedRow = rentalsTable.getSelectedRow();
        if (selectedRow != -1) {
            String fileName = "src/main/java/DatabaseFiles/Rentals.csv";
            List<String[]> allRentals = new ArrayList<>();
            try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
                allRentals = reader.readAll();
                allRentals.removeIf(rental ->
                        rental[0].equalsIgnoreCase(currentUser.getEmail()) &&
                        rental[1].equalsIgnoreCase((String) rentalsTableModel.getValueAt(selectedRow, 0))
                );

                // Rewrite the Rentals.csv file without the returned item
                try (CSVWriter writer = new CSVWriter(new FileWriter(fileName),
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END)) {
                    writer.writeAll(allRentals);
                }
            } catch (IOException | CsvException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error processing return: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Refresh the rentals list
            loadAndDisplayRentals(null);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a rental to return.", "No Selection", JOptionPane.WARNING_MESSAGE);
        }
    }
}