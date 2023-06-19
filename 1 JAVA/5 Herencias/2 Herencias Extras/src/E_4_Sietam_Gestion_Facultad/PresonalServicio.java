/*Clese hija de Empleado
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).*/
package E_4_Sietam_Gestion_Facultad;

/*@author Erick*/
public class PresonalServicio extends Empleado{
    
    private String Seccion;

    public PresonalServicio(String Seccion, int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, identificacion, estadoCivil);
        this.Seccion = Seccion;
    }
    
    public void trasladarSeccion(String nuevaSeccion) {
        this.Seccion = nuevaSeccion;
        System.out.println("Se ha trasladado a " + nombre + " " + apellido + " a la sección " + nuevaSeccion);
    }
}
