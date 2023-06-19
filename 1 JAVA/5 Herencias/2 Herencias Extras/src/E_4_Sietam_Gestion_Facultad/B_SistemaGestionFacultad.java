/*Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.*/
package E_4_Sietam_Gestion_Facultad;

/*@author Erick*/
public class B_SistemaGestionFacultad {
    protected String nombre;
    protected String apellido;
    protected int  identificacion;
    protected String estadoCivil;

    public B_SistemaGestionFacultad(String nombre, String apellido, int identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "B_SistemaGestionFacultad{" + "nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", estadoCivil=" + estadoCivil + '}';
    }

    
    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
        System.out.println("Se ha cambiado el estado civil de " + nombre + " " + apellido + " a " + nuevoEstadoCivil);
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Número de identificación: " + identificacion);
        System.out.println("Estado civil: " + estadoCivil);
    }
    
}
