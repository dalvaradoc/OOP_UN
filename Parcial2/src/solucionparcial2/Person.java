/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionparcial2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Person {
    private String name;
    private String id;
    
    private ArrayList<Pet> pets;
    
    private Vet vet;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
        this.pets = new ArrayList<>();
    }
    
    public boolean addDog (String idpet, String namepet, String haircolorpet, String breed) throws IllegalArgumentException{
        if (existId(idpet)){
            return false;
        }
        Dog dog = new Dog(breed, idpet, namepet, haircolorpet);
        dog.setOwner(this);
        return pets.add(dog);
    }
    
    public boolean addCat (String idpet, String namepet, String haircolorpet, boolean ishunter){
        if (existId(idpet)){
            return false;
        }
        //Si el id ya existe manda error... if ()
        Cat cat = new Cat(ishunter, idpet, namepet, haircolorpet);
        cat.setOwner(this);
        return pets.add(cat);
    }
    
    public boolean addHamster (String idpet, String namepet, String haircolorpet, double weight){
        if (existId(idpet)){
            return false;
        }
        //Si el id ya existe manda error... if ()
        Hamster hamster = new Hamster(weight, idpet, namepet, haircolorpet);
        hamster.setOwner(this);
        return pets.add(hamster);
    }
    
    private boolean existId (String idpet) {
        if (vet.existsId(idpet)){
            System.out.println(pets);
            return true;
        }
        return false;
    }
    
    public void showPets () {
        for (Pet p : pets){
            System.out.println(p.getName());
        }
    }
    
    public String getInfo () {
        String info = "";
        info += this.name + " " + this.id;
        return info;
    }
    
    public boolean setVet (Vet v) {
        this.vet = v;
        if (this.vet == null){
            return false;
        }
        return true;
    }
    
    
}
