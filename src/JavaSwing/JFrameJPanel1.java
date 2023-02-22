package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JFrameJPanel1 {

    public JFrame frame = new JFrame();
    public JPanel jp = new JPanel();

    public void JFrame1(LayoutManager l) {

        frame.setSize(1360, 768);
        frame.setLocation(50, 50);
        frame.setTitle("Java na Prática");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(l);
        frame.add(jp);
        frame.setVisible(true);
    }

    public void JPanel(Component y) {

        jp.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jp.setBackground(Color.WHITE);
        jp.setSize(1300, 600);
        jp.setLocation(50, 50);
        jp.add(y);
    }
}
