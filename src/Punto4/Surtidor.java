package Punto4;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 4 
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