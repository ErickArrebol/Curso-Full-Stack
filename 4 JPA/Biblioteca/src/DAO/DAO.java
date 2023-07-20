package DAO;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAO<ObjetoGenerico>{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Libreria"); // ACCESO A LA TABLA
    protected EntityManager em = emf.createEntityManager();// CONNECIONES
    
    
    public void conectar(){
        if(!em.isOpen()){
            em = emf.createEntityManager();// esto es para conectar
        }
    }
    
    public void desconectar(){
        if(em.isOpen()){
            em.close();// este cierra la coneccion
        }
    }
    
    public void guardar(ObjetoGenerico datos){
        conectar();
        em.getTransaction().begin();// declara un transacion
        em.persist(datos);//realiza la operacion para alamacenar el objeto 
        em.getTransaction().commit();// Validar la informcaicon si se ha guardado correctamete
        desconectar();
    }

    public void editar(ObjetoGenerico datos){
        conectar();
        em.getTransaction().begin();
        em.merge(datos);
        em.getTransaction().commit();
        desconectar();
    }
    
    public void eliminar(ObjetoGenerico datos){
        conectar();
        em.getTransaction().begin();
        em.remove(datos);
        em.getTransaction().commit();
        desconectar();
    }
       
}
