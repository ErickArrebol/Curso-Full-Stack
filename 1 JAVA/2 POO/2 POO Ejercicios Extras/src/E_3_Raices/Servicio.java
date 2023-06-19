package E_3_Raices;

public class Servicio {
    
    public double getDiscriminante(Raices iniciarR) {
        int a = iniciarR.getA();
        int b = iniciarR.getB();
        int c = iniciarR.getC();
        return (Math.pow((b), 2)) - 4 * a * c;
    }
    
    public boolean tieneRaices(Raices iniciarR) {
        return getDiscriminante(iniciarR) > 0;
    }
    
    public boolean tieneRaiz(Raices iniciarR) {
        return getDiscriminante(iniciarR) == 0;
    }
    
    public void obtenerRaices(Raices iniciarR) {
        int a = iniciarR.getA();
        int b = iniciarR.getB();
        int c = iniciarR.getC();
                                    //(-b±√((b^2)-(4*a*c)))/(2*a)
        System.out.println("-RAICES-");
        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.print("Raiz Positiva: " + r1);
        System.out.println("");
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.print("Raiz Negativa: " + r2);
    }
    
    public void obtenerRaiz(Raices iniciarR) {
        int a = iniciarR.getA();
        int b = iniciarR.getB();
        int c = iniciarR.getC();
        double r;

        if ((-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) % (2 * a) == 0) {
            r = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println(r);
            System.out.println("La raiz es " + r);
        } else {
            r = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("La raiz es " + r);
        }

    }
    
    public void calcular() {

        Raices iniciarR = new Raices ();
        if (tieneRaiz(iniciarR)) {
            System.out.print("Determinadte: ");
            System.out.println(getDiscriminante(iniciarR));
            obtenerRaiz(iniciarR);

            System.out.println("");
        }

        if (tieneRaices(iniciarR)) {
            System.out.print("Determinadte: ");
            System.out.println(getDiscriminante(iniciarR));
            obtenerRaices(iniciarR);
            System.out.println("");
        }

        if (getDiscriminante(iniciarR) < 0) {
            System.out.print ("Determinadte: ");
            System.out.println(getDiscriminante(iniciarR));
            System.out.println("La ecuacion no tiene raices ");
            System.out.println("");
        }

    }
}
