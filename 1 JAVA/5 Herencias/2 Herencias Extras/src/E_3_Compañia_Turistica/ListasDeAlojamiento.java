package E_3_Compañia_Turistica;

import java.util.Scanner;

/*@author Erick*/
public class ListasDeAlojamiento {

    private Hotel[] hoteles;
    private Camping[] campings;
    private Residencia[] residencias;

    public ListasDeAlojamiento() {
    }

    public void crearListas() {
        listaHotel();
        listaCamping();
        listaResidenciales();
    }

    public Hotel[] getHoteles() {
        return hoteles;
    }

    public Camping[] getCampings() {
        return campings;
    }

    public Residencia[] getResidencias() {
        return residencias;
    }

    public Hotel[] listaHotel() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio a = new Servicio();
        System.out.print("Cuantos hoteles Maneja la compania ");
        int cantidad = leer.nextInt();
        hoteles = new Hotel[cantidad];
        for (int i = 0; i < hoteles.length; i++) {
            if (i % 2 == 0) {
                hoteles[i] = new Hotel4Estrellas(a.craerGimnasio(), a.crearNombreRestaurantes(), a.craerCapacidadRestaunate(), a.crearCantidadHabitaciones(), a.crearCantidadCamas(), a.crearCantidadPisos(), a.crearNombreHoteles(), a.crearDirecionAlojamientos(), a.crearLocalidadAlojamiento(), a.crearNombreGerente());
            } else {
                hoteles[i] = new Hotel5Estrellas(a.craerGimnasio(), a.crearNombreRestaurantes(), a.craerCapacidadRestaunate(), a.craerCapacidadSalones(), a.craerCapacidadSuits(), a.craerCapacidadLimosinas(), a.crearCantidadHabitaciones(), a.crearCantidadCamas(), a.crearCantidadPisos(), a.crearNombreHoteles(), a.crearDirecionAlojamientos(), a.crearLocalidadAlojamiento(), a.crearNombreGerente());
            }
        }
        return hoteles;
    }

    public Camping[] listaCamping() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio a = new Servicio();
        System.out.print("Cuantos Camping maneja la compania ");
        int cantidad = leer.nextInt();
        campings = new Camping[cantidad];
        for (int i = 0; i < campings.length; i++) {
            campings[i] = new Camping(a.crearCapacidadMAxima(), a.crearCantidadBanio(), a.crearFalsoVerdadero(), a.crearFalsoVerdadero(), a.crearMetrosCuadrados(), a.crearNombreCamping(), a.crearDirecionAlojamientos(), a.crearLocalidadAlojamiento(), a.crearNombreGerente());
        }
        return campings;
    }

    public Residencia[] listaResidenciales() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio a = new Servicio();
        System.out.print("Cuantos Residenciales maneja la Compania ");
        int cantidad = leer.nextInt();
        residencias = new Residencia[cantidad];
        for (int i = 0; i < residencias.length; i++) {
            residencias[i] = new Residencia(a.crearCantidadHabitaciones(), a.crearFalsoVerdadero(), a.crearFalsoVerdadero(), a.crearFalsoVerdadero(), a.crearMetrosCuadrados(), a.crearNombreResidencias(), a.crearDirecionAlojamientos(), a.crearLocalidadAlojamiento(), a.crearNombreGerente());
        }
        return residencias;
    }
}
