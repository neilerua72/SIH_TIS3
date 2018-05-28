package princetonPlainsboro;

class DateH extends Date implements Comparable{

    private int heure;
    private int minutes;
    
    public DateH(int jour, int mois, int annee,int heure,int minutes) {
       super(jour,mois,annee);
    }
    public String toString() {
        return this.heure+":"+this.minutes+" "+this.jour + "/" + this.mois + "/" + this.annee;
        }
    
    public boolean equals(Object o) {
        if (o instanceof DateH) {
            DateH d = (DateH)o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour) &&(minutes==d.minutes)&&(heure==d.heure);
            }
        else
            return false;
        }
    
    // precondition : 'o' est une instance de 'Date' :
    public int compareTo(Object o) {
        DateH d = (DateH)o;
        if (annee != d.annee)
            return annee - d.annee;
        // ici on a forcement annee == d.annee :
        if (mois != d.mois)
            return mois  - d.mois;
        // ici on a forcement annee == d.annee et mois == d.mois :
        if (jour != d.jour)
           return jour - d.jour;
        if (heure != d.heure)
            return heure -d.heure;
        return minutes-d.minutes;
    }
    
    }
