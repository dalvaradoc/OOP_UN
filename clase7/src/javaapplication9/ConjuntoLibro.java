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
public class ConjuntoLibro {
    //Asociacion cardinalidad 10 (Tamano Maximo conocido)
    private Libro[] libros;

    public ConjuntoLibro() {
        //Liberando la memoria maxima
        this.libros = new Libro[10];
    }    
    
    public boolean añadirLibro (Libro libro){
        for (int i = 0; i < 10; i++){
            if (this.libros[i] == null){
                this.libros[i] = libro;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarLibroTitulo (String titulo) {
        for (int i = 0; i < 10; i++){
            if (this.libros[i] != null && this.libros[i].getTitulo().equals(titulo)){
                this.libros[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarLibroAutor (Autor autor) {
        for (int i = 0; i < 10; i++){
            if (this.libros[i] != null && this.libros[i].getAutor().equals(autor)){
                this.libros[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Libro buscarMejorCalificacion (){
        Libro bestLibro = this.libros[0];
        for (int i = 1; i < 10; i++){
            if (this.libros[i].getCalificacion() > bestLibro.getCalificacion()){
                bestLibro = this.libros[i];
            }
        }
        return bestLibro;
    }
    
    public Libro buscarPeorCalificacion (){
        Libro worstLibro = this.libros[0];
        for (int i = 1; i < 10; i++){
            if (this.libros[i].getCalificacion() < worstLibro.getCalificacion()){
                worstLibro = this.libros[i];
            }
        }
        return worstLibro;
    }
    
    public Libro[] getLibros () {
        return this.libros;
    }    
}
