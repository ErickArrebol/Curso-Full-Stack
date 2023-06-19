package E_07_Persona;

/*@author Erick*/

public class Persona {
    
    private String nombre;
    private int edad;
    private String Sexo; //'H' hombre, 'M' mujer, 'O' otro
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String Sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.Sexo = Sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return Sexo;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
