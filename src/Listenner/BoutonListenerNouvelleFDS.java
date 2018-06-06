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
import javax.swing.JComboBox;
import princetonPlainsboro.SIH;

/**
 *
 * @author annelise
 */
public class BoutonListenerNouvelleFDS implements ActionListener {
JConsulterDP_dans_le_dossier jcdpdld;
    JCreerFDS jcFDS;
    JAjouterActe aa;
    SIH sih;
    public BoutonListenerNouvelleFDS(Fen jframe,JConsulterDP_dans_le_dossier jcdpdld,JCreerFDS jcFDS,JAjouterActe aa,SIH sih) {
        this.jframe = jframe;
        this.jcFDS = jcFDS;
        this.jcdpdld= jcdpdld;
        this.aa=aa;
           this.sih=sih;
        
    }
     Fen jframe;
     
     
     
    @Override
    public void actionPerformed(ActionEvent ae) {
         jframe.toutFalse();
        jframe.add(jcFDS);
       
        jcFDS.getNomPrenom().setText(jcdpdld.getNomPrenom().getText());
        jcFDS.getDate().setText(jcdpdld.getDate().getText());
        jcFDS.getNum().setText(jcdpdld.getNumDeSS().getText());
        JComboBox<String>jc=jcFDS.getSpe();
        String [] s = new String[sih.getLS().size()];
        for(int i=0;i<s.length;i++){
            s[i]=sih.getLS().get(i).toString();
        }
        jc.setModel(new javax.swing.DefaultComboBoxModel<String>(s));
        jcFDS.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
        
    }
    
    
}
