/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_Para_Barco_Automatico;

/* @author Erick*/
public class Velero extends Barco{
    
    private int numeroMastiles;

////////////////////////////////////////////////////////////////////////////////
    public Velero() {
    }
    public Velero(int numeroMastiles, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.numeroMastiles = numeroMastiles;
    }
    public int getNumeroMastiles() {
        return numeroMastiles;
    }
    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    @Override
    public String toString() {
        return "Velero " + "\nNumero de Mastiles: " + numeroMastiles + "\nMatricula: " + matricula + "\nEslora: " + eslora + "\nAño: " + anio;
    }
    
////////////////////////////////////////////////////////////////////////////////
  
    public double calcularCostoAlquilerVelero(){
        double costo = super.calcularCostoAlquiler();
        costo +=numeroMastiles;
        return costo;
    }
}
