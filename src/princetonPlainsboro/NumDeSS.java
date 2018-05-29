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
public class NumDeSS {
    private int num[];
    public NumDeSS(int num[]){
        if(num.length==13&&(num[0]==1||num[0]==2)&&num[1]>=0&&num[1]<10&&num[2]>=0&&num[2]<10&&num[3]>=0&&num[3]<10&&num[4]>=0&&num[4]<10&&num[3]*10+num[4]>0&&num[3]*10+num[4]<13&&num[5]>=0&&num[5]<10&&num[6]>=0&&num[6]<10&&num[5]*10+num[6]<99&&num[7]>=0&&num[7]<10&&num[8]>=0&&num[8]<10&&num[9]>=0&&num[9]<10&&num[10]>=0&&num[10]<10&&num[11]>=0&&num[11]<10&&num[12]>=0&&num[12]<10){
            this.num=num;
        }
    }
    public String toString(){
        String s="";
        for(int i=0; i<num.length;i++){
            s+=num[i];
        }
        return s;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int[] num) {
        this.num = num;
    }
}
