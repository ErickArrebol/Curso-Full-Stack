/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
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

import java.util.Scanner;


/*@author Erick*/
public class A_Simulador {

    public static void main(String[] args) {
        //SimulacionManual
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaDeAmarres iniciarT = new TiendaDeAmarres();
        iniciarT.crearAlquiler();

        boolean logica = false;
        do {
            System.out.println("Los dias de ocuapcion son " + iniciarT.diasDeOcupacion());
            System.out.println("Que Barco tienes");
            System.out.println("1.- Veleros");
            System.out.println("2.- Barco Motor");
            System.out.println("3.- Yates");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Veleros v = new Veleros();
                    v.crearVelor();
                    System.out.println("\nEl precio del alquiler es " + (iniciarT.diasDeOcupacion() * v.CostoAqluilerVeleros()));
                    Veleros objetov = new Veleros(v.getNumeroMastiles(), v.getMatricula(), v.getEslora(), v.getAnio());
                    iniciarT.setBarco(objetov);
                    logica = true;
                    break;
                case 2:
                    BarcosAMotor b = new BarcosAMotor();
                    b.crearBarcoMotor();
                    System.out.println("\nEl precio del alquiler es " + (iniciarT.diasDeOcupacion() * b.CostoAqluilerBarcoM()));
                    BarcosAMotor objetoBM = new BarcosAMotor(b.getPotenciaCV(), b.getMatricula(), b.getEslora(), b.getAnio());
                    iniciarT.setBarco(objetoBM);
                    logica = true;
                    break;
                case 3:
                    Yates y = new Yates();
                    y.crearYate();
                    System.out.println("\nEl precio del alquiler es " + (iniciarT.diasDeOcupacion() * y.CostoAqluilerYate()));
                    Yates objetoY = new Yates(y.getPotenciaCV(), y.getNumeroCamarotes(), y.getMatricula(), y.getEslora(), y.getAnio());
                    iniciarT.setBarco(objetoY);
                    logica = true;
                    break;
                default:
                    System.out.println("Opcion invalida vuelva a intentar");
                    break;
            }
        } while (logica != true);

    }
}
