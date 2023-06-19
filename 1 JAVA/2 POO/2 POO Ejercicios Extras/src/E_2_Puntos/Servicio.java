package E_2_Puntos;

import java.util.Scanner;

public class Servicio {
        
    public Puntos crearPuntos() {
        
        Puntos iniciarP = new Puntos();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");   
        System.out.print("Ingresa la cordenada de x1 ");
        iniciarP.setX1(leer.nextInt());
        System.out.print("Ingresa la cordenada de x2 ");
        iniciarP.setX2(leer.nextInt());
        System.out.print("Ingresa la cordenada de y1 ");
        iniciarP.setY1(leer.nextInt());
        System.out.print("Ingresa la cordenada de y2 ");
        iniciarP.setY2(leer.nextInt());
        return iniciarP;
    }

    public void calcularDistancia() {
        
        Puntos iniciarP = new Puntos();
        int x1 = iniciarP.getX1();
        int x2 = iniciarP.getX2();
        int y1 = iniciarP.getX1();
        int y2 = iniciarP.getY2();
        double distancia = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
