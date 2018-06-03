/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.ConnexionInterface;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.Accueil;
import interfaceUtilisateur.Barre;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import princetonPlainsboro.Connexion;
import princetonPlainsboro.Identification;

/**
 *
 * @author Aurélien
 */
public class BoutonListenerConnexion extends ListenerConexion implements ActionListener {

    

    public BoutonListenerConnexion(Jmenu m, ConnexionInterface c, JPanel jp,Barre b,Fen jframe) {
        super(m,c,jp,b,jframe);
    }

    public void actionPerformed(ActionEvent e) {
       super.connexion();
        
    }
}
