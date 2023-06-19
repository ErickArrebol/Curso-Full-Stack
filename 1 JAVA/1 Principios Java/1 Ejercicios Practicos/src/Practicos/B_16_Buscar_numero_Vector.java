/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
package Practicos;
import java.util.Scanner;
/*@author Erick*/
public class B_16_Buscar_numero_Vector {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la dimension del Vector ");
        int d = leer.nextInt();
        int [] vector = new int [d];
        //Llenado del vector aleatoriamente
        for (int i = 0; i <vector.length; i++) {
            vector[i]=(int)(Math.random()*100);
        }
        System.out.print("Ingresa un numero a buscar en el Vector ");
        int nBuscar = leer.nextInt();
        int contador=0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]==nBuscar){
                System.out.println("el numero se encuentra en la posicion: "+i);
                contador++;
            }
        }
        if(contador>=2){
           System.out.println("Se ecnuetra repetido "+contador+" veces"); 
        }else if(contador==0){
            System.out.println("No se ecnotro el numero en el vector");
        }
            
        
    }
    
}
