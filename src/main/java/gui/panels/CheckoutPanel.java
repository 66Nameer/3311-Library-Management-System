package gui.panels;

import api.*;
import com.opencsv.CSVWriter;
import gui.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class CheckoutPanel extends JPanel implements ActionListener {
	
	private MainFrame mainFrame;
	private JButton proceed;
	
	
	
	public CheckoutPanel(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		setLayout(new BorderLayout(10, 10));
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		centerPanel.add(Box.createVerticalStrut(50));
		
		
		centerPanel.add(Box.createVerticalGlue());
		
		
		
		// Checkout panel
		JPanel checkoutPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		checkoutPanel.add(new JLabel("Proceed to Checkout?"));
		
		proceed = new JButton("Proceed to Checkout");
		proceed.addActionListener(this);
		proceed.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel proceedButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		proceedButtonPanel.add(proceed);
		
		proceed.setBackground(Color.WHITE);
		proceed.setForeground(Color.BLACK);
		
		
		
		
	}
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == proceed) {
			// go to Checkout page?
		}
		
	}

}
