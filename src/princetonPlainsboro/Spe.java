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
}
