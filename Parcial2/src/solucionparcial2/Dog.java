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
public class Dog extends Pet{
    
    private String breed;

    public Dog(String breed, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.breed = breed;
    }

    @Override
    public String sound() {
        return "guau";
    }

    @Override
    public String getInfo() {
        String info = "";
        info += "Dog " + " " + this.getId() + " " + this.getName() + " " + this.getHairColor() + " " + this.breed;
        return info;
    }
    
}
