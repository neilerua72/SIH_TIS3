/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JFDSMedicalModifiable;
import interfaceUtilisateur.JListeDePatients;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author teuliera
 */
public class BoutonListenerRetourFDSversDP implements ActionListener {
   JFDSMedicalModifiable jfdsmm;
    JConsulterDP_dans_le_dossier jcdpdld;
      Fen jframe;
 
    
    public BoutonListenerRetourFDSversDP(Fen jframe,  JFDSMedicalModifiable jfdsmm,JConsulterDP_dans_le_dossier jcdpdld) {
        this.jframe = jframe;
        this.jfdsmm=jfdsmm;
         this.jcdpdld=jcdpdld;
    }
    
  
      

  
    public void actionPerformed(ActionEvent ae) {
       jframe.toutFalse();
        jframe.add(jcdpdld);
         
        jcdpdld.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
    }
}
