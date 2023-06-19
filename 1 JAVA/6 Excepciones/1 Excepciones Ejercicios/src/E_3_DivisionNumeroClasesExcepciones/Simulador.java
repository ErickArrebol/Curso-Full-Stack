/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/
package E_3_DivisionNumeroClasesExcepciones;

import java.util.Scanner;

/*@author Erick*/
public class Simulador {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero objeto = new DivisionNumero();
        System.out.println("Ingresa 2 numero");
        System.out.print("1° numero ");
        String n1 = leer.next();
        System.out.print("2°numero ");
        String n2 = leer.next();
        
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            objeto.crearDivicion(num1,num2);
        }catch(ArithmeticException e){
            System.out.println("La divicion no puede realizarse por: "+ e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Algun variable no puede convertirce a numero por: "+e.getMessage());
        }
    }
    
}
