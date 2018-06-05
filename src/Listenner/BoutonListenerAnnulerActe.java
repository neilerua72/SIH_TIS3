/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JAjouterActe;
import interfaceUtilisateur.JConsulterDP_facture;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author teuliera
 */
public class BoutonListenerAnnulerActe implements ActionListener {

    JAjouterActe jaa;
    JFDSMedicalModifiable jfdsmm;
    Fen jframe;

    public BoutonListenerAnnulerActe(Fen jframe, JAjouterActe jaa, JFDSMedicalModifiable jfdsmm) {
        this.jframe = jframe;
        this.jaa = jaa;
        this.jfdsmm = jfdsmm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        jframe.toutFalse();
        jframe.add(jfdsmm);
        jfdsmm.setVisible(true);
        System.out.println("grrrrrrrrrrrrrrr");
        jframe.revalidate();
        jframe.repaint();

    }

}
