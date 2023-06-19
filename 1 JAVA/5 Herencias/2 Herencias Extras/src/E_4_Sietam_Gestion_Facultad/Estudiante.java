/*Calse hijo Estudiante de Sistema Gestión Facultad
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.*/
package E_4_Sietam_Gestion_Facultad;

/*@author Erick*/
public class Estudiante extends B_SistemaGestionFacultad{
    
    protected String nombreCurso;

    public Estudiante(String nombreCurso, String nombre, String apellido, int identificacion, String estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.nombreCurso = nombreCurso;
    }
    
    public void matricularEnCurso(String nuevoCurso) {
        this.nombreCurso = nuevoCurso;
        System.out.println("Se ha matriculado a " + nombre + " " + apellido + " en el curso " + nuevoCurso);
    }
}
