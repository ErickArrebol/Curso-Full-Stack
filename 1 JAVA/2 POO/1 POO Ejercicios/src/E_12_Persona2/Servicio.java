package E_12_Persona2;

import java.util.Date;
import java.util.Scanner;

public class Servicio {

    public void crearPersona(Persona iniciarP) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa el nombre ");
        iniciarP.setNombre(leer.next());
        System.out.println("Ingresa la fecha ");
        System.out.print("Dia ");
        int dia = leer.nextInt();
        System.out.print("Mes ");
        int mes = leer.nextInt();
        System.out.print("Año ");
        int anio = leer.nextInt();
        Date fechaNacimeinto = new Date(anio - 1900, mes, dia);
        iniciarP.setFechaNaciemiento(fechaNacimeinto);
    }

    public int calcularEdad(Persona iniciarP) {
        int edad;
        Date fechaNacimeinto = iniciarP.getFechaNaciemiento();
        Date fechaActual = new Date();
        if (fechaActual.getMonth() < fechaNacimeinto.getMonth() && fechaActual.getDay() < fechaNacimeinto.getDay()) {
            edad = (fechaActual.getYear() - fechaNacimeinto.getYear()) - 1;
        } else {
            edad = (fechaActual.getYear() - fechaNacimeinto.getYear());
        }
        return edad;
    }

    public boolean menorQue(int edad, Persona iniciarP) {
        int edadActual = calcularEdad(iniciarP);
        return edadActual < edad;
    }

    public void mostrarPersona(Persona iniciarP) {
        System.out.println("Nombre: " + iniciarP.getNombre());
        System.out.println("Fecha de nacimiento: " + iniciarP.getFechaNaciemiento());
        System.out.println("Edad: " + calcularEdad( iniciarP) + " años");
    }
}
