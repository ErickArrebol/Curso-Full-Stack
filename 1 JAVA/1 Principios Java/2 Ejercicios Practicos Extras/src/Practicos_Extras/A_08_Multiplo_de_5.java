/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
package Practicos_Extras;

import java.util.Scanner;

/*@author Erick*/
public class A_08_Multiplo_de_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nPares = 0, nImpares = 0, cantidadN = 0, numero;
        System.out.println("Ingresa un numero");
        while (true) {
            System.out.print("Ingresa un numero: ");
            numero = leer.nextInt();
            //Validar si el numero ingresado es multiplo de 5
            if (numero % 5 == 0){
                break;
            }
            //Valida si el numero es negativo
            if (numero < 0){
                continue;//este comando es para saltar la iteración actual y continuar con la siguiente
            }
            cantidadN++;
            //valida numero pares o impares
            if(numero % 2 ==0){
                nPares++;
            }else{
                nImpares++;
            }
        }

    }
    
}
