/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.ConnexionInterface;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_liste_patients;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.Connexion;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.Identification;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

/**
 *
 * @author Aurélien
 */
public abstract class ListenerRecherche {
    JListeDePatients lp;
    Fen frame;
    SIH sih;
    public ListenerRecherche(JListeDePatients lp,Fen jframe, SIH sih) {
       this.lp=lp;
       this.frame=frame;
       this.sih=sih;
    }

    
    public void recherche(){
        String[][] tab;
        ArrayList<DossierPatient> requete= new ArrayList(sih.rechercheDP(lp.getRecherche().getText()));
            tab = new String[requete.size()][3];
            for (int i = 0; i < requete.size(); i++) {
                DossierPatient dp =requete.get(i);
                Patient p = dp.getPatient();
                tab[i][0] = p.getNom();
                tab[i][1] = p.getPrenom();
                tab[i][2] = p.getDateDeNaissance().toString();
            }
            DefaultTableModel model = new DefaultTableModel(
                    tab,
                    new String[]{
                        "Nom", "Prénom", "Date de naissance"
                    });
            lp.getjTable1().setModel(model);
            lp.getjScrollPane4().setViewportView(lp.getjTable1());
         
}
}
