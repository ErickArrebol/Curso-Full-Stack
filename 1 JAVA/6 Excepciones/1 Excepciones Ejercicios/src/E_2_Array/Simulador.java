/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/
package E_2_Array;

/*@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        try {
            int vector[] = new int[10];
            vector[12]=1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango");
            System.out.println(e.fillInStackTrace());
        }finally{
            System.out.println(".....");
        }
    }
    
}
