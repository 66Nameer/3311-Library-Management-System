import javax.swing.*;
import java.awt.*;

public class WebBrowserWindow extends JFrame {
    private NewsletterBrowserPanel browserPanel;

    public WebBrowserWindow(String url) {
        setTitle("Web Browser");
        setSize(800, 600); // Set the size of the browser window
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Close the window without exiting the app

        // Initialize the NewsletterBrowserPanel with the URL
        browserPanel = new NewsletterBrowserPanel();
        browserPanel.loadURL(url); // Load the desired URL

        // Add the browser panel to the window
        getContentPane().add(browserPanel, BorderLayout.CENTER);
    }
}
