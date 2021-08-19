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
public class Persona {
    ArrayList<Carro> carros;

    public Persona(ArrayList carros) {
        this.carros = carros;
    }

    public ArrayList getCarros() {
        return carros;
    }
    
    public void showCarros () {
        for (int i = 0; i < carros.size(); i++){ 
            System.out.println("Carro " + i);
        }
    }
}
