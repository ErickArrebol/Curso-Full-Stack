/*clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:*/
package E_1_Animal;

/*@author Erick*/
public class Animal {
    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void datosAnimal(){
        System.out.println("Animal: "+nombre);
        System.out.println("Se Alimenta de: "+alimento);
        System.out.println("Su Edad es: "+edad);
        System.out.println("raza: "+raza);
    }
}
