/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JFDSMedicalModifiable;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.Jmenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.NumDeSS;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class TableauListenerFDS implements MouseListener{
    JConsulterDP_dans_le_dossier jcdpsld;
    JFDSMedicalModifiable jfdsmm;
    Fen jframe;
     JTable table;
     SIH sih;
     Jmenu jmenu;
     Barre barre;

    public TableauListenerFDS(JConsulterDP_dans_le_dossier jcdpsld, Fen jframe, JTable table,JFDSMedicalModifiable jfdsmm,Barre bar, Jmenu jmenu,SIH sih) {
        this.jcdpsld = jcdpsld;
        this.jframe = jframe;
        this.table=table;
        this.jfdsmm=jfdsmm;
        this.barre = barre;
        this.jmenu=jmenu;
        this.sih=sih;    }

 public void mouseClicked(MouseEvent me) {
       int NumLigne;
    NumLigne = table.getSelectedRow();
       
    
            jframe.toutFalse();
            jframe.add(jfdsmm);
            
           // NumDeSS numDeSS = new NumDeSS(jcdpsld.getNumDeSS().getText());
           // Patient p = new Patient(numDeSS);
           // DossierPatient dp = sih.retrouverDossPat(p);
            
            
//            FicheDeSoins fds = dp.getLfds().get(NumLigne);
//            dossierPatient.getNomPrenom().setText(dp.getPatient().getNom()+ " "+ dp.getPatient().getPrenom());
//            dossierPatient.getNumDeSS().setText(dp.getPatient().getNumDeSS().toString());
//            dossierPatient.getDate().setText(dp.getPatient().getDateDeNaissance().toString());
//            dossierPatient.getAdresse().setText(dp.getPatient().getAdresse());
     jfdsmm.setVisible(true);
            jframe.repaint();
            jframe.revalidate();
           
    

}

    @Override
    public void mousePressed(MouseEvent e) {
     //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}