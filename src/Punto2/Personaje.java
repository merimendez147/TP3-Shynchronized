package Punto2;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 2
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
