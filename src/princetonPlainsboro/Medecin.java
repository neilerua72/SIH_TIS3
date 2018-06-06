package princetonPlainsboro;
/**
 * Classe qui mod�lise un medecin
 * @author Aur�lien, AnneLise, Manon
 */
public class Medecin {

    /**M�thode qui retourne le nom du m�decin
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**M�thode qui retourne le pr�nom du m�decin
     * @return le prenom
     */
    public String getPrenom() {
        return prenom;
    }
    private String nom;
    private String prenom;
    private Spe specialite;
    /**
     * Constructeur du m�decin
     * @param nom nom du m�decin
     * @param prenom pr�nim du m�decin
     * @param specialite Sp�cialit� du m�decin
     */
    public Medecin(String nom, String prenom, Spe specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        }
    
    
    /**
     * M�thode qui retourne la sp�cialit� du medecin
     * @return la sp�cialit�
     */
    public Spe getSpecialite() { return specialite; }
    
    
    /**
     * M�thode qui renvoit le m�decin sous forme de cha�ne de caract�re
     * @return une cha�ne de caract�re
     */
    public String toString() {
        return "Dr " + getPrenom() + " " + getNom() + ", " + specialite;
        }
    
    
    /**
     * M�thode qui v�rifie l'�galit� entre un objet et le medecin de cette instance
     * @param o un objet a compar�
     * @return un boolean en fonction de l'egalit�
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


