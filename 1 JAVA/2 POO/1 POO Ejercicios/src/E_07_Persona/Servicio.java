package E_07_Persona;
import java.util.Scanner;

/*@author Erick */
public class Servicio {

    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona1 = new Persona();
        System.out.print("Ingresa el nombre: ");
        persona1.setNombre(leer.next());
        System.out.print("Ingresa la edad: ");
        persona1.setEdad(leer.nextInt());
        //sexo ('H' hombre, 'M' mujer, 'O' otro) blucle para ingesar la letra correcta
        int cont = 0;
        do {
            System.out.print("Ingresa tu sexo 'H' hombre, 'M' mujer, 'O' otro ");
            persona1.setSexo(leer.nextLine());
            if ("M".equals(persona1.getSexo()) || "H".equals(persona1.getSexo()) || "O".equals(persona1.getSexo())) {
                cont = 1;
            }
        } while (cont != 1);
        System.out.print("Ingresa el peso  en kg ");
        persona1.setPeso(leer.nextDouble());
        System.out.print("Ingresa la altura ");
        persona1.setAltura(leer.nextDouble());
        System.out.println("---------------------------------------------");
        return persona1;
    }

    public double calcularIMC(Persona persona1) {
        int n = 5;
        double peso = persona1.getPeso();
        double altura = persona1.getAltura();
        double imc = peso / (Math.pow(altura, 2));//formula (peso en kg/(altura^2 en mt2)).

        if (imc >= 20 && imc <= 25) {
            n = 0;
        }
        if (imc < 20) {
            n = -1;
        }
        if (imc > 25) {
            n = 1;
        }
        return n;
    }

    public boolean esMayorDeEdad(Persona persona1) {
        
        boolean logica = false;
        if (persona1.getEdad() >= 18) {
            logica = true;
        }
        return logica;
        
    }


}
