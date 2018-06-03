package princetonPlainsboro;
//Test 
public class Patient {

    /**
     * @return the numDeSS
     */
    public NumDeSS getNumDeSS() {
        return numDeSS;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @return the dateDeNaissance
     */
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }
    private String nom;
    private String prenom;
    private NumDeSS numDeSS;
    private String adresse;

    public Patient(NumDeSS numDeSS) {
        this.numDeSS=numDeSS;
    }
    
    private Date dateDeNaissance;
    
    public Patient(String nom, String prenom, NumDeSS numDeSS, String adresse, Date dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numDeSS=numDeSS;
        this.adresse=adresse;
        this.dateDeNaissance=dateDeNaissance;
        }
    
    public String nomPrenom(){
        return this.getNom() + " "+this.getPrenom();
    }
    public String toString() {
        String s="";
        s+="Nom : "+this.getNom()+"\n";
        s+="Prénom : "+this.getPrenom()+"\n";
        s+="Numéro de sécurité sociale : "+this.getNumDeSS()+"\n";
        s+="Adresse : "+this.getAdresse()+"\n";
        s+="Date De Naissance : "+this.getDateDeNaissance()+"\n";
        return s;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient)o;
            return this.numDeSS.equals(p.getNumDeSS());
            }
        else
            return false;
        }    
    }

