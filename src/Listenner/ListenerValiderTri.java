/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.ConnexionInterface;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterFDS_dans_ongletFDS;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.ComparaisonFichesCouts;
import princetonPlainsboro.ComparaisonFichesDates;
import princetonPlainsboro.Connexion;
import princetonPlainsboro.Date;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Identification;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

/**
 *
 * @author Aurélien
 */
public abstract class ListenerValiderTri {

    JConsulterFDS_dans_ongletFDS lp;
    Fen frame;
    SIH sih;

    public ListenerValiderTri(JConsulterFDS_dans_ongletFDS lp, Fen jframe, SIH sih) {
        this.lp = lp;
        this.frame = frame;
        this.sih = sih;
    }

    public void recherche() {
        ArrayList<FicheDeSoins> lfds = new ArrayList<FicheDeSoins>();
        
        String[][] tab;
        if (lp.getCout().isSelected()) {
            if (lp.getCroissantC().isSelected()) {
                 lfds= sih.trier(new ComparaisonFichesCouts(1));
            } else {
                    lfds= sih.trier(new ComparaisonFichesCouts(2));
            }

        } else if (lp.getDate().isSelected()) {
            if (lp.getCroissantC().isSelected()) {
                
                lfds= sih.trier(new ComparaisonFichesDates(1));
            } else {
                lfds= sih.trier(new ComparaisonFichesDates(2));

            }
        } else if (lp.getLe().isSelected()) {
            String sannee=lp.getJdjour().getText();
         String smois=lp.getJdmois().getText();
         String sjour=lp.getJdannee().getText();
         if(sannee.equals("")||smois.equals("")||sjour.equals("")){
             //POPOUP
         }else{
             int annee = Integer.parseInt(sannee);
        int mois = Integer.parseInt(smois);
         int jour = Integer.parseInt(sjour);
             Date d = new Date(annee,mois,jour);
             if(!d.dateCorrect()){
                 //POPup
             }else{
                 lfds=sih.lfdsDate(d);
             }
         }
            

        } else {
                    //DateIntervale
        }

        ArrayList<FicheDeSoins> requete = new ArrayList(lfds);
        tab = new String[requete.size()][4];
        for (int i = 0; i < requete.size(); i++) {
            FicheDeSoins f= requete.get(i);
            Patient p = f.getPatient();
            tab[i][0] = p.getNom();
            tab[i][1] = p.getPrenom();
            tab[i][2] = f.getDate().toString();
            tab[i][3]=""+f.coutTotal();
        }
        DefaultTableModel model = new DefaultTableModel(
                tab,
                new String[]{
                    "Nom", "Prénom", "Date","Coût"
                });
        lp.getjTable1().setModel(model);
        lp.getjScrollPane3().setViewportView(lp.getjTable1());

    }
}
