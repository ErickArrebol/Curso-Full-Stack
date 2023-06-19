package E_2_EliminarPerro;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    public Perros creasRazas() {
        Perros r = new Perros();
        Scanner leer = new Scanner(System.in);
        ArrayList<String> listado = new ArrayList();
        String letra = "";
        String opcion = "";
        do {
            System.out.print("Ingresa un Raza de perro ");
            letra = leer.nextLine();
            listado.add(letra);

            do {
                System.out.print("Deseas agregar mas perros Si(s) y No (n) ");
                opcion = leer.nextLine();
                switch (opcion) {
                    case "s":
                        System.out.println("------------------------------------------");
                        System.out.println("");
                    case "n":
                        System.out.println("------------         FIN       ------------");
                    default:
                        System.out.println("Error");
                        System.out.println("Vuelve a ingresa la variable");
                }

            } while (!"n".equals(opcion));

        } while (!"n".equals(opcion));

        for (String aux : listado) {
            System.out.print("[" + aux + "] ");
        }
        r.setNombreMascota(listado);
        eliminarPerros();

        return r;
    }

    public void eliminarPerros() {
        Perros r = new Perros();
        Scanner leer = new Scanner(System.in);
        ArrayList<String> eliminar = (ArrayList<String>) r.getNombreMascota();
        System.out.println("");
        System.out.print("Ingresa una raza a eliminar ");
        String raza = leer.next();
        for (int i = 0; i < eliminar.size(); i++) {
            String nombre = eliminar.get(i);
            if (nombre.equals(raza)) {
                eliminar.remove(nombre);
            }
        }
        for (String aux : eliminar) {
            System.out.print("[" + aux + "] ");
        }

    }

}
