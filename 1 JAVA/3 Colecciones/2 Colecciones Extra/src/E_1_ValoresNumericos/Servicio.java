package E_1_ValoresNumericos;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    
    public ValoresNumericos crearLista(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> numeros = new ArrayList<>();
        int n=0;
        System.out.println("Para detener el ingreso de numero ingresa (-99)");
        while (n!=-99) {
            numeros.add(n);
            System.out.print("Ingrese numeros enteros ");
            n = leer.nextInt();
            
        }
           
        int cantidadValores = numeros.size();
        int suma = 0;
        for (int i = 0; i < cantidadValores; i++) {
            suma += numeros.get(i);
        }

        double promedio = (double) suma / cantidadValores;
        System.out.println("Número de valores leídos: " + (cantidadValores-1));
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Promedio de los valores: " + promedio);
        ValoresNumericos objeto = new ValoresNumericos(numeros);
        return objeto;
    }
}
