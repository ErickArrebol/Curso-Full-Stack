/*Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos*/
package E_4_CodigosPostales;

import java.util.Scanner;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio s = new Servicio();
        s.crearCodigosPostales();
        s.agregar10CodigosPostales();
        int op;
        do {
            System.out.println("------ MENU ------");
            System.out.println("1.- Ver lista");
            System.out.println("2.- Buscar ciudad");
            System.out.println("3.- Agregar ciudad");
            System.out.println("4.- Eliminar Ciudad");
            System.out.println("5.- Salir");
            System.out.print("Elige una opcion ");
            op = leer.nextInt();
            switch (op) {
                case 1:s.imrpimirListas();
                    break;
                case 2:s.buscarCiuidad();
                    break;
                case 3:s.agregarCiuadad();
                    break;
                case 4:s.eliminarCiudad();
                    break;
                case 5:System.out.println("F I N   D E L   P R O G R A M A");
                    break;
                default:System.out.println("Opcion invalida");                  
                    break;
            }             
        } while (true);
        
        

        
    } 
}
