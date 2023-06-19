/*A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
package E_3_ElectrodomesticosAutomatico;

/*@author Erick*/
public class Lavadora extends Electrodomesticos {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergia, double peso) {
        super(precio, color, consumoEnergia, peso);
        this.carga = carga;
    }

    public double getCargar() {
        return carga;
    }

    public void setCargar(double cargar) {
        this.carga = cargar;
    }

    @Override
    public String toString() {
        return "Carga (" + carga + ")   Precio ($" + super.precio + ")   Color (" + super.color + ")   Consumo Energia (" + super.consumoEnergia + ")   Peso (" + super.peso + ")";
    }

    @Override
    public double precioFinal() {
        double precioFin = super.precioFinal();
        if (carga > 30) {
            precioFin += 500;
        }

        return precioFin;
    }

    public int electrodomestico() {
        int num = 1;
        return num;
    }
}
