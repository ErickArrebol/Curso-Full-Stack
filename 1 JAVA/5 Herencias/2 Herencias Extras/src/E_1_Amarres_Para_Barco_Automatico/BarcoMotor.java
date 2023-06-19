/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_Para_Barco_Automatico;

/* @author Erick */
public class BarcoMotor extends Barco{
    private int potenciaCV;

////////////////////////////////////////////////////////////////////////////////    
    public BarcoMotor() {
    }
    public BarcoMotor(int potenciaCV, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
    }
    public int getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "a Motor" + "\npotenciaCV: " + potenciaCV + "\nMatricula: " + matricula + "\nEslora: " + eslora + "\nAño: " + anio;
    }
    
////////////////////////////////////////////////////////////////////////////////

    public double calcularCostoAlquilerBM(){
        double costo = super.calcularCostoAlquiler();
        costo +=potenciaCV;
        return costo;
    }
}
