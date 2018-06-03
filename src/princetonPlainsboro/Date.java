package princetonPlainsboro;

public class Date implements Comparable {

    /**
     * @return the jour
     */
    public int getJour() {
        return jour;
    }

    /**
     * @return the mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * @return the annee
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
    public String toString() {
        return this.jour + "/" + this.mois + "/" + this.annee;
        }
    
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date)o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour);
            }
        else
            return false;
        }
    
    // precondition : 'o' est une instance de 'Date' :
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
    public String toStringS() {
        return this.annee + "-" + this.mois + "-" + this.jour;
        }
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
