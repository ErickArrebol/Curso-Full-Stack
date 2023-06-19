/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_6_SopaDeLetras;

/**
 *
 * @author Erick
 */
public class a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] matriz = new char[][]{
            {'p', 'e', 'r', 'r', 'o', 'c', 'a', 't', 'o', 'r'},
            {'a', 's', 'i', 't', 'i', 'o', 'c', 'e', 'r', 'o'},
            {'l', 'e', 'c', 'h', 'e', 'm', 'o', 't', 'o', 'r'},
            {'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},
            {'p', 'e', 'r', 'r', 'o', 'p', 'e', 'r', 'r', 'o'},
            {'a', 's', 'i', 't', 'i', 'o', 'a', 's', 'i', 't'},
            {'l', 'e', 'c', 'h', 'e', 'l', 'e', 'c', 'h', 'e'},
            {'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},
            {'m', 'o', 't', 'o', 'r', 'm', 'o', 't', 'o', 'r'},
            {'r', 'a', 't', 'a', 's', 'r', 'a', 't', 'a', 's'}
        };
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("|");
            
        }
    }
    
}
