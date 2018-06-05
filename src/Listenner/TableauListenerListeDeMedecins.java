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
import interfaceUtilisateur.JListeDeMedecins;
import interfaceUtilisateur.JListedePatientParMedecins;
import interfaceUtilisateur.Jmenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.UIManager.get;
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
public class TableauListenerListeDeMedecins implements MouseListener {

    JListeDeMedecins jldm;
    JListedePatientParMedecins jldppm;
    Fen jframe;
    JTable table;
    SIH sih;
    Jmenu jmenu;
    Barre barre;

    public TableauListenerListeDeMedecins(JListeDeMedecins jldm, Fen jframe, JTable table, JListedePatientParMedecins jldppm, Barre bar, Jmenu jmenu, SIH sih) {
        this.jldm = jldm;
        this.jframe = jframe;
        this.table = table;
        this.jldppm = jldppm;
        this.barre = barre;
        this.jmenu = jmenu;
        this.sih = sih;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int NumLigne;
        NumLigne = table.getSelectedRow();
        

        jframe.toutFalse();
        jframe.add(jldppm);
        Medecin m = sih.getLm().get(NumLigne);
        
        jldppm.getjLabel2().setText(m.getNom());

        String[][] tab;
        tab = new String[sih.ListePatients(m).size()][3];
        for (int i = 0; i < sih.ListePatients(m).size(); i++) {

            DossierPatient dp = sih.ListePatients(m).get(i);
            Patient p = dp.getPatient();

            tab[i][0] = p.getNom();
            tab[i][1] = p.getPrenom();
            tab[i][2] = p.getDateDeNaissance().toString();

        }
        DefaultTableModel model = new DefaultTableModel(
                tab,
                new String[]{
                    "Nom", "Prénom", "Date de naissance"
                });

        jldppm.getjTable1().setModel(model);
        jldppm.getjScrollPane1().setViewportView(jldppm.getjTable1());
        jldppm.setVisible(true);

        jframe.repaint();
        jframe.revalidate();

    }

//      
    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}