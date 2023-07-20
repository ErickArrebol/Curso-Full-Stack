package Servicios;

import DAO.DAOautor;
import DAO.DAOeditorial;
import DAO.DAOlibro;
import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import java.util.List;
import java.util.Scanner;

public class ServicioLibro {

    public void crearLibro() {
        Boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.print("Ingresa el ISBN: ");
                Long ISBN = leer.nextLong();
                System.out.print("Ingresa los datos del libro");
                System.out.print("Titulo: ");
                String titulo = leer.next();
                System.out.print("Añio: ");
                Integer anio = leer.nextInt();
                System.out.print("Ejemplares: ");
                Integer ejemplares = leer.nextInt();
                Integer ejemplares_prestados;
                do {
                    System.out.print("Ejemplares prestados: ");
                    ejemplares_prestados = leer.nextInt();
                } while (ejemplares_prestados > ejemplares);

                Integer ejemplares_restantes = ejemplares - ejemplares_prestados;
                System.out.print("Alta: ");
                boolean alta = leer.nextBoolean();
                System.out.print("Cual es el nombre del autor del libro: ");
                String AutorNombre = leer.next();
                DAOautor daoAUTOR = new DAOautor();
                Autor objetoAUTOR = daoAUTOR.buscarNombre(AutorNombre);
                
                System.out.println("Cual es el nombre dela Editorial del libro: ");
                String EditorialNombre = leer.next();
                DAOeditorial daoEDITORIAL = new DAOeditorial();
                Editorial objetoEditorial = daoEDITORIAL.buscarNombre(EditorialNombre);
                Libro libroNuevo = new Libro(ISBN,titulo, anio, ejemplares, ejemplares_prestados, ejemplares_restantes, alta, objetoAUTOR, objetoEditorial);
                DAOlibro daoLIBRO = new DAOlibro();
                if (!(ISBN == null && titulo.isEmpty() && anio == null && ejemplares == null && ejemplares_prestados == null && alta==true && objetoAUTOR == null && objetoEditorial == null)) {
                    daoLIBRO.guardarLibro(libroNuevo);
                    System.out.println("-- Se agrego correctamen un LIBRO --");
                }
            } catch (Exception e) {
                System.out.println("Error " + e);
                leer.next();
            }
        } while (logica);

    }
    
    public void desactivarLibro(){
        boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("Ingresa el nombre del libro a desactivar");
                String nombre = leer.next();
                if(nombre.isEmpty() || nombre == null){
                    DAOlibro dao = new DAOlibro();
                    Libro objeto =dao.buscarNombre(nombre);
                    objeto.setAlta(false);
                }
                
            } catch (Exception e) {
                System.out.println("ERROR "+ e);
                leer.next();
            }
        } while (logica);
    }
    
    public void buscarLibroPorISBN(){
        boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.print("Ingresa el ISBN del libro a buscar: ");
                Long numero = leer.nextLong();
                if(numero != null){
                    DAOlibro dao = new DAOlibro();
                    Libro objetoLibro = dao.buscarID(numero);
                    System.out.println(objetoLibro.toString());
                    logica = false;   
                }
            } catch (Exception e) {
                System.out.println("ERROR "+e);
                leer.next();
            }
        } while (logica);
    }
    
    public void  buscarLibroPorTitulo(){
        boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.print("Ingresa el titulo del libro a buscar: ");
                String nombre = leer.next();
                
            } catch (Exception e) {
                System.out.println("ERROR "+e);
                leer.next();
            }
        } while (logica);
    }
    
    public void buscarLibroPorAutor(){
        boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.print("Ingresa el autor del libro a buscar: ");
                String nombre = leer.next();
                if(nombre!= null){
                    DAOlibro dao = new DAOlibro();
                    List<Libro> objetoLibro = dao.busquedaPorAutor(nombre);
                    for (Libro aux : objetoLibro) {
                        System.out.println(aux.toString());
                    }
                    logica = false;   
                }
            } catch (Exception e) {
                System.out.println("ERROR "+e);
                leer.next();
            }
        } while (logica);
    }
    
    public void  buscarLibroPorEditorial(){
       boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.print("Ingresa el autor del libro a buscar: ");
                String nombre = leer.next();
                if(nombre!= null){
                    DAOlibro dao = new DAOlibro();
                    List<Libro> objetoEditorial = dao.busquedaPorAutor(nombre);
                    for (Libro aux : objetoEditorial) {
                        System.out.println(aux.toString());
                    }
                    logica = false;   
                }
            } catch (Exception e) {
                System.out.println("ERROR "+e);
                leer.next();
            }
        } while (logica); 
    }
}

