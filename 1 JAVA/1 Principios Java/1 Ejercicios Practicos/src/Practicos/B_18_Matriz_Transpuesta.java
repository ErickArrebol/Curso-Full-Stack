/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).*/
package Practicos;

/*@author Erick*/
public class B_18_Matriz_Transpuesta {

    public static void main(String[] args) {
        int [][] matriz = new int [4][4];//Matriz original
        int [][] matrizTrans = new int [4][4];//Matriz Transpuesta
        //Llenar matriz original y transpuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matriz[i][j]=(int)(Math.random()*999);
               matrizTrans[j][i]=matriz[i][j];
            }
        }
        //Imprimir Matriz Original
        System.out.println("MATRIZ ORIGINAL");
        String digitos1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                digitos1 = Integer.toString(matriz[i][j]);
                switch (digitos1.length()) {
                    case 1:System.out.print("[  "+matriz[i][j]+"] ");
                        break;
                    case 2:System.out.print("[ "+matriz[i][j]+"] ");
                        break;
                    case 3:System.out.print("["+matriz[i][j]+"] ");
                        break;                    
                }   
            }
            System.out.println("");
        }
        //Imprimir Matriz Transpuesta
        System.out.println("MATRIZ TRANSPUESTA");
        String digitos2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                digitos2 = Integer.toString(matrizTrans[i][j]);
                switch (digitos2.length()) {
                    case 1:System.out.print("[  "+matriz[j][i]+"] ");
                        break;
                    case 2:System.out.print("[ "+matriz[j][i]+"] ");
                        break;
                    case 3:System.out.print("["+matriz[j][i]+"] ");
                        break;                    
                }   
            }
            System.out.println("");
        }
    } 
}
