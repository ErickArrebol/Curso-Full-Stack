package Servicios;

import DAO.DAOautor;
import Entidades.Autor;
import java.util.Scanner;

public class ServicioAutor {

    //Crear los métodos para dar de alta/bajo o editar dichas entidades.
    public static void CrearAutor() {
        //AUTO crear
        boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("Ingresa los datos del autor");
                System.out.print("Nombre: ");
                String nombre = leer.next();
                System.out.print("Alta: ");
                Boolean alta = leer.nextBoolean();
                
                Autor autorNuevo = new Autor(nombre, alta);
                
                if (!autorNuevo.getNombre().isEmpty() && autorNuevo.getNombre() != null && autorNuevo.getAlta() != false) {
                    DAOautor dao = new DAOautor();
                    dao.guardarAutor(autorNuevo);
                    logica = false;
                    System.out.println("-- Se agrego correctamente una AUTOR --");
                }else{
                    System.out.println("El nombre no puede ir vacio o en null y el alta debe ser true");
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
                leer.next();
            }
        } while (logica);
    }

    public void desactivarAutor(){
        boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("Ingresa el nombre del Autor a eliminar");
                String autor = leer.next();
                if(autor.isEmpty() || autor == null){
                    DAOautor dao = new DAOautor();
                    Autor objeto =dao.buscarNombre(autor);
                    objeto.setAlta(false);
                }
                
            } catch (Exception e) {
                System.out.println("ERROR "+ e);
                leer.next();
            }
        } while (logica);
    }
    
    public void buscarAutorPorNombre() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        boolean logica = true;

        do {
            System.out.print("Ingresa el nombre del autor a buscar: ");
            try {
                nombre = leer.nextLine();

                if (nombre != null && !nombre.trim().isEmpty()) {
                    logica = false;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                leer.next();
            }
        } while (logica);
    }
}
