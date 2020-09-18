package Punto2;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 2
 *  Maria Mendez - Marcos Molina
 */
public abstract class Personaje implements Runnable  {
	Vida unaVida;
	String personaje;
	
	public Personaje(String p, Vida v){
		unaVida=v;
		personaje=p;
	}

	public Vida getVida(){
		return unaVida;
	}
	
}
