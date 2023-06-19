package E_2_Tiempo;

public class Tiempo {
    
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
    }
    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public int getHora() {
        return hora;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
}
