package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Vector;
/**
 * Classe qui mod�lise une fiche de soins
 * @author Aur�lien, AnneLise, Manon
 */
public class FicheDeSoins {

    /**M�thode qui retourne les actes d'une fiche de soins 
     * @return liste d'actes
     */
    public ArrayList<Acte> getActes() {
        return actes;
    }
    private Patient patient;
    private Medecin medecin;
    private DateH date;
    private ArrayList<Acte> actes;       // contient des objets de classe 'Acte'
    /**
     * Constructeur de fiche de soins
     * @param patient
     *          Patient de la fiche de soins
     * @param medecin
     *          Medecin de la fiche de soins
     * @param date 
     *          DateH de la fiche de soins
     */
    public FicheDeSoins(Patient patient, Medecin medecin, DateH date) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        actes = new ArrayList<Acte>();   // liste vide
        }
    /**
     * M�thode qui retourne le patient 
     * @return le patient
     */
    public Patient getPatient() { return patient; }
    /**
     * M�thode qui retourne le m�decin
     * @return le medecin
     */
    public Medecin getMedecin() { return medecin; }
    
    /**
     * M�thode qui retourne la date
     * @return la date
     */
    public Date    getDate()    { return date; }
    
    
    /**
     * M�thode qui ajoute un acte � la fiche de soins
     * @param acte � ajouter � a fiche de soins
     */
    public void ajouterActe(Acte acte) {
        getActes().add(acte);
        }
    
    
    /**
     * M�thode qui ajoute un acte � la fiche de soins, gr�ce � un code et un coefficient
     * @param code de l'acte � ajouter
     * @param coefficient  de l'acte � ajouter
     */
    public void ajouterActe(Code code, int coefficient) {
        Acte acte = new Acte(code, coefficient);
        getActes().add(acte);
        }
    
    
    /**
     * M�thode qui retourne la fiche de soins sous cha�ne de caract�re
     * @return une cha�ne de caract�re
     */
    public String toString() {
        String s="";
        s+="Fiche de soins du " + this.date.toString() +"\n";
        s+="- medecin : " + this.medecin.toString()+"\n";
        s+="- patient : " + this.patient.nomPrenom()+"\n";
        s+="- actes medicaux :"+"\n";
        for (int i=0; i<this.getActes().size(); i++) {
            Acte a = this.getActes().get(i);
            s+="    > " + a.toString()+"\n";
            }
        return s;
        }
    
    /**
     * M�thode qui retourne le co�t d'une fiche de soins 
     * @return le c�t d'une fiche de soins
     */
    public double coutTotal() {
        double total = 0;
        for (int i=0; i<getActes().size(); i++) {
            Acte a = getActes().get(i);
            total += a.cout();
            }
        return total;
        }
    public String ficheDeSoinPourFact(){
       String s="";
       for(int i=0;i<this.actes.size();i++){
           s+="Nom : "+actes.get(i).toString()+"\n";
           s+="Co�t : "+actes.get(i).cout()+"\n";
       }
       s+="                             "+this.coutTotal();
       return s;
    }
    }

