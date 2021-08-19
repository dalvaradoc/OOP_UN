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
public class PruebaLibros {
    public static void main (String[] args){
        
        //Dependencia con clase Autor
        Autor autor1 = new Autor("Nombre1", "Apellido1");
        Autor autor2 = new Autor("Nombre2", "Apellido2");
        
        Autor autor3 = new Autor("Nombre3", "Apellido3");
        
        
        //Dependencia con clase Libro
        //Se crean dos libros
        Libro libro1 = new Libro("Titulo1", 100, 3.5);
        Libro libro2 = new Libro("Titulo2", 256, 4.8);
        
        Libro libro3 = new Libro("Titulo3", 300, 5);
        
        libro1.setAutor(autor1);
        libro2.setAutor(autor2);
        
        libro3.setAutor(autor3);
        
        //Deoendencia con clase ConjuntoLibro
        //Se crea el conjunto de libros
        ConjuntoLibro conjuntoL = new ConjuntoLibro();
        
        //Se añade libro1 al conjunto
        if (conjuntoL.añadirLibro(libro1)){
            System.out.println("Se ha anadido " + libro1.getTitulo() + " al conjunto");
        } else {
            System.out.println("No se ha podido anadir " + libro1.getTitulo() + " al conjunto");
        }
        
        //Se añade libro2 al conjunto
        if (conjuntoL.añadirLibro(libro2)){
            System.out.println("Se ha anadido " + libro2.getTitulo() + " al conjunto");
        } else {
            System.out.println("No se ha podido anadir " + libro2.getTitulo() + " al conjunto");
        }
        
        //Se elimina libro1 por titulo
        if (conjuntoL.eliminarLibroTitulo(libro1.getTitulo())){
            System.out.println("Se ha eliminado " + libro1.getTitulo() + " del conjunto");
        } else {
            System.out.println("No se ha podido eliminar " + libro1.getTitulo() + " del conjunto");
        }
        
        //Se elimina libro2 por autor
        if (conjuntoL.eliminarLibroAutor(libro2.getAutor())){
            System.out.println("Se ha eliminado " + libro2.getTitulo() + " del conjunto");
        } else {
            System.out.println("No se ha podido eliminar " + libro2.getTitulo() + " del conjunto");
        }
        
        
        //Se añade libro3 al conjunto
        if (conjuntoL.añadirLibro(libro3)){
            System.out.println("Se ha anadido " + libro3.getTitulo() + " al conjunto");
        } else {
            System.out.println("No se ha podido anadir " + libro3.getTitulo() + " al conjunto");
        }
        
        //Se muestra el contenido de conjuntoL
        for (int i = 0; i < 10; i++){
            if (conjuntoL.getLibros()[i] != null){
                System.out.println("Libro: " + conjuntoL.getLibros()[i].getTitulo() + "\n");
            }
        }
    }
}
