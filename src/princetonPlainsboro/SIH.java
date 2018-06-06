package princetonPlainsboro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * Classe qui mod�lise un SIH 
 * @author Aur�lien
 */
public class SIH {

    private ArrayList<DossierPatient> ldp;     // contient des objets de classe 'FicheDeSoins'

/**
 * Constructeur du SI
 */
    public SIH() {
        ldp = new ArrayList<DossierPatient>();  // liste vide
       
    }

    /**
     * M�thode qui affiche le SIH
     */

    public void afficher() {
        System.out.println("Dossier medical informatise :");
        System.out.println("-----------------------------");
        for (int i = 0; i < getLdp().size(); i++) {
            DossierPatient f = getLdp().get(i);
            System.out.println(f.toString());
            // pour separer les fiches de soins :
            System.out.println("------------------*--------------------");
        }
    }

   /**
    * M�thode qui calcule le co�t pour un m�decin
    * @param m le m�decin � qui on veut calculer le co�t
    * @return le co�t du m�decin
    */
    public double coutMedecin(Medecin m) {
        double cout = 0;
        for (int i = 0; i < this.ldp.size(); i++) {
            DossierPatient p = this.ldp.get(i);
            ArrayList<FicheDeSoins> ldfs = new ArrayList<FicheDeSoins>();
            ldfs=p.getLfds();
            for(int j=0;j<ldfs.size();j++){
                FicheDeSoins f= ldfs.get(j);
                if (m.equals(f.getMedecin())) {
                cout += f.coutTotal();
            }
            }
            
        }
        return cout;
    }
    
    
    /**
     * M�thode qui retourne le co�t d'une sp�cialit�
     * @param specialite la sp�cialit� � qui ont veut effectuer le calcul
     * @return le co�t de la sp�cialit�
     */
    public double coutSpecialite(Spe specialite) {
        double cout = 0;
        for (int i = 0; i < getLdp().size(); i++) {
            DossierPatient p = getLdp().get(i);
            ArrayList<FicheDeSoins> ldfs = new ArrayList<FicheDeSoins>();
            ldfs=p.getLfds();
            for(int j=0;j<ldfs.size();j++){
                FicheDeSoins f= ldfs.get(j);
                if (specialite.equals(f.getMedecin().getSpecialite())) {
                cout += f.coutTotal();
            }
            }
            
        }
        return cout;
    }

    
    /**
     * M�thode qui retourne une liste de dossier patient pour un m�decin
     * @param m le medecin � qui on veut trouver ses patients
     * @return une liste de dossier Patient
     */
    public ArrayList<DossierPatient> ListePatients(Medecin m) {
        ArrayList<FicheDeSoins> fiches = new ArrayList<FicheDeSoins>(this.getLdfs());
         
        ArrayList<DossierPatient> liste = new ArrayList<DossierPatient>();
        // 'liste' contient tous les patients deja affiches
        // --> ceci permet de ne pas reafficher un patient deja affiche
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            if (m.equals(f.getMedecin())) {
                Patient p = f.getPatient();
                if (!liste.contains(this.retrouverDossPat(p))) {
                    //System.out.println(" - " + p.toString());
                    liste.add(this.retrouverDossPat(p));
                }
            }
        }
       return liste; 
    }

    
    /**
     * M�thode qui retourne toutes les fiches de soins entre 2 intervalles
     * @param d1 d�but de l'intervalle
     * @param d2 fin de l'intervalle
     * @return une liste de fiches de soins comprisent dans l'intervale
     */
    public ArrayList<FicheDeSoins> nombreFichesIntervalle(Date d1, Date d2) {
        ArrayList<FicheDeSoins>fds = new ArrayList<FicheDeSoins>();
        
        for (int i = 0; i < getLdp().size(); i++) {
            DossierPatient dp = getLdp().get(i);
            ArrayList<FicheDeSoins> ldfs=dp.getLfds();
            for(int j=0;j<ldfs.size();j++){
                
            Date d = ldfs.get(j).getDate();
            if(d1.compareTo(d2)<=0){
            if (d1.compareTo(d) <= 0 && d2.compareTo(d) >= 0) {
                fds.add(ldfs.get(j));
               
               
            }}
            else{
                if (d1.compareTo(d) >=0 && d2.compareTo(d) <= 0) {
                fds.add(ldfs.get(j));
               
               
            }
            }
        }
       
    }
         return fds;
    }
   
    

    /**
     * M�thode qui trie de fa�on g�n�ral la liste de fiche de soins
     * @param c le type de comparaison que l'on souhaite faire
     * @return une liste de fiches de soins tri�es 
     */
    public ArrayList<FicheDeSoins> trier(ComparaisonFiches c) {
        ArrayList <FicheDeSoins> fiches=new ArrayList<FicheDeSoins>(this.getLdfs());
        ArrayList <FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(fiches);
        ArrayList <FicheDeSoins> fichestries = new ArrayList<FicheDeSoins>();
        while (!copieFiches.isEmpty()) {
            // on cherche la fiche de soins minimale :
            int imin = 0;
            FicheDeSoins f1 = copieFiches.get(imin);
            for (int i = 1; i < copieFiches.size(); i++) {
                FicheDeSoins f2 = copieFiches.get(i);
                if (c.comparer(f2, f1) < 0) {
                    imin = i;
                    f1 = f2;
                }
            }
            // on affiche la fiche de soins trouvee :
            System.out.println(f1);
            fichestries.add(f1);
            System.out.println("------------------------");
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }

        return fichestries;
        
    }
    /**
     * M�thode qui ajoute un dossier patient au SIH
     * @param dp le dossier patient � ajouter
     */
    public void ajouterDp(DossierPatient dp){
        this.ldp.add(dp);
    }
    
    /**
     * M�thode qui ajoute une fiche de soins pour un patient donn�
     * @param fiche la fiche de soins � ajouter
     * @param p le patient a qui on souhaite ajouter la fiche de soins
     */
    public void ajouterFiche(FicheDeSoins fiche,Patient p) {
            int i=0;
            boolean rep =false;
            while(i<this.ldp.size()&&rep==false){
                if(ldp.get(i).equals(this.retrouverDossPat(p))){
                    ldp.get(i).ajouterFiche(fiche);
                    rep=true;
                }
                i++;
    }

    }

    /** M�thode qui retourne la liste de dossier patient
     * @return la liste de dossier patient
     */
    public ArrayList<DossierPatient> getLdp() {
        return ldp;
    }
    

    /**
     * M�thode qui retourne toutes les fiches de soins du SIH
     * @return liste de fiches de soins du SIH
     */
    public ArrayList<FicheDeSoins> getLdfs(){
        ArrayList<FicheDeSoins> ldfs = new ArrayList<FicheDeSoins>();
        for(int i=0;i<this.ldp.size();i++){
            DossierPatient dp=ldp.get(i);
            for(int j=0;j<dp.getLfds().size();j++){
                ldfs.add(dp.getLfds().get(j));
                    }
        }
        return ldfs;
    } 
    
    /**
     * M�thode qui retrouve un dossier patient pour un patient donn�
     * @param p le patient
     * @return un dossier patient
     */
    public DossierPatient retrouverDossPat(Patient p){
        int i =0;
        DossierPatient dp=null;
        boolean rep=false;
        while(i<this.ldp.size()&&rep==false){
            if(this.ldp.get(i).getPatient().equals(p)){
                 dp= this.ldp.get(i);
                 System.out.println("TESTTESTTEST");
            rep =true;}
            i++;
         
        }
        return dp;
        
    }
    /**
     * M�thode qui v�rifie que un patient existe
     * @param p un patient 
     * @return un boolean en fonction de la v�rification
     */
    public boolean verifExistP(Patient p){
        int i =0;
        DossierPatient dp=null;
        boolean rep=false;
        while(i<this.ldp.size()&&rep==false){
            if(this.ldp.get(i).getPatient().equals(p)){
                 dp= this.ldp.get(i);
            rep =true;}
            i++;
         
        }
        if(i==this.ldp.size()){
            rep=false;
        }
        else{
            rep =true;
        }
        return rep;
        
    }
    /**
     * M�thode qui retourne la liste de m�decin du SIH
     * @return une liste de m�decin
     */
     public ArrayList<Medecin> getLm() {
        ArrayList<FicheDeSoins> fiches = new ArrayList<FicheDeSoins>(this.getLdfs());
        ArrayList<Medecin> liste = new ArrayList<Medecin>();
        for (int i = 0; i < fiches.size(); i++) {
            FicheDeSoins f = fiches.get(i);
            Medecin m = f.getMedecin(); 
                if (!liste.contains(m)) {
                    liste.add(m);
                }
        }
       return liste; 
    }
     /**
      * M�thode qui retourne la liste des sp�cialit�s
      * @return la liste de sp�cialit�
      */
     public ArrayList<Spe> getLS(){
         List<Spe> liste = Arrays.asList(Spe.values());
         ArrayList<Spe> ls = new ArrayList<Spe>();
         ls.addAll(liste);
         return ls;
     }
     
     
     
     /**
      * M�thode qui recherche un dossier patient par une cha�ne de caract�re
      * @param r la chaine de caract�re de la recherche
      * @return la liste de dossier patient correcpondant � la recherche
      */
     public ArrayList<DossierPatient> rechercheDP(String r){
         ArrayList<DossierPatient> result = new ArrayList<DossierPatient>();
         
         for(int i=0;i<this.ldp.size();i++){
             DossierPatient dp = this.ldp.get(i);
             if(r.length()<=dp.getPatient().getNom().toString().length()&&r.toLowerCase().equals(dp.getPatient().getNom().substring(0, r.length()).toLowerCase())){
                 result.add(dp);
             }
          
     
             
         
     }  return result;
     }
     
       /**
      * M�thode qui recherche un medecin par une cha�ne de caract�re
      * @param r la chaine de caract�re de la recherche
      * @return la liste de medecin correcpondant � la recherche
      */
     public ArrayList<Medecin> rechercheMed(String r){
         ArrayList<Medecin> result = new ArrayList<Medecin>();
         
         for(int i=0;i<this.getLm().size();i++){
             Medecin dp = this.getLm().get(i);
             if(r.length()<=dp.getNom().toString().length()&&r.toLowerCase().equals(dp.getNom().substring(0, r.length()).toLowerCase())){
                 result.add(dp);
             }
          
     
             
         
     }  return result;
     
     
}
/**
 * M�thode qui retourne les fiches de soins d'une date pr�cise
 * @param d la date que l'on souhaite s�l�ctionner les fiches de soins
 * @return la liste de fiches de soins 
 */
public ArrayList<FicheDeSoins> lfdsDate(Date d){
         ArrayList<FicheDeSoins> result= new ArrayList<FicheDeSoins>();
         for(int i=0;i<ldp.size();i++){
             DossierPatient dp=ldp.get(i);
            for(int j=0;j<dp.getLfds().size();j++){
                if(d.equals(dp.getLfds().get(j).getDate()))
                      result.add(dp.getLfds().get(j));
                    }
         }
return result;      



}


}
    


