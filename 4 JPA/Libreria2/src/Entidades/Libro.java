package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long isbn;
    @Column(unique = true)
    private String titulo;
    private String letra;
    private Integer anio;
    private Integer ejemplares;
    private Integer ejemplares_prestados;
    private Integer ejemplares_restantes;
    private boolean alta;
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro( String titulo, String letra, Integer anio, Integer ejemplares, Integer ejemplares_prestados, Integer ejemplares_restantes, boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.letra = letra;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplares_prestados = ejemplares_prestados;
        this.ejemplares_restantes = ejemplares_restantes;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplares_prestados() {
        return ejemplares_prestados;
    }

    public void setEjemplares_prestados(Integer ejemplares_prestados) {
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public Integer getEjemplares_restantes() {
        return ejemplares_restantes;
    }

    public void setEjemplares_restantes(Integer ejemplares_restantes) {
        this.ejemplares_restantes = ejemplares_restantes;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro(" + "ISBN: " + isbn + ", Titulo: " + titulo + ", Año: " + anio  + ", Ejemplares Disponibles: " + ejemplares_restantes + ", Autor[" + autor.getNombre() + "], Editorial[" + editorial.getNombre() + "])";
    }

   

    
    
}
