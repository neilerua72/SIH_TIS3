package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

class Test1 {

    public static void main(String[] args) {
        Connexion con = new Connexion("donneesperso.xml"); 
       // if(con.VerificationConnexion(new Identification(id,mdp))){
        LectureXML test = new LectureXML("dossiers.xml");
        SIH dm = test.getDossier();
        System.out.println("RECHERCHE");
        printArray(dm.rechercheDP("Des"));
     
    }
    public static void printArray(ArrayList<DossierPatient> a){
        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i).getPatient());
        }
    }
}
