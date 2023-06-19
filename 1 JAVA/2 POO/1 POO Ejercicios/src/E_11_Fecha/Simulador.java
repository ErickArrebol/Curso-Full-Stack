/*Clase Date
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
package E_11_Fecha;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        
        // OPCION 1
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa la fecha ");
        System.out.print("Dia ");
        int dia = leer.nextInt();
        System.out.print("Mes ");
        int mes = leer.nextInt();
        System.out.print("Año ");
        int anio = leer.nextInt();
        Date fechaNacimeinto = new Date(anio - 1900, mes, dia);//fecha ingresa por consola
        Date fechaActual = new Date();//fecha tomada de la compu
        if (fechaActual.getMonth() < fechaNacimeinto.getMonth() && fechaActual.getDay() < fechaNacimeinto.getDay()) {
            int edad = (fechaActual.getYear() - fechaNacimeinto.getYear()) - 1;
            System.out.println("La edad es de " + edad + " años");
        } else {
            int edad = (fechaActual.getYear() - fechaNacimeinto.getYear());
            System.out.println("La edad es de " + edad + " años");
        }
        
        
        // OPCION 2
//        System.out.println("Ingresa la fecha ");
//        System.out.print("Dia ");
//        int dia = leer.nextInt();
//        System.out.print("Mes ");
//        int mes = leer.nextInt();
//        System.out.print("Año ");
//        int anio = leer.nextInt();
//        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
//        LocalDate fechaActual = LocalDate.now();
//        Period periodo = Period.between(fechaNacimiento, fechaActual);// Calcula la diferencia entre las dos fechas
//        int edad = periodo.getYears();// Obtiene la edad
//        System.out.println("La edad es: " + edad + " años.");
    }
    
}
