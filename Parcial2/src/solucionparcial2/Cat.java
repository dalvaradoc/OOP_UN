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
public class Cat extends Pet {
    
    private boolean isHunter;

    public Cat(boolean isHunter, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }

    @Override
    public String sound() {
        return "miau";
    }
    
    @Override
    public String getInfo() {
        String info = "";
        info += "Cat " + " " + this.getId() + " " + this.getName() + " " + this.getHairColor() + " " + this.isHunter;
        return info;
    }
    
}
