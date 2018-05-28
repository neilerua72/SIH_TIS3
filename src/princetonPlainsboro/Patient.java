package princetonPlainsboro;
//Test 
class Patient {
    private String nom;
    private String prenom;
    private NumDeSS numDeSS;
    private String adresse;
    private Date dateDeNaissance;
    
    public Patient(String nom, String prenom, NumDeSS numDeSS, String adresse, Date dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numDeSS=numDeSS;
        this.adresse=adresse;
        this.dateDeNaissance=dateDeNaissance;
        }
    
    public String toString() {
        String s="Patient : \n";
        s+="Nom : "+this.nom+"\n";
        s+="Prénom : "+this.prenom+"\n";
        s+="Numéro de sécurité sociale : "+this.numDeSS+"\n";
        s+="Adresse : "+this.adresse+"\n";
        s+="Date De Naissance : "+this.dateDeNaissance+"\n";
        return s;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient)o;
            return nom.equals(p.nom) && prenom.equals(p.prenom);
            }
        else
            return false;
        }    
    }

