
package E_2_SalaDeCine;

import java.util.ArrayList;

public class Cine {
    private int numeroSalas;
    private String titulo;
    private double duracion;
    private int edadMinima;
    private String director;
    private ArrayList<Espectador> cliente;
    private String[][] sala;
    private double costoEntras;

    public Cine() {
    }

    public Cine(int numeroSalas, String titulo, double duracion, int edadMinima, String director, ArrayList<Espectador> cliente, String[][] sala, double costoEntras) {
        this.numeroSalas = numeroSalas;
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
        this.cliente = cliente;
        this.sala = sala;
        this.costoEntras = costoEntras;
    }

    public int getNumeroSalas() {
        return numeroSalas;
    }

  
    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<Espectador> getCliente() {
        return cliente;
    }

    public String[][] getSala() {
        return sala;
    }

    public double getCostoEntras() {
        return costoEntras;
    }

    @Override
    public String toString() {
        return "Cine{" + "numeroSalas=" + numeroSalas + ", titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + ", cliente=" + cliente + ", sala=" + sala + ", costoEntras=" + costoEntras + '}';
    }
    
    
    public String [] crearNombrePeli() {
        String [] peliculasNombre ={
            "El señor de los anillos: La comunidad del anillo",
            "Harry Potter y la piedra filosofal",
            "Shrek 2",
            "Avatar",
            "The Dark Knight",
            "Frozen",
            "Toy Story 3",
            "Los vengadores",
            "Parásitos",
            "El viaje de Chihiro",
            "Piratas del Caribe: La maldición de la Perla Negra",
            "Inception",
            "El lobo de Wall Street",
            "Mad Max: Furia en la carretera",
            "Spider-Man: Homecoming",
            "La la land",
            "Gladiator",
            "Joker",
            "Interstellar",
            "El discurso del rey"};
        return peliculasNombre;
    }
    public double[] crearDureacionPeli(){
        double [] peliculasDuracion ={
            2.58,2.32,1.45,2.42,2.32,1.42,1.43,
            2.23,2.12,2.05,2.23,2.28,3.00,2.00,
            2.13,2.08,2.35,2.02,2.49,1.58
        };
        return peliculasDuracion;
    }
    public int []crearEdadMinimaPeli(){
        int [] peliculasEdadMinima ={12,7,0,13,13,0,0,13,16,7,13,13,18,16,13,12,13,16,13,13};
        return peliculasEdadMinima;
    }
    public String[] crearDirectorPeli(){
        String [] peliculasDirector ={
            "Peter Jackson",
            "Chris Columbus",
            "Andrew Adamson, Kelly Asbury, Conrad Vernon",
            "James Cameron",
            "Christopher Nolan",
            "Chris Buck, Jennifer Lee",
            "Lee Unkrich",
            "Joss Whedon",
            "Bong Joon-ho",
            "Hayao Miyazaki",
            "Gore Verbinski",
            "Christopher Nolan",
            "Martin Scorsese",
            "George Miller",
            "Jon Watts",
            "Damien Chazelle",
            "Ridley Scott",
            "Todd Phillips",
            "Christopher Nolan",
            "Tom Hooper"};
        return peliculasDirector;
    }
       
    public double costoEntradas(){
        double costo = (int) (Math.random() * 100);
        return costo;
    }

   

}
