package E_05_Cuenta;

/* @author Erick*/

public class Cuenta {
    
    private int nCuenta;
    private long DNI;
    private int salActual;

    public Cuenta() {
    }
    public Cuenta(int nCuenta, long DNI, int salActual) {
        this.nCuenta = nCuenta;
        this.DNI = DNI;
        this.salActual = salActual;
    }
    public int getnCuenta() {
        return nCuenta;
    }
    public long getDNI() {
        return DNI;
    }
    public int getSalActual() {
        return salActual;
    }
    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    public void setSalActual(int salActual) {
        this.salActual = salActual;
    }
     
}
