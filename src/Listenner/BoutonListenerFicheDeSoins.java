/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author annelise
 */
public class BoutonListenerFicheDeSoins implements ActionListener{
  JFDSMedicalModifiable jfdsmm = new JFDSMedicalModifiable();
    JConsulterDP_dans_le_dossier JCDPdld = new JConsulterDP_dans_le_dossier ();
     Fen jframe;
     public BoutonListenerFicheDeSoins(JConsulterDP_dans_le_dossier JCDPdld,JFDSMedicalModifiable jfdsmm,Fen jframe){
         this.jfdsmm=jfdsmm;
         this.JCDPdld=JCDPdld;
         this.jframe=jframe;
     }
    public void actionPerformed (ActionEvent e){
         jframe.toutFalse();
        jframe.add(jfdsmm);
           System.out.println("TESTTTTTT");
        jfdsmm.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
    }
}
