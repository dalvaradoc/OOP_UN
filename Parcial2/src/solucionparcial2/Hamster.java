/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionparcial2;

/**
 *
 * @author Estudiante
 */
public class Hamster extends Pet {
    private double weight;

    public Hamster(double weight, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.weight = weight;
    }

    @Override
    public String sound() {
        return "";
    }
    
    @Override
    public String getInfo() {
        String info = "";
        info += "Hamster " + " " + this.getId() + " " + this.getName() + " " + this.getHairColor() + " " + this.weight;
        return info;
    }
    
}
