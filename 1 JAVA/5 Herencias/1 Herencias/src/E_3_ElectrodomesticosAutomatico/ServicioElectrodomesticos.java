/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_3_ElectrodomesticosAutomatico;

/*@author Erick*/
public class ServicioElectrodomesticos {
    public static double cargas() {///Metdod especifico de Lavadora
        double carga = (int) (Math.random() * 50);
        return carga;
    }

    public static String colores() {//Metodo General
        String[] colores = {
            "Rojo", "Verde", "Azul", "Amarillo", "Naranja",
            "Violeta", "Blanco", "Negro", "Gris", "Rosa"};
        int posicion = (int) (Math.random() * colores.length);
        return colores[posicion];
    }

    public static char consumoEnegia() {//Metodo General
        char[] letras = new char[9];

        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) ('A' + i);
        }

        int posicion = (int) (Math.random() * letras.length);
        return letras[posicion];
    }

    public static double peso() {//Metodo General
        double peso = (int) (Math.random() * 100);
        return peso;
    }

    public static int pulgadasTV() {//Metodo de Televisor
        int resolucion = (int) (Math.random() * 100);
        return resolucion;
    }

    public static boolean TDT() {//Metodo de Televisor
        int valor = (int) (Math.random() * 2) + 1;
        boolean logica = false;
        if (valor == 1) {
            logica = true;
        }
        return logica;
    }
}
