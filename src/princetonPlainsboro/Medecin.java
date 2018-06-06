package princetonPlainsboro;
/**
 * Classe qui modélise un medecin
 * @author Aurélien, AnneLise, Manon
 */
public class Medecin {

    /**Méthode qui retourne le nom du médecin
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**Méthode qui retourne le prénom du médecin
     * @return le prenom
     */
    public String getPrenom() {
        return prenom;
    }
    private String nom;
    private String prenom;
    private Spe specialite;
    /**
     * Constructeur du médecin
     * @param nom nom du médecin
     * @param prenom prénim du médecin
     * @param specialite Spécialité du médecin
     */
    public Medecin(String nom, String prenom, Spe specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        }
    
    
    /**
     * Méthode qui retourne la spécialité du medecin
     * @return la spécialité
     */
    public Spe getSpecialite() { return specialite; }
    
    
    /**
     * Méthode qui renvoit le médecin sous forme de chaîne de caractère
     * @return une chaîne de caractère
     */
    public String toString() {
        return "Dr " + getPrenom() + " " + getNom() + ", " + specialite;
        }
    
    
    /**
     * Méthode qui vérifie l'égalité entre un objet et le medecin de cette instance
     * @param o un objet a comparé
     * @return un boolean en fonction de l'egalité
     */
    public boolean equals(Object o) {
        if (o instanceof Medecin) {
            Medecin p = (Medecin)o;
            return getNom().equals(p.getNom()) && getPrenom().equals(p.getPrenom());
            }
        else
            return false;
        }    
    }


