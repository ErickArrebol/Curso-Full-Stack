package E_5_Triangulo;

import java.util.Scanner;

public class Servicio {

    public void CargarDatos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Triangulo[] iniciarT = new Triangulo[4];

        System.out.println("Ingrese los datos de 4 triángulos isósceles:");
        for (int i = 0; i < iniciarT.length; i++) {
            System.out.println("Triangulo " + (i + 1));
            System.out.print("Base: ");
            int base = leer.nextInt();
            System.out.print("Lado: ");
            int lado = leer.nextInt();

            iniciarT[i] = new Triangulo(base, lado);
        }

        mostrarTrianguloMayorArea(iniciarT);
    }

    public double calcularArea(Triangulo triangulo) {
        int base = triangulo.getBase();
        int lado = triangulo.getLado();
        double altura = Math.sqrt(lado * lado - (base * base) / 4);
        return (base * altura) / 2;
    }

    public double calcularPerimetro(Triangulo iniciarT) {
        return 2 * iniciarT.getLado() + iniciarT.getBase();
    }
    
    public void mostrarTrianguloMayorArea(Triangulo[] iniciarT) {
        double mayorArea = 0;
        int indiceMayorArea = -1;

        for (int i = 0; i <  iniciarT.length; i++) {
            double area = calcularArea( iniciarT[i]);
            if (area > mayorArea) {
                mayorArea = area;
                indiceMayorArea = i;
            }
        }

        if (indiceMayorArea != -1) {
            System.out.println("Triángulo con mayor área:");
            System.out.println( iniciarT[indiceMayorArea]);
            System.out.println("y su area es "+mayorArea);
        } else {
            System.out.println("No se encontró ningún triángulo.");
        }
    }
}
