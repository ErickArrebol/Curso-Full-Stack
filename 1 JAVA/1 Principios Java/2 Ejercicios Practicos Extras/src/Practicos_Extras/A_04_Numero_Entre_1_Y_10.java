/*Elaborar un algoritmo en el cuall se ingrese un numero entre 1 y 10 y se muestre su
  equivalente en romano*/
package Practicos_Extras;
import java.util.Scanner;

/**@author Erick*/
public class A_04_Numero_Entre_1_Y_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero entre el 1 y el 10: ");
        int numero;
        do {
            numero = leer.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.print("INVALIDO - vuelve a ingresar el numero: ");
            }
        } while (numero < 1 || numero > 10);
        switch (numero) {
            case 1:
                System.out.println("El numero ingresa en romado es I");
                break;
            case 2:
                System.out.println("El numero ingresa en romado es II");
                break;
            case 3:
                System.out.println("El numero ingresa en romado es III");
                break;
            case 4:
                System.out.println("El numero ingresa en romado es IV");
                break;
            case 5:
                System.out.println("El numero ingresa en romado es V");
                break;
            case 6:
                System.out.println("El numero ingresa en romado es VI");
                break;
            case 7:
                System.out.println("El numero ingresa en romado es VII");
                break;
            case 8:
                System.out.println("El numero ingresa en romado es VIII");
                break;
            case 9:
                System.out.println("El numero ingresa en romado es IX");
                break;
            case 10:
                System.out.println("El numero ingresa en romado es X");
                break;
        }      
        
        
    }  
}
