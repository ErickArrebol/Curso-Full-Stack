package E_08_Cadena;

/*@author Erick*/

public class Cadena {
    
    private String frase;
    private int longitud;

    public Cadena() {
    }
    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    public String getFrase() {
        return frase;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    @Override
    public String toString() {
        return  "Frase (" + frase + "), Longitud (" + longitud + ")";
    }
    
}
