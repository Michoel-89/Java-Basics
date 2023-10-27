package labels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("GUI/java.jpg");
        JLabel label = new JLabel();
        label.setText("I'm starting to like java");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("sans serif", Font.PLAIN, 60));
        // label.setBounds(0,0,250,250);

        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        // frame.setLayout(null);
        frame.pack();
        

    }
}
