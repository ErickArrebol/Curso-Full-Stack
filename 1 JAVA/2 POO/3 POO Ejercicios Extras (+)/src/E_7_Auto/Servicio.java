/*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.*/
package E_7_Auto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Servicio {
    
    public Auto cargarFichaAuto(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa el nombre ");
        String nombre = leer.next();
        System.out.print("Ingresa la fecha (dd/MM/yy) ");
        String f1 = leer.next();
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate fecha = LocalDate.parse(f1, f2);
        System.out.print("Ingresa el color del Auto ");
        String color = leer.next();
        System.out.print("Ingresa el modelo del Auto ");
        String modelo = leer.next();
        System.out.println("");
        Auto objetoA = new Auto(nombre, fecha, color, modelo);

        return objetoA;
    }
    public void modifiqueLaTitularidad(Auto objetoA){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa el nombre de nuevo titular del auto ");
        objetoA.setNombre(leer.next()); 
    }
    public void trayectoRecorrido(Auto objetoA){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Indica una trayectoria recorrida ");
        int recorrido = leer.nextInt();
        objetoA.setKmMotor(objetoA.getKmMotor()+recorrido);
    }
    public boolean necesitaService(Auto objetoA) {
        return objetoA.getKmMotor() >= 10000;
    }
}
