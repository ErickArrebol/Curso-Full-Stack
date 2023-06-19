/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_Para_Barco_Automatico;

/*@author Erick*/
public class Yate extends Barco{
    
    private int potenciaCV;
    private int numeroCamarotes;
    
////////////////////////////////////////////////////////////////////////////////
    public Yate() {
    }
    public Yate(int potenciaCV, int numeroCamarotes, String matricula, double eslora, int anio) {
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
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    @Override
    public String toString() {
        return "Yate" + "\nPotencia CV: " + potenciaCV + "\nNumero de Camarotes: " + numeroCamarotes + "\nMatricula: " + matricula + "\nEslora: " + eslora + "\nAño: " + anio;
    }
    
////////////////////////////////////////////////////////////////////////////////
    
    public double calcularCostoAlquilerYate(){
        double costo = super.calcularCostoAlquiler();
        costo +=potenciaCV+numeroCamarotes;
        return costo;
    }
}
