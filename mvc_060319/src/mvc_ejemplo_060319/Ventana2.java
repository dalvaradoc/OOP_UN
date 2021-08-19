/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_ejemplo_060319;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Ventana2 {
    private Scene escena;
    private GridPane layout;
    private Button boton;

    public Ventana2() {
        this.layout = new GridPane();
        this.boton = new Button("Volver");
        this.layout.getChildren().add(boton);
        this.escena = new Scene(this.layout, 300,300);
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public GridPane getLayout() {
        return layout;
    }

    public void setLayout(GridPane layout) {
        this.layout = layout;
    }

    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }
    
    public void mostrar (Stage stage){
        stage.setTitle("Ventana 2");
        stage.setScene(escena);
        stage.show();
    }
    
}
