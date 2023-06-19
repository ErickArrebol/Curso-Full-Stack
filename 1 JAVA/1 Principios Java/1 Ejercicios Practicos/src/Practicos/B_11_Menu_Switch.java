/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.*/
package Practicos;

import java.util.Scanner;

/*@author EriCK*/
public class B_11_Menu_Switch {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa 2 numero positivos");
        System.out.print("1° ");
        int n1 = leer.nextInt();
        System.out.print("2° ");
        int n2 = leer.nextInt();
        String salir="";
        int opcion=0;
        int s=0;
        do {
            System.out.println("------MENU------");
            System.out.println("1° Sumar");
            System.out.println("2° Restas");
            System.out.println("3° Multiplicacion");
            System.out.println("4° Divicion");
            System.out.println("5° Salir");
            System.out.println("Elija opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La Suma es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La Resta es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La Multiplicacion es: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("La Divicion es: " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    
                    do {
                    salir = leer.next();
                    salir= salir.toUpperCase();
                    if(salir.equalsIgnoreCase("S")){
                        s=1;
                    }else if (salir.equalsIgnoreCase("N")){
                        s=1;
                    }else{
                        System.out.println("Opcion ivalidad");
                    }
                    } while (s!=1);
                    
                    break;    
                default:
                    System.out.println("Error Opciones invalida");
                    break;
            }
        } while (!salir.equalsIgnoreCase("S"));

    }
    
}
