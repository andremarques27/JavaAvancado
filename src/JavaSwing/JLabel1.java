package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JLabel1 {

    public static void main(String[] args) {

        JFrameJPanel1 FramePanel1 = new JFrameJPanel1();
        JLabel jl = new JLabel();

        jl.setText("Componente JLabel");
        jl.setFont(new Font("Dialog", Font.ITALIC, 16));
        jl.setForeground(Color.RED);
        jl.setToolTipText("Texto ao passar o mouse");
        jl.setLayout(null);

        FramePanel1.JPanel(jl);
        FramePanel1.JFrame1(new BorderLayout());
    }
}
