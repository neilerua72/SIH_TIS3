/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_facture;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author annelise
 */
public class BoutonListenerFacture implements ActionListener {

      JConsulterDP_facture jcDPf;
     JFDSMedicalModifiable jfdsmm;
      Fen jframe;
 
    
    public BoutonListenerFacture(Fen jframe,JConsulterDP_facture jcDPf,JFDSMedicalModifiable jfdsmm) {
        this.jframe = jframe;
        this.jcDPf= jcDPf;
         this.jfdsmm=jfdsmm;
    }
    
  
      

    @Override
    public void actionPerformed(ActionEvent ae) {
       jframe.toutFalse();
        jframe.add(jcDPf);
         
        jcDPf.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
    }
}

