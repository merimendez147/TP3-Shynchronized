package Punto2;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 2
 * Maria Mendez - Marcos Molina
 */
public class Vida {
private int vida;
	Vida (){
		vida=10;
	}
	
	public  synchronized void darVida(int v){
		vida= vida + v;
		System.out.println("se da mas vida, vida restante:  "+vida);
	}
	
	public synchronized  void quitarVida(int v){
		vida = vida - v;
		System.out.println("se quita vida, vida restante: "+vida);
		}
		
}
