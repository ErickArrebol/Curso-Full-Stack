package E_05_Cuenta;
import java.util.Scanner;

/*@author Erick*/

public class Servicio {

    public Cuenta CrearCuenta() {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta cuenta1 = new Cuenta();
        System.out.println("Ingresa el Numero de Cuenta");
        cuenta1.setnCuenta(leer.nextInt());
        System.out.println("Ingresa el DNI");
        cuenta1.setDNI(leer.nextLong());
        System.out.println("Ingresa el Saldo");
        cuenta1.setSalActual(leer.nextInt());
        return cuenta1;

    }

    public void ingreso(Cuenta cuenta1) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Digite la cantidad $ a ingresar");
        cuenta1.setSalActual(cuenta1.getSalActual() + (int) leer.nextDouble());
        System.out.println("Usted ingreso ");
        
    }

    public void retiro(Cuenta cuenta1) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Digita la cantidad a Retirar");
        double retiro = leer.nextDouble();

        if (retiro > cuenta1.getSalActual()) {
            cuenta1.setSalActual(0);
            System.out.println("Fondos insuficientes");
        } else {
            cuenta1.setSalActual(cuenta1.getSalActual() - (int) retiro);
            System.out.println("Se retiro: " + retiro);
        }
        
    }

    public void extraccionRapida(Cuenta cuenta1) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Digita la cantidad a Retirar");
        double retiro2 = leer.nextDouble();
        if (retiro2 <= (cuenta1.getSalActual() * 0.20)) {
            cuenta1.setSalActual(cuenta1.getSalActual() - (int) retiro2);
            System.out.println("El monto del retiro es " + retiro2);
        } else {
            System.out.println("El monto a retirar es mayor al permitido");
        }
        
    }

    public void constarSaldo(Cuenta cuenta1) {
        System.out.println("El saldo actual es " + cuenta1.getSalActual());
    }

    public void datosCuentos(Cuenta cuenta1) {
        System.out.println(cuenta1.toString());
    }
}
