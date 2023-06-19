package E_5_Paises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Paises a = new Paises();
    Set<String> conjunto = new TreeSet<>();
    List<String> lista = new ArrayList<>();

    public void creasPaises() {
        boolean salir = false;
        String pais = "";
        String opcion;
        while (!salir) {
            System.out.print("Ingrese un país: ");
            a.setPaises(leer.nextLine());
            pais = a.getPaises();
            if (conjunto.contains(pais)) {
                System.out.println("El país ya está en la lista.");
            } else {
                lista.add(pais);
                conjunto.add(pais);
                a.setPais(conjunto);
                System.out.println("El país ha sido agregado.");
            }

            System.out.print("¿Quiere ingresar otro país? (s/n): ");
            opcion = leer.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                salir = true;
            }
        }
    }

    public void ListaPaisesImpresa() {
        System.out.println("\nLista de países:");
        for (String lista : lista) {
            System.out.println(lista);
        }
    }

    public void ListaPaisesImpresaAlfabeticamente() {
        System.out.println("\nLista de países ordenados alfabéticamente:");
        Iterator<String> iter = conjunto.iterator();
        while (iter.hasNext()) {
            System.out.println("- " + iter.next());
        }
    }
    
    public void BuscarPais(){
        System.out.print("\nIngrese un país para eliminar: ");
        String paisEliminar = leer.nextLine();
        if (conjunto.remove(paisEliminar)) {
            System.out.println("El país ha sido eliminado.");
            System.out.println("Lista de países actualizada:");
            for (String pais : conjunto) {
                System.out.println("- " + pais);
            }
        } else {
            System.out.println("El país no se encuentra en la lista.");
        }
    }
}
