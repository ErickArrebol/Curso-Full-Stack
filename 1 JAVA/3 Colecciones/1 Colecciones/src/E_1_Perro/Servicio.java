package E_1_Perro;

import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Servicio {
    Perros r= new Perros();
    
    public Perros creasRazas (){
        Scanner leer = new Scanner(System.in); 
        ArrayList<String> listado = new ArrayList();
        String letra="";
        String opcion="";
        do {
            System.out.print("Ingresa un Raza de perro ");
            letra=leer.nextLine();
            listado.add(letra);
            do {
                System.out.print("Deseas agregar mas perros Si(s) y No (n) ");
            opcion=leer.nextLine();
                         
            switch (toUpperCase(opcion) ) {
                case "s":
                    System.out.println("------------------------------------------");
                    System.out.println("");
                break;
                case "n":
                    System.out.println("------------         FIN       ------------");
                    break;
                
            } 
            } while (!opcion.equalsIgnoreCase("n"));
            
                       
         
        } while (!"n".equals(opcion));
        
        for (String aux: listado ){
            System.out.println(aux+" ");
        }
        r.setNombreMascota(listado);
        return r;
    }
}
