/*Funciones en Java

Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/
package Practicos;

/*@author Erick*/
public class B_15_Numeros_Primos_vector {

    public static void main(String[] args) {
        System.out.println("----NUMEROS PRIMOS---");
        
        int [] vector = new int [100];
       numeroPrimos(vector);
    } 
    public static void numeroPrimos (int [] vector){
        int contador=0;
        int nVector=0;
         for (int i = 2; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                if(i%j==0){
                    contador++;
                }
                               
            }
            if(contador==2){
                    vector[nVector]=i;
                    nVector++;
                    if(nVector==100){
                        break;
                    }
                }
                contador=0;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("["+vector[i]+"] ");
        }
    }
}
