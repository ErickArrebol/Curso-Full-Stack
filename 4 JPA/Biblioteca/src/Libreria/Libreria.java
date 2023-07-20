package Libreria;

import Servicios.ServicioAutor;
import Servicios.ServicioEditorial;
import Servicios.ServicioLibro;
import java.util.Scanner;

/*@author Erick*/

public class Libreria {

    public static void main(String[] args) {

        ServicioAutor sa = new ServicioAutor();
        ServicioEditorial se = new ServicioEditorial();
        ServicioLibro sl = new ServicioLibro();
        int op = 0;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("------ M E N U -----");
                System.out.println("1.- Agregar Autor");
                System.out.println("2.- Agregar Editorial");
                System.out.println("3.- Agregar Libro");
                System.out.println("4.- Dar de baja un Editorial");
                System.out.println("5.- Dar de baja un Autor");
                System.out.println("6.- Dar de baja un Libro");
                System.out.println("7.- Buscar Autor por nombre");
                System.out.println("8.- Buscar libro por ISBN");
                System.out.println("9.- Buscar libro por Nombre de Autor");
                System.out.println("10.- Buscar libro por Nombre de Editorial");
                System.out.println("11.- Salir");
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    default:
                        System.out.println("--- OPCION INVALIDA");
                        break;
                }
            } catch (Exception e) {
                System.out.println("--ERROR-- " + e);
            }

        } while (true);

    }

}
