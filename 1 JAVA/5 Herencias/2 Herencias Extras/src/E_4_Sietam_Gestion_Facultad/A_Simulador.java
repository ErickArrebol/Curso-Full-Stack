/*Calse Padre
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.

Calse Hijo Empleado de Sistema Gestión Facultad
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.

Calse hijo Estudiante de Sistema Gestión Facultad
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.

Clese hija de Empleado
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).

Clese hija de Empleado
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).

El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
//Metodos
• Cambio del estado civil de una persona.<------clase padre Sistema Gestión Facultad
• Reasignación de despacho a un empleado.<------Calse Hijo Empleado de Sistema Gestión Facultad
• Matriculación de un estudiante en un nuevo curso.<------Calse hijo Estudiante de Sistema Gestión Facultad
• Cambio de departamento de un profesor.<------Clese hija de Empleado
• Traslado de sección de un empleado del personal de servicio.<------Clese hija de Empleado
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba<-----ArrayList en Main
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.*/
package E_4_Sietam_Gestion_Facultad;

import java.util.ArrayList;
import java.util.Scanner;

/*@author Erick*/
public class A_Simulador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio iniciarS = new Servicio();
        Listas iniciarL = new Listas();
        ArrayList<B_SistemaGestionFacultad> personas = iniciarL.crearlistas();
        
        int contS = 0, contP = 0, contE = 0;
        for (B_SistemaGestionFacultad aux : personas) {
            if (aux instanceof PresonalServicio) {
                if (contS == 0) {
                    System.out.println("");
                    System.out.println("------ Personal de Servicio ------");
                    contS++;
                }
                aux.imprimirInformacion();
                    System.out.println("-----------------------------------");
            }
            if (aux instanceof Profesores) {
                if (contP == 0) {
                    System.out.println("");
                    System.out.println("----------- Profesores ----------");
                    contP++;
                }
                aux.imprimirInformacion();
                    System.out.println("-----------------------------------");
            }
            if (aux instanceof Estudiante) {
                if (contE == 0) {
                    System.out.println("");
                    System.out.println("------------ Alumnos -------------");
                    contE++;
                }
                aux.imprimirInformacion();
                    System.out.println("-----------------------------------");
            }
        }
        System.out.println("");
        int opcion;
        do {
            System.out.println("--- Menu para Editar---");
            System.out.println("1.- Profesores");
            System.out.println("2.- Personas de Servicio");
            System.out.println("3.- Estudiante");
            System.out.println("4.- Salir");
            System.out.print("Elige una Opcion  ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    for (B_SistemaGestionFacultad aux : personas) {
                        if (aux instanceof Profesores) {
                            System.out.println(aux.getNombre());
                        }
                    }  
                    System.out.println("A quine deseas editar");
                    String nombreP = leer.next();
                    for (B_SistemaGestionFacultad aux : personas) {
                        if (aux instanceof Profesores) {
                            if(aux.getNombre().equalsIgnoreCase(nombreP)){
                                System.out.println("A donde se trasladara el empleado ");
                                int seccion= leer.nextInt();
                                ((Profesores) aux).reasignarDespacho(seccion);
                            }
                        }
                    } 
                    break;
                case 2:
                    for (B_SistemaGestionFacultad aux : personas) {
                        if (aux instanceof PresonalServicio) {
                            System.out.println(aux.getNombre());
                        }
                    }   
                    System.out.println("A quine deseas editar");
                    String nombrePS = leer.next();
                    for (B_SistemaGestionFacultad aux : personas) {
                        if (aux instanceof PresonalServicio) {
                            if(aux.getNombre().equalsIgnoreCase(nombrePS)){
                                System.out.println("A donde se trasladara el empleado ");
                                String traslado = leer.next();
                                ((PresonalServicio) aux).trasladarSeccion(traslado);
                            }
                        }
                    }
                    break;
                case 3:
                    for (B_SistemaGestionFacultad aux : personas) {
                        if (aux instanceof Estudiante) {
                            System.out.println(aux.getNombre());
                        }
                    }
                    System.out.println("A quine deseas editar");
                    String nombre = leer.next();
                    for (B_SistemaGestionFacultad aux : personas) {
                        if (aux instanceof Estudiante) {
                            if(aux.getNombre().equalsIgnoreCase(nombre)){
                                System.out.print("Ingresa el nombre del nuevo curso ");
                                String curso = leer.next();
                                ((Estudiante) aux).matricularEnCurso(curso);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("---   F I N    D E L   P R O G R A M A   ---");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 4);

    }

}
