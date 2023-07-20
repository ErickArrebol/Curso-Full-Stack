package DAO;

import Entidades.Autor;
import javax.persistence.TypedQuery;

public class DAOautor extends DAO<Autor> {

    public void guardarAutor(Autor autor) {
        super.guardar(autor);
    }

    public Autor buscarNombre(String nombre) {
        super.conectar();
        TypedQuery<Autor> busquedaNombre
                = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre ADN a.alta = :logica", Autor.class);
                busquedaNombre.setParameter("nombre", nombre);
                busquedaNombre.setParameter("logica",true);
        Autor autor = busquedaNombre.getSingleResult();
        super.desconectar();
        return autor;
    }

    public void editarXNombre(String nombre) {
        Autor autor = buscarNombre(nombre);
        System.out.print("Ingresa el nuevo nombre que deseas agregar ");
        autor.setNombre(leer.next());
        super.editar(autor);
    }

    public void eliminarXNombre(String nombre) {
        Autor autor = buscarNombre(nombre);
        super.eliminar(autor);
    }

    public Autor buscarID(Long id) {
        super.conectar();
        Autor autor = em.find(Autor.class, id);
        super.desconectar();
        return autor;
    }

    public void editarXID(Long id) {
        Autor autor = buscarID(id);
        System.out.print("Ingresa el nuevo nombre que deseas agregar ");
        autor.setNombre(leer.next());
        super.editar(autor);
    }

    public void eliminarXID(Long id) {
        Autor autor = buscarID(id);
        super.eliminar(autor);
    }
}
