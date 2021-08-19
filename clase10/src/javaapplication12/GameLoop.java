/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import com.sun.scenario.effect.Effect;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javax.sound.midi.Receiver;

/**
 *
 * @author Estudiante
 */
public class GameLoop extends AnimationTimer {
    
    private GraphicsContext gc;//Vista
    //private Rectangulo rectangulo;//Modelo
    private Carro carro;

    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
        //this.rectangulo = new Rectangulo(0, 200);
        this.carro = new Carro(0, 50);
    }
    
    @Override
    public void handle(long l) {
        gc.clearRect(0, 0, 300, 300);
        //gc.fillRect(this.rectangulo.getX(), this.rectangulo.getY(), 20, 20);
        //rectangulo.mover();
        double[] doublesx = {carro.getX()+18, carro.getX()+68};
        double[] doublesy = {carro.getY(), carro.getY()};
        gc.fillPolygon(doublesx, doublesy, 0);
        
    }
}
