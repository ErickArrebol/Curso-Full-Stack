/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class B_11_Contar_Digitos_de_un_Numero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = leer.nextInt();
        int contador = 0;
        //Opcion 1
        while (numero != 0) {
            //System.out.println(numero);
            numero /= 10; // Divide el número por 10 para eliminar el último dígito
            contador++; // Incrementa el contador de dígitos
        }
        //opcion 2
//        int operacion = 0;
//        while(numero != 0){
//            System.out.println(numero);
//            operacion = numero / 10 ;
//            numero = (int) operacion ;
//            contador++;
//        }
        System.out.println("El número tiene " + contador + " dígitos.");
    }
    
}
