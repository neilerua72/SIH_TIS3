/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JAjouterActe;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JCreerFDS;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author annelise
 */
public class BoutonListenerAjouterActe implements ActionListener{
    JFDSMedicalModifiable jfdsmm = new JFDSMedicalModifiable ();
    JAjouterActe jaa= new   JAjouterActe ();
Fen jframe;

    public BoutonListenerAjouterActe(Fen jframe,JFDSMedicalModifiable jfdsmm, JAjouterActe jaa) {
        this.jframe = jframe;
        this.jaa=  jaa;
        this.jfdsmm = jfdsmm;
    }
  
     
     
     
    @Override
    public void actionPerformed(ActionEvent ae) {
         jframe.toutFalse();
        jframe.add(jaa);
        
        jaa.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
        
    }
    
    
}
