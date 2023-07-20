package DAO;

import Entidades.Libro;
import java.util.List;
import javax.persistence.TypedQuery;

public class DAOlibro extends DAO<Libro> {

    public void guardarLibro(Libro libro) {
        super.guardar(libro);
    }

    public Libro buscarNombre(String titulo) {
        super.conectar();
        TypedQuery<Libro> busquedaNombre
                = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo AND l.alta = :logica", Libro.class);
        busquedaNombre.setParameter("titulo", titulo);
        busquedaNombre.setParameter("logica", true);
        Libro libro = busquedaNombre.getSingleResult();
        super.desconectar();
        return libro;
    }

    public void editarXNombre(String nombre) {
        Libro libro = buscarNombre(nombre);
        System.out.print("Ingresa el nuevo nombre que deseas agregar ");
        libro.setTitulo(leer.next());
        super.editar(libro);
    }

    public void eliminarXNombre(String nombre) {
        Libro libro = buscarNombre(nombre);
        super.eliminar(libro);
    }

    public Libro buscarID(Long id) {
        super.conectar();
        Libro libro = em.find(Libro.class, id);
        super.desconectar();
        return libro;
    }

    public void editarXID(Long id) {
        Libro libro = buscarID(id);
        System.out.print("Ingresa el nuevo nombre que deseas agregar ");
        libro.setTitulo(leer.next());
        super.editar(libro);
    }

    public void eliminarXID(Long id) {
        Libro libro = buscarID(id);
        super.eliminar(libro);
    }

    public List busquedaPorAutor(String nombre) {
        super.conectar();
        List<Libro> autores =  em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre = :nombre", Libro.class).setParameter("nombre", nombre).getResultList();
        super.desconectar();
        return autores;
    }

    public List busquedaPorEditorial(String nombre) {
        super.conectar();
        List<Libro> libros =  em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre = : nombre", Libro.class).setParameter("nombre", nombre).getResultList();
        super.desconectar();
        return libros;
    }
}
