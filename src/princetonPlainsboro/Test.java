package princetonPlainsboro;

class Test {

    public static void main(String[] args) {
        LectureXML test = new LectureXML("dossiers.xml");
        SIH dm = test.getDossier();
        //dm.afficher();

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
}
