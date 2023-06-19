/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
package Practicos;

import java.util.Scanner;

/*@author Erick*/
public class A_05_Raiz_cuadrada {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero entero ");
        int n = leer.nextInt();
        
        System.out.println("---------------------------");
        System.out.println("EL doble de ("+ n+") es: "+(n*2));
        System.out.println("EL tiple de ("+ n+") es: "+(n*3));
        System.out.println("La Raiz Cuadrada de ("+ n+") es: "+(Math.sqrt(n)));
    }
    
}
