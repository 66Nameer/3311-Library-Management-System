import javax.swing.*;
import java.awt.*;

public class WebBrowserWindow extends JFrame {
    private NewsletterBrowserPanel browserPanel;

    public WebBrowserWindow(String url) {
        setTitle("Web Browser");
        setSize(800, 600); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

      
        browserPanel = new NewsletterBrowserPanel();
        browserPanel.loadURL(url); 

     
        getContentPane().add(browserPanel, BorderLayout.CENTER);
    }
}
