package princetonPlainsboro;
/**
 * Classe qui compare 2 fiches de soins en fonction du co�t
 * @author Aur�lien, AnneLise, Manon
 */

public class ComparaisonFichesCouts implements ComparaisonFiches {
    
    int i =0;

    public ComparaisonFichesCouts(int i) {
        this.i =i;
    }
    
    /**M�thode qui compare 2 fiches en fonction du co�t
     * 
     * @param fiche1
     *      Premi�re fiche de soins � comparer
     * @param fiche2
     *      Deuxi�me fiche de soins � comparer
     * @return un entier de la diff�rence de co�t entre les 2 fiches
     */
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        Double c1 = new Double(fiche1.coutTotal());
        Double c2 = new Double(fiche2.coutTotal());
        if(i==1)
        return c1.compareTo(c2);
        else
            return c2.compareTo(c1);
        }
    }
