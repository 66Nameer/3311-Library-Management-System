package gui.panels;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PaymentMethodDialog extends JDialog {
    private JButton confirmPaymentButton;
    private JButton cancelPaymentButton;
    private JRadioButton debitCardOption;
    private JRadioButton creditCardOption;
    private JRadioButton mobileWalletOption;
    private ButtonGroup paymentMethodGroup;

    public PaymentMethodDialog(Frame owner, String stationName, String url) {
        super(owner, "Select Payment Method", true);
        setSize(400, 300);
        setLocationRelativeTo(owner);
        setLayout(new GridLayout(5, 1)); 

        JLabel selectMethodLabel = new JLabel("Select Payment Method:");
        add(selectMethodLabel);

        paymentMethodGroup = new ButtonGroup();
        debitCardOption = new JRadioButton("Debit Card");
        creditCardOption = new JRadioButton("Credit Card");
        mobileWalletOption = new JRadioButton("Mobile Wallet");

        paymentMethodGroup.add(debitCardOption);
        paymentMethodGroup.add(creditCardOption);
        paymentMethodGroup.add(mobileWalletOption);

        add(debitCardOption);
        add(creditCardOption);
        add(mobileWalletOption);

        JPanel buttonPanel = new JPanel();
        confirmPaymentButton = new JButton("Confirm");
        cancelPaymentButton = new JButton("Cancel");
        buttonPanel.add(confirmPaymentButton);
        buttonPanel.add(cancelPaymentButton);
        add(buttonPanel);

        confirmPaymentButton.addActionListener(e -> {
        
            JOptionPane.showMessageDialog(this, "Payment successful for " + stationName);
            dispose();
            if(url!=null) {
                EventQueue.invokeLater(() -> {
                    WebBrowserWindow browserWindow = new WebBrowserWindow(url);
                    browserWindow.setVisible(true);
                });
            }


            });

        cancelPaymentButton.addActionListener(e -> dispose());
    }
}
