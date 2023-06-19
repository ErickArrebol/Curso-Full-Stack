package E_04_Rectangulo;

import java.util.Scanner;

/*@author Erick*/

public class Servicio {

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo rectangulo = new Rectangulo();
        System.out.print("Ingresa la base del rectangulo ");
        rectangulo.setBase(leer.nextInt());
        System.out.print("Ingresa la altura del rectangulo ");
        rectangulo.setAltura(leer.nextInt());
        return rectangulo;
    }

    public void superficie(Rectangulo rectangulo) {
        double superficie = rectangulo.getBase() * rectangulo.getAltura();
        System.out.println("La superficie del triangulo es " + superficie);
    }

    public void perimetro(Rectangulo rectangulo) {
        double perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;
        System.out.println("El perimetro del triangulo es " + perimetro);
    }

    public void dibujo(Rectangulo rectangulo) {

        for (int i = 0; i < rectangulo.getBase(); i++) {

            for (int j = 0; j < rectangulo.getAltura(); j++) {

                if (i == 0 || j == 0 || i == rectangulo.getBase() - 1 || j == rectangulo.getAltura() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}
