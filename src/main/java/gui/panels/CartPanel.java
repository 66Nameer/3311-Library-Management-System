package gui.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.Map;
import api.*;
public class CartPanel  extends  JFrame {
    private Cart cart = new Cart();
    private JTextField itemNameField, quantityField;
    private JTextArea cartContents;

    public CartPanel() {
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

        setVisible(true);

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
