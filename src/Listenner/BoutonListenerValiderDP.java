/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JCreerDP;
import interfaceUtilisateur.State;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import princetonPlainsboro.Date;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.NumDeSS;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

/**
 *
 * @author Aurélien
 */
public class BoutonListenerValiderDP implements ActionListener{
    JCreerDP cdp;
     Fen jframe;
     SIH sih;
     public BoutonListenerValiderDP(JCreerDP cdp,Fen jframe, SIH sih){
         this.cdp=cdp;
         this.sih=sih;
                 this.jframe=jframe;
     }
    public void actionPerformed (ActionEvent e){
        String nom = cdp.getNom().getText();
        String prenom = cdp.getPrenom().getText();
        
         String adresse = cdp.getAdresse().getText()+" "+cdp.getjTextField5().getText()+" "+cdp.getjTextField6().getText();
         String numDeSS = cdp.getNumSS().getText();
         String sannee=cdp.getAnnee().getText();
         String smois=cdp.getMois().getText();
         String sjour=cdp.getJour().getText();
         Patient p = new Patient(new NumDeSS(numDeSS));
         
         //Verification données : 
         if(nom.equals("")||prenom.equals("")||sannee.equals("")||smois.equals("")||sjour.equals("")||adresse.equals("")||numDeSS.equals("")){
             JOptionPane.showMessageDialog(null, "Une case n'est pas remplie");
         }else{
             int annee = Integer.parseInt(sannee);
        int mois = Integer.parseInt(smois);
         int jour = Integer.parseInt(sjour);
         Calendar rN = Calendar.getInstance();
         Date dd=new Date(rN.DAY_OF_WEEK,rN.DAY_OF_MONTH,rN.DAY_OF_YEAR);
         Date d = new Date(jour,mois,annee);
         NumDeSS numSS = new NumDeSS(numDeSS);
         if(sih.verifExistP(p)){
             JOptionPane.showMessageDialog(null, "Dossier Patient déjà existant");
         }else if(!d.dateCorrect()){
             JOptionPane.showMessageDialog(null, "Format de Date incorrect");
             
             
         }
         //Pour pas s'embêter avec le num de SS
         
         /*else if(numSS.verifNumS(d))
             JOptionPane.showMessageDialog(null, "Numéro de sécurité sociale impossible");*/
         else{
             Patient pa= new Patient(nom,prenom,numSS,adresse,d);
             DossierPatient dp = new DossierPatient(pa);
             sih.ajouterDp(dp);
             JOptionPane.showMessageDialog(null, "Patient ajouté correctement");
             cdp.getNom().setText("");
         cdp.getPrenom().setText("");
        
       cdp.getAdresse().setText("");
      cdp.getNumSS().setText("");
         cdp.getAnnee().setText("");
         cdp.getMois().setText("");
      cdp.getJour().setText("");
      cdp.getjTextField5().setText("");
      cdp.getjTextField6().setText("");
      cdp.getjTextField7().setText("");
      cdp.getjTextField9().setText("");
      
       
         
         }
         
         
         }
         
         
         
         
         
       
    }
    
}
