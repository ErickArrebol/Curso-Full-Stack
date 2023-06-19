/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_Para_Barco_Automatico;

/* @author Erick*/
public class Barco {
    
    protected String matricula;
    protected double eslora;
    protected int anio;

////////////////////////////////////////////////////////////////////////////////
    public Barco() {
    }
    public Barco(String matricula, double eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getEslora() {
        return eslora;
    }
    public int getAnio() {
        return anio;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public String toString() {
        return " Matricula " + matricula + ", Eslora " + eslora + ", Año " + anio ;
    }
    
////////////////////////////////////////////////////////////////////////////////
 
    public double calcularCostoAlquiler(){
    double costo = eslora*10;
    return costo;
    }
    
}
