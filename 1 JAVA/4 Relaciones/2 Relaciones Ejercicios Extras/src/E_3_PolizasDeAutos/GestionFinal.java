/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_3_PolizasDeAutos;

import java.util.List;

/*@author Erick*/
public class GestionFinal {

    private Clientes cliente;
    private List<Vehiculo> carros;
    private List<Polizas> polizas;
    private List<Cuotas> cuotas;

    public GestionFinal(Clientes cliente, List<Vehiculo> carros, List<Polizas> polizas, List<Cuotas> cuotas) {
        this.cliente = cliente;
        this.carros = carros;
        this.polizas = polizas;
        this.cuotas = cuotas;
    }

    public GestionFinal() {
    }

    public Clientes getCliente() {
        return cliente;
    }

    public List<Vehiculo> getCarros() {
        return carros;
    }

    public List<Polizas> getPolizas() {
        return polizas;
    }

    public List<Cuotas> getCuotas() {
        return cuotas;
    }

    @Override
    public String toString() {
        return "--Datos de polizas de un cliente en la base de datos --\n" + "Cliente " + cliente.toString() + "\nVehiculo " + carros.toString() + "\nPolizas " + polizas.toString() + "\nCuta " + cuotas.toString() ;
    }
    

    

}
