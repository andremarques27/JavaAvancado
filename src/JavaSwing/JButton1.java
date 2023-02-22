package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JButton1 {

    public static void main(String[] args) {

        JFrameJPanel1 FramePanel = new JFrameJPanel1();
        JButton jb = new JButton("Texto Botão Construtor");

        jb.setBackground(Color.BLACK);
        jb.setForeground(Color.WHITE);

        FramePanel.JPanel(jb);
        FramePanel.JFrame1(new BorderLayout());
    }
}
