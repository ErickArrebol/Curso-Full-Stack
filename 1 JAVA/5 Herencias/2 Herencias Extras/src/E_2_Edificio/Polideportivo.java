/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_2_Edificio;

/**
 *
 * @author Erick
 */
public class Polideportivo extends Edificio {
    private boolean tipoInstalacion;

    public Polideportivo(double ancho, double alto, double largo,  boolean tipoInstalacion) {
        super(ancho, alto, largo);
        this.tipoInstalacion = tipoInstalacion;
    }

    public boolean getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);    
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    
   
}
