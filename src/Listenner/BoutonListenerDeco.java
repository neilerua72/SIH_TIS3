/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

import interfaceUtilisateur.Barre;
import interfaceUtilisateur.ConnexionInterface;
import interfaceUtilisateur.Fen;
import interfaceUtilisateur.State;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aurélien
 */
public class BoutonListenerDeco implements ActionListener{
    Barre b;
     ConnexionInterface c;
     Fen jframe;
     public BoutonListenerDeco( ConnexionInterface c,Fen jframe,Barre b){
         this.b=b;
         this.c=c;
         this.jframe=jframe;
     }
    public void actionPerformed (ActionEvent e){
        jframe.toutToutfalse();
     c.setVisible(true);
     c.getjPasswordField1().setText("");
     c.getjTextField1().setText("");
     jframe.setSize(950, 600);
    jframe.repaint();
   
    jframe.setState(State.NONCO);
    }
    
}
