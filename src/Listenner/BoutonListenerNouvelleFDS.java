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
 * @author annelise
 */
public class BoutonListenerNouvelleFDS implements ActionListener {
JConsulterDP_dans_le_dossier jcdpdld = new JConsulterDP_dans_le_dossier ();
    JCreerFDS jcFDS= new JCreerFDS ();

    public BoutonListenerNouvelleFDS(Fen jframe,JConsulterDP_dans_le_dossier jcdpdld,JCreerFDS jcFDS) {
        this.jframe = jframe;
        this.jcFDS = jcFDS;
        this.jcdpdld= jcdpdld;
        
    }
     Fen jframe;
     
     
     
    @Override
    public void actionPerformed(ActionEvent ae) {
         jframe.toutFalse();
        jframe.add(jcFDS);
        jcFDS.getNomPrenom().setText(jcdpdld.getNomPrenom().getText());
        jcFDS.getDate().setText(jcdpdld.getDate().getText());
        jcFDS.getNum().setText(jcdpdld.getNumDeSS().getText());
        jcFDS.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
        
    }
    
    
}
