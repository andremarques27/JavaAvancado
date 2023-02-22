package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JTextArea1 {

    public static void main(String[] args) {

        JFrameJPanel1 FramePanel = new JFrameJPanel1();
        JTextArea ta = new JTextArea();

        ta.setText("Ambiente gráfico \n swing no Java. \n Texto com mais de \n uma linha");
        ta.setRows(20);
        ta.setColumns(40);
        ta.setBackground(Color.GRAY);
        ta.setForeground(Color.WHITE);
        ta.setLayout(null);

        FramePanel.JPanel(ta);
        FramePanel.JFrame1(new BorderLayout());
    }
}
