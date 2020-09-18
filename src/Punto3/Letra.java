package Punto3;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 3 - imprime ABBCCCABBCCC
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
