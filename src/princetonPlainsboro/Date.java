package princetonPlainsboro;
/**
 * M�thode qui mod�lise une date 
 * @author Aur�lien, AnneLise, Manon
 */

public class Date implements Comparable {

    /**M�thode qui retourne le jour de la date
     * 
     * @return le jour
     */
    public int getJour() {
        return jour;
    }

    /**M�thode qui retourne le mois de la date
     * @return le mois
     */
    public int getMois() {
        return mois;
    }

    /**M�thode qui retourne l'ann�e de la date
     * @return l'annee
     */
    public int getAnnee() {
        return annee;
    }
    private int jour;
    private int mois;
    private int annee;
    
    public Date(int jour, int mois, int annee) {
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }
    
    /**M�thode qui retourne la date sous forme de cha�ne de caract�re
     * 
     * @return la date sous cha�ne de caract�re 
     */
    public String toString() {
        return this.jour + "/" + this.mois + "/" + this.annee;
        }
    /**M�thode qui verifie que l'objet est �gale � cette instance
     * 
     * @param o un objet 
     * @return un boolean en fonction de l'�galit� 
     */
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date)o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour);
            }
        else
            return false;
        }
    
    // precondition : 'o' est une instance de 'Date' :
    
    /** M�thode qui retourne la diff�rence entre 2 dates
     * 
     * @param o un Objet de type date 
     * @return la diff�rence entre les 2 dates
     */
    public int compareTo(Object o) {
        Date d = (Date)o;
        if (this.annee != d.getAnnee())
            return this.annee - d.getAnnee();
        // ici on a forcement annee == d.annee :
        if (this.mois != d.getMois())
            return this.mois  - d.getMois();
        // ici on a forcement annee == d.annee et mois == d.mois :
       
           return this.jour - d.getJour();
        
    }
    
    /**M�thode qui retourne la date de mani�re � l'inscrire gr�ce a InscriptionXML et pouvoir la relire avec LectureXML
     * 
     * @return une cha�ne de caract�re pour l'�criture XML 
     */
    public String toStringS() {
        return this.annee + "-" + this.mois + "-" + this.jour;
        }
    
    
    /**M�thode qui v�rifie que la date est correct
     * 
     * @return un boolean en fonction de si la date est correct
     */
    public boolean dateCorrect(){
        boolean rep=false;
        if((annee%4==0&&annee%100!=0)||annee%400==0){
            if(mois==1||mois==3||mois==5||mois==7||mois==8||mois==10||mois==12){
                if(jour>0&&jour<32){
                    rep=true;
                }
            }
            else if (mois==2){
                if(jour>0&&jour<30)
                  rep=true;
            }
            else{
                if(jour>0&&jour<31){
                   rep=true;
                }
            }
        }
        else{
            if(mois==1||mois==3||mois==5||mois==7||mois==8||mois==10||mois==12){
                if(jour>0&&jour<32){
                   rep=true;
                }
            }
            else if (mois==2){
                if(jour>0&&jour<29)
                    rep=true;
            }
            else{
                if(jour>0&&jour<31){
                    rep=true;
                }
            }
            
        }
        
        return rep;
    }
    
    }
