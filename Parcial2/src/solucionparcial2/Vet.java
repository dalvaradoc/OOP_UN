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
public class Vet {
    private ArrayList<Pet> pets;

    public Vet() {
        pets = new ArrayList<>();
    }
    
    public boolean addPet (Pet pet){
        return pets.add(pet);
    }
    
    public boolean removePet (String id) {
        for (Pet p : pets){
            if (p.getId().equals(id)){
                return pets.remove(p);
            }
        }
        return false;
    }
    
    public void showPetsByType (String type) {
        for (Pet p : pets){
            if (p.getClass().getName().equals(type)){
                System.out.println(p.getName());
            }
        }
    }
    
    public void showPets () {
        for (Pet p : pets){
            System.out.println(p.getName());
        }
    }
    
    public boolean existsId (String id) {
        for (Pet p : pets){
            if (p.getId().equals(id)){
                System.out.println(pets);
                return true;
            }
        }
        return false;
    }
    
    
}
