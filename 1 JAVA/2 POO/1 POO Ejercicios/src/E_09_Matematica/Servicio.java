package E_09_Matematica;

/*@author Erick */

public class Servicio {

    public void devolverMayor(Matematica objeto) {

        System.out.println("-------------------------------");
        if (objeto.getN1() > objeto.getN2()) {
            System.out.println("El numero 1 es mayor que el 2");

        } else {
            System.out.println("El numero 2 es mayor que el 1");
        }
    }

    public void calcularPotencia(Matematica objeto) {
        System.out.println("-------------------------------");
        int r1;
        int r2;
        int exp = 0;
        if (objeto.getN1() > objeto.getN2()) {
            r1 = (int) Math.round(objeto.getN1());
            r2 = (int) Math.round(objeto.getN2());
            exp = (int) Math.pow(r1, r2);
            System.out.println(exp);
        } else {
            r1 = (int) Math.round(objeto.getN1());
            r2 = (int) Math.round(objeto.getN2());
            exp = (int) Math.pow(r2, r1);
            System.out.println(exp);
        }
    }

    public void calculaRaiz(Matematica objeto) {
        System.out.println("----------------------------------------------------------------------");
        double raiz = 0;
        if (objeto.getN1() < objeto.getN2()) {
            raiz = Math.sqrt(objeto.getN1());
            System.out.println("La razi cuadra de numero " + objeto.getN1() + " menor es " + raiz);
        } else {
            raiz = Math.sqrt(objeto.getN2());
            System.out.println("La razi cuadra de numero (" + objeto.getN2() + ") menor es (" + raiz + ")");
        }
    }
}
