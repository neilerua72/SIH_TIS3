/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JListeDeMedecins;
import interfaceUtilisateur.JListeDePatients;
import interfaceUtilisateur.Accueil;
import interfaceUtilisateur.JConsulterFDS_dans_ongletFDS;
import interfaceUtilisateur.JCoutMedecin;
import interfaceUtilisateur.JCoutPatient;
import interfaceUtilisateur.JCoutSpecialite1;
import interfaceUtilisateur.JCreerDP;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.ComparaisonFichesCouts;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;
import princetonPlainsboro.Spe;

/**
 *
 * @author Aurélien
 */
public class BoutonListenerJTreeListe implements TreeSelectionListener {

    JListeDePatients lp;
    JCreerDP jcdp;
    JCoutPatient jcp;
    JListeDeMedecins lm;
    JCoutMedecin jcm;
    JCoutSpecialite1 jcs;
    Accueil a;
    Jmenu jm;
    Fen frame;
    JConsulterFDS_dans_ongletFDS jcfdsdofds;
    SIH sih;

    public BoutonListenerJTreeListe(JListeDePatients lp, JCreerDP jcdp, JCoutPatient jcp, JListeDeMedecins lm, JCoutMedecin jcm, JCoutSpecialite1 jcs, Accueil a, Jmenu jm, Fen frame, JConsulterFDS_dans_ongletFDS jcfdsdofds, SIH sih) {
        this.lp = lp;
        this.jcdp = jcdp;
        this.jcp = jcp;
        this.lm = lm;
        this.jcm = jcm;
        this.jcs = jcs;
        this.a = a;
        this.jm = jm;
        this.frame = frame;
        this.jcfdsdofds = jcfdsdofds;
        this.sih = sih;
    }

    public void valueChanged(TreeSelectionEvent e) {
        Object obj = jm.getjTree2().getLastSelectedPathComponent();

        if (obj.toString().equals("consulter dossier")) {
            frame.add(lp);

            //Met Tout a false        
            frame.toutFalse();

            String[][] tab;
            tab = new String[sih.getLdp().size()][3];
            for (int i = 0; i < sih.getLdp().size(); i++) {
                DossierPatient dp = sih.getLdp().get(i);
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
            lp.getjTable1().setModel(model);
            lp.getjScrollPane4().setViewportView(lp.getjTable1());

            lp.setVisible(true);
            frame.repaint();
            frame.revalidate();

        }

        if (obj.toString().equals("créer patient")) {
            frame.add(jcdp);

            //Met Tout a false        
            this.lp.setVisible(false);
            this.jcdp.setVisible(false);
            this.jcp.setVisible(false);
            this.lm.setVisible(false);
            this.jcm.setVisible(false);
            this.jcs.setVisible(false);
            this.a.setVisible(false);
            this.jcfdsdofds.setVisible(false);

            jcdp.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("coût patients")) {
            frame.add(jcp);

            //Met Tout a false        
           frame.toutFalse();
           String[][] tab;
            tab = new String[sih.getLdp().size()][3];
            for (int i = 0; i < sih.getLdp().size(); i++) {
                DossierPatient dp = sih.getLdp().get(i);
                Patient p = dp.getPatient();
                tab[i][0] = p.getNom();
                tab[i][1] = p.getPrenom();
                tab[i][2] = ""+dp.coutPatient();
            }
            DefaultTableModel model = new DefaultTableModel(
                    tab,
                    new String[]{
                        "Nom", "Prénom", "Coût"
                    });
            jcp.getjTable1().setModel(model);
            jcp.getjScrollPane4().setViewportView(jcp.getjTable1());


            jcp.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("Consulter liste")) {
            frame.add(lm);

            //Met Tout a false        
            frame.toutFalse();
            String[][] tab;
            tab = new String[sih.getLm().size()][3];
            for (int i = 0; i < sih.getLm().size(); i++) {
                Medecin m = sih.getLm().get(i);
                System.out.println("test");
                tab[i][0] = m.getNom();
                tab[i][1] = m.getPrenom();
                tab[i][2] = m.getSpecialite().toString();
            }
            DefaultTableModel model2 = new DefaultTableModel(
                    tab,
                    new String[]{
                        "Nom", "Prénom", "Spécialité"
                    }); 
            
            lm.getjTable1().setModel(model2);

            lm.getjScrollPane4().setViewportView(lm.getjTable1());
            lm.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("Coûts médecins")) {
            frame.add(jcm);

            //Met Tout a false        
            frame.toutFalse();
            
            String[][] tab;
            tab = new String[sih.getLm().size()][3];
            for (int i = 0; i < sih.getLm().size(); i++) {
                Medecin dp = sih.getLm().get(i);
                System.out.println("test");
                tab[i][0] = dp.getNom();
                tab[i][1] = dp.getPrenom();
                tab[i][2] = ""+sih.coutMedecin(dp);
            }
            DefaultTableModel model = new DefaultTableModel(
                    tab,
                    new String[]{
                        "Nom", "Prénom", "Date de naissance"
                    });
            jcm.getjTable1().setModel(model);
            jcm.getjScrollPane4().setViewportView(jcm.getjTable1());

            
            jcm.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("coûts spécialités")) {

            frame.add(jcs);

            //Met Tout a false        
            frame.toutFalse();
            String[][] tab;
            tab = new String[sih.getLS().size()][2];
            for (int i = 0; i < sih.getLS().size(); i++) {
                Spe s = sih.getLS().get(i);
                System.out.println("test1");
                tab[i][0] = s.toString();
                System.out.println("test2");
                tab[i][1] = "" + sih.coutSpecialite(s);
                System.out.println("test3");
            }
            DefaultTableModel model = new DefaultTableModel(
                    tab,
                    new String[]{
                        "Spécialité", "Coût"
                    });
            jcs.getjTable1().setModel(model);
            jcs.getjScrollPane4().setViewportView(jcs.getjTable1());
            
            
            jcs.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("Princeton Placebore")) {

            frame.add(a);

            //Met Tout a false        
            frame.toutFalse();

            a.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("Fiches de soins")) {

            frame.add(jcfdsdofds);

            //Met Tout a false        
            frame.toutFalse();

            jcfdsdofds.setVisible(true);
            System.out.println("test");
            String[][] tab;
            tab = new String[sih.getLdfs().size()][4];
            ArrayList<FicheDeSoins> a  = sih.getLdfs();
            
            for (int i = 0; i < a.size(); i++) {
                FicheDeSoins f = a.get(i);
                System.out.println("test" + i);
                Patient p = f.getPatient();
                tab[i][0] = p.getNom();
                tab[i][1] = p.getPrenom();
                tab[i][2] = f.getDate().toString();
                tab[i][3]=""+f.coutTotal();
            }
            DefaultTableModel model = new DefaultTableModel(
                    tab,
                    new String[]{
                        "Nom", "Prénom", "Date","coût"
                    });
            jcfdsdofds.getjTable1().setModel(model);
            jcfdsdofds.getjScrollPane3().setViewportView(jcfdsdofds.getjTable1());
            frame.repaint();
            frame.revalidate();

        }
        
         if (obj.toString().equals("Patients")) {
         }
    }

}
