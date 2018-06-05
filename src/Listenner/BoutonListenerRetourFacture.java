/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JConsulterDP_facture;
import interfaceUtilisateur.JCreerFDS;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author teuliera
 */
public class BoutonListenerRetourFacture implements ActionListener{
   JConsulterDP_facture jcdpf;
    JFDSMedicalModifiable jcfdsmm;

    public BoutonListenerRetourFacture(Fen jframe, JFDSMedicalModifiable jcFDS, JConsulterDP_facture jcdpf) {
        this.jframe = jframe;
        this.jcdpf = jcdpf;
        this.jcfdsmm= jcfdsmm;
        
    }
     Fen jframe;
     
     
     

    public void actionPerformed(ActionEvent ae) {
         jframe.toutFalse();
        jframe.add(jcfdsmm);
        
        jcfdsmm.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
        
    }
    
}