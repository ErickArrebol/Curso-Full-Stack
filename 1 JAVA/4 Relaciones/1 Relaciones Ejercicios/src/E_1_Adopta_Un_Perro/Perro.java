/*Clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño;

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/
package E_1_Adopta_Un_Perro;

/*@author Erick*/
public class Perro {

    private String nombre, raza;
    private int edad;
    private String tamano;

    public Perro(String nombre, String raza, int edad, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamano() {
        return tamano;
    }

}
