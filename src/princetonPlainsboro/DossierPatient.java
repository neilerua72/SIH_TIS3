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

    private Patient patient;
    private ArrayList<FicheDeSoins> lfds;
    public DossierPatient(Patient patient, ArrayList<FicheDeSoins> ldfs) {
        this.patient = patient;
        lfds = new ArrayList<FicheDeSoins>(ldfs);
    }
    public DossierPatient(Patient patient) {
        this.patient = patient;
        lfds = new ArrayList<FicheDeSoins>();
    }
    public DossierPatient(){
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
        getLfds().add(fiche);

    }

    public String toString() {
        String s="\n **************************** \n";
        s+="Dossier Patient : ";
        s+=this.getPatient().toString();
        for (Iterator<FicheDeSoins> it = this.lfds.iterator(); it.hasNext(); /*	rien	*/) {
            FicheDeSoins fds = it.next();	//	renvoie	l'élément	courant	et	passe	au	suivant
           s+=fds.toString();
        }
        return s;

    }

    public void imprimer() {

    }

    /**
     * @return the lfds
     */
    public ArrayList<FicheDeSoins> getLfds() {
        return lfds;
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @param lfds the lfds to set
     */
    public void setLfds(ArrayList<FicheDeSoins> lfds) {
        this.lfds = lfds;
    }
}
