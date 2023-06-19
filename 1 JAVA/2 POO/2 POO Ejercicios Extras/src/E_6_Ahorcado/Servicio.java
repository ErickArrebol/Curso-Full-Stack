package E_6_Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class Servicio {

    public Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ahorcado iniciarA = new Ahorcado();
        System.out.println("---------- JUEGO AHORCADO- --------------");
        System.out.print("Ingresa una palabra de ahorcado ");
        String frase = leer.next();
        iniciarA.setBuscarp(frase.split(""));
        System.out.print("Ingresa la cantidad de jugadas maximas ");
        iniciarA.setOportunidades(leer.nextInt());
        System.out.println("------------------------------------------");
        return iniciarA;
    }

    public void longitud() {
        Ahorcado iniciarA = new Ahorcado();
        System.out.println("La longitud de la Frase es " + iniciarA.getBuscarp().length);
    }

    public void buscar() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ahorcado iniciarA = new Ahorcado();
        System.out.print("Ingrese la letra a buscar ");
        char letra = leer.next().charAt(0);
        iniciarA.setContador(0);
        boolean logico = false;
        int cont = 0;
        int longitud = iniciarA.getBuscarp().length;
        String[] vector = new String[iniciarA.getBuscarp().length];
        vector = iniciarA.getBuscarp();
        for (int i = 0; i < longitud; i++) {
            //el codigo de abajo sirve para leer tanto 
            //minusculas como mayuculas por igual
            if (vector[i].equalsIgnoreCase(String.valueOf(letra))) {
                cont++;
                iniciarA.setLetrasEcontradas(cont + iniciarA.getLetrasEcontradas());
                iniciarA.setContador(cont + iniciarA.getContador());
                logico = true;
            }
        }

        if (logico == true) {
            System.out.println("La letra (SI) se ecnuentra en la frase");
        } else {
            System.out.println("La letra (NO) se ecnuentra en la frase");
        }

        encontradas();
    }

    public void encontradas() {
        Ahorcado iniciarA = new Ahorcado();
        int cont = iniciarA.getContador();
        int letras = iniciarA.getBuscarp().length;
        System.out.println("Numero de letras (Encontradas,Faltantes): " + "(" + iniciarA.getLetrasEcontradas() + "," + (letras - iniciarA.getLetrasEcontradas()) + ")");
    }

    public void intentos() {

        Ahorcado iniciarA = new Ahorcado();
        int contador = 0;
        for (int i = 0; i < iniciarA.getOportunidades(); i++) {
            System.out.println("");
            longitud();
            buscar();
            contador++;
            System.out.println("Numero de intentos restnates " + (iniciarA.getOportunidades() - contador));
            System.out.println("-------------------------------------------");
            if (i == iniciarA.getOportunidades() - 1) {
                System.out.println("");
                System.out.println("SE ACABO EL JUEGO TE QUEDADOTE SIN INTENTOS");
                System.out.println("-------------------------------------------");
                break;
            }
            if (iniciarA.getLetrasEcontradas() == iniciarA.getBuscarp().length) {
                System.out.println("");
                System.out.println("------  HAS GANADO  ------");
                System.out.println("La Frase " + Arrays.toString(iniciarA.getBuscarp()));
                System.out.println("---------------------------");
                break;
            }

        }

    }

    public Ahorcado juego() {
        Ahorcado iniciarA = new Ahorcado();
        crearJuego();
        intentos();
        return iniciarA;
    }
}
