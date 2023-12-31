package Persistencia;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.List;

public class DAOlibro extends DAO<Libro> {

    public DAOlibro() {
    }

    public void guardarLibro(Libro libro) {
        super.crear(libro);
    }

    public void editarLibro(Libro libro) {
        super.editar(libro);
    }

    public void darDeBajaLibro(Libro libro) {
        super.editar(libro);
    }

    public void eliminarLibro(Libro libro) {
        super.eliminar(libro);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List bucarLibroPorAutor(String nombre) {
        List<Libro> libros = new ArrayList<>();
        try {
            super.conectarBD();
            libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombre AND a.alta = 1", Libro.class)
                    .setParameter("nombre", "%" + nombre + "%").getResultList();
        } catch (Exception e) {
            System.out.println("No se encontro el libro");
        } finally {
            super.desconectarBD();
        }
        return libros;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Libro bucarLibroPorISBN(Long isbn) {
        Libro busqueda = new Libro();
        try {
            super.conectarBD();
            busqueda = em.find(Libro.class, isbn);
        } catch (Exception e) {
            System.out.println("Libro no encontrado");
        } finally {
            super.desconectarBD();
        }
        return busqueda;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List bucarLibroPorTitulo(String nombre) {
        List<Libro> libros = new ArrayList<>();
        try {
            super.conectarBD();
            libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre AND l.alta = 1", Libro.class)
                    .setParameter("nombre", "%" + nombre + "%").getResultList();
        } catch (Exception e) {
            System.out.println("{NO SE ENCONTRO EL LIBRO EN LA BD}");
        } finally {
            super.desconectarBD();
        }
        return libros;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List bucarLibroPorEditorial(String nombre) {
        List<Libro> libros = new ArrayList<>();
        try {
            super.conectarBD();
            libros = em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :nombre AND e.alta = 1", Libro.class)
                    .setParameter("nombre", "%" + nombre + "%").getResultList();
        } catch (Exception e) {
            System.out.println("No se encontro el libro(s)");
        } finally {
            super.desconectarBD();
        }
        return libros;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List buscarLibroPorLetra(String nombre) {

        List<Libro> libros = new ArrayList<>();
        try {
            super.conectarBD();
            libros = em.createQuery("SELECT l FROM Libro l  WHERE l.titulo LIKE :nombre AND l.alta = 1", Libro.class)
                    .setParameter("nombre", nombre + "%").getResultList();
        } catch (Exception e) {
            System.out.println("No se encontro el libro(s)");
        } finally {
            super.desconectarBD();
        }
        return libros;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List bucarLibroParaDarDeAlta(String nombre) {
        List<Libro> libros = new ArrayList<>();
        try {
            super.conectarBD();
            libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre AND l.alta = 0", Libro.class)
                    .setParameter("nombre", "%" + nombre + "%").getResultList();
        } catch (Exception e) {
            System.out.println("No se encontro el libro");
        } finally {
            super.desconectarBD();
        }
        return libros;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List bucarLibroParaDarDeBaja(String nombre) {
        List<Libro> libros = new ArrayList<>();
        try {
            super.conectarBD();
            libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre AND l.alta = 1 ", Libro.class)
                    .setParameter("nombre", "%" + nombre + "%").getResultList();
        } catch (Exception e) {
            System.out.println("No se encontro el libro");
        } finally {
            super.desconectarBD();
        }
        return libros;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
