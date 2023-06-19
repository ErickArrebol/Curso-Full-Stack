/*Una obra social tiene tres clases de socios:
  o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
  o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
    para los mismos tratamientos que los socios del tipo A.
  o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
  o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.*/
package Practicos_Extras;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*@author Erick*/
public class A_05_Clases_Sociales {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la Clase de Socio: ");
        int valido=0;
        String claseS;
        do {
            claseS = leer.nextLine();
            if(claseS.equalsIgnoreCase("A") || claseS.equalsIgnoreCase("B") || claseS.equalsIgnoreCase("C") ){
                valido=1;
            }else{
                System.out.print ("Clase invalidad ingresala nuevamente: ");
            }
        } while (valido!=1);
        System.out.print("Ingresa el costo del tratamiento: $");
        double costo = leer.nextDouble();
        switch (toUpperCase(claseS) ) {
            case "A":System.out.println("El monto a pagar es: $"+(costo*.50));
                break;
            case "B":System.out.println("El monto a pagar es: $"+(costo-costo*.30));
                break;
            case "C":System.out.println("El monto a pagar es: $"+(costo));
                break;
        }        
        
    }
    
}
