/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceUtilisateur;

import Listenner.BarreRechercheLm;
import Listenner.BarreRechercherCoutM;
import Listenner.BoutonListenerAjouterActe;
import Listenner.BoutonListenerAnnulerActe;
import Listenner.BoutonListenerGen;
import Listenner.BoutonListenerJTreeListe;
import Listenner.BoutonListenerConnexion;
import Listenner.BoutonListenerDeco;
import Listenner.BoutonListenerFacture;

import Listenner.BoutonListenerNouvelleFDS;
import Listenner.BoutonListenerRCoutPatient;

import Listenner.BoutonListenerRetoucreerFDDversDP;
import Listenner.BoutonListenerRetourDpVersLP;
import Listenner.BoutonListenerRetourFDSversDP;
import Listenner.BoutonListenerRetourFacture;
import Listenner.BoutonListenerValiderDP;
import Listenner.BoutonListenerValiderTri;
import Listenner.BoutonListenerretourLpmVersLm;
import Listenner.BoutonValiderNouvFDS;
import Listenner.ConnexionEntrerListener;
import Listenner.ListenerTableauLPPM;
import Listenner.ListenerValiderTri;

import Listenner.RechercheEntrerListener;
import Listenner.TableauListenerFDS;
import Listenner.TableauListenerListeDeMedecins;
import Listenner.tablesListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.InscriptionFichierXML;
import princetonPlainsboro.LectureXML;
import princetonPlainsboro.SIH;

/**
 *
 * @author Aurélien
 */
public class Fen extends javax.swing.JFrame {

    //Declaration Panel
    ConnexionInterface c = new ConnexionInterface();
    JListeDePatients lp = new JListeDePatients();
    JCreerDP jcdp = new JCreerDP();
    JCoutPatient jcp = new JCoutPatient();
    JListeDeMedecins lm = new JListeDeMedecins();
    JCoutMedecin jcm = new JCoutMedecin();
    JCoutSpecialite1 jcs = new JCoutSpecialite1();
    JConsulterDP_dans_le_dossier cdpdd = new JConsulterDP_dans_le_dossier();
    Accueil a = new Accueil();
    JConsulterFDS_dans_ongletFDS jfdsdofds = new JConsulterFDS_dans_ongletFDS();
    JFDSMedicalModifiable jfdsmm = new JFDSMedicalModifiable();
    JConsulterDP_facture jcDPf = new JConsulterDP_facture ();
    JCreerFDS jcFDS= new JCreerFDS ();
    JAjouterActe jaa= new JAjouterActe ();
    JListedePatientParMedecins jldppm = new  JListedePatientParMedecins ();
    
    
    
    private FicheDeSoins f = null;
  

    //Variable importante : 
    Jmenu jm = new Jmenu();
    Fen frame = this;
    Barre b = new Barre();

    //Variables autres :
    int ligne;
    SIH sih;
    //Declaration bouton
    private JButton valider = c.getjButton1();
    private JButton validerDP = jcdp.getValider();
    private State state;
    private JTable jlisteP = lp.getjTable1();
    private JTree jtreeliste = jm.getjTree2();
   private JButton jcreerFDSButton = jcFDS.getValider();
    private JButton facture = jfdsmm.getjButton3();
    private JButton rechercheDP = lp.getButtonR();
    private JTextField rechercheDPtext = lp.getRecherche();
    private JTextField rechercheDPtextJCP = jcp.getjTextField2();
    private JButton creerFDS = cdpdd.getjButton5();
    private JButton ajouteracte =jfdsmm.getjButton4();
    private JButton annuleracte = jaa.getjButton1();
    private JButton validerTri = jfdsdofds.getButtonValider();
      private JTable jlistefiche = cdpdd.getjTable1();
      private JTable jlistemedecin = lm.getjTable1();
private JTable jlistedppm =  jldppm.getjTable1();
      private JButton Boutonretour = jcDPf.getjButton1();
       private JButton Boutonretourdpverslp = cdpdd.getjButton1();
       private JButton retourfdsversdp = jfdsmm.getjButton1();
       private JButton retourcreerfdsversdp = jcFDS.getjButton1();
       private JButton retourjlmversjldppm = jldppm.getjButton1();
       private JButton boutondeco = b.getjButton1();
       private JTextField recherchelm =lm.getjTextField1();
         private JTextField rechercheclm =jcm.getjTextField1();
//    /**
//     * Creates new form Fen
//     */JFrame frame = this;
    //Declaration JTren
    public Fen() {
        state = State.NONCO;
        add(c);
        this.setSize(950, 600);

        valider.addActionListener(new BoutonListenerConnexion(jm, c, a, b, this));
        c.getjPasswordField1().addKeyListener(new ConnexionEntrerListener(jm, c, a, b, this));
        LectureXML lecture = new LectureXML("donnesApresSIH.xml");
        sih = lecture.getDossier();
        validerDP.addActionListener(new BoutonListenerValiderDP(jcdp, this, sih));
        jtreeliste.addTreeSelectionListener(new BoutonListenerJTreeListe(lp, jcdp, jcp, lm, jcm, jcs, a, jm, this, jfdsdofds, sih));
        jlisteP.addMouseListener(new tablesListener(lp, this, jlisteP, cdpdd,sih));
        boutondeco.addActionListener(new BoutonListenerDeco(c,this,b));
        jcreerFDSButton.addActionListener(new BoutonValiderNouvFDS(jcFDS, jfdsmm, this, sih,jaa));
     facture.addActionListener(new BoutonListenerFacture(this,jcDPf,jfdsmm,cdpdd));
        rechercheDPtext.addKeyListener(new RechercheEntrerListener(lp,this,sih,jcp,cdpdd));
        creerFDS.addActionListener(new BoutonListenerNouvelleFDS(this,cdpdd,jcFDS,jaa));
        ajouteracte.addActionListener(new BoutonListenerAjouterActe(this,jfdsmm,jaa));
        annuleracte.addActionListener(new BoutonListenerAnnulerActe(this,jaa,jfdsmm));
        jlistemedecin.addMouseListener(new TableauListenerListeDeMedecins (lm, this, jlistemedecin, jldppm,b ,jm, sih));
        jlistedppm.addMouseListener(new ListenerTableauLPPM(this, jldppm,cdpdd, jlistedppm,sih,b));
        Boutonretour.addActionListener(new BoutonListenerRetourFacture(this,jfdsmm,jcDPf));
        validerTri.addActionListener(new BoutonListenerValiderTri(jfdsdofds,this,sih));
        jlistefiche.addMouseListener(new TableauListenerFDS( cdpdd, this, jlistefiche ,jfdsmm,b, jm, sih));
        rechercheDPtextJCP.addKeyListener(new BoutonListenerRCoutPatient(lp,this,sih,jcp,cdpdd));
        Boutonretourdpverslp.addActionListener(new BoutonListenerRetourDpVersLP(this,lp,cdpdd));
        retourfdsversdp.addActionListener(new BoutonListenerRetourFDSversDP(this,jfdsmm, cdpdd));
          retourcreerfdsversdp.addActionListener(new BoutonListenerRetoucreerFDDversDP(this,jcFDS,cdpdd));
          retourjlmversjldppm.addActionListener(new BoutonListenerretourLpmVersLm(jldppm,lm,this));
          recherchelm.addKeyListener(new BarreRechercheLm(lm, this,sih, jcm,jldppm));
           rechercheclm.addKeyListener(new BarreRechercherCoutM(lm, this,sih, jcm,jldppm));
          
          
          
        //Ca s'est pour éviter que la fenêtre se ferme même si on clique sur "Non"
        //Définition de l'écouteur à l'aide d'une classe interne anonyme
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int reponse = JOptionPane.showConfirmDialog(frame,
                        "Voulez-vous quitter l'application",
                        "Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (reponse == JOptionPane.YES_OPTION) {
                    InscriptionFichierXML sauvegarde = new InscriptionFichierXML();
                    sauvegarde.Xml(sih);
                    System.exit(0);
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fen().setVisible(true);

            }
        });
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }
    
    public void toutFalse() {
        lp.setVisible(false);
        jcdp.setVisible(false);
        jcp.setVisible(false);
        lm.setVisible(false);
        jcm.setVisible(false);
        jcs.setVisible(false);
        cdpdd.setVisible(false);
        a.setVisible(false);

        jfdsdofds.setVisible(false);
        jfdsmm.setVisible(false);
        jcDPf.setVisible(false);
        jcFDS.setVisible(false);
        jaa.setVisible(false);
           jldppm.setVisible(false);
    }

    public State getStates() {
        return state;
    }

    /**
     * @return the f
     */
    public FicheDeSoins getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(FicheDeSoins f) {
        this.f = f;
    }

    
    
       public void toutToutfalse(){
           jm.setVisible(false);
           c.setVisible(false);
           this.toutFalse();
       }
    /**
     * @return the state
     */
   

    /**
     * @param state the state to set
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
