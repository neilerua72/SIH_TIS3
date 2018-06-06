package princetonPlainsboro;
/**
 * Classe qui compare 2 fiches de soins en fonction de la date
 * @author Aur�lien, AnneLise, Manon
 */
public class ComparaisonFichesDates implements ComparaisonFiches {
     /**M�thode qui compare 2 fiches en fonction de la date
     * 
     * @param fiche1
     *      Premi�re fiche de soins � comparer
     * @param fiche2
     *      Deuxi�me fiche de soins � comparer
     * @return un entier de la diff�rence de d'ann�e.s, ou de mois, ou de jour.s, ou d'heures, ou de minute.s entre les 2 fiches
     */
    int i;

    
    /**
     * Consutructeur de la classe 
     * @param i 1 ou 2 afin de diff�rencier les 2 types de cas
     */
    public ComparaisonFichesDates(int i) {
        this.i = i;
    }

  
    /**
     * M�thode qui compare 2 fiches de soins 
     * @param fiche1 premi�re fiche de soins � comparer
     * @param fiche2 deuxi�me fiche de soins � comparer
     * @return un entier de la diff�rence entre les 2 fiches (soit en argent ou en temps)
     */
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        if(i==1)
        return fiche1.getDate().compareTo(fiche2.getDate());
        else
            return fiche2.getDate().compareTo(fiche1.getDate());
        }
    }
