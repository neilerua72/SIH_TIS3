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
    private Spe specialite;
    
    public Medecin(String nom, String prenom, Spe specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        }
    
    public Spe getSpecialite() { return specialite; }
    
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


