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
import javax.swing.JOptionPane;
import princetonPlainsboro.Acte;
import princetonPlainsboro.Code;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class BoutonListenerValiderAjouterActe implements ActionListener {
    JAjouterActe aa;
     Fen jframe;
     SIH sih;
     FicheDeSoins fds;
     
     public BoutonListenerValiderAjouterActe(JAjouterActe aa,Fen jframe, SIH sih,FicheDeSoins fds){
         this.aa=aa;
         this.sih=sih;
                 this.jframe=jframe;
                 this.fds=fds;
     }
     
     
    public void actionPerformed (ActionEvent e){
        
        String medecin = aa.getjTextField2().getText();
       
        String coefficiant = aa.getjTextField1().getText().toString();
         int scoefficiant  = Integer.parseInt(coefficiant);
        
        String Type = (String) aa.getjComboBox1().getSelectedItem();
       //Code code = (Code) aa.getjComboBox2().getSelectedItem();
                
        Code code = Code.AMO;
         
        // Verification données : 
         if(medecin.equals("")||coefficiant.equals("")){
             JOptionPane.showMessageDialog(null, "Une case n'est pas remplit");
         }else{
      
               Acte a= new Acte(code,scoefficiant);
             
               fds.ajouterActe(a);
           
         
             JOptionPane.showMessageDialog(null, "Acte ajouté correctement");
      
      
             
             
         }
       
//         }
}
}
