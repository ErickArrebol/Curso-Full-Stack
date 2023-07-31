package Servicio;

import java.util.Scanner;

public class LibreriaServicio {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void autor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion1 = 0;
        ServicioAutor sa = new ServicioAutor();
        do {
            try {

                System.out.println("--AUTOR ");
                System.out.println("1.- Crear\n2.- Dar de Baja\n3.- Editar\n4.- Eliminar\n5.- Volver al Menu Principal");
                System.out.print("Elige una opcion: ");
                opcion1 = leer.nextInt();
                System.out.println("");
                switch (opcion1) {
                    case 1:
                        sa.crearDatosAutor();
                        break;
                    case 2:
                        sa.darDeBajaAutorDatosAutor();
                        break;
                    case 3:
                        sa.editarDatosAutor();
                        break;
                    case 4:
                        sa.eliminarDatosAutor();
                        break;
                    case 5:
                        System.out.println("Regresando al Menu Principal");
                        break;
                    default:
                        System.out.println("--- OPCION INVALIDA VUELVA A INTENTAR ---");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("-------------- E R R O R --------------");
                leer.next();
            }

        } while (opcion1 != 5);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void editorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion2 = 0;
        ServicioEditorial se = new ServicioEditorial();
        do {
            try {
                System.out.println("--Editorial");
                System.out.println("1.- Crear\n2.- Dar de Baja\n3.- Editar\n4.- Eliminar\n5.- Volver al Menu Principal");
                System.out.print("Elige una opcion: ");
                opcion2 = leer.nextInt();
                System.out.println("");
                switch (opcion2) {
                    case 1:
                        se.crearDatosEditorial();
                        break;
                    case 2:
                        se.darDeBajaEditorialDatosEditorial();
                        break;
                    case 3:
                        se.editarDatosEditorial();
                        break;
                    case 4:
                        se.eliminarDatosEditorial();
                        break;
                    case 5:
                        System.out.println("Regresando al Menu Principal");
                        break;
                    default:
                        System.out.println("--- OPCION INVALIDA VUELVA A INTENTAR ---");
                        break;
                }
            } catch (Exception e) {
                System.out.println("-------------- E R R O R --------------");
                leer.next();
            }
        } while (opcion2 != 5);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void libro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioLibro sl = new ServicioLibro();
        int opcion3 = 0;
        do {
            try {
                System.out.println("--Libro");
                System.out.println("1.- Crear\n2.- Dar de Baja o Alta\n3.- Editar\n4.- Eliminar\n5.- Volver al Menu Principal");
                System.out.print("Elige una opcion: ");
                opcion3 = leer.nextInt();
                System.out.println("");
                switch (opcion3) {
                    case 1:
                        sl.crearDatosDeLibroS();
                        break;
                    case 2:
                        sl.darDeBajaLibroS();
                        break;
                    case 3:
                        sl.editarLibroS();
                        break;
                    case 4:
                        sl.eliminarLibroS();
                        break;
                    case 5:
                        System.out.println("Regresando al Menu Principal");
                        break;
                    default:
                        System.out.println("--- OPCION INVALIDA VUELVA A INTENTAR ---");
                        break;
                }
            } catch (Exception e) {
                System.out.println("-------------- E R R O R --------------");
                leer.next();
            }
        } while (opcion3 != 5);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 

    public void busqueda() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioLibro sl = new ServicioLibro();
        ServicioAutor sa = new ServicioAutor();
        int opcion3 = 0;
        do {
            try {
                System.out.println("--Busquedas");
                System.out.println("1.- Autor por Nombre\n2.- Libro por ISBN\n3.- Libro por Titulo\n4.- Libro por Nombre de Autor\n5.- Libro por Nombre de Editorial\n6.- Volver al Menu Principal");
                System.out.print("Elige una opcion: ");
                opcion3 = leer.nextInt();
                System.out.println("");
                switch (opcion3) {
                    case 1:
                        sa.buscarAutor();
                        break;
                    case 2:
                        sl.BuscarLibroPorISBN();
                        break;
                    case 3:
                        sl.buscarLibroPorTitulo();
                        break;
                    case 4:
                        sl.buscarLibroPorAutor();
                        break;
                    case 5:
                        sl.buscarLibroPorEditorial();
                        break;
                    case 6:
                        System.out.println("Regresando al Menu Principal");
                        break;
                    default:
                        System.out.println("--- OPCION INVALIDA VUELVA A INTENTAR ---");
                        break;
                }
            } catch (Exception e) {
                System.out.println("-------------- E R R O R --------------");
                leer.next();
            }
        } while (opcion3 != 6);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void cliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCliente sc = new ServicioCliente();
        int opcion = 0;
        do {
            try {
                System.out.println("--Cliente");
                System.out.print("1.- Crear\n2.- Editar\n3.- Eliminar\n4.- Buscar\n5.- Salir al menu Principal\nElige una opcion: ");
                opcion = leer.nextInt();
                System.out.println("");
                switch (opcion) {
                    case 1:
                        sc.crearCliente();
                        break;
                    case 2:
                        sc.editarCliente();
                        break;
                    case 3:
                        sc.eliminarCliente();
                        break;
                    case 4:
                        sc.buscarCliente();
                        break;
                    case 5:
                        System.out.println("Regresando al Menu Principal");
                        break;
                    default:
                        System.out.println("--- OPCION INVALIDA VUELVA A INTENTAR ---");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
                leer.next();
            }
        } while (opcion != 5);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void prestamo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPrestamo sp = new ServicioPrestamo();
        int opcion = 0;
        do {
            try {
                System.out.println("--Prestamo");
                System.out.print("1.- Crear\n2.- Editar\n3.- Eliminar\n4.- Buscar\n5.- Devolucion\n6.- Salir al menu Principal\nElige una opcion: ");
                opcion = leer.nextInt();
                System.out.println("");
                switch (opcion) {
                    case 1:
                        sp.crearPrestamo();
                        break;
                    case 2:
                        sp.editarPrestamo();
                        break;
                    case 3:
                        sp.eliminarPrestamo();
                        break;
                    case 4:
                        sp.buscarPrestamo();
                        break;
                    case 5:
                        sp.devolucionPrestamo();
                        break;
                    case 6:
                        System.out.println("Regresando al Menu Principal");
                        break;
                    default:
                        System.out.println("--- OPCION INVALIDA VUELVA A INTENTAR ---");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
                leer.next();
            }
        } while (opcion != 6);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
