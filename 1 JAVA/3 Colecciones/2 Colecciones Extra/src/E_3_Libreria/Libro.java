package E_3_Libreria;

public class Libro {
    private String tituloLibro; 
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    public Libro(String tituloLibro, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNúmeroEjemplares(int númeroEjemplares) {
        this.numeroEjemplares = númeroEjemplares;
    }

    public void setNúmeroEjemplaresPrestados(int númeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = númeroEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Titulo del Libro (" + tituloLibro + "), Autor (" + autor + "), Numero Ejemplares [" + numeroEjemplares + "], Numero de Ejemplares Prestados [" + numeroEjemplaresPrestados + "]";
    }
    
    public void prestamo() {
        if (numeroEjemplares - numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados++;
            System.out.println("Se ha realizado el préstamo del libro: " + tituloLibro);
        } else {
            System.out.println("No quedan ejemplares disponibles para prestar del libro: " + tituloLibro);
        }
    }

    public void devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            System.out.println("Se ha realizado la devolución del libro: " + tituloLibro);
        } else {
            System.out.println("No hay ejemplares prestados del libro: " + tituloLibro);
        }
    }
}
