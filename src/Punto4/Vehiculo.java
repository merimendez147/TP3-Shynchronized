package Punto4;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 4 
 * Maria Mendez - Marcos Molina
 */


public abstract class Vehiculo implements Runnable{
	String patente;
	String modelo;
	String marca;

	
	public Vehiculo (String p, String mod, String m){
		patente=p;
		modelo=mod;
		marca=m;
	}

}
