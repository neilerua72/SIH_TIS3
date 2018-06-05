/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.ConnexionInterface;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JCoutPatient;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.Jmenu;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import princetonPlainsboro.SIH;

/**
 *
 * @author Aurélien
 */
public class RechercheEntrerListener extends ListenerRecherche implements KeyListener{

    public RechercheEntrerListener(JListeDePatients lp,Fen jframe, SIH sih, JCoutPatient cp) {
        super(lp,jframe,sih,cp);
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
            if((e.getKeyCode()>64&&e.getKeyCode()<91)||e.getKeyCode()==8)
            super.recherche(1);
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
}
