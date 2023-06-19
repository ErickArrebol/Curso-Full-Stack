/*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.*/
package E_7_Auto;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Auto {
   
    private String nombre;
    private LocalDate fechaVencimientoCarnet;
    private String color;
    private String modelo;
    private int kmMotor;
    
    public Auto (String nombre,LocalDate fechaVencimientoCarnet,String color,String modelo){
        this.nombre = nombre;
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
        this.color = color;
        this.modelo = modelo;
        this.kmMotor = 7500;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaVencimientoCarnet() {
        return fechaVencimientoCarnet;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKmMotor() {
        return kmMotor;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setKmMotor(int kmMotor) {
        this.kmMotor = kmMotor;
    }

    @Override
    public String toString() {
        return "D A T O S   D E L   A U T O\n" + "Nombre del dueño " + nombre + "\nFecha de Vencimiento del Carnet " + fechaVencimientoCarnet + "\nColor " + color + "\nModelo " + modelo + "\nkm que tiene el Motor " + kmMotor;
    }
}
