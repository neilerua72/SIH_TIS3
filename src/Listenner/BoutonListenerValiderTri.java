package Listenner;

import interfaceUtilisateur.Fen;
import interfaceUtilisateur.JConsulterFDS_dans_ongletFDS;
import interfaceUtilisateur.JFDSMedicalModifiable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import princetonPlainsboro.SIH;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aurélien
 */
public class BoutonListenerValiderTri extends ListenerValiderTri implements ActionListener{
    
    public BoutonListenerValiderTri(JConsulterFDS_dans_ongletFDS lp, Fen jframe, SIH sih,JFDSMedicalModifiable jfdsmm) {
        super(lp, jframe, sih,jfdsmm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.recherche();
    }
    
}
