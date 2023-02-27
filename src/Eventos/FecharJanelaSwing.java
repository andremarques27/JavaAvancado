package Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FecharJanelaSwing extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", null, JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
}
