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
        System.out.println("RECHERCHE");
        printArray(dm.rechercheDP("Des"));
        Patient p1=dm.rechercheDP("Des").get(0).getPatient();
        Patient p = new Patient(new NumDeSS("1254789654789"));
        Patient p2 = new Patient(new NumDeSS("1254789654789"));
        System.out.println(p.getNumDeSS());
        System.out.println(p1.getNumDeSS());
        NumDeSS ns = new NumDeSS("      214");
        System.out.println(ns);
        System.out.println(p1.equals(p));
        System.out.println("RETROUVER DP");
        System.out.println(dm.retrouverDossPat(p));
        String s = "       56565dfsgd";
        Calendar c = Calendar.getInstance ();
        System.out.println(c.getTime().getYear());
     
    }
    public static void printArray(ArrayList<DossierPatient> a){
        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i).getPatient());
        }
    }
    
}
