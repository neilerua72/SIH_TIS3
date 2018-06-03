/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.State;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author annelise
 */
public class tablesListener implements MouseListener{
   JListeDePatients listePatient;
     JConsulterDP_dans_le_dossier dossierPatient;
     Fen jframe;
     JTable table;

    public tablesListener(JListeDePatients listePatient, Fen jframe, JTable table,JConsulterDP_dans_le_dossier dossierPatient) {
        this.listePatient = listePatient;
        this.jframe = jframe;
        this.table=table;
    }
    
    
    private void tableauMouseClicked(java.awt.event.MouseEvent evt) {
    // gestion du simple clic
    int NumLigne;
    NumLigne = table.getSelectedRow();
    
    
    if ( NumLigne == listePatient.getjTable1().getSelectedRow()) {

       jframe.setContentPane(dossierPatient);
        dossierPatient.setVisible(true);
    listePatient.setVisible(false);
    jframe.repaint();
    jframe.setState(State.NONCO);
    
}
    
    


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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
