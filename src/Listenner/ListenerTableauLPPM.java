/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;


import interfaceUtilisateur.Barre;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterDP_dans_le_dossier;
import interfaceUtilisateur.JListedePatientParMedecins;
import interfaceUtilisateur.Jmenu;
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
public class ListenerTableauLPPM implements MouseListener {
    JListedePatientParMedecins jldppm;
   
  JConsulterDP_dans_le_dossier jcdpdld;
      Fen jframe;
          JTable table;
    SIH sih;
    Jmenu jmenu;
    Barre barre;

    public ListenerTableauLPPM(Fen jframe,JListedePatientParMedecins jldppm,JConsulterDP_dans_le_dossier jcdpdld, JTable table,SIH sih,Barre barre) {
        this.jframe = jframe;
        this.jcdpdld=jcdpdld;
        this.jldppm = jldppm;
         this.table=table;
    this.sih=sih;
  this.jmenu=jmenu;
    this.barre=barre;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
 
  int NumLigne;
        NumLigne = table.getSelectedRow();
        

        jframe.toutFalse();
        jframe.add(jcdpdld);
        
        
      
          DossierPatient dp = sih.getLdp().get(NumLigne);
        
        

            jcdpdld.getNomPrenom().setText(dp.getPatient().getNom()+ " "+ dp.getPatient().getPrenom());
             jcdpdld.getNumDeSS().setText(dp.getPatient().getNumDeSS().toString());
           jcdpdld.getDate().setText(dp.getPatient().getDateDeNaissance().toString());
            jcdpdld.getAdresse().setText(dp.getPatient().getAdresse());
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
            DefaultTableModel model = new DefaultTableModel(
                    tab,
                    new String[]{
                        "Nom", "Prénom", "Date","Coût"
                    });
            jcdpdld.getjTable1().setModel(model);
            jcdpdld.getjScrollPane3().setViewportView(jcdpdld.getjTable1());
            
        
// 
       jcdpdld.setVisible(true);

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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
      
      
      
      
              
              
              
}


