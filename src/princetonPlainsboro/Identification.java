
package princetonPlainsboro;

/**
 *Méthode qui modélise une identification
 * @author desruea
 */
public class Identification {
    private String id;
    private String mdp;
    private String type;
    private String photo;
    
    /**
     * Constructeur de l'Identification
     * @param id
     *          id de l'identification
     * @param mdp 
     *          mdp de l'identification
     */
    public Identification(String id, String mdp){
        this.id=id;
        this.mdp=mdp;
    }
    
    
    /**Constructeur de l'identification
     * 
     * @param id
     *             id de l'identification
     * @param mdp
     *           mdp de l'identification   
     * @param type
     *              Type de l'identification
     * @param photo 
     *          Photo de l'identification
     */
    public Identification(String id, String mdp, String type,String photo) {
        this.id = id;
        this.mdp = mdp;
        this.type = type;
        this.photo="/donnees/img/"+photo;
    }

    /**
     * Méthode qui retourne l'id
     * @return l'id
     */
    public String getId() {
        return id;
    }

    /**
     * Méthode qui retourne le mdp
     * @return le mdp
     */
    public String getMdp() {
        return mdp;
    }
    
    /**
     * Méthode qui vérifie l'égalité entre identifications
     * @param id2 
     *         Identification à comparé à cette identifiaction
     * @return 
     *          Un boolean un fonction de l'egalité
     */ 
    public boolean equals(Identification id2){
        if(this.id.equals(id2.getId())&&this.mdp.equals(id2.getMdp())){
            return true;
        }
        else {
            return false;
        }
    }
    
    
    /**
     * Méthode qui retourne l'objet sous forme de chaîne de caractère
     * @return une chaîne de caractère
     */
    public String toString(){
        return "id : "+this.id+"/mdp :"+this.mdp;
    }
    
 

    /**
     * Méthode qui défini le type
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
    }

    /** Méthode qui retourne le type
     * @return le type
     */
    public String getType() {
        return type;
    }

    /**
     * Méthode qui défini la photo
     * @param la photo à définir 
     */
    public void setPhoto(String photo) {
        this.photo ="/donnees/img/"+photo;
    }

    /** Méthode qui retourne la photo sous chaine de caractère
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }
    
    
    /**
     * Méthode qui retourne le type sous forme d'entier
     * @return le type sous entier
     */
    public int Type(){
        if(this.type.charAt(0)=='1'){
            return 1;
        }
        else if(this.type.charAt(0)=='2') {
            return 2;
        }
        else{
            return 0;
        }
    }
    
}
