package solucionparcial2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public abstract class Pet {
    private String id;
    private String name;
    private String hairColor;
    
    private Person owner;

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }
    
    public boolean setOwner (Person person) {
        this.owner = owner;
        if (this.owner == null){
            return false;
        }
        return true;
    }
    
    public abstract String sound ();
    public abstract String getInfo ();
    
}
