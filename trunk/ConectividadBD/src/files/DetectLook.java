package files;

import javax.swing.*;

public class DetectLook extends JFrame {

    public DetectLook() {
        UIManager.LookAndFeelInfo[] laf = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo laf1 : laf) {
            System.out.println("Class name: " + laf1.getClassName());
            System.out.println("Name: " + laf1.getName() + "\n");
        }
    }

    public static void main(String[] arguments) {
        DetectLook dialog = new DetectLook();
    }
}