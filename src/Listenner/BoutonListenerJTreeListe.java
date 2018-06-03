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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import princetonPlainsboro.DossierPatient;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Medecin;
import princetonPlainsboro.Patient;
import princetonPlainsboro.SIH;

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
    JFrame frame;
    JConsulterFDS_dans_ongletFDS jcfdsdofds;
    SIH sih;

    public BoutonListenerJTreeListe(JListeDePatients lp, JCreerDP jcdp, JCoutPatient jcp, JListeDeMedecins lm, JCoutMedecin jcm, JCoutSpecialite1 jcs, Accueil a, Jmenu jm, JFrame frame, JConsulterFDS_dans_ongletFDS jcfdsdofds, SIH sih) {
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
            this.lp.setVisible(false);
            this.jcdp.setVisible(false);
            this.jcp.setVisible(false);
            this.lm.setVisible(false);
            this.jcm.setVisible(false);
            this.jcs.setVisible(false);
            this.a.setVisible(false);
            this.jcfdsdofds.setVisible(false);

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
            this.lp.setVisible(false);
            this.jcdp.setVisible(false);
            this.jcp.setVisible(false);
            this.lm.setVisible(false);
            this.jcm.setVisible(false);
            this.jcs.setVisible(false);
            this.a.setVisible(false);
            this.jcfdsdofds.setVisible(false);
            
            jcp.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("Consulter liste")) {
            frame.add(lm);

            //Met Tout a false        
            this.lp.setVisible(false);
            this.jcdp.setVisible(false);
            this.jcp.setVisible(false);
            this.lm.setVisible(false);
            this.jcm.setVisible(false);
            this.jcs.setVisible(false);
            this.a.setVisible(false);
            this.jcfdsdofds.setVisible(false);
            String[][] tab;
            tab = new String[sih.getLm().size()][3];
            for (int i = 0; i < sih.getLm().size(); i++) {
                Medecin m = sih.getLm().get(i);
                System.out.println("test");
                tab[i][0] = m.getNom();
                tab[i][1] = m.getPrenom();
                tab[i][2] = m.getSpecialite();
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
            this.lp.setVisible(false);
            this.jcdp.setVisible(false);
            this.jcp.setVisible(false);
            this.lm.setVisible(false);
            this.jcm.setVisible(false);
            this.jcs.setVisible(false);
            this.a.setVisible(false);
            this.jcfdsdofds.setVisible(false);

            jcm.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("coûts spécialités")) {

            frame.add(jcs);

            //Met Tout a false        
            this.lp.setVisible(false);
            this.jcdp.setVisible(false);
            this.jcp.setVisible(false);
            this.lm.setVisible(false);
            this.jcm.setVisible(false);
            this.jcs.setVisible(false);
            this.a.setVisible(false);
            this.jcfdsdofds.setVisible(false);

            jcs.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("Princeton Placebore")) {

            frame.add(a);

            //Met Tout a false        
            this.lp.setVisible(false);
            this.jcdp.setVisible(false);
            this.jcp.setVisible(false);
            this.lm.setVisible(false);
            this.jcm.setVisible(false);
            this.jcs.setVisible(false);
            this.a.setVisible(false);
            this.jcfdsdofds.setVisible(false);

            a.setVisible(true);

            frame.repaint();
            frame.revalidate();

        }
        if (obj.toString().equals("Fiches de soins")) {

            frame.add(jcfdsdofds);

            //Met Tout a false        
            this.lp.setVisible(false);
            this.jcdp.setVisible(false);
            this.jcp.setVisible(false);
            this.lm.setVisible(false);
            this.jcm.setVisible(false);
            this.jcs.setVisible(false);
            this.a.setVisible(false);
            this.jcfdsdofds.setVisible(false);

            jcfdsdofds.setVisible(true);
            System.out.println("test");
            String[][] tab;
            tab = new String[sih.getLdfs().size()][3];
            for (int i = 0; i < sih.getLdfs().size(); i++) {
                FicheDeSoins f = sih.getLdfs().get(i);
                System.out.println("test"+i);
                Patient p = f.getPatient();
                tab[i][0] = p.getNom();
                tab[i][1] = p.getPrenom();
                tab[i][2] = f.getDate().toString();
            }
            DefaultTableModel model = new DefaultTableModel(
                    tab,
                    new String[]{
                        "Nom", "Prénom", "Date"
                    });
            jcfdsdofds.getjTable1().setModel(model);
            jcfdsdofds.getjScrollPane3().setViewportView(jcfdsdofds.getjTable1());
            frame.repaint();
            frame.revalidate();

        }

    }

}
