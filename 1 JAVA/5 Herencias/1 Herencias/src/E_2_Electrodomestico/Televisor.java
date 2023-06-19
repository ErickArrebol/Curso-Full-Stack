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
package E_2_Electrodomestico;
import java.util.Scanner;

/*@author Erick*/
public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Televisor() {
        
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergia, double peso) {
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
    
    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.
    */
    public void crearTelevisor(){
        System.out.println("----- Televisor -----");
        crearElectrodomestico();
        System.out.print("Ingresa la Resolucion de la panlla ");
        resolucion = leer.nextInt();
        System.out.println("El televisor tiene sintonizadorTDT (true/false) ");
        sintonizadorTDT = leer.nextBoolean();
    }
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.
    Finalmente, en el main debemos realizar lo siguiente:
    Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
    el precio final de los dos electrodomésticos.*/
    public double precioFinal(){
        double precioFin = super.precioFinal();
        if(resolucion>40){
           precioFin += precioFin*0.3; 
        }
        if (sintonizadorTDT ){
            precioFin+=500;
        }
        System.out.println("Precio Final " + precioFin);
        return precioFin;
    }
}
