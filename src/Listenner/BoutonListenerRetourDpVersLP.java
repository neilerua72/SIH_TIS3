/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JConsulterDP_facture;
import interfaceUtilisateur.JFDSMedicalModifiable;
import interfaceUtilisateur.JListeDePatients;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class BoutonListenerRetourDpVersLP implements ActionListener{
      JListeDePatients jldp;
    JConsulterDP_dans_le_dossier jcdpdld;
      Fen jframe;
      SIH sih;
      
    public BoutonListenerRetourDpVersLP(Fen jframe,JListeDePatients jldp,JConsulterDP_dans_le_dossier jcdpdld,  SIH sih) {
        this.jframe = jframe;
        this.jldp=jldp;
         this.jcdpdld=jcdpdld;
         this.sih=sih;
    }
    
  
      

  
    public void actionPerformed(ActionEvent ae) {
       jframe.toutFalse();
        jframe.add(jldp);
         
      
       
      
    
        jldp.setVisible(true);
   jframe.revalidate();
    jframe.repaint();
      JTable jt = jldp.getjTable1();
      jt.addMouseListener(new  tablesListener( jldp, jframe, jt,jcdpdld,sih));
    }
}



