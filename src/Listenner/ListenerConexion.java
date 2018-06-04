/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.ConnexionInterface;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.Jmenu;
import interfaceUtilisateur.State;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import princetonPlainsboro.Connexion;
import princetonPlainsboro.Identification;

/**
 *
 * @author Aurélien
 */
public abstract class ListenerConexion {
    Jmenu m;
    ConnexionInterface c;
    Fen jframe;
    JPanel jp;
    Barre b;

    public ListenerConexion(Jmenu m, ConnexionInterface c, JPanel jp,Barre b,Fen jframe) {
        this.m = m;
        this.c = c;
        this.jframe = jframe;
        this.jp=jp;
        this.b=b;
    }

    
    public void connexion(){
         String id = c.getjTextField1().getText();
        String mdp = c.getjPasswordField1().getText();
        Identification identif = new Identification(id, mdp);
        Connexion con = new Connexion("donneesperso.xml");

        
            if (con.VerificationConnexion(identif) && identif.Type() == 1) {
                jframe.setState(State.MED);
                jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
                jframe.setLayout(new BorderLayout());
                b.getjLabel2().setText(identif.getType());
                b.getjLabel2().setIcon(new javax.swing.ImageIcon(getClass().getResource(identif.getPhoto())));
                jframe.add(m,BorderLayout.WEST);
                jframe.add(jp,BorderLayout.CENTER);
                jframe.add(b,BorderLayout.NORTH);
                m.setVisible(true);
                jp.setVisible(true);         
                c.setVisible(false);
                jframe.repaint();
            } else if (con.VerificationConnexion(identif) && identif.Type() == 2) {
               jframe.setState(State.ADMIN);
                jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
                jframe.setLayout(new BorderLayout());
                b.getjLabel2().setText(identif.getType());
                b.getjLabel2().setIcon(new javax.swing.ImageIcon(getClass().getResource(identif.getPhoto())));
                jframe.add(m,BorderLayout.WEST);
                jframe.add(jp,BorderLayout.CENTER);
                jframe.add(b,BorderLayout.NORTH);
                m.setVisible(true);
                jp.setVisible(true);         
                c.setVisible(false);
                jframe.repaint();

            } else {
                JOptionPane.showMessageDialog(null, "Identifiant ou mdp incorrect");
                System.out.println("test");
            }

    }
}
