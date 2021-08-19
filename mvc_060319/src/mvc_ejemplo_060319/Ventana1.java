/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_ejemplo_060319;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Ventana1 {
    private Scene escena;
    private GridPane layout;
    private Button boton;

    public Ventana1() {
        this.layout = new GridPane();
        TextField txtF1 = new TextField();
        Text txt1 = new Text("Nombre de Usuario: ");
        TextField txtF2 = new TextField();
        Text txt2 = new Text("Correo: ");
        TextField txtF3 = new TextField();
        Text txt3 = new Text("Otro: ");
        
        this.boton = new Button("Siguiente");
        this.layout.getChildren().add(txt1);
        this.layout.getChildren().add(txtF1);
        this.layout.getChildren().add(txt2);
        this.layout.getChildren().add(txtF2);
        this.layout.getChildren().add(txt3);
        this.layout.getChildren().add(txtF3);

        this.layout.getChildren().add(boton);
        this.layout.setPadding(new Insets(20, 10, 10, 20));
        this.escena = new Scene(this.layout, 300,300);
    }

    public Scene getEscena() {
        return escena;
    }

    public GridPane getLayout() {
        return layout;
    }

    public Button getBoton() {
        return boton;
    }
    
    public void mostrar (Stage stage){
        stage.setTitle("Ventana 1");
        stage.setScene(escena);
        stage.show();
    }
    
    
}
