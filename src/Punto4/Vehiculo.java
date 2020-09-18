package Punto4;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 4 
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
