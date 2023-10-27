package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("gui");
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("GUI/java.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0,0,0));
    }
}
