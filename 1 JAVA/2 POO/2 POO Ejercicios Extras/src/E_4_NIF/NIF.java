package E_4_NIF;

public class NIF {
    
    private long numeroDNI;
    private String letra;

    public NIF() {
    }

    public NIF(long numeroDNI, String letra) {
        this.numeroDNI = numeroDNI;
        this.letra = letra;
    }
    
    public long getNumeroDNI() {
        return numeroDNI;
    }
    public String getLetra() {
        return letra;
    }
    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    @Override
    public String toString() {
        return "NIF{" + "numeroDNI=" + numeroDNI + ", letra=" + letra + '}';
    }

}
