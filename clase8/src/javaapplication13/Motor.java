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
public class Motor {
    private String numeroserie;
    private int cilindros;
    private Automovil vehiculo;

    public Motor() {
        
    }

    public Motor(String numeroserie, int cilindros) {
        this.numeroserie = numeroserie;
        this.cilindros = cilindros;
    }

    public Motor(String numeroserie, int cilindros, Automovil vehiculo) {
        this.numeroserie = numeroserie;
        this.cilindros = cilindros;
        this.vehiculo = vehiculo;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public Automovil getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Automovil vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}
