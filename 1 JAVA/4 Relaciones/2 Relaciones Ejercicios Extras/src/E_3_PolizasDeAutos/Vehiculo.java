/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_3_PolizasDeAutos;

/*@author Erick*/
public class Vehiculo {
    private String marcaYmodelo;
    private int anio, númeroDeMotor;
    private String chasis, color;
    private String tipo; //(camioneta, sedán, etc.).

    public Vehiculo(String marcaYmodelo, int anio, int númeroDeMotor, String chasis, String color, String tipo) {
        this.marcaYmodelo = marcaYmodelo;
        this.anio = anio;
        this.númeroDeMotor = númeroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarcaYmodelo() {
        return marcaYmodelo;
    }

    
    
    public int getAnio() {
        return anio;
    }

    public int getNúmeroDeMotor() {
        return númeroDeMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marcaYmodelo=" + marcaYmodelo + ", anio=" + anio + ", n\u00fameroDeMotor=" + númeroDeMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
}
