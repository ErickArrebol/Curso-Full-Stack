package E_3_Compañia_Turistica;

/*@author Erick */
public class Camping extends ExtraHoteles{
    private int capacidadMaximaCarpas;
    private int cantidadBanos;
    private boolean tieneRestaurante;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Camping(int capacidadMaximaCarpas, int cantidadBanos, boolean tieneRestaurante, boolean privado, int metrosCuadrados, String nombre, String direcion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direcion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }
    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }  
////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "capacidad Maxima de Carpas [" + capacidadMaximaCarpas + "], cantidad de Banos [" + cantidadBanos + "], tiene Restaurante [" + tieneRestaurante + ']';
    }

    
    
}
