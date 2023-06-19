/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
        int [][] matrizGrande = {{1, 26, 36, 47, 5, 6, 72, 81, 95,10}, 
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, 
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, 
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, 
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, 
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, 
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, 
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18}, 
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, 
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        
        int [][] matrizMenor = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};*/
package Practicos;
/*@author Erick*/
public class C_21_MatrizP_busquedas_MatrizM {

    public static void main(String[] args) {
        // MATRIZ M de 10x10
        int[][] matrizM =   {{1, 26, 36, 47,  5,  6, 72, 81, 95, 10},
                            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
                            {56, 78, 87, 90,  9, 90, 17, 12, 87, 36},
                            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                            {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},
                            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        // MATRIZ P de 3x3
        int[][] matrizP = { {36,  5, 67}, 
                            {89, 90, 75}, 
                            {14, 22, 26}};
        
        int f =0 , c=0, indiceF=0, indiceC=0, conta=0;
        boolean validacion = false;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                
                if (i < 7 && j < 7) {//<--->Validar que recorra hasta el limite 

                    if (matrizM[i][j] == matrizP[f][c]) {//<--->Posicion inicial de la Matriz P [0][0]
                        
                        //<---> FILA 1  Posicion de matriz M [0][1]-[0][2]
                        if (matrizM[i][j + 1] == matrizP[f][c + 1] && matrizM[i][j + 2] == matrizP[f][c + 2]) {
                            conta = conta + 1;
                            indiceF = i;
                            indiceC = j;
                        } else {
                            conta = 0;
                        }
                        
                        //<---> FILA 2 Posicion de matriz M [1][0]-[1][1]-[1][2]
                        if (matrizM[i + 1][j] == matrizP[f + 1][c] && matrizM[i + 1][j + 1] == matrizP[f + 1][c + 1] && matrizM[i + 1][j + 2] == matrizP[f + 1][c + 2]) {
                            conta = conta + 1;
                        } else {
                            conta = 0;
                        }
                        
                        //<---> FILA 3 Posicion de matriz M [2][0]-[2][1]-[2][2]
                        if (matrizM[i + 2][j] == matrizP[f + 2][c] && matrizM[i + 2][j + 1] == matrizP[f + 2][c + 1] && matrizM[i + 2][j + 2] == matrizP[f + 2][c + 2]) {
                            conta = conta + 1;
                        } else {
                            conta = 0;
                        }
                    } else {

                    }
                }

            }
        }
        
        if ( conta==3){
            System.out.println("La MATRIZ P se encuentra dentro de la MATRIZ M en la posisicones: ");
            System.out.println("["+indiceF+"]"+"["+indiceC+"]"+" "+"["+(indiceF)+"]"+"["+(+indiceC+1)+"]"+" "+"["+indiceF+"]"+"["+(indiceC+2)+"]");
            System.out.println("["+(indiceF+1)+"]"+"["+indiceC+"]"+" "+"["+(indiceF+1)+"]"+"["+(+indiceC+1)+"]"+" "+"["+(indiceF+1)+"]"+"["+(indiceC+2)+"]");
            System.out.println("["+(indiceF+2)+"]"+"["+indiceC+"]"+" "+"["+(indiceF+2)+"]"+"["+(+indiceC+1)+"]"+" "+"["+(indiceF+2)+"]"+"["+(indiceC+2)+"]");
        }else{
            System.out.println("NO se encuentra la MATRIZ P dentro de la MATRIZ M");
        }
        
    }   
}
