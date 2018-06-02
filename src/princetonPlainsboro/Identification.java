/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *
 * @author desruea
 */
public class Identification {
    private String id;
    private String mdp;
    private String type;
    private String photo;
    public Identification(String id, String mdp){
        this.id=id;
        this.mdp=mdp;
    }

    public Identification(String id, String mdp, String type,String photo) {
        this.id = id;
        this.mdp = mdp;
        this.type = type;
        this.photo="/donnees/img/"+photo;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }
    
    
    public boolean equals(Identification id2){
        if(this.id.equals(id2.getId())&&this.mdp.equals(id2.getMdp())){
            return true;
        }
        else {
            return false;
        }
    }
    public String toString(){
        return "id : "+this.id+"/mdp :"+this.mdp;
    }
    public int Type(){
        if(id.charAt(0)=='1')
            return 1;
        else if(id.charAt(0)=='2')
            return 2;
        else
            return 0;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo ="/donnees/img/"+photo;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }
    
}
