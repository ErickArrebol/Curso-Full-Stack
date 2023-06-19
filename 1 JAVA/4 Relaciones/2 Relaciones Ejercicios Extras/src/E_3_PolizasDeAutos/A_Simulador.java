/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_3_PolizasDeAutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*@author Erick*/
public class A_Simulador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        GestionFinal iniciarL = new GestionFinal();
        GetionsClienteVehiculo iniciarCV = new GetionsClienteVehiculo();
        GestionPolizaCuota iniciarPC = new GestionPolizaCuota();
        for (int i = 0; i < 30; i++) {
            iniciarPC.PolizaCuota();
            iniciarCV.Persona();
            iniciarCV.Vehiculo();
        }
//GestionFinal(Clientes cliente, List<Vehiculo> carros, List<Polizas> polizas, List<Cuotas> cuotas) 

        List<Polizas> listaPolizas = iniciarPC.getPoliza();
        System.out.println("Cuotas "+listaPolizas.size());
        List<Cuotas> listaCoutas = iniciarPC.getCuota();
        System.out.println("Poliza "+listaPolizas.size());
        List<Vehiculo> listaVehiculos = iniciarCV.getVehiculo();
        System.out.println("Vhiculo "+listaVehiculos.size());
        List<Clientes> listasClientes = iniciarCV.getCliente();
        System.out.println("Cliente "+listasClientes.size());
        List<GestionFinal> listaDeDatos = new ArrayList<>();
        System.out.print("Cuantos clientes quieres agregar a la base de datos ");
        int opcion = leer.nextInt();
        for (int i = 0; i < opcion; i++) {
            System.out.println("-------------------");
            
            for (int j = 0; j <opcion ; j++) {
                System.out.println("");
                System.out.println("El cliente " + listasClientes.get(j).getNombre() + " " + listasClientes.get(j).getApellido());
                System.out.print("Cuantos carro(s) va a asegurar ");
                int cantidad = leer.nextInt();
                int vueltas = 0;

                List<Vehiculo> carro = new ArrayList<>();
                List<Polizas> poliza = new ArrayList<>();
                List<Cuotas> couta = new ArrayList<>();

                while ( vueltas< cantidad) {

                    int posicionV = (int) (Math.random() * 30);
                    Vehiculo objetoV = listaVehiculos.get(posicionV);//objeto de Vehiculo
                    int posicionP = (int) (Math.random() * 30);
                    Polizas objetoP = listaPolizas.get(posicionP);//onjeto de Poliza
                    int posicionC = (int) (Math.random() * 30);
                    Cuotas objetoC = listaCoutas.get(posicionC);//objeto de Couta
                    
                    if (!carro.contains(objetoV) && !couta.contains(objetoC) && !poliza.contains(objetoP)) {
                        carro.add(objetoV);
                        poliza.add(objetoP);
                        couta.add(objetoC);
                        vueltas++;
                    }
                    vueltas++;
                }

                listaDeDatos.add(new GestionFinal(listasClientes.get(j),carro,poliza,couta));
            }
            
        }
        
        //imprimir lista de dtos
        for (int i = 0; i < listaDeDatos.size(); i++) {
            System.out.println(listaDeDatos.get(i).toString());
            
        }
        
        
    }

}
