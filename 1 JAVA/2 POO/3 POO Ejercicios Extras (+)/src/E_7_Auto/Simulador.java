/*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo. */
package E_7_Auto;

import java.util.Scanner;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio iniciarS = new Servicio();
        Auto objeto1 = iniciarS.cargarFichaAuto();
        System.out.println(objeto1.toString());
        System.out.println("");
        int op=0;
        String opcion="";
        do {
            System.out.print("Deseas cambiar de titular si(s) o  no(n) ");
            opcion = leer.next();
            if(opcion.equalsIgnoreCase("S")){
            iniciarS.modifiqueLaTitularidad(objeto1);
                op=1;
            } else if (opcion.equalsIgnoreCase("N")){
                op=1;
            }else{
                System.out.println("opcion invalida");
            }
        } while (op!=1);
        iniciarS.trayectoRecorrido(objeto1);
        System.out.println("El auto necesita Servicio? "+iniciarS.necesitaService(objeto1));
        System.out.println("");
        System.out.println(objeto1.toString());
    }
    
}
