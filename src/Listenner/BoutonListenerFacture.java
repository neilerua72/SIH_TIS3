/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.ActeF;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JConsulterDP_facture;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import princetonPlainsboro.Acte;
import princetonPlainsboro.FicheDeSoins;

/**
 *
 * @author annelise
 */
public class BoutonListenerFacture implements ActionListener {

      JConsulterDP_facture jcDPf;
     JFDSMedicalModifiable jfdsmm;
     JConsulterDP_dans_le_dossier dp;
      Fen jframe;
 
    
    public BoutonListenerFacture(Fen jframe,JConsulterDP_facture jcDPf,JFDSMedicalModifiable jfdsmm,JConsulterDP_dans_le_dossier dp) {
        this.jframe = jframe;
        this.jcDPf= jcDPf;
         this.jfdsmm=jfdsmm;
         this.dp = dp;
         
    }
    
  
      

    @Override
    public void actionPerformed(ActionEvent ae) {
       jframe.toutFalse();
        jframe.add(jcDPf);
        
        jcDPf.getjLabel7().setText(jfdsmm.getNomPrenom().getText());
        jcDPf.getjLabel6().setText(jfdsmm.getDateNais().getText());
            jcDPf.getjLabel9().setText(dp.getAdresse().getText());
             jcDPf.getjLabel12().setText(dp.getjLabel8().getText());
             jcDPf.getjLabel13().setText(dp.getjLabel9().getText());
        
        FicheDeSoins f = jframe.getF();
        ArrayList<Acte> la = f.getActes();
        ActeF af = new ActeF();
        JScrollPane jp =  jcDPf.getjScrollPane1();
        JPanel p = jcDPf.getjPanel6();
        p.removeAll();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        for(int i=0;i<la.size();i++){
            af.getNom().setText("Nom : "+la.get(i).toString());
            af.getCout().setText("Coût : "+la.get(i).cout());
            p.add(af);
            af.setVisible(true);
        }
        
         
        jcDPf.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
    }
}

