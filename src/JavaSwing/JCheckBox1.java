package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JCheckBox1 {

    public static void main(String[] args) {

        JFrameJPanel1 FramePanel = new JFrameJPanel1();
        JCheckBox jc = new JCheckBox();
        JCheckBox jc1 = new JCheckBox();

        jc.setText("Componente checkbox 1");
        jc1.setText("Componente checkbox 2");
        jc.setLayout(null);

        FramePanel.JPanel(jc);
        FramePanel.JPanel(jc1);
        FramePanel.JFrame1(new BorderLayout());
    }
}
