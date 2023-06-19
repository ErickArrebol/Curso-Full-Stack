/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_2_Edificio;

import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class A_Simulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();

        // Agregar dos polideportivos
        edificios.add(new Polideportivo(20, 10, 5,false));
        edificios.add(new Polideportivo(30, 15, 5,true));

        // Agregar dos edificios de oficinas
        edificios.add(new EdificioDeOficinas(40, 25, 18, 8, 10, 5));
        edificios.add(new EdificioDeOficinas(50, 25, 15, 12, 9, 3));

        // Calcular y mostrar superficie y volumen de cada edificio
        for (Edificio edificio : edificios) {
            System.out.println("Superficie del edificio: " + edificio.calcularSuperficie());
            System.out.println("Volumen del edificio: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {//instanceof se usa para checar si en una lista hya una clase o subclase
                if(((Polideportivo)edificio).getTipoInstalacion()){
                    System.out.println("Es techado");
                }else{
                    System.out.println("Es abierto");
                }
            } else if (edificio instanceof EdificioDeOficinas) {//instanceof se usa para checar si en una lista hya una clase o subclase
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                edificioDeOficinas.cantPersonas();
            }

            System.out.println();
        }
    }
    
}
