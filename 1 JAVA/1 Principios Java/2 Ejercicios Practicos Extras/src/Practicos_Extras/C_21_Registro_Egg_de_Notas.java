/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.*/
package Practicos_Extras;
import java.util.Scanner;

/*@author Erick*/
public class C_21_Registro_Egg_de_Notas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double nota1 = 0.1, nota2 = 0.15, nota3 = 0.25, nota4 = 0.5;
        double suma = 0, nota = 0, operacion = 0;
        double[] vector = new double[10];
        int alumno = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + alumno + "Â°");
            System.out.print("Ingresa la calificacion del Primer trabajo prÃ¡ctico__ ");
            nota = leer.nextDouble();
            operacion = nota * nota1;
            suma = suma + operacion;

            System.out.print("Ingresa la calificacion del Segundo trabajo prÃ¡ctico__ ");
            nota = leer.nextDouble();
            operacion = nota * nota2;
            suma = suma + operacion;

            System.out.print("Ingresa la calificacion del Primer Integrador__ ");
            nota = leer.nextDouble();
            operacion = nota * nota3;
            suma = suma + operacion;

            System.out.print("Ingresa la calificacion del Segundo integrador__ ");
            nota = leer.nextDouble();
            operacion = nota * nota4;
            suma = suma + operacion;
            System.out.println("");
            vector[i] = suma;

            alumno++;
            suma = 0;
        }
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (vector[i] >= 7) {
                contador = contador + 1;
            }
        }
        System.out.println("Tabla de calificaciones");
        for (int i = 0; i < 10; i++) {
            System.out.print("|" + vector[i]);
        }
        System.out.println("|");
        System.out.println("");
        System.out.println("La cantidad de alumnos Aprobados es " + contador);
        System.out.println("La cantidad de alumnos Reprobados es " + (10 - contador));
    }
}
