package E_06_Cafetera;

/*@author Erick*/

public class Cafetera {
    
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public double getCantidadActual() {
        return cantidadActual;
    }
    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera\n" + "Capacidad Maxima: [" + capacidadMaxima + "], Cantidad Actual: [" + cantidadActual + "]";
    }
    
    
}
