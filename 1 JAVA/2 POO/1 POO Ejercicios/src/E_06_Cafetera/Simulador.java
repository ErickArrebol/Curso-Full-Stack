/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
package E_06_Cafetera;
import java.util.Scanner;

/*@author Erick*/

public class Simulador {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion;
        Servicio iniciarS = new Servicio();
        Cafetera llenado= iniciarS.llenarCafetera();
        do {
            System.out.println("--------------------------");
            System.out.println("           MENU           ");
            System.out.println("1 - Datos de la Cafetera  "); 
            System.out.println("2 - Servir Cafe           "); 
            System.out.println("3 - Vaciar cafetera       "); 
            System.out.println("4 - Agregar Cafe          ");
            System.out.println("5 - SALIR                 "); 
            System.out.println("--------------------------"); 
            
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    iniciarS.llenarCafetera();
                    break;
                case 2:
                    iniciarS.servirTaza(llenado);
                    break;
                case 3:
                    iniciarS.vaciarCafetera(llenado);
                    break;
                case 4:
                    iniciarS.agregarCafe(llenado);
                    break;
                case 5:
                    System.out.println("Salinedo ................");
            }
            
        } while (opcion != 5);
        System.out.println("---------------------");
        System.out.println("Transacion Finalizada");
        System.out.println("---------------------");
    }
    
    
}
