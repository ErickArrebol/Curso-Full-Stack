package E_4_CodigosPostales;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, String> lista = new HashMap<>();

    public void crearCodigosPostales() {
        lista.put("01292", "Alvaro Obregon");
        lista.put("03820", "Benito Juarez");
        lista.put("07058", "Gustavo A. Madero");
        lista.put("09870", "Iztapalapa");
        lista.put("11250", "Miguel Hidalgo");
        lista.put("13315", "Tlahuac");
        lista.put("15440", "Venustiano Carranza");
        lista.put("14739", "Tlalpan");
    }
    
    public void agregar10CodigosPostales(){
        System.out.println("Ingresa 5 códigos postales y ciudades:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Código Postal: ");
            String codigoPostal = leer.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = leer.nextLine();
            lista.put(codigoPostal, ciudad);
        }
    }
    public void imrpimirListas(){
        System.out.println("Datos introducidos:");
        for (Map.Entry<String, String> entry : lista.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
    }

    public void buscarCiuidad(){
        System.out.print("Ingresa un código postal para obtener la ciudad asociada: ");
        String Buscador = leer.nextLine();
        if (lista.containsKey(Buscador)) {
            System.out.println("Ciudad: " + lista.get(Buscador));
        } else {
            System.out.println("El código postal no existe en la lista.");
        }
    }
    
    public void agregarCiuadad(){
        System.out.print("Ingresa un nuevo código postal: ");
        String nuevoCodigoPostal = leer.nextLine();
        System.out.print("Ingresa la ciudad correspondiente: ");
        String nuevaCiudad = leer.nextLine();
        lista.put(nuevoCodigoPostal, nuevaCiudad);

    }
    public void eliminarCiudad(){
            System.out.print("Ingresa el código postal de la ciudad que deseas eliminar: ");
            String codigoPostalEliminar = leer.nextLine();
            lista.remove(codigoPostalEliminar);
    }
    
    public void listaFinal(){
        System.out.println("Datos finales:");
        for (Map.Entry<String, String> entry : lista.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
    }
}
