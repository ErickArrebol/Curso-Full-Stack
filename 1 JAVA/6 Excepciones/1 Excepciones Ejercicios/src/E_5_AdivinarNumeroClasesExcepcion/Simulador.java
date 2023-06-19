/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario.Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/
package E_5_AdivinarNumeroClasesExcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*@author Erick */
public class Simulador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int nAleatorio = (int) (Math.random() * 5) + 1;
        int intentos = 0;
        int n = 0;
        System.out.println("-----------   J U E G O   -----------");
        System.out.println("Adivina el numero entre el 1 y el 500");
        do {
            intentos++;
            try {
                System.out.print("Ingresa un numero ");
                n = leer.nextInt();
                throw (n < nAleatorio) ? new Menor("Tú número es menor") : (n > nAleatorio) ? new Mayor("Tú número es mayor") : new Acerto("Felicidades Acertaste con " + intentos + " intentos");

            } catch (Menor | Mayor | Acerto e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e);
                leer.next();//limpiar el Scanner para que siga corriendo OPCION 1
            }
        } while (n != nAleatorio);

        
    }

}
