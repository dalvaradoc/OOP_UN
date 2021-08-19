/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Equipo2 {
    private String nombre;
    private HashMap<String, Jugador2> jugadores;
    
    //Otra manera de hacerlo
    Collection jgs;

    public Equipo2(String nombre) {
        this.nombre = nombre;
        this.jugadores = new HashMap<>();
        
        //Wea con Collection.        
//        for (int i = 0; i < jgs.size(); i++){
//            System.out.println("");
//        }
//        
//        //==
//        
//        for (Jugador jg : jgs){
//            System.out.println("");
//        }
    }
    
    
    public boolean addJugador (Jugador2 jugador){
        Jugador2 j = this.jugadores.put(jugador.getNombre(), jugador);
        if (j != null) {
            return true;
        }
        return false;
    }
//    public void addJugador (Jugador2 jugador) {
//        jugadores.put(jugador.getNombre(), jugador);
//    }

    public HashMap<String, Jugador2> getJugadores() {
        return jugadores;
    }
    
}
