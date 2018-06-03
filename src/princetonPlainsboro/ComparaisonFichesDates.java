package princetonPlainsboro;
/**
 * Classe qui compare 2 fiches de soins en fonction de la date
 * @author Aur�lien, AnneLise, Manon
 */
class ComparaisonFichesDates implements ComparaisonFiches {
     /**M�thode qui compare 2 fiches en fonction de la date
     * 
     * @param fiche1
     *      Premi�re fiche de soins � comparer
     * @param fiche2
     *      Deuxi�me fiche de soins � comparer
     * @return un entier de la diff�rence de d'ann�e.s, ou de mois, ou de jour.s, ou d'heures, ou de minute.s entre les 2 fiches
     */

    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        return fiche1.getDate().compareTo(fiche2.getDate());
        }
    }
