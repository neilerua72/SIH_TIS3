/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceUtilisateur;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author annelise
 */
public class menu1_administration extends JFrame {

    JPanel menu = new JPanel(new BorderLayout());
    JPanel completergrand = new JPanel(new BorderLayout());
    JPanel deconnexion = new JPanel(new BorderLayout());
    JPanel completer = new JPanel(new BorderLayout());
    JPanel panelajoute = new JPanel(new FlowLayout());

    JLabel image = new JLabel(new ImageIcon("C:\\Users\\annelise\\Desktop\\image projet\\SIH.PNG"));

    JButton a = new JButton(new ImageIcon("C:\\Users\\annelise\\Desktop\\image projet\\Deconnexion.PNG"));

    public menu1_administration(String title) {

        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));

        DefaultMutableTreeNode racine1
                = new DefaultMutableTreeNode("Listes");

        racine1.add(new DefaultMutableTreeNode("Médecins"));
        racine1.add(new DefaultMutableTreeNode("Patients"));
        
        
         DefaultMutableTreeNode racine2
                = new DefaultMutableTreeNode("Dossier Patient");

        racine2.add(new DefaultMutableTreeNode("Créer"));
        racine2.add(new DefaultMutableTreeNode("Consulter"));

        JTree listedp = new JTree(racine1);
        JTree liste = new JTree(racine2);
        
       DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) listedp.getCellRenderer();
        Icon closedIcon = new ImageIcon("C:\\Users\\annelise\\Desktop\\image projet\\loupe.PNG");
       
        renderer.setClosedIcon(closedIcon);
      
        
              DefaultTreeCellRenderer renderer1 = (DefaultTreeCellRenderer) liste.getCellRenderer();
        Icon closedIcon1 = new ImageIcon("C:\\Users\\annelise\\Desktop\\image projet\\loupe.PNG");
       
        renderer1.setClosedIcon(closedIcon1);
     

        this.add(menu, BorderLayout.WEST);
        this.add(completergrand, BorderLayout.CENTER);
        completergrand.add(deconnexion, BorderLayout.NORTH);
        completergrand.add(completer, BorderLayout.CENTER);

        deconnexion.add(panelajoute, BorderLayout.EAST);
        panelajoute.add(a);

        menu.add(liste, BorderLayout.NORTH);
        menu.add(listedp, BorderLayout.CENTER);
        completergrand.add(image, BorderLayout.CENTER);

        setVisible(true);
        pack();

    }

    public static void main(String[] args) {

        menu1_administration ma = new menu1_administration("menu");
    }

}
