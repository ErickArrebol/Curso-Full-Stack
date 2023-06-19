/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_4_Sietam_Gestion_Facultad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Listas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<B_SistemaGestionFacultad> crearlistas(){
      Servicio iniciarS = new Servicio();
        ArrayList<B_SistemaGestionFacultad> personas = new ArrayList<>();
        System.out.print("Cuatos maestros hay en la Facultad ");
        int profe = leer.nextInt();
        for (int i = 0; i < profe; i++) {
            Profesores objetoP = new Profesores(iniciarS.crearDepartamentos(), iniciarS.crearAnio(), iniciarS.crearNumeroDespacho(), iniciarS.crearNombre(), iniciarS.crearApellido(), iniciarS.crearIdentificacion(), iniciarS.crearEstadoCivil());
            personas.add(objetoP);
        }
        System.out.print("Cuatas personas de Servicio hay en la Facultad ");
        int servi = leer.nextInt();
        for (int i = 0; i < servi; i++) {
            personas.add(new PresonalServicio(iniciarS.crearSeccion(), iniciarS.crearAnio(), iniciarS.crearNumeroDespacho(), iniciarS.crearNombre(), iniciarS.crearApellido(), iniciarS.crearIdentificacion(), iniciarS.crearEstadoCivil()));
        }
        System.out.print("Cuatos alumnos hay en la Facultad ");
        int alumno = leer.nextInt();
        for (int i = 0; i < alumno; i++) {
            Estudiante objetoE = new Estudiante(iniciarS.crearNombreCurso(), iniciarS.crearNombre(), iniciarS.crearApellido(), iniciarS.crearIdentificacion(), iniciarS.crearEstadoCivil());
            personas.add(objetoE);
        }  
        return personas ;
    }
        
}
