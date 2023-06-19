package E_1_Alumnos;

public class Alumno {
    
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int dia,mes,anio;

    public Alumno() {
    }
    public Alumno(String nombre, String apellido, String nacionalidad, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

    public boolean containsKey(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
