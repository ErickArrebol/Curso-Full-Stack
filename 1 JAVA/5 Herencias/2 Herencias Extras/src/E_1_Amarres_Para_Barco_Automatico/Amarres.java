/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_Para_Barco_Automatico;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*@author Erick*/
public class Amarres {

    private String nombre;
    private int documento;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolución;
    private int posiciónDelAmarre;
    private Barco barco;
    private double precioFinal;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Amarres() {
    }

    public Amarres(String nombre, int documento, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolución, int posiciónDelAmarre, Barco barco, double precioFinal) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolución = fechaDeDevolución;
        this.posiciónDelAmarre = posiciónDelAmarre;
        this.barco = barco;
        this.precioFinal = precioFinal;
    }
    
    public String getNombre() {
        return nombre;
    }
    public int getDocumento() {
        return documento;
    }
    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }
    public LocalDate getFechaDeDevolución() {
        return fechaDeDevolución;
    }
    public int getPosiciónDelAmarre() {
        return posiciónDelAmarre;
    }
    public Barco getBarco() {
        return barco;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }
    public void setFechaDeDevolución(LocalDate fechaDeDevolución) {
        this.fechaDeDevolución = fechaDeDevolución;
    }
    public void setPosiciónDelAmarre(int posiciónDelAmarre) {
        this.posiciónDelAmarre = posiciónDelAmarre;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDocumento: " + documento + "\nFecha De Alquiler: " + fechaDeAlquiler + "\nFecha De Devolucion: " + fechaDeDevolución + "\nPosicion Del Amarre: " + posiciónDelAmarre + "\nBarco " + barco.toString();
    }
    
   
    public double diasDeOcpuacion(){
       LocalDate fecha1= fechaDeAlquiler;
       LocalDate fecha2 = fechaDeDevolución;
       Long diasOcupados =  ChronoUnit.DAYS.between(fecha1, fecha2);
       double dias= (double) diasOcupados;
       return dias;
    }
    
    
}
