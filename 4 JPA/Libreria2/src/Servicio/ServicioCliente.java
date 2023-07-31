package Servicio;

import Entidades.Cliente;
import Persistencia.DAOcliente;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServicioCliente {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void crearCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cliente cliente = new Cliente();
        System.out.println("----- Creando Cliente -----");
        ////////////////////////validacion docuemnto////////////////////////////
        String documento = "";
        do {
            System.out.print("Ingresa el numero del Domcumento: ");
            try {
                cliente.setDocumento(leer.nextLong());
                documento = String.valueOf(cliente.getDocumento());
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
        //////////////////////////validacion Nombre/////////////////////////////
        do {
            System.out.print("Ingresa el nombre del cliente: ");

            cliente.setNombre(leer.next());
            if (cliente.getNombre().trim().isEmpty()) {
                System.out.println("El nombre no puede ir vacio");
            } else {
                System.out.println("-----------------------------");
            }
        } while (cliente.getNombre().trim().isEmpty());
        /////////////////////////validacion Apellido////////////////////////////
        do {
            System.out.print("Ingresa el apellido del cliente: ");

            cliente.setApellido(leer.next());
            if (cliente.getApellido().trim().isEmpty()) {
                System.out.println("El Apellido no puede ir vacio");
            } else {
                System.out.println("-------------------------------");
            }
        } while (cliente.getApellido().trim().isEmpty());
        /////////////////////////validacion Telefono////////////////////////////
        int telefono;
        boolean validar = true;
        do {
            System.out.print("Ingresa el numero telefonico: ");
            try {
                telefono = leer.nextInt();
                String numero = Integer.toString(telefono);
                if (numero.length() != 10) {
                    System.out.println("El numero debe contener 10 digitos");
                } else {
                    cliente.setTelefono(numero);
                    validar = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                leer.next();
            }
        } while (validar);
        System.out.println("----------------------------");
        DAOcliente dao = new DAOcliente();
        dao.guardarCliente(cliente);
        System.out.println("Se Agrego Correctamente El Cliente");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void editarCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cliente cliente = new Cliente();
        int opcion = 0;
        do {
            System.out.println("----- Editar cliente -----");
            System.out.print("1.- Documento\n2.- Nombre\n3.- Apellido\n4.- Telefono\n5.- Salir\nElige una opcion: ");
            try {
                opcion = leer.nextInt();
                System.out.println("");
                switch (opcion) {
                    case 1:
                        /////////////////////////////////////////////Docuemnto
                        boolean validarD = true;
                        do {
                            try {
                                System.out.print("Ingresa el nuevo Documento: ");
                                cliente.setDocumento(leer.nextLong());
                                String doc = String.valueOf(cliente.getDocumento());
                                if (doc.length() == 16) {
                                    validarD = false;
                                } else {
                                    System.out.println("El nombre no puede ir vacio");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                                leer.next();
                            }

                        } while (validarD);
                        System.out.println("---------------------------");
                        break;
                    case 2:
                        /////////////////////////////////////////////Nombre
                        do {
                            System.out.print("Ingresa el nuevo Nombre: ");
                            cliente.setNombre(leer.next());
                            if (cliente.getNombre().trim().isEmpty()) {
                                System.out.println("El Nombre no puede ir vacio");
                            }
                        } while (cliente.getNombre().trim().isEmpty());
                        System.out.println("------------------------");
                        break;
                    case 3:
                        /////////////////////////////////////////////Apellido
                        do {
                            System.out.print("Ingresa el nuevo Apellido: ");
                            cliente.setApellido(leer.next());
                            if (cliente.getApellido().trim().isEmpty()) {
                                System.out.println("El Apelllido no puede ir vacio");
                            }
                        } while (cliente.getApellido().trim().isEmpty());
                        System.out.println("-------------------------");
                        break;
                    case 4:
                        /////////////////////////////////////////////Telefono
                        int telefono;
                        boolean validarT = true;
                        do {
                            System.out.print("Ingresa el nuevo numero telefonico: ");
                            try {
                                telefono = leer.nextInt();
                                String numero = Integer.toString(telefono);
                                if (numero.length() != 10) {
                                    System.out.println("El numero debe contener 10 digitos");
                                } else {
                                    cliente.setTelefono(numero);
                                    validarT = false;
                                }
                            } catch (InputMismatchException ex) {
                                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                                leer.next();
                            }
                        } while (validarT);
                        System.out.print("----------------------------------");
                        break;
                    case 5:
                        System.out.println("Finalizar Proceso de Editar");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                System.out.println("");
            } catch (Exception e) {
            }
        } while (opcion != 5);
        DAOcliente dao = new DAOcliente();
        dao.editarCliente(cliente);
        System.out.println("Se Modifico Correctamente El Cliente");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void eliminarCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----- Eliminado Cliente -----");
        boolean validar = true;
        do {
            System.out.print("Ingresa el numero del Documento del Cliente a Eliminar: ");
            try {
                long numero = leer.nextLong();
                String n = String.valueOf(numero);
                if (n.length() != 16) {
                    System.out.println("El Documento debe tener 16 digitos");
                } else {
                    DAOcliente dao = new DAOcliente();
                    dao.eliminarCliente(dao.buscarCliente(numero));
                    validar = false;
                }
            } catch (Exception e) {
                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                leer.next();
            }
        } while (validar);
        System.out.println("------------------------------------------------------");
        System.out.println("Se Elimino Correctamente");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void buscarCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----- Buscando Cliente -----");
        DAOcliente dao = new DAOcliente();
        Cliente cliente = new Cliente();
        boolean validar = true;
        long numero = 0;
        int contador = 0;
        String respuesta = "";
        do {
            if (contador > 0) {
                System.out.print("Deseas volver a buscar Si(s) o No(cualquire letra): ");
                respuesta = leer.next();
                if (!respuesta.equalsIgnoreCase("S")) {
                    System.out.println("Se cancelo la busqueda");
                    System.out.println("----------------------");
                    return;
                }
            }
            System.out.print("Ingresa el documento del cliente: ");
            try {
                numero = leer.nextLong();
                String n = String.valueOf(numero);
                if (n.length() != 16) {
                    System.out.println("El Documento debe tener 16 digitos");
                } else {
                    cliente = dao.buscarCliente(numero);
                    if (cliente.getId() != null) {
                        validar = false;
                    }else{
                        System.out.println("No se encontro Cliente");
                    }
                    contador++;
                }

            } catch (Exception e) {
                System.out.println("[ERROR INGRESA SOLO NUMEROS]");
                leer.next();
            }
        } while (validar);
        System.out.println("--------------------------------");
        if (cliente != null && cliente.getId() != null) {
            System.out.println(cliente.toString());
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
}
