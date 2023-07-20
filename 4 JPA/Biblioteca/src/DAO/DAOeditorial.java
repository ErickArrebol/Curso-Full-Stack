package DAO;

import Entidades.Editorial;
import javax.persistence.TypedQuery;

public class DAOeditorial extends DAO<Editorial>{
    
    public void guardarEditorial(Editorial editorial) {
        super.guardar(editorial);
    }

    public Editorial buscarNombre(String nombre) {
        super.conectar();
        TypedQuery<Editorial> busquedaNombre = 
        em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre AND e.alta = :logica", Editorial.class);
        busquedaNombre.setParameter("nombre", nombre);
        busquedaNombre.setParameter("logica",true);
        Editorial editorial = busquedaNombre.getSingleResult();
        super.desconectar();
        return editorial;
    }
    
    public void editarXNombre(String nombre){
        Editorial editorial = buscarNombre(nombre);
        System.out.print("Ingresa el nuevo nombre que deseas agregar ");
        editorial.setNombre(leer.next());
        super.editar(editorial);
    }
    
    public void eliminarXNombre (String nombre){
        Editorial editorial = buscarNombre(nombre);
        super.eliminar(editorial);
    }
    
    public Editorial buscarID(Long id){
        super.conectar();
        Editorial editorial = em.find(Editorial.class, id);
        super.desconectar();
        return editorial;
    }
    
    public void editarXID(Long id){
        Editorial editorial =buscarID(id);
        System.out.print("Ingresa el nuevo nombre que deseas agregar ");
        editorial.setNombre(leer.next());
        super.editar(editorial);
    }
    
    public void eliminarXID(Long id){
        Editorial editorial = buscarID(id);
        super.eliminar(editorial);
    }
}
