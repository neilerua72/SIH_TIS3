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
import interfaceUtilisateur.JCoutSpecialite;
import interfaceUtilisateur.JCreerDP;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author Aurélien
 */
public class BoutonListenerJTreeListe implements TreeSelectionListener{
    JListeDePatients lp;
     JCreerDP jcdp;
     JCoutPatient jcp;
    JListeDeMedecins lm;
     JCoutMedecin jcm;
     JCoutSpecialite jcs;
     Accueil a;
     Jmenu jm;
     JFrame frame;
     JConsulterFDS_dans_ongletFDS jcfdsdofds;

    

    public BoutonListenerJTreeListe(JListeDePatients lp, JCreerDP jcdp, JCoutPatient jcp, JListeDeMedecins lm, JCoutMedecin jcm, JCoutSpecialite jcs, Accueil a, Jmenu jm, JFrame frame, JConsulterFDS_dans_ongletFDS jcfdsdofds) {
        this.lp = lp;
        this.jcdp = jcdp;
        this.jcp = jcp;
        this.lm = lm;
        this.jcm = jcm;
        this.jcs = jcs;
        this.a = a;
        this.jm=jm;
        this.frame = frame;
        this.jcfdsdofds=jcfdsdofds;
    }
     
   
     


   
    
public void valueChanged(TreeSelectionEvent e) {
       Object obj = jm.getjTree2().getLastSelectedPathComponent();

        if (obj.toString().equals("consulter dossier") ){
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
              
               
                
                lp.setVisible(true); 
                frame.repaint();
                frame.revalidate();
       
        }

        if (obj.toString().equals("créer patient") ){
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
        if (obj.toString().equals("coût patients") ){
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
        if (obj.toString().equals("Consulter liste") ){
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
                
            
                lm.setVisible(true);         
                
                frame.repaint();
                frame.revalidate();
          

        }
        if (obj.toString().equals("Coûts médecins") ){
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
        if (obj.toString().equals("coûts spécialités") ){

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
        if (obj.toString().equals("Princeton Placebore") ){

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
        if (obj.toString().equals("Fiches de soins") ){

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
                
                frame.repaint();
                frame.revalidate();

        }
       
        
    }
    
}
