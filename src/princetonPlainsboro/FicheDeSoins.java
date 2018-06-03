package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Vector;

public class FicheDeSoins {

    /**
     * @return the actes
     */
    public ArrayList<Acte> getActes() {
        return actes;
    }
    private Patient patient;
    private Medecin medecin;
    private DateH date;
    private ArrayList<Acte> actes;       // contient des objets de classe 'Acte'
    
    public FicheDeSoins(Patient patient, Medecin medecin, DateH date) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        actes = new ArrayList<Acte>();   // liste vide
        }
    
    public Patient getPatient() { return patient; }
    public Medecin getMedecin() { return medecin; }
    public Date    getDate()    { return date; }
    
    public void ajouterActe(Acte acte) {
        getActes().add(acte);
        }
    
    public void ajouterActe(Code code, int coefficient) {
        Acte acte = new Acte(code, coefficient);
        getActes().add(acte);
        }
    
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
    
    public double coutTotal() {
        double total = 0;
        for (int i=0; i<getActes().size(); i++) {
            Acte a = getActes().get(i);
            total += a.cout();
            }
        return total;
        }
    }

