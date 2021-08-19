/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.*;

/**
 *
 * @author Estudiante
 */
public class Carro extends Thing {
    private String placa;

    public Carro(City city, int i, int i1, String placa) {
        super(city, i, i1);
        this.placa = placa;
    }    

    public String getPlaca() {
        return placa;
    }
    
}
