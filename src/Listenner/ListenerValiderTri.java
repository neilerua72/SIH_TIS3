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
import interfaceUtilisateur.JFDSMedicalModifiable;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
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
    JFDSMedicalModifiable jfdsmm;

    public ListenerValiderTri(JConsulterFDS_dans_ongletFDS lp, Fen jframe, SIH sih,JFDSMedicalModifiable jfdsmm) {
        this.lp = lp;
        this.frame =jframe;
        this.sih = sih;
        this.jfdsmm=jfdsmm;
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
            String sannee=lp.getJour().getText();
         String smois=lp.getMois().getText();
         String sjour=lp.getAnnee().getText();
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
            String sannee1=lp.getJour1().getText();
         String smois1=lp.getMois1().getText();
         String sjour1=lp.getAnnee1().getText();
               String sannee2=lp.getJour2().getText();
         String smois2=lp.getMois2().getText();
         String sjour2=lp.getAnnee2().getText(); 
          int annee1 = Integer.parseInt(sannee1);
        int mois1 = Integer.parseInt(smois1);
         int jour1 = Integer.parseInt(sjour1);
          int annee2 = Integer.parseInt(sannee2);
        int mois2 = Integer.parseInt(smois2);
         int jour2 = Integer.parseInt(sjour2);
             Date d1 = new Date(annee1,mois1,jour1);
             Date d2 = new Date(annee2,mois2,jour2);
             lfds=sih.nombreFichesIntervalle(d1, d2);
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
        
        
        JTable jt = lp.getjTable1();
        jt.addMouseListener(new tableauListenerFDSversDP(jt,frame,jfdsmm ,sih,requete));
        
        
        
        lp.getjTable1().setModel(model);
        lp.getjScrollPane3().setViewportView(lp.getjTable1());

    }
}
