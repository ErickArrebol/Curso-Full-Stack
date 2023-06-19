/*1.- Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/
package E_2_Ruleta_De_Agua_Rusa;

import java.util.Scanner;

/*@author Erick*/
public class RevolverDeAgua {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int posicionActual;
    private int posicionAgua;
    private int numeroJugadores;

    public int cantidadDeJugadores() {

        System.out.print("Deseas poner cuantos van a jugar Si(cualquier caracter) No(n): ");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("N")) {
            numeroJugadores = 6;
        } else {
            System.out.print("Cuanto juegan: ");
            int n = leer.nextInt();
            numeroJugadores = n;
        }
        return numeroJugadores;
    }

//    llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
//    Los valores deben ser aleatorios.
    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * numeroJugadores) + 1;
        posicionAgua = (int) (Math.random() * 6) + 1;
    }
//    mojar(): devuelve true si la posición del agua coincide con la posición actual

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

//    siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro() {
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual++;
        }
        segundo();
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

//    toString(): muestra información del revolver (posición actual y donde está el agua)
    @Override
    public String toString() {
        return "Revolver De Agua{" + "posicion Actual: " + posicionActual + ", Posicion del Agua: " + posicionAgua + '}';
    }

    private static void segundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

}
