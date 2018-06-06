
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
 * Lecture d'un document XML et verification d'identification.
 *
 * @author Aurélien, AnneLise, Manon
 */
public class Connexion {
    /// nom du document XML a analyser
    private String nomFichier;
    private final static String repBase = "src/donnees/";
    ArrayList<Identification> identif;
    private String photo;
    private String type;
    // 'nomFichier' est le nom d'un fichier XML se trouvant dans le repertoire 'repBase' a lire :
    public Connexion(String nomFichier) {
        this.nomFichier = nomFichier;
    }
    /**Méthode qui verifie si une Identification est dans un fichier XML
     * 
     * @param id 
     *      Identification qui est à verifiée
     * @return un boolean en fonction de la réponse
     */
    public boolean VerificationConnexion(Identification id) {
        boolean rep = false;
       
        String idCourant = "";
        String mdpCourant = "";
        String type ="";
        String photo="";
        String donneesCourantes="";
        Identification identifCourant= new Identification("","");
        identif=new ArrayList<Identification>();
        int i =0;
        
        // analyser le fichier par StAX
        try {
            // instanciation du parser
            InputStream in = new FileInputStream(repBase + nomFichier);
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader parser = factory.createXMLStreamReader(in);
           // int event = parser.next(); 
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
                           identif.add(new Identification(idCourant,mdpCourant,type,photo));
                         
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
                        if(parser.getLocalName().equals("type")){
                            type=donneesCourantes;
                        }
                        if(parser.getLocalName().equals("photo")){
                            photo=donneesCourantes;
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
        
        while(i<identif.size()&&!(id.equals(identif.get(i)))){
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
            type=identif.get(i).getPhoto();
           photo="/donnees/img/"+identif.get(i).getType();
        }
        
       
        return rep;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    
    
}