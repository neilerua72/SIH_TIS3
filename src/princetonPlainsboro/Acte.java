package princetonPlainsboro;

class Acte {

    /**
     * @return the code
     */
    public Code getCode() {
        return code;
    }

    /**
     * @return the coef
     */
    public int getCoef() {
        return coef;
    }
    public String getCoefS(){
        return ""+coef;
    }
    private Code code;
    private int coef;
    
    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        }
    
    public String toString() {
        return getCode().toString() + ", coefficient : " + getCoef();
        }
    
    public double cout() {
        return getCode().calculerCout(getCoef());
        }
    
    //test 29
    
    }
