package princetonPlainsboro;

class Date implements Comparable {
    protected int jour;
    protected int mois;
    protected int annee;
    
    public Date(int jour, int mois, int annee) {
        if((annee%4==0&&annee%100!=0)||annee%400==0){
            if(mois==1||mois==3||mois==5||mois==7||mois==8||mois==10||mois==12){
                if(jour>0&&jour<32){
                    this.jour=jour;
                    this.mois=mois;
                    this.annee=annee;
                }
            }
            else if (mois==2){
                if(jour>0&&jour<30)
                    this.jour=jour;
                this.mois=mois;
                this.annee=annee;
            }
            else{
                if(jour>0&&jour<31){
                    this.jour=jour;
                    this.mois=mois;
                    this.annee=annee;
                }
            }
        }
        else{
            if(mois==1||mois==3||mois==5||mois==7||mois==8||mois==10||mois==12){
                if(jour>0&&jour<32){
                    this.jour=jour;
                    this.mois=mois;
                    this.annee=annee;
                }
            }
            else if (mois==2){
                if(jour>0&&jour<29)
                    this.jour=jour;
                this.mois=mois;
                this.annee=annee;
            }
            else{
                if(jour>0&&jour<31){
                    this.jour=jour;
                    this.mois=mois;
                    this.annee=annee;
                }
            }
            
        }
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
        if (annee != d.annee)
            return annee - d.annee;
        // ici on a forcement annee == d.annee :
        if (mois != d.mois)
            return mois  - d.mois;
        // ici on a forcement annee == d.annee et mois == d.mois :
       
           return jour - d.jour;
        
    }
    
    }
