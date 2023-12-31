/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.*/
package E_4_AreaYPerimetro;
import java.util.Scanner;

/*@author Erick*/
public class A_Simulador {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa el Radio del Circulo ");
        double radio  = leer.nextDouble();
        Circulo iniciarC = new Circulo (radio);
        iniciarC.area();
        System.out.println("////////////////////////////////////////////////");
        System.out.print("Ingresa la Base del Rectangulo ");
        double base = leer.nextDouble();
        System.out.print("Ingresa la Altura del Ractangulo ");
        double altura = leer.nextDouble();
        Rectangulo iniciarR = new Rectangulo(base,altura);
        iniciarR.area();
        iniciarR.perimetro();
    }
    
}
