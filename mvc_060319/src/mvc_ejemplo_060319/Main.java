/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_ejemplo_060319;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        Modelo modelo = new Modelo();
        ControladorVentana1 ventana = new ControladorVentana1(modelo);
        
        ventana.mostrarVista();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
