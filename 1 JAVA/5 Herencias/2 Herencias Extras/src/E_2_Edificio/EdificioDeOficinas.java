/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_2_Edificio;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EdificioDeOficinas extends Edificio{
    private int numOficinas,personasPorOficina,numPisos;
    
    public EdificioDeOficinas(double ancho, double alto, double largo, int numOficinas, int personasPorOficina, int numPisos) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    
    public void cantPersonas() {
        int personasPorPiso = numOficinas * personasPorOficina;
        int personasEnEdificio = personasPorPiso * numPisos;

        System.out.println("Personas por piso: " + personasPorPiso);
        System.out.println("Personas en todo el edificio: " + personasEnEdificio);
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo * numPisos;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    
}
