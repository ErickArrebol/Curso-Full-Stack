/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class B_15_Funciones_Matematicas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa numeros");
        System.out.print("Numero 1 ");
        int numero1 = leer.nextInt();
        System.out.print("Numero 2 ");
        int numero2 = leer.nextInt();
        
        do {
            System.out.println("------ MENU ------"+
                    "\n" + "1.-  Suma"+
                    "\n" + "2.-  Resta"+
                    "\n" + "3.-  Multiplicacion"+
                    "\n" + "4.-  Divicion"+
                    "\n" + "5.-  Salir"+
                    "\n" + "Eliege una opcion");
        int opcion = leer.nextInt();
           switch (opcion) {
            case 1:System.out.print("La suma es: "+suma(numero1, numero2));
                break;
            case 2:System.out.print("La resta es: "+resta(numero1, numero2));
                break;
            case 3:System.out.print("La multiplicacion es: "+multiplicacion(numero1, numero2));
                break;
            case 4:System.out.print("La divicion es: "+divicion(numero1, numero2));
                break;
            case 5:System.out.print("Salida");
                break;
            default:System.out.println("Numero equivocado vuelve a elegir");              
                break;
        }  
            System.out.println("");
        } while (true);
        
              
    }
    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    public static int resta(int numero1, int numero2){
        return numero1 - numero2;
    }
    public static int multiplicacion(int numero1, int numero2){
        return numero1 * numero2;
    }
    public static double divicion(int numero1, int numero2){
        double n1 = numero1;
        double n2 = numero2;
        return n1 / n2;
    }
}
