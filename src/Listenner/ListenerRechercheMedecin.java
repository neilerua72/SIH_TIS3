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
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public abstract class ListenerRechercheMedecin  {
JListedePatientParMedecins jldppm;
    JListeDeMedecins lm;
    Fen frame;
    SIH sih;
    JCoutMedecin cm;

    public ListenerRechercheMedecin(JListeDeMedecins lm, Fen jframe, SIH sih, JCoutMedecin cm,JListedePatientParMedecins jldppm) {
        this.lm = lm;
        this.frame = jframe;
        this.sih = sih;
        this.cm = cm;
       this.jldppm=jldppm;
    }

    public void recherche(int f) {
        String[][] tab;
        ArrayList<Medecin> requete;
        if (f == 1) {
            requete = new ArrayList(sih.rechercheMed(lm.getjTextField1().getText()));
        }
        
        else {
            requete = new ArrayList(sih.rechercheMed(cm.getjTextField1().getText()));
          
        }
        tab = new String[requete.size()][3];
        for (int i = 0; i < requete.size(); i++) {
           Medecin m= requete.get(i);
          
            tab[i][0] = m.getNom();
            tab[i][1] = m.getPrenom();
            tab[i][2] = m.getSpecialite().toString();
          
        }
        DefaultTableModel model = new DefaultTableModel(
                tab,
                new String[]{
                    "Nom", "Prénom", "Spécialité"
                });
        JTable jt = lm.getjTable1();
        jt.addMouseListener(new tableListeneBarreRmedecin(jt,frame,jldppm,sih,requete));
 
        
        
        
        
        if (f == 1) {
            lm.getjTable1().setModel(model);
            lm.getjScrollPane4().setViewportView(lm.getjTable1());
           
        }
                
        else {
            cm.getjTable1().setModel(model);
            cm.getjScrollPane4().setViewportView(cm.getjTable1());
           
        }
 
    }
}

        
       
       
            