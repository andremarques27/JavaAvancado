package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class BorderLayout1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(1360, 768);
        frame.setLocation(100, 50);
        frame.setTitle("Java na Prática");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setLayout(new BorderLayout());
        frame.add(BorderLayout.NORTH, new JButton("Parte de cima"));
        frame.add(BorderLayout.CENTER, new JButton("Parte do centro"));
        frame.add(BorderLayout.SOUTH, new JButton("Parte de baixo"));
        frame.add(BorderLayout.EAST, new JButton("Parte da direita"));
        frame.add(BorderLayout.WEST, new JButton("Parte da esquerda"));
    }
}