package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ciudad_2
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;

            
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Ciudad2.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            Recorrido();
	}
            public static void turnLeft3(){
            estudiante.turnLeft ();
            estudiante.turnLeft ();
            estudiante.turnLeft ();
            }
            public static void Recorrido(){
            turnLeft3();
            RecorridoIda();
            estudiante.move();
            estudiante.pickThing();
            turnLeft2();
            RecorridoVuelta();
            }
            public static void turnLeft2(){
            estudiante.turnLeft ();
            estudiante.turnLeft ();
            }
            public static void move3(){
            estudiante.move ();
            estudiante.move ();
            estudiante.move ();
            }
            public static void move2(){
            estudiante.move ();
            estudiante.move ();
            }
            public static void RecorridoVuelta(){
            for (int i = 0; i < 3; i++){
            estudiante.move();
            turnLeft3();
            }
        }
            public static void RecorridoIda(){
            for (int i = 0; i < 2; i++){
            estudiante.move();
            estudiante.turnLeft();
            }
        }
            
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}
