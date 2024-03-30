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
        editorPane.setEditable(false);  // Make it read-only
        try {
            editorPane.setPage("http://www.example.com"); // Navigate to a URL
        } catch (IOException e) {
            editorPane.setContentType("text/html");
            editorPane.setText("<html>Could not load</html>"); // Error handling
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
            editorPane.setText("<html>Could not load: " + url + "</html>"); // Display error message directly in the editor pane
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Newsletter Browser");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600); // Set the initial size of the window

            // Create an instance of the NewsletterBrowserPanel
            NewsletterBrowserPanel browserPanel = new NewsletterBrowserPanel();

            // Optional URL
            browserPanel.loadURL("https://www.nytimes.com");

            // Add the NewsletterBrowserPanel to the frame
            frame.add(browserPanel);

            // Center the window and make it visible
            frame.setLocationRelativeTo(null); // This will center the window
            frame.setVisible(true); // Show the frame
        });
        }
    }


