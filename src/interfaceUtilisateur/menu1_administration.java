/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceUtilisateur;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author annelise
 */
public class menu1_administration  extends JFrame{
    
    
    
    
   JPanel menu = new JPanel(new BorderLayout());
   JPanel completergrand = new JPanel(new BorderLayout());
   JPanel deconnexion = new JPanel(new BorderLayout());
     JPanel completer = new JPanel(new BorderLayout());
       JPanel panelajoute = new JPanel(new FlowLayout());
     
     
     
     JLabel image = new JLabel(new ImageIcon("C:\\Users\\annelise\\Desktop\\image projet\\SIH.PNG"));
     
   
      
   
   JTree listedp = new JTree();
JTree liste = new JTree();

 JButton a=  new JButton (new ImageIcon("C:\\Users\\annelise\\Desktop\\image projet\\Deconnexion.PNG"));
 
  
    public menu1_administration(String title) {
    
        
        
        
        
       super (title);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setPreferredSize(new Dimension(600, 400));
       
 
    
       
       this.add(menu,BorderLayout.WEST);
       this.add(completergrand,BorderLayout.CENTER);
       completergrand.add(deconnexion,BorderLayout.NORTH);
          completergrand.add(completer,BorderLayout.CENTER);
       
       deconnexion.add(panelajoute,BorderLayout.EAST);
        panelajoute.add(a);
     
    
       
       menu.add(liste,BorderLayout.NORTH);
       menu.add(listedp,BorderLayout.CENTER);
       completergrand.add(image,BorderLayout.CENTER);
       

    
       setVisible (true);
       pack();
       
       
    }

    public static void main(String[] args) {
        
        menu1_administration ma = new menu1_administration ("menu");
    }
    
}
