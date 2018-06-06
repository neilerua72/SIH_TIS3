package princetonPlainsboro;
/**
 * Classe qui mod�lise un patient
 * @author Aur�lien, AnneLise, Manon
 */
public class Patient {

    /** M�thode qui retourne le num�ro de s�curit� sociale
     * @return le num�ro de s�curit� sociale
     */
    public NumDeSS getNumDeSS() {
        return numDeSS;
    }

    /** M�thode qui retourne l'adresse
     * @return l'adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**M�thode qui retourne la date de naissance
     * @return la date de naissance
     */
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    /** M�thode qui retourne le nom du patient
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /** M�thode qui retourne le pr�nom du patient
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
     * Constructeur du patient par son num�ro de s�cu (qui sert � identifier le patient)
     * @param numDeSS du patient
     */
    public Patient(NumDeSS numDeSS) {
        this.numDeSS=numDeSS;
    }
    
 
    
    private Date dateDeNaissance;
    /**
     * M�thode qui construit le patient
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
     * m�thode qui retourne le nom puis le pr�nom du patient
     * @return une cha�ne de caract�re
     */
    public String nomPrenom(){
        return this.getNom() + " "+this.getPrenom();
    }
    /**
     * M�thode qui renvoit le patient sous forme de cha�ne de caract�re
     * @return une cha�ne de caract�re
     */
    public String toString() {
        String s="";
        s+="Nom : "+this.getNom()+"\n";
        s+="Pr�nom : "+this.getPrenom()+"\n";
        s+="Num�ro de s�curit� sociale : "+this.getNumDeSS()+"\n";
        s+="Adresse : "+this.getAdresse()+"\n";
        s+="Date De Naissance : "+this.getDateDeNaissance()+"\n";
        return s;
        }
    
    
    /**
     * M�thode qui v�rifie l'�galite entre 2 patients
     * @param p le patient � comparer
     * @return un boolean en fonction de l'�galit� 
     */
    public boolean equals(Patient p) {
        
            return this.numDeSS.equals(p.getNumDeSS());
         
    }
}
