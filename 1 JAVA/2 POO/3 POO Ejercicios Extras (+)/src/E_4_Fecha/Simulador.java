/*Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
Profe. Adri Bestilleiro
● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
● Crear un método para verificar si el año ingresado es bisiesto*/
package E_4_Fecha;

/*@author Erick */
public class Simulador {


    public static void main(String[] args) {
        
        Fecha iniciarF = new Fecha();
        Servicio objetoS = new Servicio();
        System.out.println("Fecha inicial: " + iniciarF.getDia() + "/" + iniciarF.getMes() + "/" + iniciarF.getAnio());

        iniciarF.setAnio(2020);
        objetoS.verificarAnio(iniciarF);
        System.out.println("Año después de verificar: " + iniciarF.getAnio());

        iniciarF.setMes(10);
        int diasMes = Servicio.obtenerDiasMes(iniciarF);
        System.out.println("El mes " + iniciarF.getMes() + " tiene " + diasMes + " días");

        objetoS.mostrarDiaAnterior(iniciarF);
        System.out.println("Día anterior: " + iniciarF.getDia() + "/" + iniciarF.getMes() + "/" + iniciarF.getAnio());

        objetoS.mostrarDiaPosterior(iniciarF);
        System.out.println("Día posterior: " + iniciarF.getDia() + "/" + iniciarF.getMes() + "/" + iniciarF.getAnio());

        boolean esBisiesto = Servicio.esAnioBisiesto(iniciarF.getAnio());
        System.out.println("El año " + iniciarF.getAnio() + " es bisiesto? " + esBisiesto);
    }

}
