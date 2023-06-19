package E_3_DivisionNumero;

public class DivisionNumero {

    private int n1;
    private int n2;

    public DivisionNumero() {
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public void crearDivicion(){
        System.out.println("La divisionde los numeros es "+(n1/n2));
    }
}
