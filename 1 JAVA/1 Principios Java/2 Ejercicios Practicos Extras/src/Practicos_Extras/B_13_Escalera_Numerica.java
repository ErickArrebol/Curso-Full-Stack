/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123*/
package Practicos_Extras;
import java.util.Scanner;

/* @author Erick*/
public class B_13_Escalera_Numerica {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int escalera = leer.nextInt();
        
        //OPCION 1
        String numero="";
        for (int i = 0; i < escalera; i++) {
            numero+=Integer.toString(i+1);
            System.out.println(numero);
        }
        
        //OPCION 2
//        for (int i = 1; i <= escalera; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
     

    } 
}
