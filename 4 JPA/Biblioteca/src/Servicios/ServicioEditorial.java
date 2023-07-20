package Servicios;

import DAO.DAOeditorial;
import Entidades.Editorial;
import java.util.Scanner;

public class ServicioEditorial {

    public static void CrearEditorial() {
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

                Editorial editorialNuevo = new Editorial(nombre, alta);

                if (!editorialNuevo.getNombre().isEmpty() && editorialNuevo.getNombre() != null && editorialNuevo.getAlta() != false) {
                    DAOeditorial dao = new DAOeditorial();
                    dao.guardarEditorial(editorialNuevo);
                    logica = false;
                    System.out.println("-- Se agrego correctamente una EDITORIAL --");
                } else {
                    System.out.println("El nombre no puede ir vacio o en null y el alta debe ser true");
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
                leer.next();
            }
        } while (logica);
    }

    public void BajaEditorial() {
        boolean logica = true;
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {

            } catch (Exception e) {
            }
        } while (true);

    }
}
