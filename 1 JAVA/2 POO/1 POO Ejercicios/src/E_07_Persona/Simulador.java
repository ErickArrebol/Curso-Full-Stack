/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
package E_07_Persona;

/*@author Erick */

public class Simulador {

    public static void main(String[] args) {
        
        System.out.println("---------------------------------------------");
        Servicio iniciarS = new Servicio();
        Persona [] personas = new Persona[4];
        double pesoIdeal=0;
        double menorPeso=0;
        double mayorPeso=0;
        double mayorEdad=0;
        double menorEdad=0;

        for (int i = 0; i < personas.length; i++) {
            personas[i]= iniciarS.crearPersona();
            
        }
        for (int i = 0; i < personas.length; i++) {
            if (iniciarS.calcularIMC(personas[i]) ==-1){
               menorPeso++;
            }
            if (iniciarS.calcularIMC(personas[i]) ==0){
                pesoIdeal++;
            }
            if(iniciarS.calcularIMC(personas[i])==1){
                mayorPeso++;
            }
            if(iniciarS.esMayorDeEdad(personas[i])==false){
                mayorEdad++;
            }
            if (iniciarS.esMayorDeEdad(personas[i])==true){
                menorEdad++;
            }
        }
        
        System.out.println("El procentaje de perosnas por debajo del peso ideal es "+ ((menorPeso * 100)/4)+"%");
        System.out.println("El procentaje de perosnas en su peso ideal es "+ ((pesoIdeal * 100)/4)+"%");
        System.out.println("El procentaje de perosnas por arriba del peso ideal es "+ ((mayorPeso * 100)/4)+"%");
        System.out.println("El procentaje de perosnas mayores de Edad es"+ ((mayorEdad * 100)/4)+"%");
        System.out.println("El procentaje de perosnas menores de Edad es"+ ((menorEdad * 100)/4)+"%");
    }   
}
