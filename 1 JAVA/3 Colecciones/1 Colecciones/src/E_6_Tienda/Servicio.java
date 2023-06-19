package E_6_Tienda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Tienda a = new Tienda();
    Map<String, Double> lista = new HashMap<>();

    public void Menu() {
        int opcion = 0;
        do {
            System.out.println("----- MENU de la Tienda -----");
            System.out.println(" 1.- Añadir un Producto"
                    + "\n 2.- Modificar el Precio del Producto"
                    + "\n 3.- Eliminar un Producto"
                    + "\n 4.- Mostras los Productos y sus Precios"
                    + "\n 5.- Salir");
            System.out.print(" Elige una Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("AÑADIR PRODUCTOS");
                    añadirProducto();
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    System.out.println("MODIFICADOR DEL PRECIO DEL PRODUCTO");
                    modificarPrecioProducto();
                    break;
                case 3:
                    System.out.println("-----------------------------------");
                    System.out.println("BORRAS PRODUCTOS");
                    eliminarProducto();
                    break;
                case 4:
                    System.out.println("-----------------------------------");

                    imprimirProductos();
                    break;
                case 5:
                    System.out.println("---Programa Terminado---");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 5);
    }

    public void añadirProducto() {
        String producto, opcion = "";
        double precio;
   
        do {
            System.out.print("Ingresa el Producto: ");
            producto = leer.next();
            System.out.print("Ingresa el Precio del Producto: ");
            precio = leer.nextDouble();
            lista.put(producto, precio);
            a.setProductos(lista);
            System.out.println("EL PRODUCTO SE HA AGREGADO CORRECTAMENTE");
            System.out.println("\nDeseas agregar otro producto No(n) Si(cualquier caracter)");
            opcion = leer.next();
            
        } while (!opcion.equalsIgnoreCase("N"));

    }

    public void modificarPrecioProducto() {

        System.out.print("Ingresa el Nombre del Producto que deseas Modificar: ");
        String producto = leer.next();
        if (lista.containsKey(producto)) {
            System.out.print("Ingresa el nuevo precio del Producto: ");
            double precio = leer.nextDouble();
            lista.put(producto, precio);
            a.setProductos(lista);
            System.out.println("SE HA MODIFICADO CORRECTAMENTE EL PRECIO");
        } else {
            System.out.println("El Producto no Existe");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingresa el Nombre del Producto que deseas Eliminar: ");
        String producto = leer.next();
        if (lista.containsKey(producto)) {
            lista.remove(producto);
            System.out.println("SE HA ELIMIDADO CORRECTAMENTE");
        } else {
            System.out.println("El Producto no Existe");
        }
    }

    public void imprimirProductos() {
        System.out.println("LOS PRODUCTOS");
        for (Map.Entry<String, Double> entry : lista.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: "+key+" $"+value);
        }
    }
}

