package E_4_SistemaDeVotacion;

public class Alumno {
    private String nombre;
    private String DNI;
    private int cantidadVotos;

    public Alumno(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.cantidadVotos = 0;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return  nombre + " - DNI: " + DNI + " - Votos: " + cantidadVotos +"\n";
    }  
    
}
