/*Dado un tiempo en minutos, calcular su equivalente en dÃ­as y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 dÃ­a, 2 horas.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick */
public class A_01_Calculo_Dias_Y_Horas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Dame un tiempo en minutos: ");
        double minutos = leer.nextDouble();
        double dia=1440, hora=60,operacion ;
        int r, r2, r3;
        //
        operacion=minutos/dia;
        r=(int) operacion;
        
        System.out.println("Equivale");
        System.out.println("------------------------------");
        if (dia>1){
           System.out.print(" "+r+" Dias,"); 
        }else{
            System.out.print("- "+r+" Dia,");
        }
        
        operacion= (minutos-(dia*r))/hora;
        r2=(int) operacion;
        if (r2>1){
          System.out.print(" "+ r2+" Horas,");   
        }else{
            System.out.print(" "+ r2+" Hora,"); 
        }
        
        operacion= (minutos-(dia*r))-(hora*r2);
        r3=(int) operacion;
        if (r3>=0){
           System.out.print(" "+ r3+" Minutos"); 
        }
        
        System.out.println("");
        System.out.println("------------------------------");
        
    }  
}
