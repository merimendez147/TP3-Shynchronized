package Punto2;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 2
 *  Maria Mendez - Marcos Molina
 */
public class Curandero extends Personaje {
	
	public Curandero(String p, Vida v){
		super(p, v);
	}
	
	public void run(){
		unaVida.darVida(3);
		}

}