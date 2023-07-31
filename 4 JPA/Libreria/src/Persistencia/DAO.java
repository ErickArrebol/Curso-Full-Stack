package Persistencia;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*@author Erick*/
public class DAO<T> {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Crear y administrar instancias y la coneciones con la bse de datos
    Se encraga de adminisgtrar las conneciones con la base de datos*/
    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Libreria1PU");
    /*Es una interfaz de la Java Persistence API (JPA) que proporciona métodos para interactuar 
    con la base de datos y realizar operaciones de persistencia sobre entidades*/
    protected EntityManager em= emf.createEntityManager();

    protected void conectarBD() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void desconectarBD() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void crear(T objeto) {
        try {
            conectarBD();
            em.getTransaction().begin();//Declaras la transacion
            em.persist(objeto);//realiza la operacion para alamacenar el objeto 
            em.getTransaction().commit();// Validar la informcaicon si se ha guardado correctamete
        } catch (Exception e) {
            System.out.println("No se pudo Guardar el objeto en la BD");
        } finally {
            desconectarBD();
        }
    }

    protected void editar(T objeto) {
        try {
            conectarBD();
            em.getTransaction().begin();// declara un transacion
            em.merge(objeto);//realiza la operacion para alamacenar el objeto 
            em.getTransaction().commit();// Validar la informcaicon si se ha guardado correctamete
        } catch (Exception e) {
            System.out.println("No se pudo Guardar el objeto  Modificado en la BD");
        } finally {
            desconectarBD();
        }
    }

    protected void eliminar(T objeto) {
        try {
        conectarBD();
        em.getTransaction().begin();

        // Si la entidad no está administrada, obtenemos una instancia administrada antes de eliminarla
        if (!em.contains(objeto)) {
            objeto = em.merge(objeto);
        }

        em.remove(objeto); // Realiza la operación para eliminar el objeto
        em.getTransaction().commit(); // Validar la información si se ha guardado correctamente
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        desconectarBD();
    }
    }

}
