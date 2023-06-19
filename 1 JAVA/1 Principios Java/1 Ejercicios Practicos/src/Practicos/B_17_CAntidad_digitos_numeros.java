/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
package Practicos;

/*@author Erick*/
public class B_17_CAntidad_digitos_numeros {

    public static void main(String[] args) {
        int [] vector = new int [10];
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        String n;
        for (int i = 0; i <vector.length; i++) {
            vector[i]=(int)(Math.random()*1000);
            n=Integer.toString(vector[i]);
            switch (n.length()) {
                case 1:
                    cont1++;
                    break;               
                case 2:
                    cont2++;
                    break;               
                case 3:
                    cont3++;
                    break;               
                case 4:
                    cont4++;
                    break;               
                case 5:
                    cont5++;
                    break;               
            }            
        }
        System.out.println("La cantidad de numero con 1 digito es: "+cont1);
        System.out.println("La cantidad de numero con 2 digito es: "+cont2);
        System.out.println("La cantidad de numero con 3 digito es: "+cont3);
        System.out.println("La cantidad de numero con 4 digito es: "+cont4);
        System.out.println("La cantidad de numero con 5 digito es: "+cont5);
    }  
}
