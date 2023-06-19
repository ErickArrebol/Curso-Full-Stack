/*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.*/
package E_3_ElectrodomesticosAutomatico;

/*@author Erick*/
public class Television extends Electrodomesticos {

    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {

    }

    public Television(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergia, double peso) {
        super(precio, color, consumoEnergia, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Resolucion (" + resolucion + ")   TDT(" + sintonizadorTDT + ")   Precio ($" + super.precio + ")   Color (" + super.color + ")   Consumo Energia (" + super.consumoEnergia + ")   Peso (" + super.peso + ")";
    }

    

    @Override
    public double precioFinal() {
        double precioFin = super.precioFinal();
        if (resolucion > 40) {
            precioFin += precioFin * 0.3;
        }
        if (sintonizadorTDT) {
            precioFin += 500;
        }
        return precioFin;
    }

    public int electrodomestico() {
        int num = 2;
        return num;
    }
}
