/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JAjouterActe;
import interfaceUtilisateur.JCreerFDS;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import princetonPlainsboro.SIH;

/**
 *
 * @author Aur�lien
 */
public class BoutonValiderNouvFDS extends ListenerValiderNewFDS implements ActionListener{

    public BoutonValiderNouvFDS(JCreerFDS jcfds, JFDSMedicalModifiable j, Fen frame, SIH sih,JAjouterActe aa) {
        super(jcfds, j, frame, sih,aa);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         super.valider();
    }
    
}
