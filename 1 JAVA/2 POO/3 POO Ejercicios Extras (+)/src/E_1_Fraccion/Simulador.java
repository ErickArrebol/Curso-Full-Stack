/*Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.*/
package E_1_Fraccion;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        
        Servicio iniciarS = new Servicio ();
        Fraccion r = iniciarS.IngresoDatos();
    }
    
}
