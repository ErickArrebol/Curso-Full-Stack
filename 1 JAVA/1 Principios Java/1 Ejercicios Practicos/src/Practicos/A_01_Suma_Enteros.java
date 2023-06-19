/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/
package Practicos;
import java.util.Scanner;
/*@author Erick*/
public class A_01_Suma_Enteros {
//
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingresa 2 numeros");
        System.out.print("1° ");
        int n1 = leer.nextInt();
        System.out.print("2° ");
        int n2 =  leer.nextInt();
        System.out.println("La suma de los numero es: "+(n1+n2));
    }  
}
