package E_3_DivisionNumeroClasesExcepciones;

public class DivisionNumero extends Exception {
    
    public DivisionNumero() {
    }

    public DivisionNumero(String msg) {
        super(msg);
    }
    public void crearDivicion(int n1,int n2){
        if (n2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        System.out.println("La divisionde los numeros es "+(n1/n2));
    }
}
