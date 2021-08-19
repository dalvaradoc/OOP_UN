/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class EjercicioRelaciones1 {

    public EjercicioRelaciones1() {
        
        Llanta[] llantas = new Llanta[4];
        for (int i = 0; i < 4; i++){
            llantas[i] = new Llanta();
        }
        
        Motor motor = new Motor();
        
        Carro carro1 = new Carro(llantas, motor, "Chevrolet");
        Carro carro2 = new Carro(llantas, motor, "Renault");
        
        ArrayList carros = new ArrayList();
        
        carros.add(carro1);
        carros.add(carro2);
        
        Persona persona = new Persona(carros);
        
        persona.showCarros ();
    }
    
}
