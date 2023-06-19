/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
package Practicos;

import java.util.Scanner;

/*@author Erick*/
public class B_13_Cuadro_con_asteriscos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa dimension de cuadrado que sea mayor a dos: ");
        int dimension = leer.nextInt();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {

                if(i==0 || j==0 || i==dimension-1 || j==dimension-1){//se imprimen los bordes con asteriscos
                    System.out.print("* ");  
                }else{// se imprime el area con 2 espacios
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
    
}
