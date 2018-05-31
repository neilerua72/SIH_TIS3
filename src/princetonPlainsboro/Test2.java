/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *
 * @author Aurélien
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LectureXML test = new LectureXML("CursorWriter1.xml");
        SIH dm = test.getDossier();
        
        InscriptionFichierXML test2 = new InscriptionFichierXML();
        
        test2.Xml(dm);
    }
    
}
