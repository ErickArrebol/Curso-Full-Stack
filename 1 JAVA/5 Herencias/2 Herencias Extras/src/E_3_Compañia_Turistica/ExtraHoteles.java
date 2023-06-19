package E_3_Compañia_Turistica;

/*@author Erick*/
public class ExtraHoteles extends CompaniaTuristica{
    private boolean privado;
    private int metrosCuadrados;
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public ExtraHoteles() {
    }
    public ExtraHoteles(boolean privado, int metrosCuadrados, String nombre, String direcion, String localidad, String gerente) {
        super(nombre, direcion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }
    public boolean isPrivado() {
        return privado;
    }
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Extra Hoteles{" + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }

    


}
