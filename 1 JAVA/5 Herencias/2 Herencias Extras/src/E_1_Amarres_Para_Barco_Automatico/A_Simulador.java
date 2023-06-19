/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1_Amarres_Para_Barco_Automatico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Erick
 */
public class A_Simulador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Amarres> listaDeAlquileres = new ArrayList<>();
        ZServicio s = new ZServicio();
        Amarres a = new Amarres();
        System.out.print("Cuantos clientes agregaras a la lista ");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            a.setNombre(s.crearNombreCliente());
            a.setDocumento(s.crearDocumento()); 
            a.setFechaDeAlquiler(s.crearFechaAlquiler());
            a.setFechaDeDevolución(s.craerFechaDevolucion());
            a.setPosiciónDelAmarre(s.crearPosicionDeAmarre());
            int opcion = (int) (Math.random() * 3) + 1;
            switch (opcion) {
                case 1:
                    BarcoMotor bm = new BarcoMotor();
                    bm.setPotenciaCV(s.crearPotenciaCV());
                    bm.setMatricula(s.crearMatricula());
                    bm.setEslora(s.crearElora());
                    bm.setAnio(s.crearAño());
                    BarcoMotor objetoBM = new BarcoMotor(bm.getPotenciaCV(),bm.getMatricula(),bm.getEslora(),bm.getAnio());
                    a.setPrecioFinal((bm.calcularCostoAlquilerBM()*a.diasDeOcpuacion()));
                    listaDeAlquileres.add(new Amarres(a.getNombre(),a.getDocumento(),a.getFechaDeAlquiler(),a.getFechaDeDevolución(),a.getPosiciónDelAmarre(),objetoBM,a.getPrecioFinal()));
                    break;
                case 2:
                    Velero v = new Velero();
                    v.setNumeroMastiles(s.crearMastiles());
                    v.setMatricula(s.crearMatricula());
                    v.setEslora(s.crearElora());
                    v.setAnio(s.crearAño());
                    Velero objetov = new Velero(v.getNumeroMastiles(),v.getMatricula(),v.getEslora(),v.getAnio());
                    a.setPrecioFinal((v.calcularCostoAlquilerVelero()*a.diasDeOcpuacion()));
                    listaDeAlquileres.add(new Amarres(a.getNombre(),a.getDocumento(),a.getFechaDeAlquiler(),a.getFechaDeDevolución(),a.getPosiciónDelAmarre(),objetov,a.getPrecioFinal()));
                    break;
                case 3:
                    Yate y = new Yate();
                    y.setPotenciaCV(s.crearPotenciaCV());
                    y.setNumeroCamarotes(s.crearCamarotes());
                    y.setMatricula(s.crearMatricula());
                    y.setEslora(s.crearElora());
                    y.setAnio(s.crearAño());
                    Yate objetoY = new Yate(y.getPotenciaCV(),y.getNumeroCamarotes(),y.getMatricula(),y.getEslora(),y.getAnio());
                    a.setPrecioFinal((y.calcularCostoAlquilerYate()*a.diasDeOcpuacion()));
                    listaDeAlquileres.add(new Amarres(a.getNombre(),a.getDocumento(),a.getFechaDeAlquiler(),a.getFechaDeDevolución(),a.getPosiciónDelAmarre(),objetoY,a.getPrecioFinal()));
                    break;
            }
        }
        System.out.println("");
        for (int i = 0; i < listaDeAlquileres.size(); i++) {
            System.out.println("C L I E N T E   "+(i+1));
            System.out.println(listaDeAlquileres.get(i).toString()+"\nCantidad de dias de ocuapcion "+listaDeAlquileres.get(i).diasDeOcpuacion()+"\nEl preio final es "+listaDeAlquileres.get(i).getPrecioFinal());
            System.out.println("");
            segundo();
        }
        

    }
    private static void segundo() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
