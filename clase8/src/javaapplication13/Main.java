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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Llanta[] llantas = new Llanta[4];
        for (int i = 0; i < 4; i++){
            Llanta llanta = new Llanta("wheels", "x32", 100);
            llantas[i] = llanta;
        }
        
        ArrayList<Puerta> puertas = new ArrayList<>(2);
        for (int i = 0; i < 4; i++) {
            Puerta puerta = new Puerta("door");
            puertas.add(puerta);
        }
        
        Motor motor = new Motor("steam", 3);
        
        Automovil vehiculo = new Automovil("renault", 1999, "Sandero", llantas, motor, puertas);
        
        System.out.println("Informacion");
        System.out.println("Vehiculo: " + "\n" + "Marca: " + vehiculo.getMarca() + "\n" + "Modelo: " + vehiculo.getModelo() + '\n' + "Anyo: " + vehiculo.getAnyo());
        System.out.println("");
        
    }
    
}
