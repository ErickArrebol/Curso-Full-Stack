/*Vectores y Matrices en Java

Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
package Practicos;
import java.util.Scanner;
/*@author Erick*/
public class B_14_euro_convertir_a {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una cantidad en EUROS: ");
        double euro = leer.nextDouble();
        convertidosMoneda(euro);
    }
    public static void convertidosMoneda (double euro){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa a que moneda deseas convertir: ");
        String moneda = leer.nextLine();
        switch (moneda.toLowerCase()) {
            case "dolares":
                System.out.println("La cantidad en DOLARES es: "+(euro*1.28611));
                break;

            case "yenes":
                System.out.println("La cantidad en LIBRAS es: "+(euro *0.86));
                break;            
            case "libras":
                System.out.println("La cantidad en YENES es: "+(euro*129.852));
                break;
            default:
                System.out.println("---Erros Moneda no valida---");
        }        
    }
}
