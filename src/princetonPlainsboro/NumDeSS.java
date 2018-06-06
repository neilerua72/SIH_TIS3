/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *Méthode qui modélise un numéro de sécurité sociale
 * @author Aurélien, AnneLise, Manon
 */
public class NumDeSS {
    private String num;
//    public NumDeSS(int num[]){
//        if(num.length==13&&(num[0]==1||num[0]==2)&&num[1]>=0&&num[1]<10&&num[2]>=0&&num[2]<10&&num[3]>=0&&num[3]<10&&num[4]>=0&&num[4]<10&&num[3]*10+num[4]>0&&num[3]*10+num[4]<13&&num[5]>=0&&num[5]<10&&num[6]>=0&&num[6]<10&&num[5]*10+num[6]<99&&num[7]>=0&&num[7]<10&&num[8]>=0&&num[8]<10&&num[9]>=0&&num[9]<10&&num[10]>=0&&num[10]<10&&num[11]>=0&&num[11]<10&&num[12]>=0&&num[12]<10){
//            this.num=num;
//        }
//    }
    
    /**
     * Méthode qui construit le numéro de Sécu
     * @param n le numéro de sécurité 
     */
    public NumDeSS(String n){
//        int num[] = new int[13];
//        for(int i=0;i<num.length;i++ ){
//                                char c1 = n.charAt(i);
//                                String c = Character.toString(c1);;
//                               int pro =Character.getNumericValue(c1) ; 
//                               num[i]=pro;
//                            }
        //if(num.length==13&&(num[0]==1||num[0]==2)&&num[1]>=0&&num[1]<10&&num[2]>=0&&num[2]<10&&num[3]>=0&&num[3]<10&&num[4]>=0&&num[4]<10&&num[3]*10+num[4]>0&&num[3]*10+num[4]<13&&num[5]>=0&&num[5]<10&&num[6]>=0&&num[6]<10&&num[5]*10+num[6]<99&&num[7]>=0&&num[7]<10&&num[8]>=0&&num[8]<10&&num[9]>=0&&num[9]<10&&num[10]>=0&&num[10]<10&&num[11]>=0&&num[11]<10&&num[12]>=0&&num[12]<10){
            this.num=n;
        //}
        
    }

    /**
     * Méthode qui retourne le numéro de sécurité sociale
     * @return 
     */
    public String getNum() {
        return num;
    }
    

    /**Méthode qui défini le numéro de sécurité sociale
     * @param le numéro de sécurité à définir
     */
    public void setNum(String num) {
        this.num = num;
    }
    
    /**
     * Méthode qui retourne le numéro de sécu sous la forme d'une chaîne de caractère
     * @return une chaîne de caractère
     */
    public String toString(){
        return num;
    }
    
/**
 * Méthode qui retourne le numéro de sécurité pour un affichage plus jolie
 * @return une chaîne de caractère
 */    
    public String toStringBo(){
        return num.charAt(0)+" "+num.substring(1,3)+" "+num.substring(3,5)+" "+ num.substring(5,8)+" "+num.substring(8,11)+" "+num.substring(11,13);
    }
    
    /**
     * Méthode qui vérifie l'egalité entre 2 numéro de sécurité sociale
     * @param n le numéro à comparé 
     * @return un boolean en fonction de l'égalite
     */
    public boolean equals(NumDeSS n){
        return n.getNum().equals(this.num);
    }
    
    /**
     * Méthode qui verifie que le numéro de sécurité est correct
     * @param d la date d'anniversaire du patient
     * @return un boolean en fonction de la vérification
     */
    public boolean verifNumS(Date d){
        int ann = d.getAnnee()%100;
        int mois = d.getMois();
        boolean rep = false;
        if(this.num.length()==13){
            int sann=Integer.parseInt(this.num.substring(1,3));
            int smois=Integer.parseInt(this.num.substring(3,5));
            int depN=Integer.parseInt(this.num.substring(5,7));
            if((num.charAt(0)=='1'||num.charAt(0)=='2')&&sann==ann&&mois==smois&&depN>0&&depN<99){
                rep = true;
            }
        }
        return rep;
    }
  
}