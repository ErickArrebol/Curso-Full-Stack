/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package Practicos;

import java.util.Scanner;

/*@author Erick*/
public class A_04_Centigrados_a_Farenheit {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en Centrigrados ");
        double temCentigrados = leer.nextDouble();
        double temFahrenheit =32+(9*temCentigrados/5);
        System.out.println("La temperatura "+temFahrenheit );
    }
    
}
