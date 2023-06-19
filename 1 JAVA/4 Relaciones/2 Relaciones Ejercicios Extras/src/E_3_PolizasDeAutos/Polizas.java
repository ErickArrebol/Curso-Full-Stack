/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_3_PolizasDeAutos;
import java.util.Date;

/*@author Erick
*/
public class Polizas {
    private int númeroDePóliza;
    private String inicio;
    private String fin;
    private int cantidadDeCuotas; 
    private String formaDePago;
    private double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private int montoMaximoGranizo;
    private String tipoDeCobertura; // (total, contra terceros, etc.).  

    public Polizas(int númeroDePóliza, String inicio, String fin, int cantidadDeCuotas, String formaDePago, double montoTotalAsegurado, boolean incluyeGranizo, String tipoDeCobertura) {
        this.númeroDePóliza = númeroDePóliza;
        this.inicio = inicio;
        this.fin = fin;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        if(incluyeGranizo==true){
          this.montoMaximoGranizo =50000; 
        }else{
           this.montoMaximoGranizo =0; 
        }
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public int getNúmeroDePóliza() {
        return númeroDePóliza;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public int getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    @Override
    public String toString() {
        return "Polizas{" + "numeroDePoliza=" + númeroDePóliza + ", inicio=" + inicio + ", fin=" + fin + ", cantidadDeCuotas=" + cantidadDeCuotas + ", formaDePago=" + formaDePago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGranizo=" + montoMaximoGranizo + ", tipoDeCobertura=" + tipoDeCobertura + '}';
    }
    
    
}
