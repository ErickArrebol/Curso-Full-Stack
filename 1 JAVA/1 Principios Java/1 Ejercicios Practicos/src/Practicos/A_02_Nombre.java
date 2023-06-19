/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/
package Practicos;

import java.util.Scanner;
/*@author Erick*/
public class A_02_Nombre {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa tu Nombre: ");
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresa es: "+nombre);
        
    }  
}
