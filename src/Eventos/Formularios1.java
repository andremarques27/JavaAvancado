package Eventos;

import javax.swing.*;

public class Formularios1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(1360, 768);
        frame.setLocation(100, 50);
        frame.setTitle("Formulario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();

        JLabel jNome = new JLabel("Digite seu nome: ");
        jp.add(jNome);

        JTextField jtTexto = new JTextField(20);
        jp.add(jtTexto);

        JButton jbOk = new JButton("OK");
        EventListener1 eventListener1 = new EventListener1(jtTexto);
        jbOk.addActionListener(eventListener1);
        jp.add(jbOk);

        frame.add(jp);
        frame.setVisible(true);
    }
}
