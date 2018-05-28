package princetonPlainsboro;

class Date implements Comparable {
    private int jour;
    private int mois;
    private int annee;
    private int heure;
    private int minutes;
    
    public Date(int jour, int mois, int annee,int heure,int minutes) {
        if((annee%4==0&&annee%100!=0)||annee%400==0){
            if(mois==1||mois==3||mois==5||mois==7||mois==8||mois==10||mois==12){
                if(jour>0&&jour<32){
                    this.jour=jour;
                    this.mois=mois;
                }
            }
            else if (mois==2){
                if(jour>0&&jour<30)
                    this.jour=jour;
                this.mois=mois;
            }
            else{
                if(jour>0&&jour<31){
                    this.jour=jour;
                    this.mois=mois;
                }
            }
        }
        else{
            if(mois==1||mois==3||mois==5||mois==7||mois==8||mois==10||mois==12){
                if(jour>0&&jour<32){
                    this.jour=jour;
                    this.mois=mois;
                }
            }
            else if (mois==2){
                if(jour>0&&jour<29)
                    this.jour=jour;
                this.mois=mois;
            }
            else{
                if(jour>0&&jour<31){
                    this.jour=jour;
                    this.mois=mois;
                }
            }
            
        }
    }
    public String toString() {
        return this.heure+":"+this.minutes+" "+this.jour + "/" + this.mois + "/" + this.annee;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date)o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour) &&(minutes==d.minutes)&&(heure==d.heure);
            }
        else
            return false;
        }
    
    // precondition : 'o' est une instance de 'Date' :
    public int compareTo(Object o) {
        Date d = (Date)o;
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
