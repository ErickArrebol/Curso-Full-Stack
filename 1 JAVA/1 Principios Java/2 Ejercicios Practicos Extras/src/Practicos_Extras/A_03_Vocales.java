/*Elaborar un algoritmo en el cuÃ¡l se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la funciÃ³n equals() de la clase String.*/
package Practicos_Extras;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/* @author Erick*/
public class A_03_Vocales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una letra");
        String letra = leer.nextLine();
        
        //opcion 1
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("El caracter ingresado es una vocal");
        } else {
            System.out.println("El caracter ingresdo no es vocal");
        }

        
        //opcion 2
//        String vocalA = "a", vocalE = "e", vocalI = "i", vocalO = "o", vocalU = "u";
//        if (letra.equalsIgnoreCase(vocalA) || letra.equalsIgnoreCase(vocalE) || letra.equalsIgnoreCase(vocalI) || letra.equalsIgnoreCase(vocalO) || letra.equalsIgnoreCase(vocalU)) {
//            System.out.println("El caracter ingresado es una vocal");
//        } else {
//            System.out.println("El caracter ingresdo no es vocal");
//        }
        

        //opcion 3
//        switch (toUpperCase(letra) ) {
//            case "A":System.out.println("El caracter ingresado es una vocal");
//            break;
//            case "E":System.out.println("El caracter ingresado es una vocal");
//            break;
//            case "I":System.out.println("El caracter ingresado es una vocal");
//            break;
//            case "O":System.out.println("El caracter ingresado es una vocal");
//            break;
//            case "U":System.out.println("El caracter ingresado es una vocal");
//            break;
//            default:System.out.println("El caracter ingresdo no es vocal");
//            break;
//        }
        
    }
}
