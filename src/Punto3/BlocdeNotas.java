package Punto3;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 3 - imprime ABBCCCABBCCCABBCCC...
 * Maria Mendez - Marcos Molina
 */
public class BlocdeNotas {
private boolean [] turno;
private int contador=0; //cuenta la cantidad de letras que se imprimen

public BlocdeNotas(){
	turno = new boolean[3];
	turno [0] =true;
	//turno [1] =false;
	//turno [2]=false;
}

private void asignarTurno (int i){
	try {
	turno[i]=true;
	}catch (ArrayIndexOutOfBoundsException ex){
		turno[0]=true;
}}

private void quitarTurno(int i){
	turno[i]=false;
}

public synchronized void escribir(char l, int i){
	if (turno[i]) {
		if (contador == i){
			System.out.println(l);
			quitarTurno(i);
			asignarTurno(i+1);
			contador=0;
			} else {
				System.out.println(l);
				contador=contador +1;
		}}
}}
