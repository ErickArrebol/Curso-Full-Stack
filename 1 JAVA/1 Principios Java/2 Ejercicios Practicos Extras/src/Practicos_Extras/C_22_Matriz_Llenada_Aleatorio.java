/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.*/
package Practicos_Extras;

/* @author Erick*/
public class C_22_Matriz_Llenada_Aleatorio {

    public static void main(String[] args) {
        int suma = 0;
        int [][] matriz = new int [4][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] =(int) (Math.random() * 100);
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los numero de la Matriz es: "+ suma);
    }  
}
