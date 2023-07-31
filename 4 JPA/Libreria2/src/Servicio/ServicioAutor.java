package Servicio;

import Entidades.Autor;
import Persistencia.DAOautor;
import java.util.List;
import java.util.Scanner;

public class ServicioAutor {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void crearDatosAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean finalizar = true;
        do {
            System.out.print("Ingresa el nombre del autor: ");
            String nombre = leer.next();
            if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                System.out.println("");
                DAOautor dao = new DAOautor();
                dao.guardarAutor(new Autor(nombre));
                finalizar = false;
            } else {
                System.out.println("---------- ERROR ----------");
                System.out.println("El nombre no puede ir vacio");
                System.out.println("     Intenta nuevamente    ");
                System.out.println("---------------------------");
                System.out.println("");
            }
        } while (finalizar);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void crearDatosAutorEnLibro(String nombre) {
                DAOautor dao = new DAOautor();
                dao.guardarAutor(new Autor(nombre));
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void editarDatosAutor() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean finalizar = true;
        do {
            System.out.print("Ingresa el nombre del Autor a editar: ");
            String nombre = leer.next();
            if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                DAOautor dao = new DAOautor();
                List<Autor> listaDeAutores = dao.buscarAutor(nombre);
                if (listaDeAutores.size() == 1) {
                    System.out.print("Ingresa el nuevo nombre: ");
                    String nuevoNombre = leer.next();
                    dao.editarAutor(new Autor(nuevoNombre));
                    finalizar = false;
                } else if (listaDeAutores.size() > 1) {
                    for (Autor aux : listaDeAutores) {
                        System.out.println(aux.toString());
                    }
                    do {
                        System.out.print("Ingresa el numero del autor a editar: ");
                        int idAutor = leer.nextInt();
                        for (int i = 0; i < listaDeAutores.size(); i++) {
                            if (listaDeAutores.get(i).getId() == idAutor) {
                                Autor autorEditar = listaDeAutores.get(i);
                                System.out.println("Ingresa el nuevo nombre de Autor");
                                autorEditar.setNombre(leer.next());
                                finalizar = false;
                            } else {
                                System.out.println("-ERROR- Numero de autor invalido");
                            }
                        }

                    } while (finalizar);

                }

            } else {
                System.out.println("---------- ERROR ----------");
                System.out.println("El nombre no puede ir vacio");
                System.out.println("     Intenta nuevamente    ");
                System.out.println("---------------------------");
                System.out.println("");
            }
        } while (finalizar);
        System.out.println("");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void darDeBajaAutorDatosAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean finalizar = true;
        do {
            System.out.print("Ingresa el nombre del Autor que se dara de baja: ");
            String nombre = leer.next();
            if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                DAOautor dao = new DAOautor();
                List<Autor> listaDeAutores = dao.buscarAutor(nombre);
                if (listaDeAutores.size() == 1) {
                    Autor autorDeBaja = listaDeAutores.get(0);
                    autorDeBaja.setAlta(false);
                    dao.darDeBajaAutor(autorDeBaja);
                    finalizar = false;
                } else if (listaDeAutores.size() > 1) {
                    for (Autor aux : listaDeAutores) {
                        System.out.println(aux.toString());
                    }
                    int cont = 0;
                    do {
                        System.out.print("Ingresa el numero del autor que se dara de baja: ");
                        int idAutor = leer.nextInt();
                        for (int i = 0; i < listaDeAutores.size(); i++) {
                            if (listaDeAutores.get(i).getId() == idAutor) {
                                Autor autorDeBaja = listaDeAutores.get(i);
                                autorDeBaja.setAlta(false);
                                dao.darDeBajaAutor(autorDeBaja);
                                cont = 1;
                                finalizar = false;
                            }
                        }
                        if (cont == 0) {
                            System.out.println("-ERROR- Numero de autor invalido");
                        }

                    } while (finalizar);

                }

            } else {
                System.out.println("---------- ERROR ----------");
                System.out.println("El nombre no puede ir vacio");
                System.out.println("     Intenta nuevamente    ");
                System.out.println("---------------------------");
                System.out.println("");
            }
        } while (finalizar);
        System.out.println("");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void eliminarDatosAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean finalizar = true;
        do {
            System.out.print("Ingresa el nombre del Autor a Eliminar: ");
            String nombre = leer.next();
            if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                DAOautor dao = new DAOautor();
                List<Autor> listaDeAutores = dao.buscarAutor(nombre);
                if (listaDeAutores.size() == 1) {
                    Autor eliminarAutor = listaDeAutores.get(0);
                    dao.eliminarAutor(eliminarAutor);
                    finalizar = false;
                } else if (listaDeAutores.size() > 1) {
                    for (Autor aux : listaDeAutores) {
                        System.out.println(aux.toString());
                    }
                    int cont = 0;
                    do {
                        System.out.print("Ingresa el numero del autor a Eliminar: ");
                        int idAutor = leer.nextInt();
                        for (int i = 0; i < listaDeAutores.size(); i++) {
                            if (listaDeAutores.get(i).getId() == idAutor) {
                                Autor eliminarAutor = listaDeAutores.get(0);
                                dao.eliminarAutor(eliminarAutor);
                                cont = 1;
                                finalizar = false;
                            }
                        }
                        if (cont == 0) {
                            System.out.println("-ERROR- Numero de autor invalido");
                        }

                    } while (finalizar);

                }

            } else {
                System.out.println("---------- ERROR ----------");
                System.out.println("El nombre no puede ir vacio");
                System.out.println("     Intenta nuevamente    ");
                System.out.println("---------------------------");
                System.out.println("");
            }
        } while (finalizar);
        System.out.println("");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void buscarAutor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean validacion = true;
        do {
            System.out.print("Ingresa el nombre del Autor: ");
            try {
                String nombre = leer.next();
                if(!nombre.trim().isEmpty() || !nombre.equalsIgnoreCase("null")){
                    DAOautor daoA = new DAOautor();
                    List<Autor> listaAutor = daoA.buscarAutor(nombre);
                    if(listaAutor.size() == 1){
                        System.out.println(listaAutor.get(0).toString());
                        validacion = false;
                    }else{
                        System.out.println("Autores con que contiene en su nombre "+ nombre);
                        for (Autor aux : listaAutor) {   
                        }
                        validacion = false;
                    }
                }else{
                    System.out.println("El nombre de Autor no puede estra vacio o en Null");
                    validacion = false;
                }
            } catch (Exception e) {
                System.out.println(e);
                leer.next();
            }
        } while (validacion);
        System.out.println("");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public void crearDatosAutorParaLibro(String nombre) {
                Autor autor = new Autor(nombre);
                autor.setAlta(true);
                DAOautor dao = new DAOautor();
                dao.guardarAutor(autor);      
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
