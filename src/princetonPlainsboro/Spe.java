/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *Méthode qui modélise les spécialités de l'hopital
 * @author Aurélien, AnneLise, Manon
 */
public enum Spe {
    ANE("anesthésiologie"),
    CAR("cardiologie"),
    DER("dermatologie"),
    GER("gérontologie"),
    GYN("gynécologie"),
    HEM("hématologie"),
    NEU("neurologie"),
    PED("pédiatrie"),
    RAD("radiologie"),
    URO("urologie"),
    ONC("oncologie"),
    ORL("oto-rhino-laryngologie");

    String libelle;
    
    /**
     * Méthode qui retourne le libelle de la spécialité 
     * @param libelle 
     */
    private Spe(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Méthode qui retourne une chaîne de caractère de l'objet
     * @return une chaîne de caractère
     */
    public String toString() {
        return libelle;
    }
    
    
    /**
     * méthode qui récupe le code sous forme de chaîne de caractère
     * @return une chaîne de caractère
     */
    public String reucpSpe(){
        return super.toString();
    }
    /**
     * Méthode qui retourne la Spe en fonction de la chaine de caractère passé en paramètre
     * @param code que l'ont souhaite trouver
     * @return un code
     */
    public static Spe recupEnum(String code){
         if (code.equals("anesthésiologie"))
            return Spe.ANE;
        if (code.equals("cardiologie"))
            return Spe.CAR;
        if (code.equals("dermatologie"))
            return Spe.DER;
        if (code.equals("gérontologie"))
            return Spe.GER;
        if (code.equals("gynécologie"))
            return Spe.GYN;
        if (code.equals("hématologie"))
            return Spe.HEM;
        if(code.equals("neurologie"))
            return Spe.NEU;
        if (code.equals("pédiatrie"))
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
