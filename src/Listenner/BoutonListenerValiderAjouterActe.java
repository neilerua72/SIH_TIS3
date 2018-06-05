/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JAjouterActe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import princetonPlainsboro.Acte;
import princetonPlainsboro.Code;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class BoutonListenerValiderAjouterActe implements ActionListener {
    JAjouterActe aa;
     Fen jframe;
     SIH sih;
     
     
     public BoutonListenerValiderAjouterActe(JAjouterActe aa,Fen jframe, SIH sih){
         this.aa=aa;
         this.sih=sih;
                 this.jframe=jframe;
     }
     
     
    public void actionPerformed (ActionEvent e){
        
        String medecin = aa.getjTextField2().getText();
        String coefficiant = aa.getjTextField1().getText();
        
        
       Acte a;
       a = new Acte(Code code,int coef);
       
       
       
         
         //Verification données : 
         if(nom.equals("")||prenom.equals("")||sannee.equals("")||smois.equals("")||sjour.equals("")||adresse.equals("")||numDeSS.equals("")){
             JOptionPane.showMessageDialog(null, "Une case n'est pas remplit");
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
         //Pour pas se faire chier avec le num de SS
         
         /*else if(numSS.verifNumS(d))
             JOptionPane.showMessageDialog(null, "Numéro de sécurité sociale impossible");*/
         else{
             Patient pa= new Patient(nom,prenom,numSS,adresse,d);
             DossierPatient dp = new DossierPatient(pa);
             sih.ajouterDp(dp);
             JOptionPane.showMessageDialog(null, "Patient ajouté correctement");
         }
         }
         
         
         
         
         
       
    }
}
