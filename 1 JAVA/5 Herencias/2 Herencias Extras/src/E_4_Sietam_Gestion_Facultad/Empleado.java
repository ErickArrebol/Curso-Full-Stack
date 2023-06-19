/*Calse Hijo Empleado de Sistema Gestión Facultad
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.*/
package E_4_Sietam_Gestion_Facultad;

/*@author Erick*/
public class Empleado extends B_SistemaGestionFacultad{
    protected int anioIncorporacion;
    protected int numeroDespacho;

    public Empleado(int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }
    
    public void reasignarDespacho(int nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
        System.out.println("Se ha reasignado el despacho de " + nombre + " " + apellido + " al despacho " + nuevoDespacho);
    }
}
