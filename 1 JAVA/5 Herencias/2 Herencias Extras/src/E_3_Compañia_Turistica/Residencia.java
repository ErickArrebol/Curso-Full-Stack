package E_3_Compañia_Turistica;

/*@author Erick*/
public class Residencia extends ExtraHoteles{
    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean tieneCampoDeportivo;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Residencia(int cantidadHabitaciones, boolean descuentoGremios, boolean tieneCampoDeportivo, boolean privado, int metrosCuadrados, String nombre, String direcion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direcion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }
    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }
    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }
    
     @Override
    public String toString() {
        return "Cantidad de Habitaciones [" + cantidadHabitaciones + "], descuento a Gremios [" + descuentoGremios + "], tiene Campo Deportivo [" + tieneCampoDeportivo + ']';
    }

    
////////////////////////////////////////////////////////////////////////////////////////////////////////////

   
    
}
