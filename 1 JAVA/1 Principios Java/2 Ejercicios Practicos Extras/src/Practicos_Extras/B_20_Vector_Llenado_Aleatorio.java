/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
package Practicos_Extras;

/* @author Erick*/
public class B_20_Vector_Llenado_Aleatorio {

    public static void main(String[] args) {

        int[] vector = new int[5];
        llenarVector(vector);
        imprimir(vector);
    }

    //Proceso para llenar vector
    public static void llenarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            int num2 = (int) (Math.random() * 10000);
            vector[i] = num2;
        }
    }

    //Proceso para imprimir vector
    public static void imprimir(int[] vector) {
        System.out.println("            VECTOR");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
        System.out.println("-----------------------------------");

    }
}
