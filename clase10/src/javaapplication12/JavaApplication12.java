/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.Panel;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class JavaApplication12 extends javafx.application.Application {

    /**
     * @param args the command line arguments
     */
    
    @Override
    public void start(Stage stage){
        
//        Group root = new Group();
//        Canvas canvas = new Canvas(300, 250);
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        
//        Carro carro = new Carro(0, 0);
//        
//        
//        root.getChildren().add(canvas);
//        stage.setTitle("Clase 10");
//        stage.setScene(new Scene(root));
//        stage.show();

        Group root = new Group();
        Canvas canvas = new Canvas(300,300);
        GraphicsContext gc = canvas.getGraphicsContext2D();        
        
        GameLoop juegoLoop = new GameLoop(gc);
        
        juegoLoop.start();
        
        root.getChildren().add(canvas);
        stage.setTitle("Clase 10");
        stage.setScene(new Scene(root));
        stage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
