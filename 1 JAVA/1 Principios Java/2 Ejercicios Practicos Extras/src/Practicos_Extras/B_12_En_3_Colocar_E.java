/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/
package Practicos_Extras;

/*@author Erick*/
public class B_12_En_3_Colocar_E {
    
    public static void main(String[] args) {
        //Opcion 1
        String a="",b,c,letra="3";
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    a = Integer.toString(i);
                    b = Integer.toString(j);
                    c = Integer.toString(k);
                    //A-B-C
                    if (a.equalsIgnoreCase(letra) && b.equalsIgnoreCase(letra) && c.equalsIgnoreCase(letra)) {
                        System.out.println("E" + "-" + "E" + "-" + "E");
                        //B-C
                    } else if (b.equalsIgnoreCase(letra) && c.equalsIgnoreCase(letra)) {
                        System.out.println(a + "-" + "E" + "-" + "E");
                        //A-B
                    } else if (a.equalsIgnoreCase(letra) && b.equalsIgnoreCase(letra)) {
                        System.out.println("E" + "-" + "E" + "-" + c);
                        //A-C
                    } else if (a.equalsIgnoreCase(letra) && c.equalsIgnoreCase(letra)) {
                        System.out.println("E" + "-" + b + "-" + "E");
                        //A
                    } else if (a.equalsIgnoreCase(letra)) {
                        System.out.println("E" + "-" + b + "-" + c);
                        //B
                    } else if (b.equalsIgnoreCase(letra)) {
                        System.out.println(a + "-" + "E" + "-" + c);
                        //C
                    } else if (c.equalsIgnoreCase(letra)) {
                        System.out.println(a + "-" + b + "-" + "E");
                    } else {
                        System.out.println(a + "-" + b + "-" + c);
                    }
                }
            }
        }
        //Opcion 2
//String texto = String.format("%03d", 534);
//System.out.println(texto);
//        for (int i = 0; i <= 999; i++) {
//            String numero = String.format("%03d", i);
//            if (numero.contains("3")) {
//                numero = numero.replace("3", "E");
//            }
//            System.out.println(numero.charAt(0) + "-" + numero.charAt(1) + "-" + numero.charAt(2));
//        }
        
//        String texto = String.format("%03d", 5);
//        System.out.println(texto);
//        En este ejemplo, la cadena de formato "%03d" significa lo siguiente:

//      % indica el comienzo del especificador de formato.
//      0 indica que se rellenará con ceros a la izquierda si es necesario.
//      3 indica que la cadena resultante tendrá una longitud mínima de tres caracteres.
//      d indica que el argumento que se va a formatear es un número entero (en este caso, el número 5).
        
        
    } 
}
