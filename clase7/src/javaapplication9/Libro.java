/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private int paginas;
    private double calificacion;
    //Asociacion con cardinalidad 1
    private Autor autor;

    public Libro() {
    }

    public Libro(String titulo, int paginas, double calificacion) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }    
}
