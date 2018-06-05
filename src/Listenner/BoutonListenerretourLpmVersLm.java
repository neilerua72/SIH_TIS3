/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JListeDeMedecins;
import interfaceUtilisateur.JListedePatientParMedecins;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author teuliera
 */
public class BoutonListenerretourLpmVersLm implements ActionListener {
    JListeDeMedecins jldm;
    JListedePatientParMedecins jldppm;
     Fen jframe;
     
     public BoutonListenerretourLpmVersLm(JListedePatientParMedecins jldppm, JListeDeMedecins jldm,Fen jframe){
        this.jldppm=jldppm;
        this.jldm=jldm;
         this.jframe=jframe;
     }
    public void actionPerformed (ActionEvent e){
        
        jframe.toutFalse();
        jframe.add(jldm);
         
        jldm.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
}
}
