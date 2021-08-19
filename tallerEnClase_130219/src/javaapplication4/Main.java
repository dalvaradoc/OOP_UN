/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import menu.Menu;

/**
 *
 * @author Estudiante
 * El main crea un objeto tipo Universidad y se le asigna el nombre del archivo
 * donde se guarda la informacion de las sedes. Luego se crea un objeto Menu que
 * es el encargado de toda la interfaz para que el usuario pueda interactuar
 * con el programa (mediante la consola).
 * Nota: el menu no permite modificar informacion de estudiantes, ya que para
 * guardar o cargar la informacion no son relevantes.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /*


    */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Universidad un = new Universidad("savefile.txt");
        
        Menu menu = new Menu(un);

    }
    
}
