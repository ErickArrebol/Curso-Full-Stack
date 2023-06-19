package E_5_Adivina;

import java.util.Scanner;

public class Servicio {
    
    public void crearJuego(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Adivina iniciarA = new Adivina();
        String mes;
        int n=2;
        System.out.println("-------------   ADIVINA   --------------");
        do {
            System.out.print("Ingresa el mes ");
            mes = leer.next();
            if(iniciarA.getMEsSECRETO().equalsIgnoreCase(mes)){
                n=1;
                System.out.println("¡Ha acertado!");
            }else{
                System.out.println("Vuelve a intentar");
            }
        } while (n!=1);
    }
}
