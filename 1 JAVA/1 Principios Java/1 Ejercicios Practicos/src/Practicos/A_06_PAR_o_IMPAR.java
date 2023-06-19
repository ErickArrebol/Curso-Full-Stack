/*Condicionales en Java
Crear un programa que dado un numero determine si es par o impar.*/
package Practicos;
import java.util.Scanner;
/* @author Erick*/
public class A_06_PAR_o_IMPAR {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un Numero Enetro ");
        int n = leer.nextInt();
        if (n%2==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    } 
}
