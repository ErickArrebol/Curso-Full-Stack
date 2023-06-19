/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
Usalo como ejemplo
  MATRIZ       MATRIZ TRASNPUESTA
0   -2   4          0    2   -4
2    0   2         -2    0   -2
-4  -2   0          4    2    0
*/
package Practicos;
import java.util.Scanner;

/*@author Erick*/
public class B_19_Matriz_Antisimetrica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];//Matriz original
        int[][] matrizTrans = new int[3][3];//Matriz Transpuesta
        int[][] matrizAnti = new int [3][3];//MAtriz Anti simetrica
        //Llenar matriz original y transpuesta
        System.out.println("Ingresa los valores de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print((i+1)+"° ");
                matriz[i][j] =leer.nextInt();
                matrizTrans[j][i] = matriz[i][j];
                matrizAnti[j][i]=-matrizTrans[j][i];
            }
        }
        //Imprimir Matriz Original
        System.out.println("Matriz Original");
        String digitos1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                digitos1 = Integer.toString(matriz[i][j]);
                switch (digitos1.length()) {
                    case 1:
                        System.out.print("[ " + matriz[i][j] + "] ");
                        break;
                    case 2:
                        System.out.print("[" + matriz[i][j] + "] ");
                        break;
                    case 3:
                        System.out.print("[" + matriz[i][j] + "] ");
                        break;                    
                }                
            }
            System.out.println("");
        }
        //Imprimir Matriz Transpuesta
        System.out.println("Matriz Transpuesta");
        String digitos2;
        for (int i = 0; i < matrizTrans.length; i++) {
            for (int j = 0; j < matrizTrans.length; j++) {
                digitos2 = Integer.toString(matriz[i][j]);
                switch (digitos2.length()) {
                    case 1:
                        System.out.print("[ " + matriz[i][j] + "] ");
                        break;
                    case 2:
                        System.out.print("[" + matriz[i][j] + "] ");
                        break;
                    case 3:
                        System.out.print("[" + matriz[i][j] + "] ");
                        break;                    
                }                
            }
            System.out.println("");
        }
        //Imprimir matriz Anti simetrica
        System.out.println("Matriz Anti Simetrica");
        String digitos3;
        for (int i = 0; i < matrizAnti.length; i++) {
            for (int j = 0; j < matrizAnti.length; j++) {
                digitos3 = Integer.toString(matriz[i][j]);
                switch (digitos3.length()) {
                    case 1:
                        System.out.print("[ " + matriz[i][j] + "] ");
                        break;
                    case 2:
                        System.out.print("[" + matriz[i][j] + "] ");
                        break;
                    case 3:
                        System.out.print("[" + matriz[i][j] + "] ");
                        break;                    
                }                
            }
            System.out.println("");
        }
        
    } 
}
