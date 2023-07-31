package Servicio;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.DAOautor;
import Persistencia.DAOeditorial;
import Persistencia.DAOlibro;
import java.util.List;
import java.util.Scanner;

public class ServicioLibro {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void crearDatosDeLibroS() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro = new Libro();
        boolean finalizar = true;
        System.out.println("---------- CREANDO LIRBO ----------");
        do {
            do {
//---------------------------------- TITULO ----------------------------------------//
                System.out.print("Ingresa el nombre del Libro: ");
                libro.setTitulo(leer.next());

                if (!libro.getTitulo().trim().isEmpty()) {
                    libro.setLetra(libro.getTitulo().substring(0, 1));
                } else {
                    System.out.println("------------ ERROR ------------");
                    System.out.println("El autor no debe de estra vacio");
                    System.out.println("-------------------------------");
                }
            } while (libro.getTitulo().trim().isEmpty());
            System.out.println("------------------------------");
//---------------------------------- AÑO ----------------------------------------//
            String n = "";
            do {
                try {

                    System.out.print("Ingresa el año: ");
                    libro.setAnio(leer.nextInt());
                    n = String.valueOf(libro.getAnio());
                    if (n.length() > 4 || n.length() < 4 || libro.getAnio() == null || libro.getAnio() > 2023) {
                        System.out.println(" El año debe tener 4 digitos y no ser mayor al año 2023");
                    }

                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("------------ ERROR ------------");
                    System.out.println("----- Ingresa solo numeros ----");
                    System.out.println("-------------------------------");
                    leer.next();
                }
            } while (n.length() != 4);
            System.out.println("------------------------------");
//---------------------------------- EJEMPLARES ----------------------------------------//
            do {
                try {
                    System.out.print("Ingresa el numero de ejemplares: ");
                    libro.setEjemplares(leer.nextInt());
                    if (libro.getEjemplares() == null) {
                        System.out.println("El autor no debe tener algun valor");
                    } else {
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("------------ ERROR ------------");
                    System.out.println("----- Ingresa solo numeros ----");
                    System.out.println("-------------------------------");
                    leer.next();
                }
            } while (libro.getEjemplares() == null);
            libro.setEjemplares_prestados(0);
            libro.setEjemplares_restantes(libro.getEjemplares() - libro.getEjemplares_prestados());
            System.out.println("------------------------------");
//---------------------------------- AUTOR ----------------------------------------//
            String nombreAutor = "";
            boolean validadA = true;
            do {
                System.out.print("Ingresa el Nombre del Autor: ");
                nombreAutor = leer.next();
                if (!nombreAutor.trim().isEmpty() && !nombreAutor.equalsIgnoreCase("null")) {
                    DAOautor autor = new DAOautor();
                    List<Autor> lista = autor.buscarAutor(nombreAutor);
                    if (lista.size() == 1) {
                        System.out.println(lista.get(0).toString());
                        libro.setAutor(lista.get(0));
                        validadA = false;
                    } else if (lista.size() > 1) {
                        do {
                            for (Autor aux : lista) {
                                System.out.println(aux.toString());
                            }
                            System.out.print("Ingresa nuevamente el nombre del Autor : ");
                            nombreAutor = leer.next();
                            if (!nombreAutor.trim().isEmpty() || nombreAutor.equalsIgnoreCase("null")) {
                                for (Autor aux : lista) {
                                    if (aux.getNombre().equalsIgnoreCase(nombreAutor)) {
                                        libro.setAutor(aux);
                                        validadA = false;
                                    }
                                }
                                if (validadA) {
                                    System.out.println("Nombre invalido ");
                                }
                            }
                        } while (validadA);
                    } else {
                        System.out.println("-El Autor no se encuentra en la BD-");
                        System.out.print("Deseas crear el Autor Si(s) o No(Cualquier letra) ");
                        String r = leer.next();
                        if (r.equalsIgnoreCase(r)) {
                            do {
                                System.out.print("Ingresa el nombre del autor: ");
                                String nombre = leer.next();
                                if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                                    ServicioAutor sa = new ServicioAutor();
                                    sa.crearDatosAutorEnLibro(nombre);
                                    List<Autor> listaAutorNuevo = autor.buscarAutor(nombre);
                                    System.out.println(listaAutorNuevo.get(0).toString());
                                    libro.setAutor(listaAutorNuevo.get(0));
                                    validadA = false;
                                } else {
                                    System.out.println("El nombre no puede ir vacio");
                                }
                            } while (validadA);
                        } else {
                            System.out.println("Buscar otro autor en la BD");
                        }
                    }
                }
            } while (validadA);
            System.out.println("------------------------------");
//---------------------------------- EDITORIAL ----------------------------------------//
            boolean validadE = true;
            String nombreEditorial = "";
            do {
                System.out.print("Ingresa el Nombre de la Editorial: ");
                nombreEditorial = leer.next();
                if (!nombreEditorial.trim().isEmpty() && !nombreEditorial.equalsIgnoreCase("null")) {
                    DAOeditorial daoE = new DAOeditorial();
                    List<Editorial> lista = daoE.buscarEditorial(nombreEditorial);
                    if (lista.size() == 1) {
                        System.out.println(lista.get(0).toString());
                        libro.setEditorial(lista.get(0));
                        validadE = false;
                    } else if (lista.size() > 1) {
                        do {
                            for (Editorial aux : lista) {
                                System.out.println(aux.toString());
                            }
                            System.out.print("Ingresa nuevamente el nombre de la Editorial: ");
                            nombreEditorial = leer.next();
                            if (!nombreEditorial.trim().isEmpty() || !nombreEditorial.equalsIgnoreCase("null")) {
                                for (Editorial aux : lista) {
                                    if (aux.getNombre().equalsIgnoreCase(nombreEditorial)) {
                                        libro.setEditorial(aux);
                                        validadE = false;
                                    }
                                }
                                if (validadE) {
                                    System.out.println("El nombre de la editorial fue incorrecto");
                                }
                            } else {
                                System.out.println("La editorial no puede estar vacia o en null");
                            }
                        } while (validadE);
                    } else {
                        System.out.println("La editorial no se encontro en la BD");
                        System.out.print("Deseas agregar una nueva Editorial Si(s) o No(Cualquier caracter) ");
                        String rE = leer.next();
                        if (rE.equalsIgnoreCase("s")) {
                            do {
                                System.out.print("Ingresa el nombre del editorial: ");
                                String nombre = leer.next();
                                if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                                    DAOeditorial dao = new DAOeditorial();
                                    ServicioEditorial se = new ServicioEditorial();
                                    se.crearDatosEditorialParaLibro(nombre);
                                    List<Editorial> listaE = dao.buscarEditorial(nombre);
                                    System.out.println(listaE.get(0).toString());
                                    libro.setEditorial(listaE.get(0));
                                    validadE = false;
                                } else {
                                    System.out.println("El nombre no puede ir vacio");
                                }
                            } while (validadE);

                        } else {
                            System.out.println("Vuelve a buscar la editorial");

                        }
                    }
                }
            } while (validadE);
            finalizar = false;
        } while (finalizar);
        libro.setAlta(true);
        DAOlibro daoL = new DAOlibro();
        daoL.guardarLibro(libro);
        System.out.println("------------------------------");
        System.out.println("Se creo el LIBRO correctamente");
        System.out.println("------------------------------");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void darDeBajaLibroS() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro = new Libro();
        boolean comprobacion = true;
        String titulo;
        int op;
        boolean validacion = true;
        do {
            System.out.println("1.- Dar de baja un libro");
            System.out.println("2.- Dar de Alta un libro");
            System.out.print("Elige una opcion: ");
            try {
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("Ingresa ell Titulo del libro a dar de baja: ");
                        titulo = leer.next();
                        if (!titulo.trim().isEmpty() || !titulo.equalsIgnoreCase("null")) {
                            DAOlibro dao = new DAOlibro();
                            List<Libro> listaTitulos = dao.bucarLibroParaDarDeBaja(titulo);
                            if (listaTitulos.size() == 1) {
                                System.out.println(listaTitulos.get(0).toString());
                                libro = listaTitulos.get(0);
                                libro.setAlta(false);
                                dao.editarLibro(libro);
                                validacion = false;
                            } else {
                                do {
                                    for (Libro aux : listaTitulos) {
                                        System.out.println(aux.toString());
                                    }
                                    System.out.println("Cual de los libros mostrados deseas dar de baja: ");
                                    titulo = leer.next();
                                    for (Libro aux : listaTitulos) {
                                        if (aux.getTitulo().equalsIgnoreCase(titulo)) {
                                            System.out.println(aux.toString());
                                            libro = aux;
                                            libro.setAlta(false);
                                            dao.editarLibro(libro);
                                            comprobacion = false;
                                            validacion = false;
                                        }
                                    }
                                    if (comprobacion) {
                                        System.out.println("El nombre ingresado no coincide con los libros mostrados");
                                    }
                                } while (comprobacion);
                            }
                        } else {
                            System.out.println("El titulo no debe de estra vacio o en Null");
                        }
                        break;
                    case 2:
                        System.out.print("Ingresa ell Titulo del libro a dar de alta: ");
                        titulo = leer.next();
                        if (!titulo.trim().isEmpty() || !titulo.equalsIgnoreCase("null")) {
                            DAOlibro dao = new DAOlibro();
                            List<Libro> listaTitulos = dao.bucarLibroParaDarDeAlta(titulo);
                            if (listaTitulos.size() == 1) {
                                System.out.println(listaTitulos.get(0).toString());
                                libro = listaTitulos.get(0);
                                libro.setAlta(true);
                                dao.editarLibro(libro);
                                validacion = false;
                            } else {
                                do {
                                    for (Libro aux : listaTitulos) {
                                        System.out.println(aux.toString());
                                    }
                                    System.out.println("Cual de los libros mostrados deseas dar de Alta: ");
                                    titulo = leer.next();
                                    for (Libro aux : listaTitulos) {
                                        if (aux.getTitulo().equalsIgnoreCase(titulo)) {
                                            System.out.println(aux.toString());
                                            libro = aux;
                                            libro.setAlta(true);
                                            dao.editarLibro(libro);
                                            comprobacion = false;
                                        }
                                    }
                                    if (comprobacion) {
                                        System.out.println("El nombre ingresado no coincide con los libros mostrados");
                                    }
                                } while (comprobacion);
                            }
                        } else {
                            System.out.println("El titulo no debe de estra vacio o en Null");
                        }
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("ingresa numeros");
                leer.next();
            }
        } while (validacion);
        System.out.println("---------------------------------------------------------------------");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void editarLibroS() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro = new Libro();
        boolean comprobacion = true;
        do {
            System.out.print("Ingresa el titulo del Libro a Editar: ");
            String nombre = leer.next();
            DAOlibro dao = new DAOlibro();
            List<Libro> listaLibros = dao.bucarLibroPorTitulo(nombre);
            if (listaLibros.size() == 1) {
                System.out.println(listaLibros.get(0).toString());
                System.out.println("Seguro de que deseas editar este libroSi(s) No(cualquier caracter)? ");
                String respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("S")) {
                    int op = 0;
                    libro = listaLibros.get(0);

                    do {
                        boolean editarC = true;
                        System.out.println("1.- Titulo");
                        System.out.println("2.- Año");
                        System.out.println("3.- Ejemplares");
                        System.out.println("4.- Autor");
                        System.out.println("5.- Editorial");
                        System.out.println("6.- Salir de opcion Editarl");
                        System.out.print("Que atributo deseas editar: ");
                        op = leer.nextInt();
                        System.out.println("");
                        switch (op) {
                            case 1:
                                do {
                                    System.out.print("Ingresa el nuevo Titulo: ");
                                    libro.setTitulo(leer.next());
                                    if (!libro.getTitulo().trim().isEmpty() || !libro.getTitulo().equalsIgnoreCase("null")) {
                                        libro.setLetra(libro.getTitulo().substring(0, 1));
                                        System.out.println("-- Titulo modificado Correctamente --");
                                        editarC = false;
                                    } else {
                                        System.out.println("El tiulo no puede ir vacio o en Null");
                                    }
                                } while (editarC);
                                break;
                            case 2:
                                do {
                                    System.out.print("Ingresa el nuevo Titulo: ");
                                    try {
                                        libro.setAnio(leer.nextInt());
                                        if (libro.getAnio() != null || libro.getAnio() < 2024) {
                                            System.out.println("-- El año se ha modificado Correctamente --");
                                            editarC = false;

                                        } else {
                                            System.out.println("El tiulo no puede ir vacio o en Null");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("-- ERROR no puede ingresar letras --");
                                        leer.next();
                                    }
                                } while (editarC);
                                break;
                            case 3:
                                do {
                                    System.out.println("Ingresa el nuevo nuemro de ejempalres");
                                    try {
                                        libro.setEjemplares(leer.nextInt());
                                        if (libro.getEjemplares() != null || libro.getEjemplares() != 0) {
                                            libro.setEjemplares_restantes(libro.getEjemplares() - libro.getEjemplares_prestados());
                                            System.out.println("-- El Numero de Ejemplares se ha modificado Correctamente --");
                                            editarC = false;
                                        } else {
                                            System.out.println("Los ejemplares no puede ser null");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("-- ERROR no puede ingresar letras --");
                                        leer.next();
                                    }
                                } while (editarC);

                                break;
                            case 4:
                                ServicioAutor sa = new ServicioAutor();
                                do {
                                    try {
                                        System.out.println("1.- Agregar un nuevo Autor al Libro (que no se encuentra en la BD)");
                                        System.out.println("2.- Cambiar el Autor al Libro");
                                        System.out.println("3.- Salir");
                                        System.out.print("Elige un opcion: ");
                                        int opcion = leer.nextInt();
                                        DAOautor daoA = new DAOautor();
                                        switch (opcion) {
                                            case 1:
                                                boolean finalizar = true;
                                                String nombreA;
                                                do {
                                                    System.out.print("Ingresa el nombre del autor: ");
                                                    nombreA = leer.next();
                                                    if (!nombreA.trim().isEmpty() || !nombreA.equalsIgnoreCase("Null")) {
                                                        sa.crearDatosAutorParaLibro(nombreA);
                                                        List<Autor> autor = daoA.buscarAutor(nombre);
                                                        libro.setAutor(autor.get(0));
                                                        System.out.println("Se agrego correctamente el Autor que no se enocntraba en la BD");
                                                        finalizar = false;
                                                    } else {
                                                        System.out.println("El nombre no puedes ser null o estra vacio");
                                                    }
                                                } while (finalizar);
                                                break;
                                            case 2:
                                                boolean finalizarC = true;
                                                String nombreAC;
                                                String resp;
                                                do {
                                                    System.out.print("Ingresa el nombre del Autor a cambiar: ");
                                                    nombreAC = leer.next();
                                                    if (!nombreAC.trim().isEmpty() || !nombreAC.equalsIgnoreCase("null")) {
                                                        List<Autor> listaDeAutor = daoA.buscarAutor(nombreAC);
                                                        if (listaDeAutor.size() == 1) {
                                                            System.out.println("Autor encontrado");
                                                            System.out.println(listaDeAutor.get(0).toString());
                                                            System.out.print("Este es el autor que deseas agregar Si(s) No(cualquier cacatrer): ");
                                                            resp = leer.next();
                                                            if (resp.equalsIgnoreCase("S")) {
                                                                libro.setAutor(listaDeAutor.get(0));
                                                                System.out.println("Se agrego correctamente el Autor");
                                                                finalizarC = false;
                                                            } else {
                                                                System.out.println("Salir al menu de Editar");
                                                                finalizarC = false;
                                                            }
                                                        } else if (listaDeAutor.size() > 1) {
                                                            System.out.println("Autores Encontrados");
                                                            for (Autor aux : listaDeAutor) {
                                                                System.out.println(aux.toString());
                                                            }
                                                            do {
                                                                System.out.print("Ingresa el nombre completo del Autor: ");
                                                                nombreAC = leer.next();
                                                                if (!nombreAC.trim().isEmpty() || !nombreAC.equalsIgnoreCase("null")) {
                                                                    for (Autor aux : listaDeAutor) {
                                                                        if (aux.getNombre().equalsIgnoreCase(nombreAC)) {
                                                                            System.out.println(aux.toString());
                                                                            System.out.print("Este es el autor que deseas agregar Si(s) No(cualquier cacatrer): ");
                                                                            resp = leer.next();
                                                                            if (resp.equalsIgnoreCase("s")) {
                                                                                libro.setAutor(aux);
                                                                                System.out.println("Se agrego correctamente el Autor");
                                                                                finalizarC = false;
                                                                            } else {
                                                                                System.out.println("Salir al menu de Editar");
                                                                                finalizarC = false;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    System.out.println("El nombre no puede ir vacio o en null");
                                                                }
                                                            } while (finalizarC);
                                                        } else {
                                                            System.out.println("No se encontro el autor");
                                                        }
                                                    } else {
                                                        System.out.println("El nombre no puede ir vacio o en null");
                                                    }
                                                } while (finalizarC);

                                                break;
                                            case 3:
                                                System.out.println("Opcion de Editar Autor finalizada");
                                                editarC = false;
                                                break;
                                            default:
                                                System.out.println("Opcion invalida");
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("-- Debes de ingresar solo numeros --");
                                        leer.next();
                                    }

                                } while (editarC);

                                break;
                            case 5:
                                ServicioEditorial se = new ServicioEditorial();
                                DAOeditorial daoE = new DAOeditorial();
                                boolean validacionE = true;
                                int opE;
                                String nombreE;
                                String r;
                                do {
                                    try {
                                        System.out.println("1.- Agregar una nueva Editorial al Libro (que no se encuentra en la BD)");
                                        System.out.println("2.- Cambiar el Editorial al Libro");
                                        System.out.println("3.- Salir");
                                        System.out.print("Elige una opcion: ");
                                        opE = leer.nextInt();
                                        switch (opE) {
                                            case 1:
                                                System.out.println("Ingresa el nombre de la nueva Editorial");
                                                nombreE = leer.next();
                                                if (!nombreE.trim().isEmpty() || !nombreE.equalsIgnoreCase("null")) {
                                                    se.crearDatosEditorialParaLibro(nombreE);
                                                    List<Editorial> listaEditorial = daoE.buscarEditorial(nombreE);
                                                    libro.setEditorial(listaEditorial.get(0));
                                                    System.out.println("Se modifico la Editorial correctamente");
                                                    validacionE = false;
                                                } else {
                                                    System.out.println("El nombre de la editorial no puede ser vacio o null");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Ingresa el nombre de la Editorial que agregaras al libro: ");
                                                nombreE = leer.next();
                                                if (!nombreE.trim().isEmpty() || !nombreE.equalsIgnoreCase("null")) {
                                                    List<Editorial> listaEditorial = daoE.buscarEditorial(nombreE);
                                                    if (listaEditorial.size() == 1) {
                                                        System.out.println("Editorial encontrada");
                                                        System.out.println(listaEditorial.get(0).toString());
                                                        System.out.println("Este es la editorial que deseas agregar al Libro Si(s) o No(cualquire caracter)");
                                                        r = leer.next();
                                                        if (r.equalsIgnoreCase("s")) {
                                                            libro.setEditorial(listaEditorial.get(0));
                                                            System.out.println("Se agrego correctamente la Editorial");
                                                            validacionE = false;
                                                        } else {
                                                            System.out.println("Salir al menu Editar");
                                                            validacionE = false;
                                                        }
                                                    } else if (listaEditorial.size() > 1) {
                                                        System.out.println("Editoriales encontradas");
                                                        for (Editorial aux : listaEditorial) {
                                                            System.out.println(aux.toString());
                                                        }
                                                        do {
                                                            System.out.print("Ingresa el nombre completo del Autor: ");
                                                            nombreE = leer.next();
                                                            if (!nombreE.trim().isEmpty() || !nombreE.equalsIgnoreCase("null")) {
                                                                for (Editorial aux : listaEditorial) {
                                                                    if (aux.getNombre().equalsIgnoreCase(nombreE)) {
                                                                        System.out.println(aux.toString());
                                                                        System.out.println("Este es la editorial que deseas agregar al Libro Si(s) o No(cualquire caracter)");
                                                                        r = leer.next();
                                                                        if (r.equalsIgnoreCase("s")) {
                                                                            libro.setEditorial(aux);
                                                                            System.out.println("Se agrego correctamente la Editorial");
                                                                            validacionE = false;
                                                                        } else {
                                                                            System.out.println("Salir al menu Editar");
                                                                            validacionE = false;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("El nombre de la editorial no puede ser vacio o null");
                                                            }
                                                        } while (validacionE);

                                                    } else {
                                                        System.out.println("No se encontro editorial");
                                                    }
                                                } else {
                                                    System.out.println("El nombre de la editorial no puede ser vacio o null");
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Opcion de Editar Autor finalizada");
                                                validacionE = false;
                                                break;
                                            default:
                                                System.out.println("Opcion invalida");
                                                break;
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                } while (validacionE);
                                break;
                            case 6:
                                System.out.println("Opcion de Editar libro Finalizada");
                                comprobacion = false;
                                break;
                            default:
                                System.out.println("Opcion invalidad vuelve a intentar");
                                break;
                        }

                    } while (comprobacion);
                } else {
                    System.out.println("Opcion editar libro Cancelada");
                    comprobacion = false;
                }
//            }else if(listaLibros.size() > 1){
//                
            } else {
                System.out.println("El libro no se encontro en la BD");
            }
        } while (comprobacion);
        DAOlibro daoL = new DAOlibro();
        daoL.editarLibro(libro);
        System.out.println("---------------------------------------------------------------------");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void eliminarLibroS() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro = new Libro();
        boolean comprobacion = true;
        System.out.print("Ingresa el titulo del Libro a elimanar: ");
        String nombre = leer.next();
        DAOlibro dao = new DAOlibro();
        List<Libro> listaLibros = dao.bucarLibroPorTitulo(nombre);
        do {
            if (listaLibros.size() == 1) {
                System.out.println(listaLibros.get(0).toString());
                do {
                    System.out.print("Deseas eliminar este libro Si(s) No(cualquier caracter)?  ");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        libro = listaLibros.get(0);
                        dao.eliminarLibro(libro);
                        System.out.println("Se elimno El Libro Correctamente");
                        comprobacion = false;
                    } else {
                        System.out.println("Se cancelo la eliminacion del libro");
                        comprobacion = false;
                    }
                } while (comprobacion);
            } else {
                System.out.println("Lista de Libros");
                for (Libro aux : listaLibros) {
                    System.out.println(aux.toString());
                }
                do {
                    System.out.print("Deseas eliminar algun libro Si(s) No(cualquier caracter)? ");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        do {
                            System.out.println("Ingresa el nombre completo del Libro a Eliminar: ");
                            nombre = leer.next();
                            for (Libro aux : listaLibros) {
                                if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                                    libro = aux;
                                    dao.eliminarLibro(libro);
                                    System.out.println("Se elimno El Libro Correctamente");
                                    comprobacion = false;
                                }
                            }
                            if (comprobacion) {
                                System.out.println("No ingresate el nombre correctamente");
                            }
                        } while (comprobacion);
                    } else {
                        System.out.println("Se cancelo la eliminacion del libro");
                        comprobacion = false;
                    }
                } while (comprobacion);
            }
        } while (comprobacion);
        System.out.println("---------------------------------------------------------------------");

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void BuscarLibroPorISBN() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DAOlibro daoL = new DAOlibro();
        boolean validacion = true;
        do {
            System.out.print("Ingresa el ISBN: ");
            try {
                long isbn = leer.nextLong();
                Libro libro = daoL.bucarLibroPorISBN(isbn);
                System.out.println(libro.toString());
                validacion = false;
            } catch (Exception e) {
                System.out.println("------ ERROR ------");
                System.out.println("Ingresa solo numeros");
                leer.next();
            }
        } while (validacion);
        System.out.println("");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void buscarLibroPorTitulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DAOlibro daoL = new DAOlibro();
        boolean validacion = true;
        do {
            System.out.print("Ingresa el Titulo del libro: ");
            try {
                String titulo = leer.next();
                if (!titulo.trim().isEmpty() || !titulo.equalsIgnoreCase("null")) {
                    List<Libro> listaLibro = daoL.bucarLibroPorTitulo(titulo);
                    if (listaLibro.size() == 1) {
                        System.out.println(listaLibro.get(0).toString());
                        validacion = false;
                    } else if (listaLibro.size() > 1) {
                        System.out.println("Libros que en el titulo contienen " + titulo);
                        for (Libro aux : listaLibro) {
                            System.out.println(aux.toString());
                        }
                        validacion = false;
                    } else {
                        System.out.println("No se encontro el libro");
                        validacion = false;
                    }
                } else {
                    System.out.println("El nombre del autor no debe de ser vacio");
                }
            } catch (Exception e) {
                System.out.println("No se ecnontro libro");
                leer.next();
            }
        } while (validacion);
        System.out.println("");
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void buscarLibroPorAutor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DAOlibro daoL = new DAOlibro();
        boolean validacion = true;
        do {
            try {
                System.out.print("Ingresa el autor: ");
                String nombre = leer.next();
                if (!nombre.trim().isEmpty() || !nombre.equalsIgnoreCase("null")) {
                    List<Libro> listaLibro = daoL.bucarLibroPorAutor(nombre);
                    if (listaLibro.size() == 1) {
                        System.out.println("Libro del autor " + nombre);
                        System.out.println(listaLibro.get(0).toString());
                    } else {
                        System.out.println("Libros del autor " + nombre);
                        for (Libro aux : listaLibro) {
                            System.out.println(aux.toString());
                        }
                        validacion = false;
                    }
                } else {
                    System.out.println("El nombre del autor no debe de ser vacio");
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

    public void buscarLibroPorEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DAOlibro daoL = new DAOlibro();
        boolean validacion = true;
        do {
            System.out.print("Ingresa el nombre de la Editorial: ");
            try {
                String nombre = leer.next();
                if (!nombre.trim().isEmpty() || !nombre.equalsIgnoreCase("null")) {
                    List<Libro> listaLibros = daoL.bucarLibroPorEditorial(nombre);
                    if (listaLibros.size() == 1) {
                        System.out.println(listaLibros.get(0).toString());
                    } else {
                        System.out.println("Libro con la Editorial " + nombre);
                        for (Libro aux : listaLibros) {
                            System.out.println(aux.toString());
                        }
                        validacion = false;
                    }
                } else {
                    System.out.println("El nombre de la Editorial no puede ir vacio");
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

    public void buscarLibroPorLetraIncicial() {

    }
}
