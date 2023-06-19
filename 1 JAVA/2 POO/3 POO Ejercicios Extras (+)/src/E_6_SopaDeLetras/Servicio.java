package E_6_SopaDeLetras;

import java.util.Scanner;

public class Servicio {

        public void buscarPalabra(SopaDeLetras sopa1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscar = scanner.nextLine();

        char[][] matriz = sopa1.getMatriz();

        for (int i = 0; i < matriz.length; i++) {
            String fila = new String(matriz[i]);
            int indice = fila.indexOf(palabraBuscar);
            if (indice != -1) {
                System.out.println("La palabra '" + palabraBuscar + "' se encuentra en la posición: (" + i + ", " + indice + ")");
                return;
            }
        }

        System.out.println("La palabra '" + palabraBuscar + "' no se encuentra en la matriz.");
    }

    public void imprimirSopaDeLetras(SopaDeLetras sopaDeLetras) {
        char[][] matriz = sopaDeLetras.getMatriz();
        System.out.println("---------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    public void reemplazarPalabra(SopaDeLetras sopaDeLetras, String palabraBuscar, String palabraReemplazar) {
        char[][] matriz = sopaDeLetras.getMatriz();

        for (int i = 0; i < matriz.length; i++) {
            String fila = new String(matriz[i]);
            int indice = fila.indexOf(palabraBuscar);
            if (indice != -1) {
                matriz[i] = fila.replace(palabraBuscar, palabraReemplazar).toCharArray();
                System.out.println("La palabra '" + palabraBuscar + "' ha sido reemplazada por '" + palabraReemplazar + "'.");
                return;
            }
        }

        System.out.println("La palabra '" + palabraBuscar + "' no se encuentra en la matriz.");
    }

    public void imprimirSopaDeLetrasInvertida(SopaDeLetras sopa1) {
        char[][] matriz = sopa1.getMatriz();
        System.out.println("---------------------------------");
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("| ");
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------------------------------");
    }
}
