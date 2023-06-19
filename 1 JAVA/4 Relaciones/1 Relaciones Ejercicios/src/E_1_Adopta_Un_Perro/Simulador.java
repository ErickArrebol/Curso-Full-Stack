/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
clase Persona conatributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/
package E_1_Adopta_Un_Perro;

import java.text.DecimalFormat;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Pricnesa","Pitbull",4,"Mediano");
        Persona persona1 = new Persona("Erick","Garcia",27,"A50199",perro1);
        Perro perro2 = new Perro("Chalas","Pitbull",4,"Mediano");
        Persona persona2 = new Persona("Pedro","Olascuaga",27,"A50200",perro2);
        
        System.out.println("--- CERTIFICADO DE ADOPCION ---");
        System.out.println("Nombre:"+persona1.getNombre()+" "+persona1.getApellido());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Docuemneto: "+persona1.getDocumento());
        System.out.println("----------------------");
        Perro adoptado1 = persona1.getPerro();
        System.out.println("Nombre: "+adoptado1.getNombre());
        System.out.println("Raza: "+adoptado1.getRaza());
        System.out.println("Edad: "+adoptado1.getEdad());
        System.out.println("Tamaño: "+adoptado1.getTamano());
        System.out.println("");
        System.out.println("--- CERTIFICADO DE ADOPCION ---");
        System.out.println("Nombre:"+persona2.getNombre()+" "+persona1.getApellido());
        System.out.println("Edad: "+persona2.getEdad());
        System.out.println("Docuemneto: "+persona2.getDocumento());
        System.out.println("----------------------");
        Perro adoptado2 = persona2.getPerro();
        System.out.println("Nombre: "+adoptado2.getNombre());
        System.out.println("Raza: "+adoptado2.getRaza());
        System.out.println("Edad: "+adoptado2.getEdad());
        System.out.println("Tamaño: "+adoptado2.getTamano());
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        double numero = 3.14159;

                DecimalFormat formato = new DecimalFormat("#.##");
                String resultado = formato.format(numero);

                System.out.println(resultado);
    }
    
}
