package princetonPlainsboro;

import java.util.Scanner;

class Test {

    public static void main(String[] args) {
        Connexion con = new Connexion("donneesperso.xml");
        Identification id1 = new Identification("123","123");
        Identification id2 = new Identification("123","1243");
        System.out.println(id1.equals(id2));
        Scanner sc = new Scanner(System.in);
        
System.out.println("Id :");

String id = sc.nextLine();
        System.out.println(id);
System.out.println("Mdp :");

String mdp = sc.nextLine();
        System.out.println(mdp);

        if(con.VerificationConnexion(new Identification(id,mdp))){
        LectureXML test = new LectureXML("dossiers.xml");
        SIH dm = test.getDossier();
        dm.afficher();

        System.out.println("\n********\n");

        /*Patient p1 = new Patient("Bole", "Pat","2549875634587","Wesh alors",new Date(6,5,1997));
        DossierPatient dp = new DossierPatient(p1);
        Medecin m = new Medecin("Jacky","Michel","Zizi");
        FicheDeSoins f = new FicheDeSoins(p1,m,new DateH(1,14,2004,14,50));
        f.ajouterActe(Code.CS,5);
        dp.ajouterFiche(f);
        //dm.ajouterDp(dp);
        System.out.println("> cout de " + p1.nomPrenom() + " : " + dp.coutPatient());
        //System.out.println(f);
        System.out.println("\n********\n");*/

        
        }
        else{
            System.out.println("Erreur, mot de passe ou identifiant érroné");
        }
    }
}
