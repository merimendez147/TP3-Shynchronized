package Punto2;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 2
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