/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author Aur�lien
 */
public class InscriptionFichierXML {
    public void Xml(SIH sih){
    XMLOutputFactory xof = XMLOutputFactory.newInstance();
      //On cr�e notre objet qui va servir � �crire dans notre fichier
      FileWriter fw;
      try {
         //On initialise le flux en �criture
         FileOutputStream fos = new FileOutputStream(new File("src/donnees/donnesApresSIH.xml"));
       
          XMLStreamWriter xsw = xof.createXMLStreamWriter(fos, "UTF-8");
         
         //Il existe une m�thode sans argument
         xsw.writeStartDocument("UTF-8", "1.0");
         xsw.writeStartElement("dossiers");
            for(int i=0;i<sih.getLdp().size();i++){
               xsw.writeStartElement("dp");
                xsw.writeStartElement("patient");
                    xsw.writeStartElement("nom");
                        xsw.writeCharacters(sih.getLdp().get(i).getPatient().getNom());
                    xsw.writeEndElement();
                    xsw.writeStartElement("prenom");
                        xsw.writeCharacters(sih.getLdp().get(i).getPatient().getPrenom());
                    xsw.writeEndElement();
                    xsw.writeStartElement("adresse");
                        xsw.writeCharacters(sih.getLdp().get(i).getPatient().getAdresse());
                    xsw.writeEndElement();
                    xsw.writeStartElement("numDeSS");
                        xsw.writeCharacters(sih.getLdp().get(i).getPatient().getNumDeSS().toString());
                    xsw.writeEndElement();
                    xsw.writeStartElement("date");
                        xsw.writeCharacters(sih.getLdp().get(i).getPatient().getDateDeNaissance().toStringS());
                    xsw.writeEndElement();
                xsw.writeEndElement();
                    for(int j=0;j<sih.getLdp().get(i).getLfds().size();j++){
                        FicheDeSoins f =sih.getLdp().get(i).getLfds().get(j);
                        xsw.writeStartElement("ficheDeSoins");
                            xsw.writeStartElement("dateh");
                                xsw.writeCharacters(f.getDate().toStringS());
                            xsw.writeEndElement();
                            xsw.writeStartElement("medecin");
                                xsw.writeStartElement("nom");
                                    xsw.writeCharacters(f.getMedecin().getNom());
                                xsw.writeEndElement();
                                xsw.writeStartElement("prenom");
                                    xsw.writeCharacters(f.getMedecin().getPrenom());
                                xsw.writeEndElement();
                                xsw.writeStartElement("specialite");
                                    xsw.writeCharacters(f.getMedecin().getSpecialite().reucpSpe());
                                xsw.writeEndElement();
                            xsw.writeEndElement();
                            xsw.writeStartElement("patient");
                                xsw.writeStartElement("nom");
                                    xsw.writeCharacters(f.getPatient().getNom());
                                xsw.writeEndElement();
                                xsw.writeStartElement("prenom");
                                    xsw.writeCharacters(f.getPatient().getPrenom());
                                xsw.writeEndElement();
                            xsw.writeEndElement();
                            for(int k=0;k<f.getActes().size();k++){
                                Acte a = f.getActes().get(k);
                            xsw.writeStartElement("acte");
                                xsw.writeStartElement("code");
                                    xsw.writeCharacters(a.getCode().recupCode());
                                xsw.writeEndElement();
                                xsw.writeStartElement("coef");
                                    xsw.writeCharacters(a.getCoefS());
                                xsw.writeEndElement();    
                            xsw.writeEndElement();
                            }
                        xsw.writeEndElement();
                
                    }
                    
            
              xsw.writeEndElement();          
      }
         xsw.writeEndElement();   
         
         xsw.writeEndDocument();
         
         //Tr�s important, on doit invoquer les m�thodes flush() et close()
         //pour rendre l'�criture effective
         xsw.flush();
         xsw.close();
         //nous cr�ons notre objet qui va �crire dans notre fichier
         
         
      } catch (IOException e) {
         e.printStackTrace();
      } catch (XMLStreamException e) {
         e.printStackTrace();
      }
   }
}

