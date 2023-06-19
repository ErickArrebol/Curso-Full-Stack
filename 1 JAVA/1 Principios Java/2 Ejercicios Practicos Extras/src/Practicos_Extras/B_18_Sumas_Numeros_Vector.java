/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class B_18_Sumas_Numeros_Vector {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector = new int [10];
        int suma = 0;
        System.out.println("Ingresa "+vector.length+" numeros al vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Numero "+(i+1)+"° ");
            vector[i] = leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("El total de la suma de los numero del vector es: "+suma);
    }  
}
