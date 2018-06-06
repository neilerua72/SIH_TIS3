/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JCoutMedecin;
import interfaceUtilisateur.JListeDeMedecins;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class BarreRechercherCoutM extends ListenerRechercheMedecin implements KeyListener{
      JListeDeMedecins lm;
    Fen frame;
    SIH sih;
    JCoutMedecin cm;
    
    public BarreRechercherCoutM(JListeDeMedecins lm, Fen jframe, SIH sih, JCoutMedecin cm) {
        super(lm,jframe,sih,cm);
    }
    
    public void actionPerformed(ActionEvent e) {
           
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if((e.getKeyCode()>64&&e.getKeyCode()<91)||e.getKeyCode()==8);
         super.recherche(2);  
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
