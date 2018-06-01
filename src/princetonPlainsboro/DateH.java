package princetonPlainsboro;

class DateH extends Date implements Comparable{

    private int heure;
    private int minutes;
    
    public DateH(int jour, int mois, int annee,int heure,int minutes) {
       super(jour,mois,annee);
       this.heure=heure;
       this.minutes=minutes;
    }
    public String toString() {
        return this.heure+":"+this.minutes+" "+this.getJour() + "/" + this.getMois() + "/" + this.getAnnee();
        }
    
    public boolean equals(Object o) {
        if (o instanceof DateH) {
            DateH d = (DateH)o;
            return (getAnnee() == d.getAnnee()) && (getMois() == d.getMois()) && (getJour() == d.getJour()) &&(minutes==d.minutes)&&(heure==d.heure);
            }
        else
            return false;
        }
    
    // precondition : 'o' est une instance de 'Date' :
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
    public String toStringS() {
        return this.heure+":"+this.minutes+";"+this.getAnnee() + "-" + this.getMois() + "-" + this.getJour();
        }

    /**
     * @return the heure
     */
    public int getHeure() {
        return heure;
    }

    /**
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }
    
    }
