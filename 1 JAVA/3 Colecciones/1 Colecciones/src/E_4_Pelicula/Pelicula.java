package E_4_Pelicula;

public class Pelicula {
    
    private String titulo;
   private String director;
   private Double duracion;

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    public Double getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
}
