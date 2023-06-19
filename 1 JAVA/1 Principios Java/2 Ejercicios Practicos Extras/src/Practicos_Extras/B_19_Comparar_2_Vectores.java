/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class B_19_Comparar_2_Vectores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Llenado de vectores Automatico
        int dimension = (int) (Math.random() * 10);
        int conta = 0;
        int[] vector1 = new int[dimension];
        int[] vector2 = new int[dimension];

        for (int i = 0; i < dimension; i++) {//Llenado del vectores
            vector1[i] = (int) (Math.random() * 2);
            vector2[i] = (int) (Math.random() * 2);
        }
        for (int i = 0; i < dimension; i++) {//comparacion de vectores
            if (vector1[i] == vector2[i]) {
                conta++;
            }
        }
        if (conta == dimension) {
            System.out.println("Los vectores SI son iguales");
        } else {
            System.out.println("Los vectores NO son iguales");
        }
        
        //Llenado de los vectores manuales
//        int contador = 0;
//        System.out.print("Ingresa la dimension de vector: ");
//        int tamaño = leer.nextInt();        
//        int [] listaA = new int [tamaño];
//        int [] listaB = new int [tamaño];
//        System.out.println("Lista A");
//        for (int i = 0; i < tamaño; i++) {
//            System.out.print("listaA "+(i+1)+"° ");
//            listaA[i]=leer.nextInt();
//        }
//        System.out.println("Lista B");
//        for (int i = 0; i < tamaño; i++) {
//            System.out.print("listaB "+(i+1)+"° ");
//            listaB[i]=leer.nextInt();
//        }
//        for (int i = 0; i < tamaño; i++) {//comparacion de vectores
//            if(listaA[i] == listaB[i]){
//              contador++;  
//            }
//        }
//        if(contador == tamaño){
//            System.out.println("Los vectores SI son iguales");
//        }else{
//            System.out.println("Los vectores NO son iguales");
//        }      
    }
}
