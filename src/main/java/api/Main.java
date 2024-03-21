package api;


import gui.MainFrame;
import gui.panels.BrowsingPanel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        User user = new Student("Email", "Password");

        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);

/*        JFrame frame = new JFrame("Browsing");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BrowsingPanel browsing = new BrowsingPanel(new Cart());
        frame.add(browsing);

        frame.pack();
        frame.setVisible(true);*/

    }
}
