package E_03_Operaciones;
import java.util.Scanner;

/*@author Erick*/

public class Servicio {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("-----------------------");
        Operacion n = new Operacion();
        System.out.print("Ingresa un numero ");
        n.setNumero1(leer.nextDouble());
        System.out.print("Ingresa otro numero ");
        n.setNumero2(leer.nextDouble());
        System.out.println("-----------------------");
        return n;
    }

    public void sumar(Operacion n) {
        double suma = n.getNumero1() + n.getNumero2();
        System.out.println("La suma de los numeros ingresados es " + suma);
    }

    public void restar(Operacion n) {
        double resta = n.getNumero1() - n.getNumero2();
        System.out.println("El resultado de la resta del los numeros ingreados es " + resta);
    }

    public void multiplicacion(Operacion n) {
        double multiplicacion = n.getNumero1() * n.getNumero2();
        System.out.println("La multiplicacion de los numeros ingresados es " + multiplicacion);
    }

    public void dividir(Operacion n) {
        double dividir;
        if (n.getNumero1() == 0 || n.getNumero2() == 0) {
            dividir = 0;
            System.out.println("El resultado es " + dividir + " porque un numero ingresado era 0");
        } else {
            dividir = n.getNumero1() / n.getNumero2();
            System.out.println("El resultado de la division es " + dividir);
        }
    }
}
