/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

/**
 *
 * @author Estudiante
 */
public class Parqueadero {
    private Carro[] carros = new Carro[5];
    private int cantidad;

    public Parqueadero() {
        cantidad = carros.length;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCarro(Carro carro) {
        this.carros[cantidad-1] = carro;
        cantidad++;
    }   
    
}
