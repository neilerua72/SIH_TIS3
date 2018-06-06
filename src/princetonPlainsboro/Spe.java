/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *
 * @author Aur�lien
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

    private Spe(String libelle) {
        this.libelle = libelle;
    }

    public String toString() {
        return libelle;
    }
    
    public String reucpSpe(){
        return super.toString();
    }
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
