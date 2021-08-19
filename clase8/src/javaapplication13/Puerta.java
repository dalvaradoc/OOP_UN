/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Estudiante
 */
public class Puerta {
    private String tipo;
    private Automovil vehiculo;

    public Puerta() {
        
    }

    public Puerta(String tipo) {
        this.tipo = tipo;
    }

    public Puerta(String tipo, Automovil vehiculo) {
        this.tipo = tipo;
        this.vehiculo = vehiculo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setVehiculo(Automovil vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Automovil getVehiculo() {
        return vehiculo;
    }
    
    
    
}
