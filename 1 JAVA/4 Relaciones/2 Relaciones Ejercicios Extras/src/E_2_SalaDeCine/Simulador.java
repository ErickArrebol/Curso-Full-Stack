/*Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B   | 8 C X | 8 D   | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X
6 A   | 6 B X | 6 C   | 6 D   | 6 E X | 6 F
5 A X | 5 B   | 5 C X | 5 D X | 5 E X | 5 F 
4 A   | 4 B X | 4 C   | 4 D   | 4 E X | 4 F 
3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F 
2 A   | 2 B   | 2 C X | 2 D X | 2 E X | 2 F
1 A   | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.*/
package E_2_SalaDeCine;

import java.util.ArrayList;
import java.util.Scanner;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        Cine iniciarC = new Cine();
        ArrayList<Cine> listaCine = new ArrayList<>();
        Espectador iniciarE = new Espectador();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Cuantas salas deseas crear: ");
        int numeroSalas = leer.nextInt();
        String[] titulos = iniciarC.crearNombrePeli();
        double[] duracion = iniciarC.crearDureacionPeli();
        int[] edadMinima = iniciarC.crearEdadMinimaPeli();
        String[] director = iniciarC.crearDirectorPeli();
        for (int i = 0; i < numeroSalas; i++) {

            String[][] salaCine = new String[8][6];
            ArrayList<Espectador> listaClientes = new ArrayList<>();
            int posicion = (int) (Math.random() * titulos.length);
            double costoEntradas = iniciarC.costoEntradas();
            int[] numero = {8, 7, 6, 5, 4, 3, 2, 1};
            String[] letra = {"A", "B", "C", "D", "E", "F"};
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 6; k++) {
                    String nombreCliente = iniciarE.creaNombreCliente();

                    int edadCliente = iniciarE.crearEdadCliente();
                    double dineroCliente = iniciarE.crearDineroCliente();
                    if (edadCliente >= edadMinima[posicion]) {
                        if (dineroCliente >= costoEntradas) {
                            salaCine[j][k] = "X";
                            String asiento = numero[j] + letra[k];
                            listaClientes.add(new Espectador(nombreCliente, edadCliente, asiento, dineroCliente));
                        } else {
                            salaCine[j][k] = " ";
                        }
                    } else {
                        salaCine[j][k] = " ";
                    }
                }
            }
            listaCine.add(new Cine(i + 1, titulos[posicion], duracion[posicion], edadMinima[posicion],
                    director[posicion], listaClientes, salaCine, costoEntradas));
        }
        System.out.println("");
        for (int i = 0; i < listaCine.size(); i++) {
            System.out.println("__________ SALA " + listaCine.get(i).getNumeroSalas());
            System.out.println("Pelicula " + listaCine.get(i).getTitulo() + "\n"
                    + "Duracion de " + listaCine.get(i).getDuracion() + " horas\n"
                    + "Edad minima " + listaCine.get(i).getEdadMinima() + "\n"
                    + "Director " + listaCine.get(i).getDirector());
            System.out.println("------------------------------------------");
            String[][] iprimirSala = listaCine.get(i).getSala();
            int[] numero = {8, 7, 6, 5, 4, 3, 2, 1};
            String[] letra = {"A", "B", "C", "D", "E", "F"};
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 6; k++) {
                    if (iprimirSala[j][k].equalsIgnoreCase("X")) {
                        System.out.print(numero[j] + " " + letra[k] + " " + iprimirSala[j][k] + " |");
                    } else {
                        System.out.print(numero[j] + " " + letra[k] + "  " + " |");
                    }
                }
                System.out.println("");
            }
            System.out.println("------------------------------------------");
//            ArrayList<Espectador> clientesEnSala =listaCine.get(i).getCliente();
//            for (int l = 0; l < clientesEnSala.size(); l++) {
//            System.out.println(clientesEnSala.get(l).toString());
//            }
//            System.out.println("");
        }
    }

}
