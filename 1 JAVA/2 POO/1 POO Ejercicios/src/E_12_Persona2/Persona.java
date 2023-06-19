package E_12_Persona2;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private Date fechaNaciemiento;

    public Persona() {
    }
    public Persona(String nombre, Date fechaNaciemiento) {
        this.nombre = nombre;
        this.fechaNaciemiento = fechaNaciemiento;
    }
    public String getNombre() {
        return nombre;
    }
    public Date getFechaNaciemiento() {
        return fechaNaciemiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNaciemiento(Date fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }
    
    
}
