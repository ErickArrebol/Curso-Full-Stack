package E_02_Circunferenciua;
import java.util.Scanner;

/*@author Erick*/
public class Servicio {

    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circunferencia iniciar = new Circunferencia();
        System.out.print("Ingresa el radio del circulo ");
        iniciar.setRadio(leer.nextDouble());
        return iniciar;
    }
    public void area(Circunferencia radio) {
        double area;
        area = Math.PI * Math.pow(radio.getRadio(), 2);
        System.out.println("El area es " + area);
    }

    public void perimetro(Circunferencia radio) {
        double perimetro;
        perimetro = 2 * Math.PI * radio.getRadio();
        System.out.println("El perimetro es " + perimetro);
    }
}
