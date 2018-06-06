/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *
 * @author Aurélien
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
