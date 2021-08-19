package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase2
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            objetos = new City("Field2.txt");
	    objetos.showThingCounts(true);
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,0);
           
            for (int i = 0; i < 5; i++) {
                while(estudiante.canPickThing()){
                    tomar();
                }
                move(1);
            }
            girar(2);
            for (int i = 0; i < 4; i++) {
                move(1);
                dejar();
            }
            move(1);
            girar(3);
            for (int i = 0; i < 4; i++) {
                
                move(1);
                dejar();
            }
	}
        public static void girar(int giros){
            for (int i=0;i<giros;i++) {
                estudiante.turnLeft();
            }
        }
        public static void tomar(){
               estudiante.pickThing();
        }
        public static void dejar(){
               estudiante.putThing();
        }
        public static void move(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                if(estudiante.frontIsClear()){
                    estudiante.move();
                }
        }
}

