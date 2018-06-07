/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JListedePatientParMedecins;
import interfaceUtilisateur.State;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class tableListeneBarreRmedecin implements MouseListener{
 
     JListedePatientParMedecins jldppm;
    Fen jframe;
     JTable table;
     SIH sih;
     JTable jtable;
     
     ArrayList<Medecin> ldm;
    public tableListeneBarreRmedecin(JTable jtable,Fen jframe,JListedePatientParMedecins jldppm,SIH sih,ArrayList <Medecin> m) {
        
        this.jframe = jframe;
        this.jtable=jtable;
        this.jldppm=jldppm;
       
        this.sih=sih;
ldm=new ArrayList<Medecin>(m);    }
    
    
    private void tableauMouseClicked(java.awt.event.MouseEvent evt) {
    // gestion du simple clic

    }

    @Override
    public void mousePressed(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //tethods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       int NumLigne;
    NumLigne = jtable.getSelectedRow();
       
    
            //jframe.toutFalse();
            //jframe.add(dossierPatient);
            Medecin m = ldm.get(NumLigne);
            jldppm.getjLabel2().setText(m.getNom());
           
            String[][] tab;
            tab = new String[sih.ListePatients(m).size()][4];
            for (int i = 0; i < sih.ListePatients(m).size(); i++) {
                 DossierPatient dp = sih.ListePatients(m).get(i);
            Patient p = dp.getPatient();
                tab[i][0] = p.getNom();
                tab[i][1] = p.getPrenom();
                tab[i][2] = p.getDateDeNaissance().toString();
                
            }
            ModelTable model = new ModelTable(
                    tab,
                    new String[]{
                        "Nom", "Prénom", "Date de Naissance"
                    });
            jldppm.getjTable1().setModel(model);
            jldppm.getjScrollPane1().setViewportView(jldppm.getjTable1());
            System.out.println("TEST3");
            
            
            
            jldppm.setVisible(true);
            
            
          
               
           jframe.repaint();
            jframe.revalidate();
           
    

}}

    

