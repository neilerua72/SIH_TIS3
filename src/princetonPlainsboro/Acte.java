package princetonPlainsboro;
/**Classe qui modélise un acte médical
 * 
 * @author Aurélien, Annelise, Manon
 */

public class Acte {

    /**
     * Méthode qui retourne le code de l'acte
     * @return le code correspondant
     */
    public Code getCode() {
        return code;
    }

    /**
     * Méthode qui retourne le coefficient de l'acte
     * @return le coefficiant 
     */
    public int getCoef() {
        return coef;
    }
    
    
    /**
     * Méthode qui retourne le coefficiant sous forme de chaîne de caractère
     * 
     * @return le coefficiant sout forme de chaîne de caractère 
     */
    public String getCoefS(){
        return ""+coef;
    }
    private Code code;
    
    private int coef;
    
    
    
    /**
     * Constructeur de l'objet acte
     * @param code de l'acte
     * @param coef de l'acte
     */
    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        }
    
    
    /**Méthode qui rends l'objet sous forme de chaîne de caractère
     * 
     * @return l'obbjet sous forme de chaîne de caractère
     */
    public String toString() {
        return getCode().toString() + ", coefficient : " + getCoef();
        }
    
    
    /**Méthode qui cacule le cout d'un acte
     * @return le coût d'un acte 
     */
    public double cout() {
        return getCode().calculerCout(getCoef());
        }
    
 
    
    }
