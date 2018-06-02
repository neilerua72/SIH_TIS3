/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listenner;

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
public class BoutonListenerGen implements ActionListener{
    JPanel m;
     JPanel c;
     Fen jframe;
     public BoutonListenerGen(JPanel m, JPanel c,Fen jframe){
         this.m=m;
         this.c=c;
         this.jframe=jframe;
     }
    public void actionPerformed (ActionEvent e){
        
        jframe.setContentPane(m);
        m.setVisible(true);
    c.setVisible(false);
    jframe.repaint();
    }
    
}
