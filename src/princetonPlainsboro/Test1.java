package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

class Test1 {

    public static void main(String[] args) {
        Connexion con = new Connexion("donneesperso.xml"); 
       // if(con.VerificationConnexion(new Identification(id,mdp))){
        LectureXML test = new LectureXML("donnesApresSIH.xml");
        SIH dm = test.getDossier();
        System.out.println("test ultra bg");
       // printArray(dm.nombreFichesIntervalle (new Date(6,1,2006),new Date(31,8,2005)));
        
        
        printArray(dm.rechercheDP("tr"));
     
    }
    public static void printArray(ArrayList<DossierPatient> a){
        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i).getPatient());
        }
    }
    
}
