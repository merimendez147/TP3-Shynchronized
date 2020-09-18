package Punto3;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 3 - imprime ABBCCCABBCCC
 * Maria Mendez - Marcos Molina
 */
public class Letra implements Runnable{
	char letra;
	int id;
	BlocdeNotas unBloc;
	
	public Letra(char l, int id, BlocdeNotas b){
		this.letra =l;
		this.id=id;
		this.unBloc=b;
	}
	
	public void run(){
		while(true){
		unBloc.escribir(letra, id);}
	}
}
