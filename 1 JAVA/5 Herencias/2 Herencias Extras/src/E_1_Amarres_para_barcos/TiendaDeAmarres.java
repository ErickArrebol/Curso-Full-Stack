/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará*/
package E_1_Amarres_para_barcos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/* @author Erick*/
public class TiendaDeAmarres {

    private String nombre;
    private int documento;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolución;
    private int posiciónDelAmarre;
    private double diasDeOcupacion;
    private Barco barco;

    public TiendaDeAmarres() {
    }

    public TiendaDeAmarres(String nombre, int documento, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolución, int posiciónDelAmarre, double diasDeOcupacion, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolución = fechaDeDevolución;
        this.posiciónDelAmarre = posiciónDelAmarre;
        this.diasDeOcupacion = diasDeOcupacion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolución() {
        return fechaDeDevolución;
    }

    public int getPosiciónDelAmarre() {
        return posiciónDelAmarre;
    }

    public double getDiasDeOcupacion() {
        return diasDeOcupacion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    @Override
    public String toString() {
        return "TiendaDeAmarres{" + "nombre=" + nombre + ", documento=" + documento + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevoluci\u00f3n=" + fechaDeDevolución + ", posici\u00f3nDelAmarre=" + posiciónDelAmarre;//+ ", barco=" + barco + '}';
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Apartir de aquie METODOS manuales
    public void crearAlquiler() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa tu nombre: ");
        nombre = leer.next();
        System.out.print("Ingresa tu Documento: ");
        documento = leer.nextInt();
        System.out.println("Ingresa la fecha de Alquiler ");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        LocalDate fechaAl = LocalDate.of(anio, mes, dia);
        fechaDeAlquiler = fechaAl;
        System.out.println("Ingresa la fecha de Devolucion ");
        System.out.print("Dia: ");
        int diaD = leer.nextInt();
        System.out.print("Mes: ");
        int mesD = leer.nextInt();
        System.out.print("Año: ");
        int anioD = leer.nextInt();
        LocalDate fechaDV = LocalDate.of(anioD, mesD, diaD);
        fechaDeDevolución = fechaDV;
        System.out.print("Ingresa la posicion de amarre: ");
        posiciónDelAmarre = leer.nextInt();
        diasDeOcupacion();
    }

    public double diasDeOcupacion() {
        long dias = ChronoUnit.DAYS.between(fechaDeAlquiler, fechaDeDevolución);
        diasDeOcupacion = (double) dias;
        return diasDeOcupacion;
    }

   
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metodos Atomaticso

}
