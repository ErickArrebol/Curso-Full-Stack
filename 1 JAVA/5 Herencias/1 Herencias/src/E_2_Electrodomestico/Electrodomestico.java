/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/
//HERENCIA JERARQUICA
package E_2_Electrodomestico;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;


/*@author Erick*/
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergia;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergia, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.*/
    public void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra < 'F') {
            consumoEnergia = letra;
        } else {
            consumoEnergia = 'F';
        }
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public void comprobarColor(String colo) {
        if (!(colo.equalsIgnoreCase("Amarillo") || colo.equalsIgnoreCase("Rojo") || colo.equalsIgnoreCase("Verde") || colo.equalsIgnoreCase("Morado"))) {
            color = "Blanco";
        }
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa el color ");
        color = leer.next();
        comprobarColor(color);
        System.out.print("Ingresa el consumo (Rango A al F) ");
        consumoEnergia = leer.next().charAt(consumoEnergia);
        consumoEnergia=toUpperCase(consumoEnergia);
        comprobarConsumoEnergetico(consumoEnergia);
        System.out.print("Ingresa el peso ");
        peso = leer.nextInt();
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:*/
    public double precioFinal() {
        precio = 1000;
        double precioFin = precio;
        switch (consumoEnergia) {
            case 'A':
                precioFin += 1000;
                break;
            case 'B':
                precioFin += 800;
                break;
            case 'C':
                precioFin += 600;
                break;
            case 'D':
                precioFin += 500;
                break;
            case 'E':
                precioFin += 300;
                break;
            case 'F':
                precioFin += 100;
                break;
        }
        if (peso >= 0 && peso <= 19) {
            precioFin += 100;
        }
        if (peso >= 20 && peso <= 49) {
            precioFin += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precioFin += 800;
        }
        if (peso >= 80) {
            precioFin += 1000;
        }
        
        return precioFin;
    }

}
