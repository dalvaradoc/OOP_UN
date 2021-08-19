/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Estudiante
 */
public class Producto {
    
    private String nombre;
    private Tipo tipo;
    private double precioBase;
    private double precio;
    
    public static int cantidadActual;
    public static int productosMinimos;

    public Producto(String nombre, Tipo tipo, double precioBase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.precio = this.precioBase + (this.tipo.impuesto * this.precioBase);
    }
    
    
    
    
}
