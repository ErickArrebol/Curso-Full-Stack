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
package E_3_ElectrodomesticosAutomatico;

/*@author Erick*/
public class Electrodomesticos {

    protected double precio;
    protected String color;
    protected char consumoEnergia;
    protected double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, char consumoEnergia, double peso) {
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

    
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergia=" + consumoEnergia + ", peso=" + peso + '}';
    }
    

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.*/
    public char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            consumoEnergia = letra;
        } else {
            consumoEnergia = 'F';
        }
        return consumoEnergia;
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public String comprobarColor(String colo) {
        if (!(colo.equalsIgnoreCase("Amarillo") || colo.equalsIgnoreCase("Rojo") || colo.equalsIgnoreCase("Verde") || colo.equalsIgnoreCase("Morado")
                || colo.equalsIgnoreCase("Negro") || colo.equalsIgnoreCase("Gris") || colo.equalsIgnoreCase("Rosa"))) {
            color = "Blanco";
        }else{
           color =colo; 
        }
        return color;
    }

    

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:*/
    public double precioFinal() {
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
    public int electrodomestico(){
        int num =3;
        return num;
    }
}
