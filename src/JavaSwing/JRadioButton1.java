package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JRadioButton1 {

    public static void main(String[] args) {

        JFrameJPanel1 FramePanel = new JFrameJPanel1();

        JRadioButton op1 = new JRadioButton("Linux");
        JRadioButton op2 = new JRadioButton("Windows");
        JRadioButton op3 = new JRadioButton("Macintosh");

        ButtonGroup group = new ButtonGroup();
        group.add(op1);
        group.add(op2);
        group.add(op3);

        FramePanel.JPanel(op1);
        FramePanel.JPanel(op2);
        FramePanel.JPanel(op3);
        FramePanel.JFrame1(new BorderLayout());
    }
}
