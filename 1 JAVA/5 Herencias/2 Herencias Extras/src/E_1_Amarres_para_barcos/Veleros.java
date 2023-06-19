/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_para_barcos;

import java.util.Scanner;

/**@author Erick*/
public class Veleros extends Barco{
    private int numeroMastiles;

    public Veleros() {
    }
    public Veleros(int numeroMastiles, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }
    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    public void crearVelor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.print("Ingrea el numero de mastil ");
        numeroMastiles = leer.nextInt();
    }
    
    public double CostoAqluilerVeleros(){
        double costoFinal = super.calcularCostoAqluiler();
        costoFinal += numeroMastiles;
        return costoFinal;
    }
}
