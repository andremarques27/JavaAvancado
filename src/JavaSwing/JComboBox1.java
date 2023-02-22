package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JComboBox1 {

    public static void main(String[] args) {

        JFrameJPanel1 FramePanel = new JFrameJPanel1();
        JComboBox cb = new JComboBox();

        cb.addItem("Opção teste 1");
        cb.addItem("Opção teste 2");
        cb.addItem("Opção teste 3");
        cb.addItem("Opção teste 4");

        FramePanel.JPanel(cb);
        FramePanel.JFrame1(new BorderLayout());
    }
}
