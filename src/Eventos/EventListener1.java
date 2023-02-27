package Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListener1 implements ActionListener {

    private final JTextField t;

    public EventListener1(JTextField t) {
        this.t = t;
    }

    public void actionPerformed(ActionEvent e) {

        String nome = t.getText();

        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
    }
}
