/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuaciÃ³n, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sÃ³lo una variable auxiliar. */
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class A_02_Variable_Auxiliar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int a=5, b=4, c=3, d=2, auxiliar=0;
        auxiliar=d;
        d=b;
        b=c;
        c=a;
        a=auxiliar;
        System.out.println("A = "+ a);
        System.out.println("B = "+ b);
        System.out.println("c = "+ c);
        System.out.println("D = "+ d);
    }
    
}
