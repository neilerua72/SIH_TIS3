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
import interfaceUtilisateur.JConsulterFDS_dans_ongletFDS;
import interfaceUtilisateur.JFDSMedicalModifiable;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
public class TableListenerFDSdansOngletFDS implements MouseListener {

    JConsulterFDS_dans_ongletFDS jcc;
    JFDSMedicalModifiable jfdsmm;
    Fen jframe;
    JTable table;
    SIH sih;
    Jmenu jmenu;
    Barre barre;
    FicheDeSoins f;

    public TableListenerFDSdansOngletFDS(JConsulterFDS_dans_ongletFDS jcc, Fen jframe, JTable table, JFDSMedicalModifiable jfdsmm, Barre bar, Jmenu jmenu, SIH sih) {
        this.jcc = jcc;
        this.jframe = jframe;
        this.table = table;
        this.jfdsmm = jfdsmm;
        this.barre = barre;
        this.jmenu = jmenu;
        this.sih = sih;
    }

    public void mouseClicked(MouseEvent me) {
        int NumLigne;
        NumLigne = table.getSelectedRow();

        jframe.toutFalse();
        jframe.add(jfdsmm);

        FicheDeSoins fs = sih.getLdfs().get(NumLigne);

        jfdsmm.getNomPrenom().setText(fs.getPatient().getNom() + " " + fs.getPatient().getPrenom());
        jfdsmm.getNumDeSS().setText(fs.getPatient().getNumDeSS().toString());
        jfdsmm.getDateNais().setText(fs.getPatient().getDateDeNaissance().toString());

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
            }

        }

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
