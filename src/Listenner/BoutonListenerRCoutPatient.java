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
import princetonPlainsboro.SIH;

/**
 *
 * @author Manon
 */
public class BoutonListenerRCoutPatient extends ListenerRecherche implements ActionListener {
    Fen frame;
    SIH sih;
    JCoutPatient cp;
    JListeDePatients lp;
    
    public BoutonListenerRCoutPatient(JListeDePatients lp,Fen jframe, SIH sih, JCoutPatient cp,JConsulterDP_dans_le_dossier jpp) {
        super(lp,jframe,sih,cp,jpp);
    }
    
    public void actionPerformed(ActionEvent e) {
       super.recherche(2);        
    }
    
}
