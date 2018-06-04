package princetonPlainsboro;
/**M�thode qui mod�lise une date avec une heure
 * 
 * @author Aur�lien, AnneLise, Manon
 */
class DateH extends Date implements Comparable{

    private int heure;
    private int minutes;
    
    public DateH(int jour, int mois, int annee,int heure,int minutes) {
       super(jour,mois,annee);
       this.heure=heure;
       this.minutes=minutes;
    }
    
    
    /**M�thode qui retourne la date sous forme de cha�ne de caract�re
     * 
     * @return la date sous cha�ne de caract�re 
     */
    public String toString() {
        return this.heure+":"+this.minutes+" "+this.getJour() + "/" + this.getMois() + "/" + this.getAnnee();
        }
    
    
     /**M�thode qui verifie que l'objet est �gale � cette instance
     * 
     * @param o un objet 
     * @return un boolean en fonction de l'�galit� 
     */
    public boolean equals(Object o) {
        if (o instanceof DateH) {
            DateH d = (DateH)o;
            return (getAnnee() == d.getAnnee()) && (getMois() == d.getMois()) && (getJour() == d.getJour()) &&(minutes==d.minutes)&&(heure==d.heure);
            }
        else
            return false;
        }
    
    /** M�thode qui retourne la diff�rence entre 2 dates
     * 
     * @param o un Objet de type date 
     * @return la diff�rence entre les 2 dates
     */
    public int compareTo(Object o) {
        DateH d = (DateH)o;
        if (this.getAnnee() != d.getAnnee()){
            
            return this.getAnnee() - d.getAnnee();}
        // ici on a forcement annee == d.annee :
        if (getMois() != d.getMois())
            return getMois()  - d.getMois();
        // ici on a forcement annee == d.annee et mois == d.mois :
        if (getJour() != d.getJour())
           return getJour() - d.getJour();
        if (heure != d.getHeure())
            return heure -d.getHeure();
        return minutes-d.getMinutes();
    }
    
    /**M�thode qui retourne la date de mani�re � l'inscrire gr�ce a InscriptionXML et pouvoir la relire avec LectureXML
     * 
     * @return une cha�ne de caract�re pour l'�criture XML 
     */
    public String toStringS() {
        return this.heure+":"+this.minutes+";"+this.getAnnee() + "-" + this.getMois() + "-" + this.getJour();
        }

    /**M�thode qui retourne l'heure
     * @return l'heure
     */
    public int getHeure() {
        return heure;
    }

    /**M�thode qui retourne les minutes
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }
    
    }
