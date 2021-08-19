package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase1
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            objetos = new City("Field1.txt");
	    objetos.showThingCounts(true);
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,0);
           girar(3);
           move(1);
            for (int i = 0; i < 2; i++) {
               girar(1);
               move(1); 
            }
            tomar();
            girar(2);
            for (int i = 0; i < 3; i++) {
               move(1); 
               girar(3);
            }
	}
        public static void girar(int giros){
            for (int i=0;i<giros;i++) {
                estudiante.turnLeft();
            }
        }
        public static void tomar(){
            if(estudiante.canPickThing())
               estudiante.pickThing();
        }
        public static void move(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                if(estudiante.frontIsClear()){
                    estudiante.move();
                }
        }
}

