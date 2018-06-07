/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.ActeUI;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JFDSMedicalModifiable;
import interfaceUtilisateur.JListedePatientParMedecins;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import princetonPlainsboro.Acte;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.NumDeSS;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class tableauListenerFDSversDP implements MouseListener{
    
     JFDSMedicalModifiable jfdsmm;
    Fen jframe;
    
     SIH sih;
     JTable jtable;
     
     ArrayList<FicheDeSoins> fds;
     
     
    public tableauListenerFDSversDP(JTable jtable,Fen jframe,JFDSMedicalModifiable jfdsmm ,SIH sih,ArrayList<FicheDeSoins> fds) {
        
        this.jframe = jframe;
        this.jtable=jtable;
        this.jfdsmm=jfdsmm;
       
        this.sih=sih;
      this.fds=fds;    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
      int NumLigne;
    NumLigne = jtable.getSelectedRow();
       
    
            jframe.toutFalse();
            jframe.add(jfdsmm);
    FicheDeSoins fs =fds.get(NumLigne);
       
    
       
        jfdsmm.getNomPrenom().setText(fs.getPatient().getNom() + " " + fs.getPatient().getPrenom());
        jfdsmm.getNumDeSS().setText(fs.getPatient().getNumDeSS().toString());
        jfdsmm.getDateNais().setText(fs.getPatient().getDateDeNaissance().toString());
        jfdsmm.getDateFiche().setText("Fiche de soins du "+ fs.getDate().toString());
        JScrollPane jsp = new JScrollPane();
        jsp = this.jfdsmm.getPanelActes();

        ArrayList<DossierPatient> ba = new ArrayList<DossierPatient>();
        ba = sih.getLdp();

        for (int w = 0; w < ba.size(); w++) {

            NumDeSS numDeSS = new NumDeSS(jfdsmm.getNumDeSS().getText());
            Patient p = new Patient(numDeSS);
            DossierPatient dps = sih.retrouverDossPat(p);
      
            jframe.setF(fs);
            
            
            ArrayList<Acte> la = new ArrayList<Acte>(fs.getActes());

            this.jfdsmm.getPanActes().removeAll();
            for (int i = 0; i < la.size(); i++) {
                ActeUI aui = new ActeUI();
                System.out.println(la.size());
                Acte a = la.get(i);
                aui.getCode().setText("Code : " + a.getCode().recupCode());
                aui.getCoef().setText("Coefficient : " + a.getCoefS());
                aui.getNom().setText(a.getCode().getLibelle());
                this.jfdsmm.getPanActes().add(aui);
                aui.setVisible(true);


jfdsmm.setVisible(true);
            jframe.repaint();
            jframe.revalidate();
            }
        }
    }

    

    @Override
    public void mousePressed(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}