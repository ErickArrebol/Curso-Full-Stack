package E_3_Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Servicio {
    
    List<Alumno> listaAlumnos = new ArrayList<>();

    public void crearRegistro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opcion = "";
        System.out.println("LLENADO DE REGISTRO");
        do {
            System.out.print("Ingresa el nombre del alumno: ");
            String nombre = leer.next();
            nombre=toUpperCase(nombre);
            System.out.println("Ingresa las 3 notas");
            List<Integer> notas = new ArrayList<>();
            int suma = 0, n;
            for (int i = 0; i < 3; i++) {
                System.out.print("Nota " + (i + 1) + "° ");
                n = leer.nextInt();
                suma += n;
            }
            notas.add((suma / 3));
            Alumno lista = new Alumno(nombre, notas);
            listaAlumnos.add(lista);
            System.out.print("Deseas agregar otro estudienate Si(cualquier caracter) No(n): ");
            opcion = leer.next();
            System.out.println("----------------------------------------------------------------");
        } while (!opcion.equalsIgnoreCase("N"));

    }

    public void notaFinal() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("NOTA FINAL ");
        System.out.print("Ingresa nombre del alumno: ");
        String nombre = leer.next();
        nombre=toUpperCase(nombre);
        boolean validacion = false;
        for (Alumno listado : listaAlumnos) {
            if (listado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("La Nota Final de " + listado.getNombre() + " es: " + listado.getNotas());
                validacion = true;
            }
        }
        if (validacion == false) {
            System.out.println("El alumno no se encuentra en la lista");
        }
    }
}
