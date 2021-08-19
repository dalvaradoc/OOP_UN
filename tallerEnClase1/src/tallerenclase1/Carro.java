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
public class Carro {
    private Llanta[] llantas;
    private Motor motor;
    private Chasis chasis;
    public Carro() {
        llantas = new Llanta[4];
    }

    public Carro(Llanta[] llantas, Motor motor, String marca) {
        this.llantas = llantas;
        this.motor = motor;
        this.chasis = new Chasis();
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }
    
    public void setLlantas(Llanta llanta) {
        for (int i = 0; i < llantas.length; i++){
            if (llantas[i] == null){
                llantas[i] = llanta;
            }
        }
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public Motor getMotor() {
        return motor;
    }


}
