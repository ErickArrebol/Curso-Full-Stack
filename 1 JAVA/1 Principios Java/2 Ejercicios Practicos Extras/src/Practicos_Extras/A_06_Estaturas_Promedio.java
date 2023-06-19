/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class A_06_Estaturas_Promedio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Cuantas personas van a resgistar: ");
        int numeroP = leer.nextInt();
        double estatura, estaturaG = 0, estaturaE = 0;
        int contador=0;
        System.out.println("Ingresa la estatua de la perosna");
        for (int i = 0; i < numeroP; i++) {
            System.out.print((i+1)+"° ");
            estatura = leer.nextDouble();
            estaturaG+=estatura;
            if(estatura<1.60){
                estaturaE+=estatura;
                contador++;
            }
        }
        System.out.println("La estatura promedio de las "+numeroP+" personas es: "+(estaturaG/numeroP)+" Mts");
        System.out.println("La estatura promedio de "+contador+" personas que miden menos de 1.60 es: "+(estaturaE/contador)+" Mts");
    }
    
}
