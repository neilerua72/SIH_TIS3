
package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Méthode qui modélise un dossier Patient
 * @author Aurélien, AnneLise, Manon
 */
public class DossierPatient {

    private Patient patient;
    private ArrayList<FicheDeSoins> lfds;
    /**
     * Constructeur du DossierPatient 
     * @param patient 
     *                  Un objet de type Patient
     * @param ldfs 
     *                  Une liste de fiche de soin
     */
    public DossierPatient(Patient patient, ArrayList<FicheDeSoins> ldfs) {
        this.patient = patient;
        lfds = new ArrayList<FicheDeSoins>(ldfs);
    }
    /**Constructeur du DossierPatient
     * 
     * @param patient 
     *             Un objet de type Patient
     */
    public DossierPatient(Patient patient) {
        this.patient = patient;
        lfds = new ArrayList<FicheDeSoins>();
    }
    /**
     * Constructeur du DossierPatient
     */
    public DossierPatient(){
        lfds = new ArrayList<FicheDeSoins>();
    }

    
    /**
     * Méthode qui calcule le coût du patient
     * @return coût du patient
     */
    public double coutPatient() {
        double cout = 0;
        for (Iterator<FicheDeSoins> it = this.lfds.iterator(); it.hasNext(); /*	rien	*/) {
            FicheDeSoins fds = it.next();	//	renvoie	l'élément	courant	et	passe	au	suivant
           cout+=fds.coutTotal();
        }
        return cout;
    }
    
    /**
     * Méthode qui ajoute une fiche de soins au dossier patient 
     * @param fiche de soins 
     */
    public void ajouterFiche(FicheDeSoins fiche) {
        this.lfds.add(fiche);

    }
    
    
    /**
     * Méthode qui renvoie le dossier patient sous forme de chaîne de caractère
     * @return une chaîne de caractère
     */
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

    /** Méthode qui retourne la liste de fiche de soins du patient
     * @return liste de fiche de soins
     */
    public ArrayList<FicheDeSoins> getLfds() {
        return lfds;
    }

    /**Méthode qui retourne un patient
     * @return le patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**Méthode qui défini le patient
     * @param le patient à finir
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**Méthode qui défini la liste de fiches de soins 
     * @param la liste de fiches de soins à définir
     */
    public void setLfds(ArrayList<FicheDeSoins> lfds) {
        this.lfds = lfds;
    }
}
