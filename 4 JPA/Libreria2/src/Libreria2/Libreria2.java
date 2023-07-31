package Libreria2;

import Servicio.LibreriaServicio;
import java.util.Scanner;

/* @author Erick*/
public class Libreria2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibreriaServicio ls = new LibreriaServicio();
        int opcion =0 ;
        do {
            try {

                System.out.println("------- MENU PRINCIPAL -------");
                System.out.print("1.- Autor\n2.- Editorial\n3.- Libro\n4.- Busqueda\n5.- Cliente\n6.- Prestamo\n7.- Salir\nElige una opcion: ");
                opcion = leer.nextInt();
                System.out.println("");
                switch (opcion) {
                    case 1:
                        ls.autor();
                        break;
                    case 2:
                        ls.editorial();
                        break;
                    case 3:
                        ls.libro();
                        break;
                    case 4:
                        ls.busqueda();
                        break;
                    case 5:
                        ls.cliente();
                       break;
                    case 6:
                        ls.prestamo();
                        break;
                    case 7:
                        System.out.println("----- FIN DEL PROGRAMA -----");
                        break;
                    default:
                        System.out.println("--- Opcion Invalida ---");
                        break;
                }
            } catch (Exception e) {
                System.out.println("---------------------------------");
                System.out.println("-- ERROR INGRESA SOLO NUEMROS --");
                System.out.println("---------------------------------");
                System.out.println("");
                leer.next();
            }
        } while (opcion != 7);
    }

}
