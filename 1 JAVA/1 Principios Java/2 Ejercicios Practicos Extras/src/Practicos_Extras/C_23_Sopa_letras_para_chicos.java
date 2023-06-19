/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().*/
package Practicos_Extras;


import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*@author Erick*/
public class C_23_Sopa_letras_para_chicos {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        String [][] matrizSopa = new String [20][20];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            String palabra = leer.nextLine();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese otra palabra: ");
                palabra = leer.nextLine();
            }
            palabras[i] = toUpperCase(palabra);
        }
//        for (int i = 0; i < palabras.length; i++) {
//            System.out.print("["+palabras[i]+"]");
//        }
        System.out.println("");
        for (int i = 0; i < matrizSopa.length; i++) {
            for (int j = 0; j < matrizSopa.length; j++) {
                matrizSopa[i][j] = "0";
            }
        }
        int conta = 0;
        boolean logica = true;
        do {
            int fila = (int) (Math.random() * 19);
            int columna = (int) (Math.random() * 13);
            if (matrizSopa[fila][columna] == "0") {
                String letras = palabras[conta];
                for (int i = 0; i < letras.length(); i++) {
                    matrizSopa[fila][columna + i] = letras.substring(i, i+1);
                    if (conta == 4) {
                        logica=false;
                    }
                }
                conta++;
            }
        } while (logica!=false);
        
       
        System.out.println(" --------------------- SOPA DE LETRAS --------------------- ");
        for (int i = 0; i < matrizSopa.length; i++) {
            for (int j = 0; j < matrizSopa.length; j++) {
                System.out.print("[" + matrizSopa[i][j] + "]");

            }
            System.out.println("");
        }
    }
}