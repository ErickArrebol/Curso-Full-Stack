/*Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.*/
package E_4_AreaYPerimetro;

import java.util.Scanner;

/*@author Erick*/
public class Circulo implements carculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void area() {
        double area = PI*(Math.pow(radio, 2))  ;
        System.out.println("El area del Circulo es " +area);
    }

    @Override
    public void perimetro() {
        double perimetro = 2*PI*radio;
        System.out.println("El perimetro del Circulo es "+perimetro);
    }

}
