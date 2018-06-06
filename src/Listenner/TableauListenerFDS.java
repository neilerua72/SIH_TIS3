/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.ActeUI;
import interfaceUtilisateur.Barre;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JFDSMedicalModifiable;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import princetonPlainsboro.Acte;
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
     FicheDeSoins f;

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
            
           NumDeSS numDeSS = new NumDeSS(jcdpsld.getNumDeSS().getText());
           
           Patient p = new Patient(numDeSS);
           DossierPatient dp = sih.retrouverDossPat(p);
            
            JScrollPane jsp = new JScrollPane();
            jsp=this.jfdsmm.getPanelActes();
            
           FicheDeSoins fds = dp.getLfds().get(NumLigne);
           jframe.setF(fds);
           ArrayList<Acte> la = new ArrayList<Acte>(fds.getActes());
           
          this.jfdsmm.getPanActes().removeAll();
           for(int i=0;i<la.size();i++){
               ActeUI aui= new ActeUI();
               System.out.println(la.size());
               Acte a = la.get(i);
               aui.getCode().setText("Code : "+a.getCode().recupCode());
               aui.getCoef().setText("Coefficient : "+ a.getCoefS());
               aui.getNom().setText(a.getCode().getLibelle());
               this.jfdsmm.getPanActes().add(aui);
               aui.setVisible(true);
           }
           jfdsmm.getNomPrenom().setText(jcdpsld.getNomPrenom().getText());
            jfdsmm.getDateNais().setText(jcdpsld.getDate().getText());
            jfdsmm.getNumDeSS().setText(jcdpsld.getNumDeSS().getText());
     jfdsmm.setVisible(true);
            jframe.repaint();
            jframe.revalidate();
          if(jframe.getStates()==State.ADMIN){
              jfdsmm.getButtonAjouter().setVisible(false);
              jfdsmm.getjLabel11().setVisible(false);
          }
    

}

    public FicheDeSoins getF() {
        return f;
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