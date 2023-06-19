/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class A_10_Adivina_el_Resultado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int respuesta = 0, multiplicacion;
        int numero1 = (int) (Math.random() * 10);
        int numero2 = (int) (Math.random() * 10);
        multiplicacion = numero1 * numero2;
        //System.out.println(multiplicacion);
        do {
            System.out.print("Adivina la multiplicacion: ");
            respuesta = leer.nextInt();
            if (respuesta == multiplicacion){
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecta");
            }
        } while (respuesta != multiplicacion);
        
    }
    
}
