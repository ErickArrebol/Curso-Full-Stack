package E_06_Cafetera;

import java.util.Scanner;

/*@author Erick*/
public class Servicio {

    public Cafetera llenarCafetera() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----------------------------------------------");
        System.out.println("---DATOS NECESARIOS PARA INCIAR EL SOFTWARE---");
        System.out.println("----------------------------------------------");
        Cafetera llenado = new Cafetera();
        System.out.println("Cuantos mililitros de cafe caben en la cafetera");
        llenado.setCapacidadMaxima(leer.nextDouble());
        System.out.println("Ingresa la cantidad en mililitros de cafe actual de la cafetera");
        llenado.setCantidadActual(leer.nextDouble());

        return llenado;
    }

    public void servirTaza(Cafetera llenado) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int tasa;
        System.out.println("Cual es el tamaño actual de la tasa en ml");
        tasa = leer.nextInt();
        if (tasa <= llenado.getCantidadActual()) {
            llenado.setCantidadActual(llenado.getCantidadActual() - tasa);
            System.out.println("Se lleno la tasa");
        } else {
            llenado.setCantidadActual(llenado.getCantidadActual() - llenado.getCantidadActual());
            System.out.println("La tasa no se lleno");
            System.out.println("se sirvio la cantidad de " + llenado.getCantidadActual() + "ml");
        }
    }

    public void vaciarCafetera(Cafetera llenado) {
        llenado.setCantidadActual(llenado.getCantidadActual() - llenado.getCantidadActual());
    }

    public void agregarCafe(Cafetera llenado) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int servir;
        System.out.println("¿Cuanto cafe quieres?");
        servir = leer.nextInt();
        if (llenado.getCantidadActual() == 0) {
            llenado.setCantidadActual(servir);
            System.out.println("Listo.... se sirvio " + servir + "Mililitros");
        } else {
            llenado.setCantidadActual(llenado.getCantidadActual() - llenado.getCantidadActual());
            llenado.setCantidadActual(servir);
        }
    }
}
