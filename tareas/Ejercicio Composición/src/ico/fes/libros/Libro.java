/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libros;

import ico.fes.componentes.Autor;
import ico.fes.componentes.Editorial;

/**
 *
 * @author PC
 */
public class Libro {
    private String titulo;
    private int edicion;
    private int costo;
    private Autor nombreAutor;
    private Editorial nombreEditorial;

    public Libro() {
    }

    public Libro(String titulo, int edicion, int costo, Autor nombreautor, Editorial nombreEditorial) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.costo = costo;
        this.nombreAutor = nombreautor;
        this.nombreEditorial = nombreEditorial;
    }

    public Editorial getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(Editorial nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Autor getNombreautor() {
        return nombreAutor;
    }

    public void setNombreautor(Autor nombreautor) {
        this.nombreAutor = nombreautor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", edicion=" + edicion + ", costo=" + costo + ", nombreautor=" + nombreAutor + ", nombreEditorial=" + nombreEditorial + '}';
    }

    
    
   
}
