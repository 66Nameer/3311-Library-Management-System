package gui.panels;

import gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class NewsletterBrowserPanel extends JPanel {
    private JEditorPane editorPane;

    public NewsletterBrowserPanel() {
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());
        editorPane = new JEditorPane();
        editorPane.setEditable(false);  
        try {
            editorPane.setPage("http://www.example.com"); 
        } catch (IOException e) {
            editorPane.setContentType("text/html");
            editorPane.setText("<html>Could not load</html>"); 
        }

        JScrollPane scrollPane = new JScrollPane(editorPane);
        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }

    public void loadURL(String url) {
        try {
            editorPane.setPage(url);
        } catch (IOException e) {
            editorPane.setContentType("text/html");
            editorPane.setText("<html>Could not load: " + url + "</html>"); 
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Newsletter Browser");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

      
            NewsletterBrowserPanel browserPanel = new NewsletterBrowserPanel();

         
            browserPanel.loadURL("https://www.nytimes.com");

         
            frame.add(browserPanel);

        
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
        }
    }


