/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases.
Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con atributos: 
nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que pensar la
lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase Persona,
la información del Perro y de la Persona.
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a tener que
contar con muchas personas y muchos perros. El programa deberá preguntarle a cada persona, que perro
según su nombre, quiere adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió 
un perro que ya estaba adoptado, se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/
package E_1_AdoptaUnPerro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> listaPersonas = new ArrayList<>();//lista de Personas
        Persona p = new Persona();//objeto de Persona
        for (int i = 0; i < 4; i++) {//Llenar lista de los datos de personas
            String nombre = p.nombres();
            String apellido = p.apellidos();
            int edad = p.edades();
            String documento = p.documentos();
            listaPersonas.add(new Persona(nombre, apellido, edad, documento));
        }

        HashMap<String, Perro> listaPerro = new HashMap<>();//lista de Perros
        Perro d = new Perro();//el objeto de perro
        for (int i = 0; i < 20; i++) {//Llena lista con los datos de los perro
            String nombre = d.nombresP();
            String raza = d.raza();
            double edad = d.edadesP();
            String medida = d.medida();
            Perro dog = new Perro(nombre, raza, edad, medida);
            listaPerro.put(nombre, dog);
        }

        for (Map.Entry<String, Perro> entry : listaPerro.entrySet()) {
            String key = entry.getKey();
            Perro value = entry.getValue();
            System.out.print("(" + key.toString() + ")");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------");
        for (Persona persona : listaPersonas) {
            int validacion = 0;
            do {
                System.out.print(persona.getNombre() + " " + persona.getApellido());
                System.out.print(" ¿Qué perro deseas adoptar?\n");
                System.out.print("Ingresa el nombre: ");
                String nombreP = leer.next();
                /*
                crea una nueva instancia de la clase Perro y se asigna a la variable 
                perroNombre este objeto puede acceder a sus métodos y atributos.*/
                //Perro perroNombre = new Perro(); 
                
                /*  la variable perroNombre se declara pero no se inicializa con ningún objeto.
                utulizando el valor espacial null de esta manera solo puedes acceder a los atrinutos
                usando los getter y setter*/
                Perro perroNombre = null;
                for (Map.Entry<String, Perro> entry : listaPerro.entrySet()) {
                    String nombrePerro = entry.getKey();
                    Perro perro = entry.getValue();
                    if (nombrePerro.equalsIgnoreCase(nombreP)) {
                        perroNombre = perro;
                        break;
                    }
                }
                if (perroNombre != null && !perroNombre.isAdoptado()) {
                    persona.setAnimal(perroNombre);
                    perroNombre.setAdoptado(true);
                    validacion = 1;
                    System.out.println("Felicidades Has adoptado a " + perroNombre.getNombre());
                } else {
                    System.out.println("El perro no está disponible para adopción.");
                    System.out.println("--- INTENTA DE NUEVO ---");
                }
            } while (validacion != 1);
            System.out.println("");
        }
        System.out.println("");
        for (Persona aux : listaPersonas) {
            System.out.println("--- CERTIFICADO DE ADOPCION ---");
            System.out.println(aux.toString());
            System.out.println("");
        }
    }
}
