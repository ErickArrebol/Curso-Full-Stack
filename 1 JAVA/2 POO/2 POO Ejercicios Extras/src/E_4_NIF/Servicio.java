package E_4_NIF;

import java.util.Scanner;


public class Servicio {
    
    public NIF crearDNI(){
        Scanner leer = new Scanner(System.in);
        NIF iniciarN = new NIF();
        String [] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};        
        System.out.print("Ingrese su DNI: ");
        int num = leer.nextInt();
        long numeros = 9999999+(long) (Math.random() * 2453380);
        iniciarN.setNumeroDNI(numeros);
        iniciarN.setLetra(vector[num]); 
        return iniciarN;
    }
    public void mostrar(NIF iniciarN){
        System.out.println("Su numero de NIF es: " + iniciarN.getNumeroDNI()+"-"+iniciarN.getLetra());
    }
}
