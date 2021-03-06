/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JCoutPatient;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.SIH;

/**
 *
 * @author teuliera
 */
public class tableauListenerCoutPatient  implements MouseListener{
JCoutPatient cp;
     JConsulterDP_dans_le_dossier dossierPatient;
    Fen jframe;
     JTable table;
     SIH sih;
     Jmenu jmenu;
     Barre barre;
     
    public tableauListenerCoutPatient( JCoutPatient cp, Fen jframe, JTable table,JConsulterDP_dans_le_dossier dossierPatient,SIH sih) {
        this.cp=cp;
        this.jframe = jframe;
        this.table=table;
        this.dossierPatient=dossierPatient;
        this.barre = barre;
        this.jmenu=jmenu;
        this.sih=sih;    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int NumLigne;
    NumLigne = table.getSelectedRow();
       
           
            jframe.toutFalse();
            jframe.add(dossierPatient);
            DossierPatient dp = sih.getLdp().get(NumLigne);
            dossierPatient.getNomPrenom().setText(dp.getPatient().getNom()+ " "+ dp.getPatient().getPrenom());
            dossierPatient.getNumDeSS().setText(dp.getPatient().getNumDeSS().toString());
            dossierPatient.getDate().setText(dp.getPatient().getDateDeNaissance().toString());
            dossierPatient.getAdresse().setText(dp.getPatient().getAdresse());
            
            
            
            String[][] tab;
            tab = new String[dp.getLfds().size()][4];
            for (int i = 0; i < dp.getLfds().size(); i++) {
                Medecin m = dp.getLfds().get(i).getMedecin();
                FicheDeSoins f = dp.getLfds().get(i);
                tab[i][0] = m.getNom();
                tab[i][1] = m.getPrenom();
                tab[i][2] = f.getDate().toString();
                tab[i][3]=""+f.coutTotal();
            }
            ModelTable model = new ModelTable(
                    tab,
                    new String[]{
                        "Nom", "Pr�nom", "Date","Co�t"
                    });
            dossierPatient.getjTable1().setModel(model);
            dossierPatient.getjScrollPane3().setViewportView(dossierPatient.getjTable1());
            
            if(jframe.getStates()==State.ADMIN){
                dossierPatient.getjButton5().setVisible(false);
                dossierPatient.getjLabel11().setVisible(false);
            }
            
            
            
            dossierPatient.setVisible(true);
            
            
            
            
            jframe.repaint();
            jframe.revalidate();
           
    
    }

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
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
