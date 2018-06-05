/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JCreerFDS;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author teuliera
 */
public class BoutonListenerRetoucreerFDDversDP 

    
     implements ActionListener {
 JCreerFDS jcfds;
    JConsulterDP_dans_le_dossier jcdpdld;
      Fen jframe;
 
    
    public BoutonListenerRetoucreerFDDversDP(Fen jframe,  JCreerFDS jcfds,JConsulterDP_dans_le_dossier jcdpdld) {
        this.jframe = jframe;
        this.jcfds=jcfds;
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

