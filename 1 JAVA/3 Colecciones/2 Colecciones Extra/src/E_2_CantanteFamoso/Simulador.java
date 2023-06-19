/*Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios*/
package E_2_CantanteFamoso;

import java.util.Scanner;


/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio iniciarS = new Servicio();
        iniciarS.crearCantante();
        iniciarS.mostrarTodosLosCantantes();
        int op;
        do {
            System.out.println(" --------  M E N U  -------- ");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion ");
            op = leer.nextInt();
            switch (op) {
                case 1:iniciarS.agregarCantante();
                    break;
                case 2:iniciarS.mostrarTodosLosCantantes();
                    break;
                case 3:iniciarS.eliminarCantante();
                    break;
                case 4:System.out.println("---- F I N   D E L   P R O G R A M N A ---");
                    break;
                default:System.out.println("opcio invalida");                
                    break;
            }            
        } while (op!=4);
        
            
        
    }
    
}
