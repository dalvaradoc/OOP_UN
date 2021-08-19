/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Estudiante
 */
public class Dog extends Pet implements ILicensable {
    
    

    public Dog(String name, License license) {
        super(name);
    }

    

    @Override
    public License getLicense() {
        return 
    }

    @Override
    public void speak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
