/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class B_16_Funcion_Mayores_o_Menores_de_Edad {

    public static void main(String[] args) {
        persona();
        
    }
    public static void persona() {
        Scanner leer = new Scanner(System.in);
        String nombre, opcion="", validacion;
        boolean logica=true;
        int edad, conta=0;
        while (true) {
            System.out.print("Ingresa el Nombre: ");
            nombre = leer.next();

            System.out.print("Ingresa la Edad: ");
            edad = leer.nextInt();

            if (edad >= 18) {
                validacion = "Mayor de Edad";
            } else {
                validacion = "Menor de Edad";
            }
            System.out.println(nombre+" tiene "+edad+" ("+validacion+")");
            
            do {
                System.out.print("Deseas ingresa otra persona (si) o (no): ");
                opcion = leer.next();
                if (opcion.equalsIgnoreCase("NO")){
                    System.out.println("Salida");
                    conta=1;
                    break;
                }else if(opcion.equalsIgnoreCase("SI")){
                    conta=2;
                }else{
                    System.out.println("Caracter Invalido");
                }
            } while (conta!=2);
            if(conta==1){
                logica=false;
                break;
            }
        }
        leer.close();
    }
}
