package princetonPlainsboro;
/**
 * Interface qui compare 2 fiches de soins
 * @author Aur�lien, AnneLise, Manon
 */
// cette interface permet de representer une comparaison entre deux FicheDeSoins
interface ComparaisonFiches {
    // la fonction 'comparer' doit retourner :
    //    <0  si fiche1 < fiche2
    //     0  si fiche1 == fiche2
    //    >0  si fiche1 > fiche2
    /**M�thode qui compare 2 fiches
     * 
     * @param fiche1
     *      Premi�re fiche de soins � comparer
     * @param fiche2
     *      Deuxi�me fiche de soins � comparer
     * @return un entier de la diff�rence entre les 2 fiches
     */
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2);
}
