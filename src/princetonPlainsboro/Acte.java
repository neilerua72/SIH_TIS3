package princetonPlainsboro;
/**Classe qui mod�lise un acte m�dical
 * 
 * @author Aur�lien, Annelise, Manon
 */

public class Acte {

    /**
     * M�thode qui retourne le code de l'acte
     * @return le code correspondant
     */
    public Code getCode() {
        return code;
    }

    /**
     * M�thode qui retourne le coefficient de l'acte
     * @return le coefficiant 
     */
    public int getCoef() {
        return coef;
    }
    
    
    /**
     * M�thode qui retourne le coefficiant sous forme de cha�ne de caract�re
     * 
     * @return le coefficiant sout forme de cha�ne de caract�re 
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
    
    
    /**M�thode qui rends l'objet sous forme de cha�ne de caract�re
     * 
     * @return l'obbjet sous forme de cha�ne de caract�re
     */
    public String toString() {
        return getCode().toString() + ", coefficient : " + getCoef();
        }
    
    
    /**M�thode qui cacule le cout d'un acte
     * @return le co�t d'un acte 
     */
    public double cout() {
        return getCode().calculerCout(getCoef());
        }
    
 
    
    }
