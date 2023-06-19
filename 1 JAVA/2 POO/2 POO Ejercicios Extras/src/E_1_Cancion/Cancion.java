package E_1_Cancion;

public class Cancion {
    
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "C A N C I O N \n" + "Titulo: " + titulo + ", Autor: " + autor ;
    }
    
    
}
