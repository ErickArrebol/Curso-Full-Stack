/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números . El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class A_07_Valor_Minimo_y_Maximo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresas el limite de nuemro: ");
        int dimension, contador=0;
        dimension = leer.nextInt();
        while (dimension<2) {
            System.out.print("Ingresas el limite de nuemro: ");
            dimension = leer.nextInt();

        }
        int minimo = 0, maximo=0, numero;
        double promedio=0;
        System.out.println("Ingresa los numero");
        do {
            System.out.print((contador+1)+"° ");
            numero = leer.nextInt();
            //ingresar los valores a las variables para realizar la comparacion
            if(contador==0){
                minimo=numero;
                maximo=numero;
            }
            //minimo
            if(numero<minimo){
                minimo=numero;
            }
            //maximo
            if(numero>maximo){
                maximo=numero;
            }
            promedio+=numero;
            contador++;
        } while (contador!=dimension);
        
        System.out.println("El numero MENOR ingresado es ("+minimo+")");
        System.out.println("El numero MATOR ingresado es ("+maximo+")");
        System.out.println("El promedio de los "+dimension+" numero ingresado es ("+(promedio/dimension)+")");
        
    }
}
