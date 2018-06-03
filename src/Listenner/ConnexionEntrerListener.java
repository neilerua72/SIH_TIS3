/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.ConnexionInterface;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.Jmenu;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author Aurélien
 */
public class ConnexionEntrerListener extends ListenerConexion implements KeyListener{

    public ConnexionEntrerListener(Jmenu m, ConnexionInterface c, JPanel jp, Barre b, Fen jframe) {
        super(m, c, jp, b, jframe);
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
            super.connexion();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
}
