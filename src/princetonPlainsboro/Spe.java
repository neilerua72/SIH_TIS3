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
         if (code.equals("ANE"))
            return Spe.ANE;
        if (code.equals("CAR"))
            return Spe.CAR;
        if (code.equals("DER"))
            return Spe.DER;
        if (code.equals("GER"))
            return Spe.GER;
        if (code.equals("GYN"))
            return Spe.GYN;
        if (code.equals("HEM"))
            return Spe.NEU;
        if (code.equals("PED"))
            return Spe.PED;
        if (code.equals("RAD"))
            return Spe.RAD;
        if (code.equals("URO"))
            return Spe.URO;
        if (code.equals("ONC"))
            return Spe.ONC;
        if (code.equals("ORL"))
            return Spe.ORL;
        
            
        // probleme : code inconnu
        return null;   
    }
}
