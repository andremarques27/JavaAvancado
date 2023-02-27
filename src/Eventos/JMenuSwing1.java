package Eventos;

import javax.swing.*;

public class JMenuSwing1 extends JFrame {

    public JMenuSwing1(){

        setTitle("Menu principal");
        setSize(700, 400);
        setLocation(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();

        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');

        JMenu menuEditar = new JMenu("Editar");
        menuEditar.setMnemonic('E');

        JMenuItem novo = new JMenuItem("Novo");
        novo.setMnemonic('O');

        JMenuItem copiar = new JMenuItem("Copiar");
        copiar.setMnemonic('C');

        JMenuItem sair = new JMenuItem(new FecharJanelaSwing());
        sair.setText("Sair");
        sair.setMnemonic('S');

        menu.add(menuArquivo);
        menu.add(menuEditar);
        menuEditar.add(copiar);
        menuArquivo.add(novo);
        menuArquivo.add(sair);

        setJMenuBar(menu);
        setVisible(true);
    }

    public static void main(String[] args) {

        new JMenuSwing1();
    }
}
