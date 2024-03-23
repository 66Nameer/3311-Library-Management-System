package api;


import gui.MainFrame;
import gui.panels.BrowsingPanel;
import gui.panels.CartPanel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

       Item item = Database.getInstance().fetchItem(2);
        System.out.println(item);

    }
}
