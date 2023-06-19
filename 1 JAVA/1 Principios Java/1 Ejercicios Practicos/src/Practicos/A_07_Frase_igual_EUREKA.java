/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
package Practicos;

import java.util.Scanner;

/*@author Erick*/
public class A_07_Frase_igual_EUREKA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase =  leer.nextLine();
        if(frase.equals("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }  
}
