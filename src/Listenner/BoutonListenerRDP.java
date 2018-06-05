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
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JCoutPatient;
import interfaceUtilisateur.JListeDePatients;
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
import princetonPlainsboro.SIH;

/**
 *
 * @author Aurélien
 */
public class BoutonListenerRDP extends ListenerRecherche implements ActionListener {

    JListeDePatients lp;
    Fen jframe;
    SIH sih;
    JCoutPatient cp;

    public BoutonListenerRDP(JListeDePatients lp,Fen jframe, SIH sih, JCoutPatient cp,JConsulterDP_dans_le_dossier jpp) {
        super(lp,jframe,sih,cp,jpp);
    }

    public void actionPerformed(ActionEvent e) {
       super.recherche(1);        
    }
}
