package E_14_Movil;

import java.util.Arrays;
import java.util.Scanner;

public class Servicio {

    public void cargarCelular(Movil movil) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa la martca del movil ");
        movil.setMarca(leer.nextLine());
        System.out.print("Ingresa el precio ");
        movil.setPrecio(leer.nextDouble());
        System.out.print("Ingresa el modelo ");
        movil.setModelo(leer.next());
        System.out.print("Ingresa la memoria ram que trae ");
        movil.setMemoriaRam(leer.nextInt());
        System.out.print("Ingresa la cantidad GB de almacenamiento ");
        movil.setAlmacenamiento(leer.nextInt());
        movil.setCodigo(ingresarCodigo());

    }

    //Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
    //números de un celular. Para ello, puede utilizarse un bucle repetitivo
    public String[] ingresarCodigo() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String [] vector = new String[7];
        String codigo="";
        do {
            System.out.println("Ingresa 7 numero del codigo");
            codigo = leer.next();
        } while (codigo.length()!=7);
        vector=codigo.split(""); //Este funcion split sirve para meter a un vector una frase en una linea

        return vector;
    }

    public void impirmirDatos(Movil movil) {
        System.out.println("--------------------------------");
        System.out.println("- DATOS DE MOVIL");
        System.out.println("- Marca: " + movil.getMarca());
        System.out.println("- Precio: " + movil.getPrecio());
        System.out.println("- Modelo: " + movil.getModelo());
        System.out.println("- Meroria Ram: " + movil.getMemoriaRam());
        System.out.println("- Almacenamiento: " + movil.getAlmacenamiento());
        System.out.println("- Codigo " + Arrays.toString(movil.getCodigo()));
        System.out.println("--------------------------------");
    }
}
