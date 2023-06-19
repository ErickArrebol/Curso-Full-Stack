/*Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y núme´¿ro de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.*/
package E_1_Amarres_para_barcos;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/* @author Erick*/
public class Barco {

    private String matricula;
    private double eslora;
    private int anio;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getAnio() {
        return anio;
    }


    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + '}';
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Apartir de aquie METODOS Manueales
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa Matricula ");
        matricula = leer.next();
        System.out.print("Ingresa el año del barco ");
        anio = leer.nextInt();
        System.out.print("Ingresa el tamaño de la Eslora ");
        eslora = leer.nextInt();
    }
    
    public double calcularCostoAqluiler(){
       
        return eslora*10;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metodos Atomaticso
   

}
