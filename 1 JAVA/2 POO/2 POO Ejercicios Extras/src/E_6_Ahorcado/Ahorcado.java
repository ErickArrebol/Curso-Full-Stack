package E_6_Ahorcado;

public class Ahorcado {
    
    private String buscarp[];   
    private int letrasEcontradas;
    private int oportunidades;
    private int contador;

    public Ahorcado() {
    }
    public Ahorcado(String[] buscarp, int letrasEcontradas, int oportunidades, int contador) {
        this.buscarp = buscarp;
        this.letrasEcontradas = letrasEcontradas;
        this.oportunidades = oportunidades;
        this.contador = contador;
    }
    
    public String[] getBuscarp() {
        return buscarp;
    }
    public int getLetrasEcontradas() {
        return letrasEcontradas;
    }
    public int getOportunidades() {
        return oportunidades;
    }
    public int getContador() {
        return contador;
    }

    public void setBuscarp(String[] buscarp) {
        this.buscarp = buscarp;
    }
    public void setLetrasEcontradas(int letrasEcontradas) {
        this.letrasEcontradas = letrasEcontradas;
    }
    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
}

