package E_01_Libro;
import java.util.Scanner;

/*@author Erick*/

public class Servicio {
    
    public Libro crearLibro(){
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("---------------");
        System.out.println("DATOS DEL LIBRO");
        System.out.println("---------------");
        System.out.print("Ingresa el ISBN ");
        libro.ISBN=leer.nextInt();
        System.out.print("Ingresa el Titullo del libro ");
        libro.autor=leer.next();
        System.out.print("Ingresa el Autor del libro ");
        libro.autor=leer.next();
        System.out.print("Ingresa el numero de paginas ");
        libro.nPaginas=leer.nextInt();
        return libro;
    }
    
}
