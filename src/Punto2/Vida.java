package Punto2;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 2
 * Maria Mendez - Marcos Molina
 */
public class Vida {
private int vida;
	Vida (){
		vida=10;
	}
	
	public synchronized void darVida(int v){
		if (vida >0 & vida <10){//Consideramos que si el personaje tiene la vida completa o esta muerto, entonces no podria curarse
		vida= vida +v;
		System.out.println("se da mas vida, vida restante:  "+vida);}
	}
	
	public synchronized void quitarVida(int v){
		if (vida >=v){
		vida = vida - v;
		System.out.println("se quita vida, vida restante: "+vida);}
		else{vida=0;}

	}
}
