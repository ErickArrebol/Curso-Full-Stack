package E_1_Fraccion;

public class Fraccion {
    
    private int den1;
    private int numer1;
    private int den2;
    private int numer2;

    public Fraccion() {
    }
    public Fraccion(int den1, int numer1, int den2, int numer2) {
        this.den1 = den1;
        this.numer1 = numer1;
        this.den2 = den2;
        this.numer2 = numer2;
    }
    public int getDen1() {
        return den1;
    }
    public int getNumer1() {
        return numer1;
    }
    public int getDen2() {
        return den2;
    }
    public int getNumer2() {
        return numer2;
    }
    public void setDen1(int den1) {
        this.den1 = den1;
    }
    public void setNumer1(int numer1) {
        this.numer1 = numer1;
    }
    public void setDen2(int den2) {
        this.den2 = den2;
    }
    public void setNumer2(int numer2) {
        this.numer2 = numer2;
    }
    
    
}
