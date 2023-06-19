package E_10_Vectores;

public class Servicio {

    public Vector crearVectores() {//crea el tamaño de los vectores

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        return new Vector(arregloA, arregloB);
    }

    public void llenar(Vector arreglo) {//llena el vector A de 50 elementos

        double[] vectorA = arreglo.getA();
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = Math.random() * 100;
        }

    }

    public void imprimir(Vector arreglo) {

        System.out.println("-------------------------");
        System.out.println("ARREGLO (a) LLENADO E IMPRESO");
        double[] vectorA = arreglo.getA();
        for (int i = 0; i < vectorA.length; i++) {

            System.out.print(i + "-[" + vectorA[i] + "]  ");
        }
        System.out.println("");
        System.out.println("");

    }

    public void ordenar(Vector arreglo) {
        double[] ordenar = arreglo.getA();
        double auxiliar = 0;
        //metodo burbuja
        for (int i = 0; i < ordenar.length - 1; i++) {
            for (int j = 0; j < ordenar.length - 1; j++) {

                if (ordenar[j] > ordenar[j + 1]) {
                    auxiliar = ordenar[j];
                    ordenar[j] = ordenar[j + 1];
                    ordenar[j + 1] = auxiliar;
                }
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("ARREGLO (a) ORDEANDO E IMNPRESO DE MENOR A MAYOR");
        for (int i = 0; i < ordenar.length; i++) {
            System.out.print(i + "-[" + ordenar[i] + "]  ");
        }
        System.out.println("");
        System.out.println("");

        double[] arregloB = arreglo.getB();

        for (int i = 0; i < arregloB.length; i++) {//llenado del arreglo b
            if (arregloB[i] < arregloB[9]) {
                arregloB[i] = 0.5;
            } else {
                arregloB[i] = ordenar[i];
            }
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("ARREGLO (b) LLENADO 10 CON EL ARREGLO (a) ORDENARO Y EL RESTO CON 0.5");
        for (int i = 0; i < arregloB.length; i++) {//imprimir vector B
            System.out.print(i + "-[" + arregloB[i] + "]  ");
        }
        System.out.println("");
        System.out.println("");
    }
}
