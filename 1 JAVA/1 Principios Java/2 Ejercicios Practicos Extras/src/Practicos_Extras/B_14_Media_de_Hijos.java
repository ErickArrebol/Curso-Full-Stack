/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.*/
package Practicos_Extras;

import java.util.Scanner;

/*@author Erick*/
public class B_14_Media_de_Hijos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de familias: ");
        int familias = leer.nextInt();
        int hijos = 0, edades = 0 , hijosTotales = 0, suma=0;
        double media=0;
        
        System.out.println("Ingresa la cantidad de hijos");
        for (int i = 0; i < familias; i++) {
            
            System.out.print("Familia "+(i+1)+" ");
            hijos = leer.nextInt();
            hijosTotales+= hijos;
            
            System.out.println("Ingresa la edad");
            for (int j = 0; j < hijos; j++) {
                System.out.print("hijo "+(j+1)+" ");
                edades = leer.nextInt();
                suma+=edades;
            }
        }
        media = suma / hijosTotales;
        System.out.println("La Media de Edad de los hijos de todas las Familias es: "+media);
    }   
}
