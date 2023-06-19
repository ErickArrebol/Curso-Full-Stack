/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_3_PolizasDeAutos;

import java.util.Date;

/* @author Erick*/
public class Cuotas {
    private int númeroDeCuota;   //mese a pagar, 
    private double montoTotalDeLaCuota;
    private String Vencimiento; 
    private String formaDePago; //(efectivo, transferencia, etc.).

    public Cuotas(int númeroDeCuota, double montoTotalDeLaCuota, String Vencimiento, String formaDePago) {
        this.númeroDeCuota = númeroDeCuota;
        this.montoTotalDeLaCuota = montoTotalDeLaCuota;
        this.Vencimiento = Vencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNúmeroDeCuota() {
        return númeroDeCuota;
    }

    public double getMontoTotalDeLaCuota() {
        return montoTotalDeLaCuota;
    }



    public String getVencimiento() {
        return Vencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numeroDeCuota=" + númeroDeCuota + ", montoTotalDeLaCuota=" + montoTotalDeLaCuota + ", Vencimiento=" + Vencimiento + ", formaDePago=" + formaDePago + '}';
    }
    
    
}
