package princetonPlainsboro;
/**
 * Classe qui compare 2 fiches de soins en fonction du coût
 * @author Aurélien, AnneLise, Manon
 */

public class ComparaisonFichesCouts implements ComparaisonFiches {
    
    
    /**Méthode qui compare 2 fiches en fonction du coût
     * 
     * @param fiche1
     *      Première fiche de soins à comparer
     * @param fiche2
     *      Deuxième fiche de soins à comparer
     * @return un entier de la différence de coût entre les 2 fiches
     */
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        Double c1 = new Double(fiche1.coutTotal());
        Double c2 = new Double(fiche2.coutTotal());
        return c1.compareTo(c2);
        }
    }
