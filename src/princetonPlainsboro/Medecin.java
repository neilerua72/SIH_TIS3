package princetonPlainsboro;

public class Medecin {

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
    private String specialite;
    
    public Medecin(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        }
    
    public String getSpecialite() { return specialite; }
    
    public String toString() {
        return "Dr " + getPrenom() + " " + getNom() + ", " + specialite;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Medecin) {
            Medecin p = (Medecin)o;
            return getNom().equals(p.getNom()) && getPrenom().equals(p.getPrenom());
            }
        else
            return false;
        }    
    }


