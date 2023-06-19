/*Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
● Imprimir la sopa de letras, invertida (es decir, filas por columnas)*/
package E_6_SopaDeLetras;

import java.util.Scanner;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        SopaDeLetras sopa1 = new SopaDeLetras();
        Servicio servicio = new Servicio();

        servicio.imprimirSopaDeLetras(sopa1 );
        servicio.buscarPalabra(sopa1 );
        System.out.print("Que palabras remplazar ");
        String palabra = leer.next();
        System.out.print("Por cual deaseas remplazar ");
        String remplazo = leer.next();
        servicio.reemplazarPalabra(sopa1 , palabra, remplazo);
        System.out.println("");
        System.out.println("SOPA DE LETRAS ORIGANAL");
        servicio.imprimirSopaDeLetras(sopa1);
        segundo();
        System.out.println("SOPA DE LETRAS TRANSPUESTA");
        servicio.imprimirSopaDeLetrasInvertida(sopa1);
    }
    private static void segundo() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
