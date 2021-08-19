package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio_parqueadero
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot robot;
        
	public static void main (String[] args){
            
            objetos = new City("Field Parqueadero.txt");
	    objetos.showThingCounts(true);
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            robot = new Robot(objetos,6, 7, Direction.WEST,10);
            
            move(6);
            rot(3);
            //revisarParqueadero(parqueadero1);

            Carro carro1 = new Carro(objetos, 6, 8, "BB853");
            
	}
        public static void rot(int giros){
            for (int i=0;i<giros;i++) {
                robot.turnLeft();
            }
        }
        public static void tomar(){
            if(robot.canPickThing())
               robot.pickThing();
        }
        public static void move(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                if(robot.frontIsClear()){
                    robot.move();
                }
        }
}

