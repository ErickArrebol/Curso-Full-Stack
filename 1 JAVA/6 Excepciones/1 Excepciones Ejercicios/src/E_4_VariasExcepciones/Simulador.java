/*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/
package E_4_VariasExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.print("Ingresa un numero ");
            String n1 = leer.next();
            System.out.print("Ingresa un numero ");
            String n2 = leer.next();
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            System.out.println("El resultado la division es " + (num1 / num2));
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println(ex);
        }
        try {
            System.out.print("Ingresa un numero ");
            int n = leer.nextInt();
        } catch (InputMismatchException e) {//aplica en cualquier variable ecepto String
            System.out.println(e.toString());
        }

    }

}
