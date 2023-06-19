/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario.Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/
package E_5_AdivinarNumero;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author Erick*/
public class Simulador {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int nAleatorio = (int) (Math.random() * 5) + 1;
        int intentos = 0;
        int n = 0;
        System.out.println("");
        System.out.println("-----------   J U E G O   -----------");
        System.out.println("Adivina el numero entre el 1 y el 500");
       do { //opcion 2 usando solo las excepciones en el main
            intentos++;
            System.out.print("Advinia el numero ");
            try {
                n = leer.nextInt();
                if (n < nAleatorio) {
                    System.out.println("El numero es mayor");
                }
                if (n > nAleatorio) {
                    System.out.println("El numero es menor");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error Ingresa solo numeros");
                leer.next();//limpiar el Scanner para que siga corriendo OPCION 1
            }
        } while (n != nAleatorio);
        System.out.println("");
        System.out.println("Felicidades Acertaste con " + intentos + " intentos");
    }
    
}
