/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Automovil {
    private String marca;
    private int anyo;
    private String modelo;
    
    private Llanta[] llantas;
    private Motor motor;
    private ArrayList<Puerta> puertas;

    public Automovil(String marca, int anyo, String modelo) {
        this.llantas = new Llanta[4];
        this.puertas = new ArrayList<>(2);
        this.marca = marca;
        this.anyo = anyo;
        this.modelo = modelo;
    }

    public Automovil(String marca, int anyo, String modelo, Llanta[] llantas, Motor motor, ArrayList<Puerta> puertas) {
        this.llantas = new Llanta[4];
        this.puertas = new ArrayList<Puerta>(2);
        this.marca = marca;
        this.anyo = anyo;
        this.modelo = modelo;
        this.llantas = llantas;
        this.motor = motor;
        this.puertas = puertas;
    }
    
    public Automovil() {
        llantas = new Llanta[4];
        puertas = new ArrayList<Puerta>(2);
    }

    public String getMarca() {
        return marca;
    }

    public int getAnyo() {
        return anyo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }
    
    public void setLlantas(Llanta llanta) {
        for (int i = 0; i < llantas.length; i++){
            if (llantas[i] == null){
                llantas[i] = llanta;
            }
        }
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setPuertas(ArrayList<Puerta> puertas) {
        this.puertas = puertas;
    }
    
    public void setPuertas(Puerta puerta) {
        this.puertas.add(puerta);
    }
    

    public Llanta[] getLlantas() {
        return llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public ArrayList<Puerta> getPuertas() {
        return puertas;
    }
    
}
