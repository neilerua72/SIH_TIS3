/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JAjouterActe;
import interfaceUtilisateur.JCreerFDS;
import interfaceUtilisateur.JFDSMedicalModifiable;
import javax.swing.JButton;
import princetonPlainsboro.Date;
import princetonPlainsboro.DateH;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.NumDeSS;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;
import princetonPlainsboro.Spe;

/**
 *
 * @author Aurélien
 */
public abstract class ListenerValiderNewFDS {
    
    JCreerFDS jcfds;
    JFDSMedicalModifiable j;
    Fen frame;
    SIH sih;
    JAjouterActe aa;
    public ListenerValiderNewFDS(JCreerFDS jcfds, JFDSMedicalModifiable j, Fen frame, SIH sih,JAjouterActe aa){
       this.jcfds=jcfds;
       this.j=j;
       this.frame=frame;
       this.sih=sih;
       this.aa=aa;
       
    }
    public void valider(){
        String nom = jcfds.getNom().getText();
        String prenom=jcfds.getPrenom().getText();
        String sannee=jcfds.getJour().getText();
        NumDeSS n = new NumDeSS(jcfds.getNum().getText());
        String specialite = jcfds.getSpe().getItemAt(2);
        specialite="GYN";
         String smois=jcfds.getMois().getText();
         String sjour=jcfds.getAnnee().getText();
         String sheure=jcfds.getHeure().getText();
         String sminutes=jcfds.getMinutes().getText();
         
         DossierPatient dp = sih.retrouverDossPat(new Patient(n));
         if(sannee.equals("")||smois.equals("")||sjour.equals("")||nom.equals("")||prenom.equals("")){
             //POPUP
         }else{
             int annee = Integer.parseInt(sannee);
        int mois = Integer.parseInt(smois);
         int jour = Integer.parseInt(sjour);
         int heure = Integer.parseInt(sheure);
         int minutes = Integer.parseInt(sminutes);
             DateH d = new DateH(annee,mois,jour,heure,minutes);
             if(!d.dateCorrect()){
                 //POPup
             }else{
                 Spe spe = Spe.recupEnum(specialite);
             
               Medecin m = new Medecin(nom,prenom,spe);
                 FicheDeSoins f = new FicheDeSoins(dp.getPatient(),m,d);
                 dp.ajouterFiche(f);
                 JButton jb = aa.getjButton2();
                 jb.addActionListener(new BoutonListenerValiderAjouterActe(aa,frame,sih,f));
                 j.getNomPrenom().setText(dp.getPatient().getNom()+" "+dp.getPatient().getPrenom());
                 j.getDateFiche().setText("Fiche de soins du "+f.getDate());
                 j.getNumDeSS().setText(dp.getPatient().getNumDeSS().toString());
                 j.getDateNais().setText(dp.getPatient().getDateDeNaissance().toString());
                 frame.toutFalse();
                 frame.add(j);
                 j.setVisible(true);
                 frame.revalidate();
                 frame.repaint();
             }
         }
    }
    
}
