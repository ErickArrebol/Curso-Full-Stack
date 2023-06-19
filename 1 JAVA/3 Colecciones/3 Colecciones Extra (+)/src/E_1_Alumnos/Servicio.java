package E_1_Alumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alumno a = new Alumno();
    List<Alumno> lista = new ArrayList<>();

    public void Creacion() {
        int opcion = 0;
        Lista();
        do {
            System.out.println("________________________________");
            System.out.println("             MENU               ");
            System.out.println("0.-Dar de Alta otro Alumno"
                    + "\n1.-Dar de Alta otro Alumno"
                    + "\n2.-Dar de Baja otro Alumno"
                    + "\n3.-Modificar un Alumno"
                    + "\n4.-Lista ascendente X Apellido"
                    + "\n5.-Lista descendente X Nombre"
                    + "\n6.-Buscar Edad de un Alumno"
                    + "\n7.-Listas por Nacionalidad"
                    + "\n8.-Reporte Final de la Lista"
                    + "\n9.-Salir"
                    + "\n________________________________");
            System.out.print("Elige una opcion ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("--------------------------------");
                    System.out.println("          LISTA ACTUAL          ");
                    System.out.println("--------------------------------");
                    imprimirLista();
                    break;
                case 1:
                    Alta();
                    break;
                case 2:
                    Baja();
                    break;
                case 3:Modificacion();
                    break;
                case 4:
                    ordenAlfabéticoApellido();
                    break;
                case 5:
                    OrdenAlfabéticoNombre();
                    break;
                case 6:
                    FechaNacimiento();
                    break;
                case 7:
                    AlumnosPorNacionalidad();
                    break;
                case 8:
                    reporteFinal();
                    break;
                case 9:
                    System.out.println("FINAL DEL PROGRAMA");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 9);

    }

    //Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros , para no hacer 
    //carga manual de los datos)
    public void Lista() {
        Alumno alumno1 = new Alumno("Erick", "Garcia", "Argentina", 1, 12, 1995);
        lista.add(alumno1);
        Alumno alumno2 = new Alumno("Ana", "Pérez", "Chile", 10, 5, 1998);
        lista.add(alumno2);
        Alumno alumno3 = new Alumno("Carlos", "López", "Argentina", 3, 9, 1997);
        lista.add(alumno3);
        Alumno alumno4 = new Alumno("Laura", "Martínez", "Chile", 22, 7, 1996);
        lista.add(alumno4);
        Alumno alumno5 = new Alumno("Diego", "Rodríguez", "Argentina", 14, 3, 1999);
        lista.add(alumno5);
        Alumno alumno6 = new Alumno("Isabella", "Gómez", "Chile", 5, 11, 1997);
        lista.add(alumno6);
        Alumno alumno7 = new Alumno("Luis", "Fernández", "Argentina", 17, 2, 1998);
        lista.add(alumno7);
        Alumno alumno8 = new Alumno("Camila", "Silva", "Venezuela", 9, 6, 1996);
        lista.add(alumno8);
        Alumno alumno9 = new Alumno("Javier", "Torres", "Argentina", 12, 10, 1999);
        lista.add(alumno9);
        
        
        Alumno alumno10 = new Alumno("Valentina", "Morales", "Chile", 8, 4, 1997);
        lista.add(alumno10);
        
        lista.add(new Alumno("Martín", "Hernández", "Argentina", 25, 1, 1995));
        lista.add(new Alumno("Gabriela", "Lara", "Venezuela", 6, 7, 1998));
        lista.add(new Alumno("Santiago", "Mendoza", "Argentina", 19, 11, 1997));
        lista.add(new Alumno("Carolina", "González", "Chile", 2, 3, 1999));
        lista.add(new Alumno("Matías", "Pérez", "Argentina", 14, 8, 1996));
        lista.add(new Alumno("Alejandra", "Sánchez", "Venezuela", 7, 5, 1997));
        lista.add(new Alumno("Pablo", "Díaz", "Argentina", 23, 9, 1995));
        lista.add(new Alumno("Florencia", "Rojas", "Chile", 10, 12, 1998));
        lista.add(new Alumno("Ignacio", "Gutierrez", "Argentina", 5, 6, 1999));
        lista.add(new Alumno("María", "Chavez", "Venezuela", 30, 4, 1996));
    }

    public void imprimirLista() {
        for (Alumno pais : lista) {
            System.out.println("Nombre: " + pais.getNombre() + " " + pais.getApellido()
                    + "\nNacionalidad: " + pais.getNacionalidad()
                    + "\nFecha De Nacimiento: " + pais.getDia() + "/" + pais.getMes() + "/" + pais.getAnio());
            System.out.println("");
        }
        System.out.println("--------------------------------");
    }

    //Crear métodos de A(Alata) que manipulen los objetos de este tipo.
    public void Alta() {
        System.out.println("\nDar de Altas mas Alumnos");
        int i = 6;
        while (true) {
            System.out.println("Ingresa los datos del alumno");
            System.out.print("Nombre : ");
            String nombre = leer.next();
            System.out.print("Apellido: ");
            String apellido = leer.next();
            System.out.print("Nacionalidad: ");
            String nacionalidad = leer.next();
            System.out.print("Dia: ");
            int dia = leer.nextInt();
            System.out.print("Mes: ");
            int mes = leer.nextInt();
            System.out.print("Año: ");
            int anio = leer.nextInt();
            Alumno alumnoi = new Alumno(nombre, apellido, nacionalidad, dia, mes, anio);
            lista.add(alumnoi);
            i++;
            System.out.println("Deseas agregar otro alumno si(cualquier caracter) No(n)");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("N")) {
                break;
            }
            imprimirLista();
        }

    }

    //Crear los métodos B (Baja) que manipulen los objetos de este tipo.
    public void Baja() {
        System.out.println("\nDar de Baja Alumnos");
        System.out.print("Igresa el nombre del alumno: ");
        String nombre = leer.next();
        for (int i = 0; i < lista.size(); i++) {
            String alumno = lista.get(i).getNombre();
            if (alumno.equalsIgnoreCase(nombre)) {
                lista.remove(i);
            }
        }
        imprimirLista();
    }

    //Crear los métodos M (modificación) que manipulen los objetos de este tipo.
    public void Modificacion() {
        System.out.println("\nModificar Datos");
        System.out.print("Ingresa el nombre del alumno: ");
        String nombre = leer.next();
        
        int opcion = 0,contador=0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                contador++;
                do {
                    System.out.println("Que deseas modificar:"
                            + "\n1.Nombre"
                            + "\n2.Apellido"
                            + "\n3.Nacionalidad"
                            + "\n4.Dia"
                            + "\n5.Mes"
                            + "\n6.Año"
                            + "\n7.Salir");
                    System.out.print("Elige una opcion: ");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:System.out.print("Nombre: ");
                        lista.get(i).setNombre(leer.next());
                            break;
                        case 2:System.out.print("Apellido: ");
                            lista.get(i).setApellido(leer.next());
                            break;
                        case 3:System.out.print("Nacionalidad: ");
                        lista.get(i).setNacionalidad(leer.next());
                            break;
                        case 4:System.out.print("Dia: ");
                        lista.get(i).setDia(leer.nextInt());
                            break;
                        case 5:System.out.print("Mes: ");
                        lista.get(i).setMes(leer.nextInt());
                            break;
                        case 6:System.out.print("Año: ");
                        lista.get(i).setAnio(leer.nextInt());
                            break;
                        case 7:
                            System.out.println("Salir");
                            break;
                        default:
                            break;
                    }
                } while (opcion !=7);
                if(opcion==7){
                    break;
                }
            } 
        }
        if(contador==0){
            System.out.println("El Alumno no se encuentra en la lista");
        }

    }

    //Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su apellido de forma ascendente.
    public void ordenAlfabéticoApellido() {
        System.out.println("Orden Alfabetico Sugun apellidos");
        Collections.sort(lista, new Comparator<Alumno>() {

            public int compare(Alumno l1, Alumno l2) {
                return l1.getApellido().compareTo(l2.getApellido());
            }

        });
        imprimirLista();
    }

    //Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su nombre de forma descendente
    public void OrdenAlfabéticoNombre() {
        System.out.println("\nOrden Alfabetico Sugun Nombre");
        Collections.sort(lista, new Comparator<Alumno>() {

            public int compare(Alumno l1, Alumno l2) {
                return l2.getNombre().compareTo(l1.getNombre());
            }

        });
        imprimirLista();
    }

    //Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo nombre y apellido), mostrar 
    //por pantalla su edad. Considerar, el manejo de fechas, utilizando el atributo fecha de nacimiento.
    public void FechaNacimiento() {
        System.out.println("\nEdad del alumno");
        System.out.print("Ingresa el nombre del alumno que deseas sabes su Edad:");
        String dato = leer.next();
        int edad;
        for (Alumno alumno : lista) {
            if (alumno.getNombre().equalsIgnoreCase(dato)) {
                Date fecha = new Date(alumno.getAnio() - 1900, alumno.getMes() - 1, alumno.getDia());
                Date fechaactual = new Date();
                if (fechaactual.getMonth() < fecha.getMonth() && fechaactual.getDay() < fecha.getDay()) {
                    edad = (fechaactual.getYear() - fecha.getYear()) - 1;
                } else {
                    edad = (fechaactual.getYear() - fecha.getYear());
                }

                System.out.println("La edad de " + alumno.getNombre() + " " + alumno.getApellido() + " es: " + edad + " años");
            }
        }
    }

    //Crear listas paralelas de Alumnos, según la nacionalidad
    //ARGENTINA – CHILENA – VENEZOLANA
    public void AlumnosPorNacionalidad() {
        System.out.println("\nAlumnos Ordenados Por nacionalidad");
        List<Alumno> ar = new ArrayList<>();
        List<Alumno> ch = new ArrayList<>();
        List<Alumno> ve = new ArrayList<>();
        for (Alumno l : lista) {
            if (l.getNacionalidad().equalsIgnoreCase("argentina")) {
                ar.add(l);
            } else if (l.getNacionalidad().equalsIgnoreCase("chile")) {
                ch.add(l);
            } else {
                ve.add(l);
            }
        }
        System.out.println("------------------------------");
        System.out.println("Argentina");
        for (Alumno pais : ar) {
            System.out.println("Nombre: " + pais.getNombre()
                    + " " + pais.getApellido() + "\nNacionalidad: "
                    + pais.getNacionalidad() + "\nFecha De Nacimiento: "
                    + pais.getDia() + "/" + pais.getMes() + "/" + pais.getAnio());
        }
        System.out.println("------------------------------");
        System.out.println("Chile");
        for (Alumno pais : ch) {
            System.out.println("Nombre: " + pais.getNombre()
                    + " " + pais.getApellido() + "\nNacionalidad: "
                    + pais.getNacionalidad() + "\nFecha De Nacimiento: "
                    + pais.getDia() + "/" + pais.getMes() + "/" + pais.getAnio());
        }
        System.out.println("------------------------------");
        System.out.println("Venezuela");
        for (Alumno pais : ve) {
            System.out.println("Nombre: " + pais.getNombre()
                    + " " + pais.getApellido() + "\nNacionalidad: "
                    + pais.getNacionalidad() + "\nFecha De Nacimiento: "
                    + pais.getDia() + "/" + pais.getMes() + "/" + pais.getAnio());
        }
    }

    //Realizar un reporte final de datos que informe:
    //o Cuantos alumnos son mayores de 25 años.
    //o Cuantos alumnos tiene su apellido que comienzan con letra L o P
    //o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA
    public void reporteFinal() {
        System.out.println("\nReporte Final ");
        int contadorEdad = 0, contaL = 0, contaP = 0, edad;
        int argentina = 0, chile = 0, venezuela = 0;

        for (Alumno alumno : lista) {

            Date fecha = new Date(alumno.getAnio() - 1900, alumno.getMes() - 1, alumno.getDia());
            Date fechaactual = new Date();
            if (fechaactual.getMonth() < fecha.getMonth() && fechaactual.getDay() < fecha.getDay()) {
                edad = (fechaactual.getYear() - fecha.getYear()) - 1;
            } else {
                edad = (fechaactual.getYear() - fecha.getYear());
            }
            if (edad > 25) {
                contadorEdad++;
            }

            if (alumno.getApellido().startsWith("L")) {
                contaL++;
            }
            if (alumno.getApellido().startsWith("P")) {
                contaP++;
            }

            switch (toUpperCase(alumno.getNacionalidad())) {
                case "ARGENTINA":
                    argentina++;
                    break;
                case "CHILE":
                    chile++;
                    break;
                case "VENEZUELA":
                    venezuela++;
                    break;

            }
        }

        System.out.println("Son " + contadorEdad + " Mayores a 25");
        System.out.println("Son " + contaL + " alumnos que su apellido empeiza por L");
        System.out.println("Son " + contaP + " alumnos que su apellido empeiza por P");
        System.out.println("Son " + argentina + " alumnos con nacionalidad Argentina");
        System.out.println("Son " + chile + " alumnos con nacionalidad Chile");
        System.out.println("Son " + venezuela + " alumnos con nacionalidad Venezuela");
    }
}
