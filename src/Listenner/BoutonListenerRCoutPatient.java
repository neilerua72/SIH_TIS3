/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JCoutPatient;
import interfaceUtilisateur.JListeDePatients;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import princetonPlainsboro.SIH;

/**
 *
 * @author Manon
 */
public class BoutonListenerRCoutPatient extends ListenerRecherche implements KeyListener {
    Fen frame;
    SIH sih;
    JCoutPatient cp;
    JListeDePatients lp;
    
    public BoutonListenerRCoutPatient(JListeDePatients lp,Fen jframe, SIH sih, JCoutPatient cp,JConsulterDP_dans_le_dossier jpp) {
        super(lp,jframe,sih,cp,jpp);
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {

      
    }

    

    @Override
    public void keyReleased(KeyEvent e) {
         if((e.getKeyCode()>64&&e.getKeyCode()<91)||e.getKeyCode()==8);
         super.recherche(2); 
    }
    
}

