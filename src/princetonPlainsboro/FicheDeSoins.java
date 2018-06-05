package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Vector;
/**
 * Classe qui modélise une fiche de soins
 * @author Aurélien, AnneLise, Manon
 */
public class FicheDeSoins {

    /**Méthode qui retourne les actes d'une fiche de soins 
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
     * Méthode qui retourne le patient 
     * @return le patient
     */
    public Patient getPatient() { return patient; }
    /**
     * Méthode qui retourne le médecin
     * @return le medecin
     */
    public Medecin getMedecin() { return medecin; }
    
    /**
     * Méthode qui retourne la date
     * @return la date
     */
    public Date    getDate()    { return date; }
    
    
    /**
     * Méthode qui ajoute un acte à la fiche de soins
     * @param acte à ajouter à a fiche de soins
     */
    public void ajouterActe(Acte acte) {
        getActes().add(acte);
        }
    
    
    /**
     * Méthode qui ajoute un acte à la fiche de soins, grâce à un code et un coefficient
     * @param code de l'acte à ajouter
     * @param coefficient  de l'acte à ajouter
     */
    public void ajouterActe(Code code, int coefficient) {
        Acte acte = new Acte(code, coefficient);
        getActes().add(acte);
        }
    
    
    /**
     * Méthode qui retourne la fiche de soins sous chaîne de caractère
     * @return une chaîne de caractère
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
     * Méthode qui retourne le coût d'une fiche de soins 
     * @return le cût d'une fiche de soins
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
           s+="Coût : "+actes.get(i).cout()+"\n";
       }
       s+="                             "+this.coutTotal();
       return s;
    }
    }

