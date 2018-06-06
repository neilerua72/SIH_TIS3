/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.ConnexionInterface;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JCoutMedecin;
import interfaceUtilisateur.JCoutPatient;
import interfaceUtilisateur.JListeDeMedecins;

import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.JListedePatientParMedecins;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.Connexion;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.Identification;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

/**
 *
 * @author Aurélien
 */
public abstract class ListenerRecherche {
JConsulterDP_dans_le_dossier dossierPatient;
    JListeDePatients lp;
    Fen frame;
    SIH sih;
    JCoutPatient cp;

    public ListenerRecherche(JListeDePatients lp, Fen jframe, SIH sih, JCoutPatient cp, JConsulterDP_dans_le_dossier dossierPatient) {
        this.lp = lp;
        this.frame = frame;
        this.sih = sih;
        this.cp = cp;
        this.dossierPatient=dossierPatient;
    }

    public void recherche(int f) {
        String[][] tab;
        ArrayList<DossierPatient> requete;
        if (f == 1) {
            requete = new ArrayList(sih.rechercheDP(lp.getRecherche().getText()));
        }
        
        else {
            requete = new ArrayList(sih.rechercheDP(cp.getjTextField2().getText()));
          
        }
        tab = new String[requete.size()][3];
        for (int i = 0; i < requete.size(); i++) {
            DossierPatient dp = requete.get(i);
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
        JTable jt = lp.getjTable1();
        jt.addMouseListener(new tablesListenerBarreR(jt,frame, dossierPatient,sih,requete));
    
        if (f == 1) {
            lp.getjTable1().setModel(model);
            lp.getjScrollPane4().setViewportView(lp.getjTable1());
           
        }
                
        else {
            cp.getjTable1().setModel(model);
            cp.getjScrollPane4().setViewportView(cp.getjTable1());
           
        }
 
    }
}

    
        
     
       
        
        
        
        
      
           
        
     
 
    
