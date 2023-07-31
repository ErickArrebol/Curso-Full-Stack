package Servicio;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistencia.DAOcliente;
import Persistencia.DAOlibro;
import Persistencia.DAOprestamo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ServicioPrestamo {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void crearPrestamo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----- Prestar Libro -----");
        Prestamo prestamo = new Prestamo();
        ///////////////////////VALIDAR FECHA PRESTAMO///////////////////////////
        Date fechaPrestamo = new Date();
        prestamo.setFechaPrestamo(fechaPrestamo);//Convierto el LocalDate a Date
        ///////////////////////VALIDAR FECHA DEVOLUCION/////////////////////////
        prestamo.setFechaDevolucion(null);
        ///////////////////////////VALIDAR CLIENTE//////////////////////////////
        boolean validar = true;
        String documento = "";
        long numero = 0;
        do {
            System.out.print("Ingresa el numero del Domcumento del cliente: ");
            try {
                numero = leer.nextLong();
                documento = String.valueOf(numero);
                if (documento.length() != 16) {
                    System.out.println("El numero del documento debe tener 16 digitos");
                } else {
                    DAOcliente daoC = new DAOcliente();
                    Cliente cliente = daoC.buscarCliente(numero);
                    if (cliente.getId() != null) {
                        prestamo.setCliente(cliente);
                        validar = false;
                    } else {
                        System.out.print("Deseas agregar el cliente Si(s) o No(cualquier letra): ");
                        String resp = leer.next();
                        if (resp.equalsIgnoreCase("s")) {
                            ServicioCliente sc = new ServicioCliente();
                            sc.crearCliente();
                        } else {
                            System.out.println("Vuelve a buscar");
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                leer.next();
            }
        } while (validar);
        System.out.println("---------------------------------");
        ///////////////////////////VALIDAR LIBRO////////////////////////////////
        validar = true;
        List<Libro> listaLibros = new ArrayList<>();
        Libro libro = new Libro();
        String respuesta;
        do {
            System.out.print("Ingresa el Titulo del Libro que se prestara: ");
            String titulo = leer.next();
            if (!titulo.trim().isEmpty()) {
                DAOlibro daoL = new DAOlibro();
                listaLibros = daoL.bucarLibroPorTitulo(titulo);
                if (listaLibros.size() == 1) {
                    System.out.println(listaLibros.get(0).toString());
                    System.out.print("Es este el libro a prestar Si(s) o No(cualquier letra): ");
                    respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        libro = listaLibros.get(0);
                        int num = 1;
                        libro.setEjemplares_prestados(num);
                        libro.setEjemplares_restantes(libro.getEjemplares() - num);
                        daoL.editarLibro(libro);
                        prestamo.setLibro(libro);
                        validar = false;
                    }
                }
            }
        } while (validar);
        System.out.println("--------------------------------------------");
        DAOprestamo daoP = new DAOprestamo();
        daoP.guardarPrestamo(prestamo);
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void editarPrestamo() {

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void eliminarPrestamo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String documento = "";
        long numero = 0;
        String respuesta;
        do {
            System.out.print("Ingresa el numero del Domcumento: ");
            try {
                numero = leer.nextLong();
                documento = String.valueOf(numero);
                if (documento.length() != 16) {
                    System.out.println("El numero del documento debe tener 16 digitos");
                } else {
                    DAOprestamo daoP = new DAOprestamo();
                    System.out.println("---------------------------------");
                    List<Prestamo> listaPrestamo = daoP.buscarPrestamoGeneral(numero);
                    if (listaPrestamo.size() == 1) {
                        System.out.println(listaPrestamo.get(0).toString());
                        System.out.print("Estas seguro de Eliminar este registro Si(s) o No(Cualquier letra): ");
                        respuesta = leer.next();
                        if (respuesta.equalsIgnoreCase("s")) {
                            daoP.eliminarPrestamo(listaPrestamo.get(0));
                        } else {
                            System.out.println("Deseas continuar buscando y eliminar el registro del Prestamo");
                            System.out.print("Si(s) o No(cualquier letra)");
                            respuesta = leer.next();
                            if (!respuesta.equalsIgnoreCase(respuesta)) {
                                System.out.println("Se cancela eliminar el registro del Prestamo");
                                return;
                            }
                        }
                    } else if (listaPrestamo.size() > 1) {
                        for (Prestamo aux : listaPrestamo) {
                            System.out.println(aux.toString());
                        }
                        boolean validarT = true;
                        do {
                            System.out.print("Ingresa el titulo del libro que deseas borrar de Prestamos: ");
                            String titulo = leer.next();
                            for (Prestamo aux : listaPrestamo) {
                                if (aux.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
                                    System.out.println(aux.toString());
                                    System.out.print("Estas seguro de Eliminar este registro Si(s) o No(Cualquier letra): ");
                                    respuesta = leer.next();
                                    if (respuesta.equalsIgnoreCase("s")) {
                                        daoP.eliminarPrestamo(aux);
                                    } else {
                                        System.out.println("Deseas continuar buscando y eliminar el registro del Prestamo");
                                        System.out.print("Si(s) o No(cualquier letra)");
                                        respuesta = leer.next();
                                        if (!respuesta.equalsIgnoreCase(respuesta)) {
                                            System.out.println("Se cancela eliminar el registro del Prestamo");
                                            return;
                                        }
                                    }

                                }
                            }
                            if (validarT) {
                                System.out.println("El Titulo es incorreto");
                                System.out.println("Deseas continuar buscando y eliminar el registro del Prestamo");
                                System.out.print("Si(s) o No(cualquier letra)");
                                respuesta = leer.next();
                                if (!respuesta.equalsIgnoreCase(respuesta)) {
                                    System.out.println("Se cancela eliminar el registro del Prestamo");
                                    return;
                                }
                            }
                        } while (validarT);

                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                leer.next();
            }
        } while (documento.length() != 16);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void buscarPrestamo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----- Busqueda de Prestamos -----");
        String documento = "";
        long numero = 0;
        do {
            System.out.print("Ingresa el numero del Domcumento del cliente: ");
            try {
                numero = leer.nextLong();
                documento = String.valueOf(numero);
                if (documento.length() != 16) {
                    System.out.println("El numero del documento debe tener 16 digitos");
                } else {
                    System.out.println("---------------------------------");
                }
            } catch (InputMismatchException e) {
                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                leer.next();
            }
        } while (documento.length() != 16);
        DAOprestamo daoP = new DAOprestamo();
        List<Prestamo> listaPrestamo = daoP.buscarPrestamoGeneral(numero);
        for (Prestamo aux : listaPrestamo) {
            System.out.println(aux.toString());
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void devolucionPrestamo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----- Devoluciones -----");
        /////////////////////Validar Cliente///////////////////////////////////
        String documento = "";
        long numero = 0;
        do {
            System.out.print("Ingresa el numero del Domcumento: ");
            try {
                numero = leer.nextLong();
                documento = String.valueOf(numero);
                if (documento.length() != 16) {
                    System.out.println("El numero del documento debe tener 16 digitos");
                } else {
                    System.out.println("---------------------------------");
                }
            } catch (InputMismatchException e) {
                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                leer.next();
            }
        } while (documento.length() != 16);
        DAOprestamo daoP = new DAOprestamo();
        List<Prestamo> listaPrestamo = daoP.buscarPrestamoDevolucion(numero);
        ///////////////////Validar libro y fecha de devolucion //////////////////
        if (listaPrestamo.size() == 1) {
            System.out.println(listaPrestamo.get(0).toString());
            System.out.print("Desea Devolver el libro Si(s) o No(cualquier letre): ");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase(respuesta)) {
                boolean validar = true;
                do {
                    System.out.print("Ingresa la fecha de Prestamo (dd/MM/yy): ");
                    try {
                        String fechaString = leer.next();//Ingresas la fecha en un String
                        DateTimeFormatter fechaConvertida = DateTimeFormatter.ofPattern("dd/MM/yy");//se utiliza para formatear y analizar fechas en formato de texto específico
                        LocalDate fechaDevolucionLocalDate = LocalDate.parse(fechaString, fechaConvertida);//convierte una cadena de texto que sigue el patrón especificado por el DateTimeFormatter en una instancia de LocalDate
                        LocalDate fechaPrestamo = listaPrestamo.get(0).getFechaPrestamo().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();// Convierto las fecha de pretasmo de Date a LocalDate para realizar la verficacion de la fechas
                        long dias = ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucionLocalDate);
                        if (dias >= 0) {
                            Date fechaDevolucion = Date.from(fechaDevolucionLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());//Convierto el LocalDate a Date
                            listaPrestamo.get(0).setFechaDevolucion(fechaDevolucion);
                            System.out.println(listaPrestamo.get(0).toString());
                            daoP.editarPrestamo(listaPrestamo.get(0));
                            DAOlibro daoL = new DAOlibro();
                            Libro libroDevuelto = listaPrestamo.get(0).getLibro();
                            libroDevuelto.setEjemplares_restantes(libroDevuelto.getEjemplares_restantes() + 1);
                            libroDevuelto.setEjemplares_prestados(libroDevuelto.getEjemplares_prestados() - 1);
                            daoL.editarLibro(libroDevuelto);
                            validar = false;
                        } else {
                            System.out.println("[NO PUEDES HACER UNA DEVOLUVION CON UNA FECHA ANTERIOR AL PRESTAMO]");
                        }

                    } catch (DateTimeParseException e) {
                        System.out.println("[ERROR INGRESA LAS FECHA CON EL FORMATO INDICADO]");
                        leer.next();
                    }
                } while (validar);
            } else {
                System.out.println("Se cancela la devolucion del libro");
                return;
            }
        } else {
            boolean validacion = true;
            do {
                System.out.print("Que libro va a Devolver");
                System.out.println("-----------------------");
                String titulo = leer.next();
                if (!titulo.trim().isEmpty()) {
                    do {
                        for (Prestamo aux : listaPrestamo) {
                            if (aux.getLibro().getTitulo().equalsIgnoreCase(titulo)) {
                                boolean validar = true;
                                do {
                                    System.out.print("Ingresa la fecha de Prestamo (dd/MM/yy): ");
                                    try {
                                        String fechaString = leer.next();//Ingresas la fecha en un String
                                        DateTimeFormatter fechaConvertida = DateTimeFormatter.ofPattern("dd/MM/yy");//se utiliza para formatear y analizar fechas en formato de texto específico
                                        LocalDate fechaDevolucionLocalDate = LocalDate.parse(fechaString, fechaConvertida);//convierte una cadena de texto que sigue el patrón especificado por el DateTimeFormatter en una instancia de LocalDate
                                        LocalDate fechaPrestamo = aux.getFechaPrestamo().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();// Convierto las fecha de pretasmo de Date a LocalDate para realizar la verficacion de la fechas
                                        long dias = ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucionLocalDate);
                                        if (dias >= 0) {
                                            Date fechaDevolucion = Date.from(fechaDevolucionLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());//Convierto el LocalDate a Date
                                            aux.setFechaPrestamo(fechaDevolucion);
                                            validar = false;
                                        } else {
                                            System.out.println("[NO PUEDES HACER UNA DEVOLUVION CON UNA FECHA ANTERIOR AL PRESTAMO]");
                                        }

                                    } catch (DateTimeParseException e) {
                                        System.out.println("[ERROR INGRESA LAS FECHA CON EL FORMATO INDICADO]");
                                        leer.next();
                                    }
                                } while (validar);
                            }
                        }
                        if (validacion) {
                            System.out.println("Ingresa el titulo del libro correctamente");
                        }
                    } while (validacion);

                } else {
                    System.out.println("El titulo del libro no puede ir vacio");
                }
            } while (validacion);
        }
        System.out.println("");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
