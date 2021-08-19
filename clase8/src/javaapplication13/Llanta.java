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
public class Llanta {
    private String marca;
    private String modelo;
    private int tamanoPulgadas;
    private Automovil vehiculo;
    
    public Llanta (){
        
    }

    public Llanta(String marca, String modelo, int tamanoPulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanoPulgadas = tamanoPulgadas;
    }

    public Llanta(String marca, String modelo, int tamanoPulgadas, Automovil vehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanoPulgadas = tamanoPulgadas;
        this.vehiculo = vehiculo;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamanoPulgadas() {
        return tamanoPulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanoPulgadas(int tamanoPulgadas) {
        this.tamanoPulgadas = tamanoPulgadas;
    }

    public Automovil getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Automovil vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
