package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    
    JButton button;
    MyFrame() {

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e -> System.out.println("button"));
        button.setText("button");
        button.setFocusable(false);
        button.setBorder(BorderFactory.createBevelBorder(ABORT, getForeground(), getForeground(), getBackground(), getForeground()));

        this.setSize(500,500);
        this.setVisible(true);
        JPanel panel = new JPanel();
        panel.add(button);
        this.add(panel);

    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     if (e.getSource()==button) {
    //         System.out.println("button");
    //     }
    // }
}
