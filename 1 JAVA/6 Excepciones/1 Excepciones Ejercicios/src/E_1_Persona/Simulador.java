/*Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8
Servicios, a null y tratar de invocar el método esMayorDeEdad() a través
de ese objeto. Luego, englobe el código con una cláusula try-catch para
probar la nueva excepción que debe ser controlada.*/
package E_1_Persona;

/* @author Erick*/
public class Simulador {

    public static void main(String[] args) {
        
        try {
            Persona persona = null;
            persona.esMayorDeEdad(persona);
        } catch (RuntimeException e) {
            System.out.println( e);
            System.out.println(e.getMessage());
        }
    }

}
