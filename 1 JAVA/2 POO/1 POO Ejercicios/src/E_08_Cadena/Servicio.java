package E_08_Cadena;
import java.util.Scanner;

/*@author Erick*/
public class Servicio {

    public Cadena crearFrase() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena palabra = new Cadena();
        System.out.print("Ingresa una frase ");
        String letras = leer.nextLine();
        palabra.setFrase(letras);
        palabra.setLongitud(letras.length());
        return palabra;
    }

    public void mostrarVocales(Cadena palabra) {

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        char[] consonantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
            'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        String cons = "";
        String voc = "";
        int nConsonantes = 0;
        int nVocal = 0;
        for (int i = 0; i < palabra.getLongitud(); i++) {

            for (int a = 0; a < vocales.length; a++) {
                if (palabra.getFrase().charAt(i) == vocales[a]) {
                    nVocal++;
                    voc += palabra.getFrase().charAt(i);
                }
            }
            for (int a = 0; a < consonantes.length; a++) {
                if (palabra.getFrase().charAt(i) == consonantes[a]) {
                    nConsonantes++;
                    cons += palabra.getFrase().charAt(i);
                }
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("MOSTRAR VOCALES");
        System.out.println("Cadena Original " + palabra.getFrase());
        System.out.println("Vocales (" + nVocal + "): " + voc);
        System.out.println("Consonantes (" + nConsonantes + "): " + cons);

    }

    public void invertirFrase(Cadena palabra) {

        String palabraInv = "";

        for (int i = palabra.getLongitud() - 1; i >= 0; i--) {
            palabraInv += palabra.getFrase().substring(i, i + 1);
        }
        System.out.println("---------------------------------------");
        System.out.println("INVERTIR FRASE");
        System.out.println("La palabra invertida es: " + palabraInv);

    }

    public void vecesRepetido(Cadena palabra) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        String caracter = "";
        System.out.println("---------------------------------------");
        System.out.println("veces Repetido");
        System.out.print("Ingresa el caracter a buscar ");
        caracter = leer.next();

        for (int i = 0; i < palabra.getLongitud(); i++) {
            if (caracter.equals(palabra.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("El caracter (" + caracter + ") se repite " + contador);
        } else {
            System.out.println("El caracter (" + caracter + ") no se encontro");
        }

    }

    public void compararLongitud(Cadena palabra) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---------------------------------------");
        System.out.println("COMPARAR LONGITUD");
        System.out.println("Ingresa otra frase");
        String fraseNueva = leer.next();
        int tamaño = fraseNueva.length();

        if (tamaño == palabra.getLongitud()) {
            System.out.println("Las dos frases ingresadas son iguales");
        } else if (tamaño > palabra.getLongitud()) {
            System.out.println("La segunda frase ingresa es mayor que la primera");
        } else {
            System.out.println("La primer frase ingresa es mas garnde que la segunda");
        }

    }

    public void unirFrases(Cadena palabra) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---------------------------------------");
        System.out.println("UNIR FRASE");
        System.out.println("Ingresa una frase a unir");
        String frase = leer.next();
        String union = "";
        union += frase;
        union += palabra.getFrase();
        System.out.println("La frase unuida es " + union);

    }

    public void reemplazar(Cadena palabra) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---------------------------------------");
        System.out.println("REMPLAZAR");
        String remplazo = "";
        System.out.println("Ingresa un cacater a remplazar en la frase en la (a)");
        String letra = leer.next();

        for (int i = 0; i < palabra.getLongitud(); i++) {
            if ("a".equals(palabra.getFrase().substring(i, i + 1))) {
                remplazo += letra;
            } else {
                remplazo += palabra.getFrase().substring(i, i + 1);
            }
        }
        System.out.println("La frase con el caracter editado es " + remplazo);

    }

    public void contine(Cadena palabra) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---------------------------------------");
        System.out.println("CONTINE");
        System.out.println("Ingresa un caracter a buscar");
        String caracter = leer.next();
        boolean logico = false;
        for (int i = 0; i < palabra.getLongitud(); i++) {
            if (caracter.equals(palabra.getFrase().substring(i, i + 1))) {
                logico = true;
            }
        }
        System.out.println("El caracter ("+caracter+") se ecuentra en la frase? " + logico);

    }

}
