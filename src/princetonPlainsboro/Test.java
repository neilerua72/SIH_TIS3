package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Scanner;

class Test {

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
        Patient p1 = new Patient("Bole", "Pat","2549875634587","Wesh alors",new Date(6,5,1997));
        DossierPatient dp = new DossierPatient(p1);
        FicheDeSoins f = new FicheDeSoins(p1,m,new DateH(12,2,2012,12,54));
        f.ajouterActe(new Acte(Code.CCP,5));
        f.ajouterActe(new Acte(Code.AMI,2));
        System.out.println(f.coutTotal());
        dp.ajouterFiche(f);
        System.out.println(dp.coutPatient());
       
        dm.ajouterDp(dp);
        System.out.println(dm.coutSpecialite("ORL"));
        System.out.println(dm.coutMedecin(m));
        ArrayList<DossierPatient> dp1=new ArrayList<DossierPatient>(dm.getLdp());
        for(int i=0;i<dp1.size();i++){
            System.out.println("1");
            System.out.println(dp1.get(i));
        }
        System.out.println(dm.trierDates());
     
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
}
