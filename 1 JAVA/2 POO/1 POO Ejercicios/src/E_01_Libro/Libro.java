package E_01_Libro;

/*@author Erick*/

public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int nPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int nPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }
    
}
