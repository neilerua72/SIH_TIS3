package princetonPlainsboro;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class SIH {

    private ArrayList<DossierPatient> ldp;     // contient des objets de classe 'FicheDeSoins'


    public SIH() {
        ldp = new ArrayList<DossierPatient>();  // liste vide
    }

    

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

    public double coutSpecialite(String specialite) {
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

    public ArrayList<DossierPatient> ListePatients(Medecin m) {
        System.out.println("> liste des patients du " + m.toString() + " :");
        ArrayList<DossierPatient> liste = new ArrayList<DossierPatient>();
        // 'liste' contient tous les patients deja affiches
        // --> ceci permet de ne pas reafficher un patient deja affiche
        for (int i = 0; i < getLdp().size(); i++) {
            DossierPatient dp = getLdp().get(i);
            ArrayList<FicheDeSoins> ldfs=dp.getLfds();
            for(int j=0;j<ldfs.size();j++){
                FicheDeSoins f = ldfs.get(j);
            if (m.equals(f.getMedecin())) {
                if (!liste.contains(dp)) {
                    
                    liste.add(dp);
                }
            }
        }
        }
        return liste;
    }

    public int nombreFichesIntervalle(Date d1, Date d2) {
        int n = 0;
        for (int i = 0; i < getLdp().size(); i++) {
            DossierPatient dp = getLdp().get(i);
            ArrayList<FicheDeSoins> ldfs=dp.getLfds();
            for(int j=0;j<ldfs.size();j++){
                
            Date d = ldfs.get(i).getDate();
            if (d.compareTo(d1) >= 0 && d.compareTo(d2) <= 0) {
                n++;
            }
        }
       
    }
         return n;
    }
    public void trierDates() {
        ArrayList<FicheDeSoins> fiches = new ArrayList<FicheDeSoins>();
        for(int i=0;i<getLdp().size();i++){
            for(int j=0;j<getLdp().get(i).getLfds().size();j++){
                fiches.add(getLdp().get(i).getLfds().get(j));
            }
        }
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(fiches);

        

        while (!copieFiches.isEmpty()) {
            // on cherche la fiche de soins de date minimale :
            int imin = 0;
            FicheDeSoins f1 = copieFiches.get(imin);
            for (int i = 1; i < copieFiches.size(); i++) {
                FicheDeSoins f2 = copieFiches.get(i);
                if (f2.getDate().compareTo(f1.getDate()) < 0) {
                    imin = i;
                    f1 = f2;
                }
            }
            // on affiche la fiche de soins trouvee :
            System.out.println(f1.toString());
            System.out.println("------------------------");
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }
    }
    

    // tri generique :
    public void trier(ComparaisonFiches c) {
        ArrayList<FicheDeSoins> fiches = new ArrayList<FicheDeSoins>();
        for(int i=0;i<getLdp().size();i++){
            for(int j=0;j<getLdp().get(i).getLfds().size();j++){
                fiches.add(getLdp().get(i).getLfds().get(j));
            }
        }
        ArrayList<FicheDeSoins> copieFiches = new ArrayList<FicheDeSoins>(fiches);

        

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
            System.out.println(f1.toString());
            System.out.println("------------------------");
            //on la supprime de la liste :
            copieFiches.remove(imin);
        }
    }
    public void ajouterDp(DossierPatient dp){
        getLdp().add(dp);
    }

    /**
     * @return the ldp
     */
    public ArrayList<DossierPatient> getLdp() {
        return ldp;
    }
}

