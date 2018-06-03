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
        //dm.afficher();
        //ArrayList<DossierPatient> ldp=new ArrayList<DossierPatient>(dm.getLdp());
        System.out.println("\n********\n");
        
        //dm.afficher();
        Medecin m=new Medecin("Foupasune","Jean","ORL");
        //dm.coutMedecin(m);
        Patient p1 = new Patient("Bole", "Pat",new NumDeSS("2549875634587"),"Wesh alors",new Date(6,5,1997));
        DossierPatient dp = new DossierPatient(p1);
        FicheDeSoins f = new FicheDeSoins(p1,m,new DateH(12,2,2012,12,54));
        f.ajouterActe(new Acte(Code.CCP,5));
        f.ajouterActe(new Acte(Code.AMI,2));
        System.out.println(f.coutTotal());
        dm.ajouterFiche(f,p1);
        System.out.println(dp.coutPatient());
       
        
        Date d = new Date(16,12,1997);
        System.out.println(d.dateCorrect());
        Calendar rN = Calendar.getInstance();
         Date dd=new Date(rN.DATE,rN.MONTH,rN.YEAR);
         System.out.println(dd);
        
        //printArray(dm.trier(new ComparaisonFichesDates()));
        
        //System.out.println(dm.retrouverDossPat(p1));
       //System.out.println(dm.retrouverDossPat(p1));
                
                DateH dh1 = new DateH(12,6,2005,12,45);
        DateH dh2 = new DateH(12,6,2005,12,44);
        System.out.println(dh1.compareTo(dh2));
        /*Medecin m = new Medecin("Jacky","Michel","Zizi");
        FicheDeSoins f = new FicheDeSoins(p1,m,new DateH(1,14,2004,14,50));
        f.ajouterActe(Code.CS,5);
        dp.ajouterFiche(f);
        //dm.ajouterDp(dp);
        System.out.println("> cout de " + p1.nomPrenom() + " : " + dp.coutPatient());
        //System.out.println(f);
        System.out.println("\n********\n");*/

        
        //}
        //else{
         //   System.out.println("Erreur, mot de passe ou identifiant érroné");
        //}
    }
    public static void printArray(ArrayList<DossierPatient> a){
        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i).getPatient());
        }
    }
}
