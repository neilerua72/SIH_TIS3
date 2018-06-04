
package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * M�thode qui mod�lise un dossier Patient
 * @author Aur�lien, AnneLise, Manon
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
     * M�thode qui calcule le co�t du patient
     * @return co�t du patient
     */
    public double coutPatient() {
        double cout = 0;
        for (Iterator<FicheDeSoins> it = this.lfds.iterator(); it.hasNext(); /*	rien	*/) {
            FicheDeSoins fds = it.next();	//	renvoie	l'�l�ment	courant	et	passe	au	suivant
           cout+=fds.coutTotal();
        }
        return cout;
    }
    
    /**
     * M�thode qui ajoute une fiche de soins au dossier patient 
     * @param fiche de soins 
     */
    public void ajouterFiche(FicheDeSoins fiche) {
        this.lfds.add(fiche);

    }
    
    
    /**
     * M�thode qui renvoie le dossier patient sous forme de cha�ne de caract�re
     * @return une cha�ne de caract�re
     */
    public String toString() {
        String s="\n **************************** \n";
        s+="Dossier Patient : ";
        s+=this.getPatient().toString();
        for (Iterator<FicheDeSoins> it = this.lfds.iterator(); it.hasNext(); /*	rien	*/) {
            FicheDeSoins fds = it.next();	//	renvoie	l'�l�ment	courant	et	passe	au	suivant
           s+=fds.toString();
        }
        return s;

    }

    public void imprimer() {

    }

    /** M�thode qui retourne la liste de fiche de soins du patient
     * @return liste de fiche de soins
     */
    public ArrayList<FicheDeSoins> getLfds() {
        return lfds;
    }

    /**M�thode qui retourne un patient
     * @return le patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**M�thode qui d�fini le patient
     * @param le patient � finir
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**M�thode qui d�fini la liste de fiches de soins 
     * @param la liste de fiches de soins � d�finir
     */
    public void setLfds(ArrayList<FicheDeSoins> lfds) {
        this.lfds = lfds;
    }
}
