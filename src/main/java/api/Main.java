package api;


import gui.MainFrame;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        User user = new Student("Email", "Password");

        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);

    }
}
