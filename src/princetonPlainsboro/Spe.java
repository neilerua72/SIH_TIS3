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
}
