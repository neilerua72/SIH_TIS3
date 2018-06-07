/*
 * LectureXML.java
 *
 * Created on 5 janvier 2006, 18:26
 *
 * Lecture d'un document XML et transformation en instances Java
 */

package princetonPlainsboro;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * Lecture d'un document XML et transformation en instances Java.
 *
 * @author Aur�lien, AnneLise, Manon
 */
public class LectureXML {
    /// nom du document XML a analyser
    private String nomFichier;
    private final static String repBase = "src/donnees/";
    
    // 'nomFichier' est le nom d'un fichier XML se trouvant dans le repertoire 'repBase' a lire :
    /**
     * Constructeur de la classe
     * @param nomFichier nom du fichier � lire
     */
    public LectureXML(String nomFichier) {
        this.nomFichier = nomFichier;
    }
    /**
     * M�thode qui retourne le SI
     * @return le SI
     */
    public SIH getDossier() {
        SIH dossierCourant = null;
        DateH dateh = null;
        Date date=null;
        Medecin medecinCourant = null;
        Patient patientCourant= null;
        ArrayList<Acte> actes = new ArrayList<Acte>();
        String donneesCourantes = "";
        String nomCourant = "";
        String prenomCourant = "";
        Spe specialiteCourante =null;
        String adresseCourant="";
        String numDeSSstring="";
        int tab[] = new int[13];
        NumDeSS numDeSScourant= new NumDeSS("0000000000000");
        Code codeCourant = null;
        DossierPatient dpcourant = null;
        int coefCourant = 0;
        ArrayList<DossierPatient> ldp = new ArrayList<DossierPatient>();
        ArrayList<FicheDeSoins> ldfscourant = new ArrayList<FicheDeSoins>();
        
        // analyser le fichier par StAX
        try {
            // instanciation du parser
            InputStream in = new FileInputStream(repBase + nomFichier);
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader parser = factory.createXMLStreamReader(in);

            // lecture des evenements
            for (int event = parser.next(); event != XMLStreamConstants.END_DOCUMENT; event = parser.next()) {
                // traitement selon l'evenement
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        if (parser.getLocalName().equals("dossiers")) {
                            dossierCourant = new SIH();
                        }
                        if (parser.getLocalName().equals("dp")){
                            dpcourant=new DossierPatient();
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        if (parser.getLocalName().equals("dp")){
                            dpcourant.setPatient(patientCourant);
                            //dpcourant.setLfds(ldfscourant);
                            dossierCourant.ajouterDp(dpcourant);
                           
                            
                        }
                        if (parser.getLocalName().equals("acte")) {
                            actes.add(new Acte(codeCourant, coefCourant));
                        }                        
                        if (parser.getLocalName().equals("code")) {
                            codeCourant = getCode(donneesCourantes);
                            if (codeCourant==null) 
                                throw new XMLStreamException("Impossible de trouver le code d'acte = "+donneesCourantes);
                        }                        
                        if (parser.getLocalName().equals("coef")) {
                            coefCourant = Integer.parseInt(donneesCourantes);
                        }
                        if (parser.getLocalName().equals("dateh")) {
                            int heure=Integer.parseInt(donneesCourantes.substring(0, donneesCourantes.indexOf(':')));
                            int minute=Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf(':')+1, donneesCourantes.lastIndexOf(';')));
                            int annee = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf(';')+1, donneesCourantes.indexOf('-')));
                            int mois = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('-')+1, donneesCourantes.lastIndexOf('-')));
                            int jour = Integer.parseInt(donneesCourantes.substring(donneesCourantes.lastIndexOf('-')+1, donneesCourantes.length()));
                            
                            dateh = new DateH(jour, mois, annee,heure,minute);
                        }
                        if (parser.getLocalName().equals("date")) {
                            int annee = Integer.parseInt(donneesCourantes.substring(0, donneesCourantes.indexOf('-')));
                            int mois = Integer.parseInt(donneesCourantes.substring(donneesCourantes.indexOf('-')+1, donneesCourantes.lastIndexOf('-')));
                            int jour = Integer.parseInt(donneesCourantes.substring(donneesCourantes.lastIndexOf('-')+1, donneesCourantes.length()));
                            
                            date = new Date(jour, mois, annee);
                        }
                        if (parser.getLocalName().equals("ficheDeSoins")) {
                            FicheDeSoins f = new FicheDeSoins(patientCourant, medecinCourant, dateh);
                            // ajout des actes
                            for (int i=0;i<actes.size();i++) {
                                Acte a = (Acte) actes.get(i);
                                f.ajouterActe(a); 
                                
                            }
                            // effacer tous les actes de la liste
                            actes.clear();
                            
                            //System.out.println(f.toString());
                            // ajouter la fiche de soin au dossiers
                            dpcourant.ajouterFiche(f);
                        }
                        if (parser.getLocalName().equals("medecin")) {
                            medecinCourant = new Medecin(nomCourant, prenomCourant, specialiteCourante);
                        }
                        if (parser.getLocalName().equals("nom")) {
                            nomCourant = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("patient")) {
                            patientCourant = new Patient(nomCourant, prenomCourant,new NumDeSS(numDeSSstring),adresseCourant,date);
                        }
                        if (parser.getLocalName().equals("prenom")) {
                            prenomCourant = donneesCourantes;
                        }
                        if (parser.getLocalName().equals("adresse")) {
                            adresseCourant = donneesCourantes;
                        }
                         if (parser.getLocalName().equals("numDeSS")) {
                             numDeSSstring=donneesCourantes;
                             numDeSSstring =numDeSSstring.trim();
                             System.out.println(numDeSSstring);
//                            for(int i=0;i<tab.length;i++ ){
//                                char c1 = numDeSSstring.charAt(i);
//                                String c = Character.toString(c1);;
//                               int pro =Character.getNumericValue(c1) ; 
//                               System.out.println(pro);
//                               tab[i]=pro;
//                           }
                               
                            numDeSScourant=new NumDeSS(numDeSSstring);
                           
                            //System.out.println(numDeSScourant);
                            //numDeSScourant.setNum(tab);
                        }
                        if (parser.getLocalName().equals("specialite")) {
                            specialiteCourante = getSpe(donneesCourantes);
                          
                            if (specialiteCourante==null) 
                                throw new XMLStreamException("Impossible de trouver le code d'acte = "+donneesCourantes);
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        donneesCourantes = parser.getText();
                        break;
                } // end switch
            } // end while
            parser.close();
        } catch (XMLStreamException ex) {
            System.out.println("Exception de type 'XMLStreamException' lors de la lecture du fichier : " + nomFichier);
            System.out.println("Details :");
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("Exception de type 'IOException' lors de la lecture du fichier : " + nomFichier);
            System.out.println("Verifier le chemin.");
            System.out.println(ex.getMessage());
        }
        
       
        return dossierCourant;
    }
    /**
     * M�thode qui revoit le code pour une chaine de caract�re
     * @param code qui sera lu par cette classe
     * @return un Code 
     */
    private static Code getCode(String code) {
        if (code.equals("CS"))
            return Code.CS;
        if (code.equals("CS"))
            return Code.CS;
        if (code.equals("APC"))
            return Code.APC;
        if (code.equals("APY"))
            return Code.APY;
        if (code.equals("APU"))
            return Code.APU;
        if (code.equals("CCP"))
            return Code.CCP;
        if (code.equals("U03"))
            return Code.U03;
        if (code.equals("U45"))
            return Code.U45;
        if (code.equals("COE"))
            return Code.COE;
        if (code.equals("CSC"))
            return Code.CSC;
        if (code.equals("CNPSY"))
            return Code.CNPSY;
        if (code.equals("CDE"))
            return Code.CDE;
        if (code.equals("KA"))
            return Code.KA;
        if (code.equals("KMB"))
            return Code.KMB;
        if (code.equals("Z"))
            return Code.Z;
        if (code.equals("ORT"))
            return Code.ORT;
        if (code.equals("TO"))
            return Code.TO;
        if (code.equals("SP"))
            return Code.SP;
        if (code.equals("SF"))
            return Code.SF;
        if (code.equals("SFI"))
            return Code.SFI;
        if (code.equals("AMS"))
            return Code.AMS;
        if (code.equals("AMC"))
            return Code.AMC;
        if (code.equals("AMI"))
            return Code.AMI;
        if (code.equals("DI"))
            return Code.DI;
        if (code.equals("AMP"))
            return Code.AMP;
        if (code.equals("POD"))
            return Code.POD;
        if (code.equals("AMO"))
            return Code.AMO;
        if (code.equals("AMY"))
            return Code.AMY;
        // probleme : code inconnu
        return null;            
    }
    
    /**
     * M�thode qui retourne une Spe en fonction du code de la Spe pass� en param�tre
     * @param code de la sp�cialit� � retrouver
     * @return une Spe
     */
     private Spe getSpe(String code) {
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
            return Spe.HEM;
        if(code.equals("NEU"))
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
