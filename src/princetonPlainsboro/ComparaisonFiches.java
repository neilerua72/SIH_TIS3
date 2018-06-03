package princetonPlainsboro;
/**
 * Interface qui compare 2 fiches de soins
 * @author Aurélien, AnneLise, Manon
 */
// cette interface permet de representer une comparaison entre deux FicheDeSoins
interface ComparaisonFiches {
    // la fonction 'comparer' doit retourner :
    //    <0  si fiche1 < fiche2
    //     0  si fiche1 == fiche2
    //    >0  si fiche1 > fiche2
    /**Méthode qui compare 2 fiches
     * 
     * @param fiche1
     *      Première fiche de soins à comparer
     * @param fiche2
     *      Deuxième fiche de soins à comparer
     * @return un entier de la différence entre les 2 fiches
     */
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2);
}
