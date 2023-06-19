package E_1_Cancion;

import java.util.Scanner;

public class Servicio {
    
    public Cancion llenarDatos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion datos = new Cancion();
        System.out.print("Ingresa el titulo de la cancion ");
        datos.setTitulo(leer.next());
        System.out.print("Ingresa el Autor ");
        datos.setAutor(leer.next());
        return datos;
    }
}
