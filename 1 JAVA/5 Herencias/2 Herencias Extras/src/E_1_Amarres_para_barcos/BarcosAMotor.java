/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_para_barcos;

import java.util.Scanner;

/*@author Erick */
public class BarcosAMotor  extends Barco{
    private int potenciaCV;

    public BarcosAMotor() {
    }
    
    public BarcosAMotor(int potenciaCV, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////77
    // metodos manueales
    
    public void crearBarcoMotor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.print ("Ingresa la potencia ");
         potenciaCV = leer.nextInt();
    }
    
    public double CostoAqluilerBarcoM(){
        double costoFinal = super.calcularCostoAqluiler();
        costoFinal += potenciaCV;
        return costoFinal;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metodos Atomaticso
}
