package Punto2;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 2
 *  Maria Mendez - Marcos Molina
 */
public class Main {
	public static void main(String [] args){
		Vida unaVida= new Vida();
		Orco orco = new Orco("Orco", unaVida);
		Curandero curandero = new Curandero("Curandero", unaVida);
		Thread h1= new Thread(orco);
		Thread h2= new Thread(curandero);
		h1.start();
		h2.start();
	}
}
