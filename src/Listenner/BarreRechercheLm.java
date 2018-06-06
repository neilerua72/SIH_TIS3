/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JCoutMedecin;
import interfaceUtilisateur.JCoutPatient;
import interfaceUtilisateur.JListeDeMedecins;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.JListedePatientParMedecins;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class BarreRechercheLm extends ListenerRechercheMedecin implements KeyListener{
      JListeDeMedecins lm;
    Fen frame;
    SIH sih;
    JCoutMedecin cm;
    JListedePatientParMedecins jldppm;
    
    public BarreRechercheLm( JListeDeMedecins lm, Fen jframe, SIH sih, JCoutMedecin cm,JListedePatientParMedecins jldppm) {
        super(lm,jframe,sih,cm,jldppm);
    }
    
  

   
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       if((e.getKeyCode()>64&&e.getKeyCode()<91)||e.getKeyCode()==8)
            super.recherche(1);
    }
    
}
