/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
package Practicos;
import java.util.Scanner;
/*@author Erick*/
public class B_20_Cuadro_Magico {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//        System.out.print("Ingresa la dimesnion de cuadro magico que sea mayor a 2 ");
//        int dimension = leer.nextInt();
        int d=3;
        //llENADO DE MATRIZ
        int [][] matrizMagica = new int [d][d];
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica.length; j++) {
                matrizMagica[i][j]=leer.nextInt();
            }  
        }
        //COMPOBAR SI LA MATRIZ NO TIENE NUMEROS REPETIDOS
        int numeroRepetido=matrizMagica[0][0],contador=0;
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica.length; j++) {
                if(numeroRepetido==matrizMagica[i][j]){
                   contador++;
                   if(contador==2){
                       System.out.println("EL CUBO NO ES MAGICO");
                       break;
                   }
                }
            }
        }
        
        
        
        
        
        
    } 
}
