package E_10_Vectores;

public class Vector {

   private double  []a;
    private double  []b;

    public Vector() {
    }
    public Vector(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }
    public void setA(double[] a) {
        this.a = a;
    }
    public void setB(double[] b) {
        this.b = b;
    }
    public double[] getA() {
        return a;
    }
    public double[] getB() {
        return b;
    }
    
}
