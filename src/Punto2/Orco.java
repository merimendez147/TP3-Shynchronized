package Punto2;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 2
 *  Maria Mendez - Marcos Molina
 */
public class Orco extends Personaje {
	
	public Orco(String p, Vida v){
		super(p, v);
	}
	
	public void run(){
		unaVida.quitarVida(3);
		
		}
}
