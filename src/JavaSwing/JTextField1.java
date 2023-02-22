package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JTextField1 {

    public static void main(String[] args) {

        JFrameJPanel1 FramePanel = new JFrameJPanel1();
        JTextField tf = new JTextField();

        tf.setText("Caixa de texto");
        tf.setColumns(20);
        tf.setLayout(null);

        FramePanel.JPanel(tf);
        FramePanel.JFrame1(new BorderLayout());
    }
}
