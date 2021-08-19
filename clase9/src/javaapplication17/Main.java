/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.ArrayList;
import java.awt.*;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo e = new Equipo("U");
        Jugador j1 = new Jugador("V");
        boolean resultado = e.addJugador(j1);
        if (resultado){
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
        
        ArrayList<Jugador> lista = e.getJugadores();
        for (Jugador j : lista){
            System.out.println(j.getNombre());
        }
        
        //es lo mismo que escribir
        
        for (int i = 0; i < lista.size(); i++){
            Jugador j = lista.get(i);
            System.out.println(j.getNombre());
        }
        
        Equipo2 e2 = new Equipo2("UvU");
        Jugador2 j2 = new Jugador2(123, "uwu");
        
        boolean resultado2 = e2.addJugador(j2);
        if (resultado2){
            System.out.println("OKx2");
        } else {
            System.out.println("KOx2");
        }
        
        Collection jgs = e2.getJugadores().values();
        
        System.out.println(jgs);
        
        
    }
}
