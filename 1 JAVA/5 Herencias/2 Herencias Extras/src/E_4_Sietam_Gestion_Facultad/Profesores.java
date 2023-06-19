/*Clese hija de Empleado
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
*/
package E_4_Sietam_Gestion_Facultad;

/*@author Erick*/
public class Profesores extends Empleado {
    
    private String departamento;

    public Profesores(String departamento, int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, identificacion, estadoCivil);
        this.departamento = departamento;
    }
    
    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
        System.out.println("Se ha cambiado el departamento de " + nombre + " " + apellido + " a " + nuevoDepartamento);
    }
}
