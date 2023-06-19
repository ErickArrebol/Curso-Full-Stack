/*clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:  s*/
package E_1_Animal;

/*@author Erick*/
public class A_Simulador {


    public static void main(String[] args) {
        Perro dog = new Perro("Princesa","Croquetas",5,"Pitbul");
        Gato cat = new Gato("Felix.","Carne",2,"Persa");
        Caballo horse = new Caballo("Sultán","Paja",10,"Arabe");
        
        dog.datosAnimal();
        System.out.println("");
        cat.datosAnimal();
        System.out.println("");
        horse.datosAnimal();
        
        
    }

}
