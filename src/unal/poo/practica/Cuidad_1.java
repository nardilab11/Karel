package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Cuidad_1
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;

            
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Ciudad1.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            Recorrido();
	}
            public static void turnLeft3(){
            estudiante.turnLeft ();
            estudiante.turnLeft ();
            estudiante.turnLeft ();
            }
            public static void Recorrido(){
            turnLeft2();
            estudiante.move();
            RecorridoU();
            turnLeft3();
            move2();
            turnLeft2();
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
                    public static void RecorridoU(){
            for (int i = 0; i < 3; i++){
                turnLeft3();
            move3();
            }
        }
            
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}