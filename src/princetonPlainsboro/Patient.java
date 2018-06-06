package princetonPlainsboro;
/**
 * Classe qui modélise un patient
 * @author Aurélien, AnneLise, Manon
 */
public class Patient {

    /** Méthode qui retourne le numéro de sécurité sociale
     * @return le numéro de sécurité sociale
     */
    public NumDeSS getNumDeSS() {
        return numDeSS;
    }

    /** Méthode qui retourne l'adresse
     * @return l'adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**Méthode qui retourne la date de naissance
     * @return la date de naissance
     */
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    /** Méthode qui retourne le nom du patient
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /** Méthode qui retourne le prénom du patient
     * @return le prenom
     */
    public String getPrenom() {
        return prenom;
    }
    private String nom;
    private String prenom;
    private NumDeSS numDeSS;
    private String adresse;

    
    /**
     * Constructeur du patient par son numéro de sécu (qui sert à identifier le patient)
     * @param numDeSS du patient
     */
    public Patient(NumDeSS numDeSS) {
        this.numDeSS=numDeSS;
    }
    
 
    
    private Date dateDeNaissance;
    /**
     * Méthode qui construit le patient
     * @param nom du patient 
     * @param prenom du patient
     * @param numDeSS du patient
     * @param adresse du patient
     * @param dateDeNaissance du patient
     */
    public Patient(String nom, String prenom, NumDeSS numDeSS, String adresse, Date dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numDeSS=numDeSS;
        this.adresse=adresse;
        this.dateDeNaissance=dateDeNaissance;
        }
    
    
    /**
     * méthode qui retourne le nom puis le prénom du patient
     * @return une chaîne de caractère
     */
    public String nomPrenom(){
        return this.getNom() + " "+this.getPrenom();
    }
    /**
     * Méthode qui renvoit le patient sous forme de chaîne de caractère
     * @return une chaîne de caractère
     */
    public String toString() {
        String s="";
        s+="Nom : "+this.getNom()+"\n";
        s+="Prénom : "+this.getPrenom()+"\n";
        s+="Numéro de sécurité sociale : "+this.getNumDeSS()+"\n";
        s+="Adresse : "+this.getAdresse()+"\n";
        s+="Date De Naissance : "+this.getDateDeNaissance()+"\n";
        return s;
        }
    
    
    /**
     * Méthode qui vérifie l'égalite entre 2 patients
     * @param p le patient à comparer
     * @return un boolean en fonction de l'égalité 
     */
    public boolean equals(Patient p) {
        
            return this.numDeSS.equals(p.getNumDeSS());
         
    }
}
