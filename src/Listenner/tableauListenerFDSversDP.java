/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JFDSMedicalModifiable;
import interfaceUtilisateur.JListedePatientParMedecins;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class tableauListenerFDSversDP implements ActionListener{
    
     JFDSMedicalModifiable jfdsmm;
    Fen jframe;
     JTable table;
     SIH sih;
     JTable jtable;
     
     ArrayList<FicheDeSoins> fds;
     
     
    public tableauListenerFDSversDP(JTable jtable,Fen jframe,JFDSMedicalModifiable jfdsmm ,SIH sih,ArrayList<FicheDeSoins> fds) {
        
        this.jframe = jframe;
        this.jtable=jtable;
        this.jfdsmm=jfdsmm;
       
        this.sih=sih;
      fds=new ArrayList<FicheDeSoins>();    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
