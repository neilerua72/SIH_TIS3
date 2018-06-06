/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *M�thode qui mod�lise les sp�cialit�s de l'hopital
 * @author Aur�lien, AnneLise, Manon
 */
public enum Spe {
    ANE("anesth�siologie"),
    CAR("cardiologie"),
    DER("dermatologie"),
    GER("g�rontologie"),
    GYN("gyn�cologie"),
    HEM("h�matologie"),
    NEU("neurologie"),
    PED("p�diatrie"),
    RAD("radiologie"),
    URO("urologie"),
    ONC("oncologie"),
    ORL("oto-rhino-laryngologie");

    String libelle;
    
    /**
     * M�thode qui retourne le libelle de la sp�cialit� 
     * @param libelle 
     */
    private Spe(String libelle) {
        this.libelle = libelle;
    }

    /**
     * M�thode qui retourne une cha�ne de caract�re de l'objet
     * @return une cha�ne de caract�re
     */
    public String toString() {
        return libelle;
    }
    
    
    /**
     * m�thode qui r�cupe le code sous forme de cha�ne de caract�re
     * @return une cha�ne de caract�re
     */
    public String reucpSpe(){
        return super.toString();
    }
    /**
     * M�thode qui retourne la Spe en fonction de la chaine de caract�re pass� en param�tre
     * @param code que l'ont souhaite trouver
     * @return un code
     */
    public static Spe recupEnum(String code){
         if (code.equals("anesth�siologie"))
            return Spe.ANE;
        if (code.equals("cardiologie"))
            return Spe.CAR;
        if (code.equals("dermatologie"))
            return Spe.DER;
        if (code.equals("g�rontologie"))
            return Spe.GER;
        if (code.equals("gyn�cologie"))
            return Spe.GYN;
        if (code.equals("h�matologie"))
            return Spe.HEM;
        if(code.equals("neurologie"))
            return Spe.NEU;
        if (code.equals("p�diatrie"))
            return Spe.PED;
        if (code.equals("radiologie"))
            return Spe.RAD;
        if (code.equals("urologie"))
            return Spe.URO;
        if (code.equals("oncologie"))
            return Spe.ONC;
        if (code.equals("oto-rhino-laryngologie"))
            return Spe.ORL;
        
            
        // probleme : code inconnu
        return null;   
    }
}
