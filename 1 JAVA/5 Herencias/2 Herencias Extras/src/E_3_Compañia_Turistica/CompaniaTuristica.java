package E_3_Compañia_Turistica;

/**@author Erick */
public class CompaniaTuristica {
    protected String nombre;
    protected String direcion;
    protected String localidad;
    protected String gerente;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public CompaniaTuristica() {
    }
    public CompaniaTuristica(String nombre, String direcion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direcion = direcion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
      public String getNombre() {
        return nombre;
    }
    public String getDirecion() {
        return direcion;
    }
    public String getLocalidad() {
        return localidad;
    }
    public String getGerente() {
        return gerente;
    }
    @Override
    public String toString() {
        return "CompaniaTuristica{" + "nombre=" + nombre + ", direcion=" + direcion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
   
  
 
    
}
