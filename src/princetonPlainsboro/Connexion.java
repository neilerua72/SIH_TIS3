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
 * @author promayon
 */
public class Connexion {
    /// nom du document XML a analyser
    private String nomFichier;
    private final static String repBase = "src/donnees/";
    
    // 'nomFichier' est le nom d'un fichier XML se trouvant dans le repertoire 'repBase' a lire :
    public Connexion(String nomFichier) {
        this.nomFichier = nomFichier;
    }
    
    public boolean VerificationConnexion(Identification id) {
        boolean rep = false;
       
        String idCourant = "";
        String mdpCourant = "";
        String donneesCourantes="";
        ArrayList<Identification> identif=new ArrayList<Identification>();
        
        
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
                        if (parser.getLocalName().equals("root")) {
                           
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                                            
                        if (parser.getLocalName().equals("perso")) {
                           identif.add(new Identification(idCourant,mdpCourant));
                           
                        }                        
                        
                        
                        if (parser.getLocalName().equals("id")) {
                            idCourant=donneesCourantes;
                            // ajout des actes
                           
                            // ajouter la fiche de soin au dossiers
                            
                        }
                        if (parser.getLocalName().equals("mdp")){
                            
                            mdpCourant=donneesCourantes;
                            mdpCourant=mdpCourant.replaceAll(" ","");
                            mdpCourant=mdpCourant.replaceAll("\n","");
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
        int i =0;
        while(i<identif.size()&&!(identif.get(i).equals(id))){
            System.out.println(identif.get(i).getId());
            System.out.println(identif.get(i).equals(id));
            System.out.println(i);
        i++;
    }
        if(i==identif.size()){
            rep=false;
        }
        else{
            rep=true;
        }
        
       
        return rep;
    }
    
    
    
}
