/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aurélien
 */
public class DossierPatient {

    Patient patient;
    ArrayList<FicheDeSoins> lfds;

    public DossierPatient(Patient patient) {
        this.patient = patient;
        lfds = new ArrayList<FicheDeSoins>();
    }

    public double coutPatient() {
        double cout = 0;
        for (Iterator<FicheDeSoins> it = this.lfds.iterator(); it.hasNext(); /*	rien	*/) {
            FicheDeSoins fds = it.next();	//	renvoie	l'élément	courant	et	passe	au	suivant
           cout+=fds.coutTotal();
        }
        return cout;
    }

    public void ajouterFiche(FicheDeSoins fiche) {
        lfds.add(fiche);

    }

    public void afficher() {

    }

    public void imprimer() {

    }
}
