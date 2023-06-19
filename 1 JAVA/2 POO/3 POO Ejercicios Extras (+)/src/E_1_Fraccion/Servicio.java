package E_1_Fraccion;

import java.util.Scanner;

public class Servicio {

    

    public Fraccion IngresoDatos() {
        
        Fraccion iniciarF = new Fraccion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numeros de la fracion 1");
        System.out.print("Numerado    ");
        iniciarF.setNumer1(leer.nextInt());
        System.out.print("Denominador ");
        iniciarF.setDen1(leer.nextInt());
        System.out.println("Ingrese numero de la fraccion 2");
        System.out.print("Numerado    ");
        iniciarF.setNumer2(leer.nextInt());
        System.out.print("Denominador ");
        iniciarF.setDen2(leer.nextInt());
        System.out.println("-------------------------------");
        SUMA();
        RESTA();
        DIVISION();
        MULTIPLICACION();
        return iniciarF;
    }

    public void SUMA() {
        Fraccion iniciarF = new Fraccion();
        int n1 = iniciarF.getNumer1();
        int d1 = iniciarF.getDen1();
        int n2 = iniciarF.getNumer2();
        int d2 = iniciarF.getDen2();
        int sumaD, sumaN;

        if (d1 == d2) {
            sumaN = n1 + n2;
            sumaD = d1;
        } else {
            sumaD = d1 * d2;
            sumaN = ((n1 * d2) + (n1 * d1));
        }
        System.out.println("La suma es " + sumaN + "/" + sumaD);
    }

    public void RESTA() {
        Fraccion iniciarF = new Fraccion();
        int n1 = iniciarF.getNumer1();
        int d1 = iniciarF.getDen1();
        int n2 = iniciarF.getNumer2();
        int d2 = iniciarF.getDen2();
        int restaD, restaN;
        if (d1 == d2) {
            restaN = n1 - n2;
            restaD = d1;
        } else {
            restaN = ((n1 * d2) - (n1 * d1));
            restaD = d1 * d2;
        }
        System.out.println("La resta es " + restaN + "/" + restaD);
    }

    public void DIVISION() {
        Fraccion iniciarF = new Fraccion();
        int n1 = iniciarF.getNumer1();
        int d1 = iniciarF.getDen1();
        int n2 = iniciarF.getNumer2();
        int d2 = iniciarF.getDen2();
        int divN = n1 * n2;
        int divD = d1 * d2;
        System.out.println("La divicion es " + divN + "/" + divD);
    }

    public void MULTIPLICACION() {
        Fraccion iniciarF = new Fraccion();
        int n1 = iniciarF.getNumer1();
        int d1 = iniciarF.getDen1();
        int n2 = iniciarF.getNumer2();
        int d2 = iniciarF.getDen2();
        int mulN = n1 * n2;
        int mulD = d1 * d2;
        System.out.println("La multiplicacion es " + mulN + "/" + mulD);
    }
}
