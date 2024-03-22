package api;


import gui.MainFrame;
import gui.panels.BrowsingPanel;
import gui.panels.CartPanel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        User user = new Student("Email", "Password");

       MainFrame mainFrame = new MainFrame();
       mainFrame.setVisible(true);

    }
}
