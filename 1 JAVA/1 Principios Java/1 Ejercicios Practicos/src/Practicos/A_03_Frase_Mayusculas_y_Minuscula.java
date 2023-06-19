/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.*/
package Practicos;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
/* @author Erick*/
public class A_03_Frase_Mayusculas_y_Minuscula {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        System.out.print("Ingresa una frase: ");
        String frase = leer.nextLine();
        System.out.println("La frase en mayusculas: "+ toUpperCase(frase));
        System.out.println("La frase en minusculas: "+toLowerCase(frase));
    }   
}
