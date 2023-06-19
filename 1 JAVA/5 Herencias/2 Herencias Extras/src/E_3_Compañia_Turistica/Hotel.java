package E_3_Compañia_Turistica;

/*@author Erick */
public class Hotel extends CompaniaTuristica{
    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected double precioHabitacion;
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Hotel() {
    }
    public Hotel(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, String nombre, String direcion, String localidad, String gerente) {
        super(nombre, direcion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
    }
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }
    public int getNumeroCamas() {
        return numeroCamas;
    }
    public int getCantidadPisos() {
        return cantidadPisos;
    }
    public double getPrecioHabitacion() {
        return precioHabitacion;
    }
    
    @Override
    public String toString() {
        return "Hotel{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
   
}
