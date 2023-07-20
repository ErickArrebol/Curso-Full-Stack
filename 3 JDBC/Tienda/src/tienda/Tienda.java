package tienda;

import java.util.List;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.fabricanteDAO;
import tienda.persistencia.productoDAO;

/*@author Erick*/
public class Tienda {

    public static void main(String[] args) throws Exception {

        productoDAO pDAO = new productoDAO();
        fabricanteDAO fDAO = new fabricanteDAO();
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("A C C I O N E S    A    R E A L I Z A R");
            System.out.println("1) Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2) Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3) Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4) Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5) Listar el nombre y el precio del producto más barato.");
            System.out.println("6) Ingresar un producto a la base de datos.");
            System.out.println("7) Ingresar un fabricante a la base de datos");
            System.out.println("8) Editar un producto con datos a elección.");
            System.out.println("9) Salir");
            System.out.print("Elige una opcion ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    List<String> nombresProductos = pDAO.obtenerNombresProductos();
                    System.out.println("----- Nombres de productos -----");
                    for (String nombre : nombresProductos) {
                        System.out.println(nombre);
                    }
                    break;
                case 2:
                    List<String> nombresYPreciosProductos = pDAO.obtenerNombresYPreciosProductos();
                    System.out.println("----- Nombres y precios de productos -----");
                    for (String nombreYPrecio : nombresYPreciosProductos) {
                        System.out.println(nombreYPrecio);
                    }
                    break;
                case 3:
                    List<Producto> productosEnRango = pDAO.obtenerProductosEnRangoDePrecio(120, 202);
                    System.out.println("----- Productos en el rango de precios -----");
                    for (Producto producto : productosEnRango) {
                        System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
                    }
                    break;
                case 4:
                    List<Producto> portatiles = pDAO.obtenerPortatiles();
                    System.out.println("----- Portátiles -----");
                    for (Producto portatil : portatiles) {
                        System.out.println(portatil.getNombre());
                    }
                    break;
                case 5:
                    Producto productoMasBarato = pDAO.obtenerProductoMasBarato();
                    if (productoMasBarato != null) {
                        System.out.println("----- Producto más barato -----");
                        System.out.println("Nombre: " + productoMasBarato.getNombre());
                        System.out.println("Precio: $" + productoMasBarato.getPrecio());
                    } else {
                        System.out.println("No hay productos en la base de datos");
                    }
                    break;
                case 6:
                    System.out.println("Ingresa el codido del producto: ");
                    int codigo = leer.nextInt();
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombreProducto = leer.next();
                    System.out.println("Ingrese el precio del producto: ");
                    double precioProducto = leer.nextDouble();
                    System.out.println("Ingrese el código del fabricante: ");
                    int codigoFabricante = leer.nextInt();

                    Producto nuevoProducto = new Producto(codigo, nombreProducto, precioProducto, codigoFabricante);
                    pDAO.insertarProducto(nuevoProducto);
                    System.out.println("Producto ingresado correctamente.");
                    break;

                case 7:
                    System.out.println("Ingresa el codigo del fabricante ");
                    int codigof = leer.nextInt();
                    System.out.println("Ingrese el nombre del fabricante: ");
                    String nombreFabricante = leer.next();
                    
                    Fabricante nuevoFabricante = new Fabricante(codigof, nombreFabricante);
                    fDAO.insertarFabricante(nuevoFabricante);
                    break;

                case 8:
                    // Editar un producto
                    System.out.println("Ingrese el código del producto a editar: ");
                    int codigoProducto = leer.nextInt();
                    System.out.println("Ingrese el nuevo nombre del producto: ");
                    String nuevoNombre = leer.next();
                    System.out.println("Ingrese el nuevo precio del producto: ");
                    double nuevoPrecio = leer.nextDouble();
                    System.out.println("Ingrese el nuevo código del fabricante: ");
                    int nuevoCodigoFabricante = leer.nextInt();

                    Producto productoEditado = new Producto(codigoProducto, nuevoNombre, nuevoPrecio, nuevoCodigoFabricante);
                    pDAO.editarProducto(productoEditado);
                    System.out.println("Producto editado correctamente.");
                    break;
                case 9:
                    System.out.println("F I N    D E L    P R O G R A M A");
                    break;
                default:
                    System.out.println("Opcion invalida vuelve a intentar");
                    break;
            }
            System.out.println("--------------------------------------------------------------");
        } while (opc!=9);

    }

}
