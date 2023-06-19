/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_para_barcos;

import java.util.Scanner;

/*@author Erick*/
public class Yates extends Barco{
    private int potenciaCV;
    private int numeroCamarotes;

    public Yates() {
    }
    

    public Yates(int potenciaCV, int numeroCamarotes, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }
    
    public void crearYate(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.print("Ingrea la potencia ");
        potenciaCV = leer.nextInt();
        System.out.print("Ingresa el numero de Camarotes ");
        numeroCamarotes = leer.nextInt();
    }
    
    public double CostoAqluilerYate(){
        double costoFinal = super.calcularCostoAqluiler();
        costoFinal += potenciaCV+numeroCamarotes;
        return costoFinal;
    }
}
