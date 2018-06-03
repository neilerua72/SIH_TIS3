package princetonPlainsboro;
/**
 * Classe qui compare 2 fiches de soins en fonction de la date
 * @author Aurélien, AnneLise, Manon
 */
class ComparaisonFichesDates implements ComparaisonFiches {
     /**Méthode qui compare 2 fiches en fonction de la date
     * 
     * @param fiche1
     *      Première fiche de soins à comparer
     * @param fiche2
     *      Deuxième fiche de soins à comparer
     * @return un entier de la différence de d'année.s, ou de mois, ou de jour.s, ou d'heures, ou de minute.s entre les 2 fiches
     */

    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        return fiche1.getDate().compareTo(fiche2.getDate());
        }
    }
