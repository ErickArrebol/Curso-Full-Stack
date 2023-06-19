package E_3_PolizasDeAutos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*@author Erick*/
public class GestionPolizaCuota {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Cuotas> cuota= new ArrayList<>();
    private List<Polizas> poliza= new ArrayList<>();  

    public GestionPolizaCuota(List<Cuotas> cuota, List<Polizas> poliza) {
        this.cuota = cuota;
        this.poliza = poliza;
    }

    public GestionPolizaCuota() {
    }

    public List<Cuotas> getCuota() {
        return cuota;
    }

    public List<Polizas> getPoliza() {
        return poliza;
    }

    @Override
    public String toString() {
        return "GestionPolizaCuota{" + "leer=" + leer + ", cuota=" + cuota + ", poliza=" + poliza + '}';
    }
    
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metodos de poliza *
    public int crearNumeroPoliza(){
        int numeroPoliza;
        String num;
        String numLetra = "5500";
        do {
             numeroPoliza = (int) (Math.random() * 10000);
             num =Integer.toString(numeroPoliza);
        } while (num.length()<4);
        numLetra =numLetra+num;
        numeroPoliza=Integer.parseInt(numLetra);
        return numeroPoliza;
    }
    public String fechaDeInicio(){
        LocalDateTime fecha = LocalDateTime.now();
        String inicio =(fecha.getDayOfMonth())+"-"+fecha.getMonth()+ "-"+fecha.getYear();
        return inicio;
    }
    public String fechaDeFin(){
        LocalDateTime fecha = LocalDateTime.now();
        String fin = (fecha.getDayOfMonth()-1)+"-"+fecha.getMonth()+ "-"+(fecha.getYear()+1);
        return fin;
    }
    public int mesnuslaidades(){
        int[] mensualidades = {1,3,6,12};
        int posicion = (int) (Math.random() * mensualidades.length);
        return mensualidades[posicion];
    }
    public double montoTotalAsegurado(){
        int montoAsegurado ;
        String opcion ="";
        do {
            montoAsegurado = (int) (Math.random() * 5000000);
            if(montoAsegurado>100000 && montoAsegurado<500000){
                opcion ="x";
            }
            
        } while (!opcion.equalsIgnoreCase("x"));
        return montoAsegurado;
    }
    public boolean coberturaGranizo(){
        boolean granizo;
        int opcion =(int) (Math.random() * 2)+1;
        if(opcion==1){
            granizo = true;
        }else{
            granizo = false;
        }
        return granizo;
    }
    public String covertura(){
        String []cobertura = {"Daños a Terceros","Basica","Amplia"};
        int opcion = (int) (Math.random() * cobertura.length);
        return cobertura[opcion];
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metdoso ded Cobertura*
    public double montototal(){
        double montoTotal;
        do {
            montoTotal = (double) (Math.random() * 30000);
        } while (montoTotal < 10000);
        return montoTotal;
    }
    public String fechaDeVencimiento(){
        LocalDateTime fecha = LocalDateTime.now();
        String fechaVencimiento =(fecha.getDayOfMonth()-1)+"-"+fecha.getMonth()+ "-"+(fecha.getYear()+1);
        return fechaVencimiento;
    }
    public String metdoDePago(){
       String [] pagoMetodo ={"Efectivo","Tarjeta","Cheque"};
        int posicion = (int) (Math.random() * pagoMetodo.length); 
        return pagoMetodo[posicion];
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void PolizaCuota() {
        int cantidadDeCuotas=mesnuslaidades();//este se guardara en poliza y cuotas
        double montoTotalDeLaCuota=montototal();
        String Vencimiento=fechaDeVencimiento(); 
        String formaDePago=metdoDePago();//este se guardara en poliza y cuotas
        cuota.add(new Cuotas(cantidadDeCuotas,montoTotalDeLaCuota,Vencimiento,formaDePago));
        int númeroDePóliza=crearNumeroPoliza();
        String inicio=fechaDeInicio();
        String fin=fechaDeFin();
        double montoTotalAsegurado=montoTotalAsegurado();
        boolean incluyeGranizo=coberturaGranizo();
        String tipoDeCobertura=covertura();
        poliza.add(new Polizas (númeroDePóliza,inicio,fin,cantidadDeCuotas,formaDePago,montoTotalAsegurado,incluyeGranizo,tipoDeCobertura));
          
    }

}
