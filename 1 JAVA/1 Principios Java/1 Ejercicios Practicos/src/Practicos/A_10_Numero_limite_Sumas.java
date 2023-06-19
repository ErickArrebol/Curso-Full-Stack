/*Bucles y sentencias de salto break y continue

Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/
package Practicos;

import java.util.Scanner;

/**@author Erick*/
public class A_10_Numero_limite_Sumas {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor límite positivo: ");
        int valor;
        do {
            valor = leer.nextInt();
            if(valor<=0){
                System.out.print("Ingrese un valor límite positivo: ");
            }
        } while (valor<=0);
        System.out.println("Ingresa valores a sumar");
        int suma=0, n;
        for (int i = 0; i < 10; i++) {
            n=leer.nextInt();
            suma=suma+n;
            if(suma>valor){
                System.out.println("La suma de los numero ingresados es "+suma);
                System.out.println("Y el valor ingresado limite es "+ valor);
                break;
            }
        }
        
    }
    
}
