/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
package Practicos_Extras;

import java.util.Scanner;

/*@author Erick*/
public class A_09_Simular_la_Division {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el numero Dividendo: ");
        int dividendo = leer.nextInt();
        System.out.print("Ingresa el numero Divisor: ");
        int divisor = leer.nextInt();
        int cociente = 0, residuo = 0;
        while (dividendo > divisor) {
            System.out.println(dividendo + "-" + divisor + "=" + (dividendo-divisor));
            residuo = dividendo - divisor;
            dividendo = residuo;
            cociente++;
        }
        System.out.println("El Residuo es: ["+ residuo+"]");
        System.out.println("El Cociente es: ["+ cociente+"]");
        
    }
    
}
