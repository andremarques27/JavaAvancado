package JavaSwing;

import javax.swing.*;

public class JMenu1 {

    public static void main(String[] args) {

        JFrame janela =new JFrame();
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setLocation(500, 150);
        janela.setSize(600, 300);

        JMenuBar barra =new JMenuBar();

        JMenu arquivo = new JMenu("Arquivo");
        arquivo.setMnemonic('A');

        JMenuItem sair = new JMenuItem("Sair");
        sair.setMnemonic('S');

        JMenu editar = new JMenu("Editar");
        editar.setMnemonic('E');

        JMenuItem copiar = new JMenuItem("Copiar");
        copiar.setMnemonic('C');

        barra.add(arquivo);
        arquivo.add(sair);
        barra.add(editar);
        editar.add(copiar);

        janela.setJMenuBar(barra);
        janela.setVisible(true);
    }
}
