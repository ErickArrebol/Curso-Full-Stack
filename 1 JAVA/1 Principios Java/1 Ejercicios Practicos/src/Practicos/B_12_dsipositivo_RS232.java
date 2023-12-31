/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
package Practicos;

import java.util.Scanner;

/**@author Erick
*/
public class B_12_dsipositivo_RS232 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena="";
        int contadorCor=0,contadorInco=0;
        do {
            System.out.print("Ingresa una cadena ");
            cadena = leer.nextLine();
//            if(cadena.length()==5 && cadena.substring(0,1).equalsIgnoreCase("x") && cadena.endsWith("o")){ ------- La otra opcion
            if (cadena.length()==5 && cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(4,5).equalsIgnoreCase("o")){
                contadorCor++;
            }else{
                contadorInco++;
            }
        } while (!cadena.equalsIgnoreCase("&&&&&"));
        System.out.println("La cantidad de lecturas Correctas es: "+ contadorCor);
        System.out.println("La cantidad de lecturas Incorrectas es: "+ (contadorInco-1));
        
    }
    
}
