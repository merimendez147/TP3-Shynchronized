package Punto4;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 4 
 * Maria Mendez - Marcos Molina
 */
public class Surtidor {

	public Surtidor(){
		
	}
	public synchronized double cargar(){
		System.out.println("Esta cargando el auto "+Thread.currentThread().getName());
		return 50.0;
		
	}
}