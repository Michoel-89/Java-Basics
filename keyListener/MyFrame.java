package keyListener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener {
    
    JLabel label;

    MyFrame() {
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());
                break;  
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println("you released key char: " + e.getKeyChar());
        // System.out.println("you released key code: " + e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
