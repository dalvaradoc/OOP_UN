/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodejavafx;


import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class EjemploGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

//Layout dentro de Layout
        
//        VBox vlayout = new VBox();
//        
//        HBox hlayout = new HBox();
//        
//        Button b1 = new Button("Boton 1");
//        Button b2 = new Button("Boton 2");
//        
//        hlayout.getChildren().add(b1);
//        hlayout.getChildren().add(b2);
//        
//        FileInputStream file = new FileInputStream("save.png");
//        Image image = new Image(file);
//        Button button3 = new Button("Save", new ImageView(image));
//        
//        vlayout.getChildren().add(hlayout);
//        vlayout.getChildren().add(button3);
//        
//        Scene scene = new Scene(vlayout,200,250);
//
//        primaryStage.setTitle("Titulo de la Ventana");
//        primaryStage.setScene(scene);
//        primaryStage.show();

//Tabla
//        TableView table = new TableView();
//        table.setEditable(true);
//        TableColumn c1 = new TableColumn("Columna 1");
//        TableColumn c2 = new TableColumn("Columna 2");
//        
//        table.getColumns().addAll(c1,c2);
//        
//        Scene sceneTabla = new Scene(table);

//        primaryStage.setTitle("Titulo de la Ventana");
//        primaryStage.setScene(sceneTabla);
//        primaryStage.show();


// GridPane ez
//        GridPane pane = new GridPane();
//        pane.setAlignment(Pos.CENTER);
//        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
//        pane.setHgap(5.5);
//        pane.setVgap(5.5);
//        
//        pane.add(new Label("First name: "), 0, 0);
//        pane.add(new TextField(), 1, 0);
//        pane.add(new Label("MI: "), 0, 1);
//        pane.add(new TextField(), 1, 1);
//        pane.add(new Label("Last name: "), 0, 2);
//        pane.add(new TextField(), 1, 2);
//        Button btAdd = new Button("Add Name");
//        pane.add(btAdd, 1, 3);
//        GridPane.setHalignment(btAdd, HPos.RIGHT);
//        
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("Titulo de la Ventana");
//        primaryStage.setScene(scene);
//        primaryStage.show();


//No funciono alv :'v
//        GridPane gridpane = new GridPane();
//        ColumnConstraints col1 = new ColumnConstraints();
//        col1.setPercentWidth(20);
//        ColumnConstraints col2 = new ColumnConstraints();
//        col2.setPercentWidth(30);
//        gridpane.getColumnConstraints().addAll(col1,col2,col2,col1);
//        
//        
//        Label text = new Label("Enter Address");
//        gridpane.add(text, 0, 0, 4, 0); // (Columna 0, Fila 0)and colspan 4
//        GridPane.setHalignment(text, HPos.CENTER);
//        Label direccion = new Label("Direccion");
//        gridpane.add(direccion, 0, 1, 1, 1); // (Columna 0, Fila 1) and colspan 1
//        GridPane.setHalignment(direccion, HPos.RIGHT);
//        TextField txtDireccion = new TextField();
//        gridpane.add(txtDireccion, 1, 1, 4, 1); // (Columna 0, Fila 1)and colspan 1
//        Label direccion2 = new Label("Direccion");
//        TextField txtDireccion2 = new TextField();
//        gridpane.add(direccion2, 0, 2, 1, 2); // (Columna 0, Fila 1)and colspan 1
//        gridpane.add(txtDireccion2, 1, 2, 4, 2); // (Columna 0, Fila 1)and colspan 1
        
//        Scene scene = new Scene(gridpane);
//        primaryStage.setTitle("Titulo de la Ventana");
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
