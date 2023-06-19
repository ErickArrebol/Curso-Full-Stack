package E_1_AdoptaUnPerro;

import java.util.Random;

/* @author Erick*/
public class Persona {

    private String nombre, apellido;
    private int edad;
    private String documento;
    private Perro animal;
    Random random = new Random();

    public Persona() {
    }
    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;

    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getDocumento() {
        return documento;
    }
    public Perro getAnimal() {
        return animal;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setAnimal(Perro animal) {
        this.animal = animal;
    }

    public String toString() {
        return "Datos de la Persona\n" + "Nombre: " + nombre + " " + apellido + "\nEdad: " + edad + " Documento=" + documento + "\n----------------------\n" + animal.toString();
    }
    
    public String nombres() {
        String[] nombres = {"Erick", "Pedro", "Francisco", "Alejandra", "Diego", "Gustavo", "Fran",
                            "Sofía", "Andrés", "María", "Carlos", "Laura", "Juan", "Ana", "Luis",
                            "Isabella", "Miguel", "Valentina", "José", "Paula"};

        return nombres[random.nextInt(nombres.length)];
    }

    public String apellidos() {
        String[] apellidos = {"Gracia", "Olascuaga", "Najera", "Lopez", "Martinez", "Gonzalez", "Ribeiro",
                             "Ramirez", "Fernandez", "Garcia", "Hernandez", "Sanchez", "Rodriguez", "Perez",
                              "Torres", "Gomez", "Vargas", "Silva", "Ortega", "Pacheco"};
        return apellidos[random.nextInt(apellidos.length)];
    }

    public int edades() {
        int edad;
        do {
            edad = random.nextInt(55);
        } while (edad < 18);

        return edad;
    }

    public String documentos() {
        String[] documento = {"AE50199", "AB40220", "FG30294", "TG40954", "ER64821", "MA31234", "DT74312",
                            "AE50199", "AB40220", "FG30294", "TG40954", "ER64821", "MA31234", "DT74312",
                            "PR50986", "LQ20562", "VC40875", "NK74251", "BX15268", "ZY30247", "JP40629"};
        return documento[random.nextInt(documento.length)];
    }

}
