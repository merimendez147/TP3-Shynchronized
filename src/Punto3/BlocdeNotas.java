package Punto3;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 3 - imprime ABBCCCABBCCCABBCCC...
 * @mariamendez
 */
public class BlocdeNotas {
private boolean [] turno;
private int contador=0;

public BlocdeNotas(){
	turno = new boolean[3];
	turno [0] =true;
	//turno [1] =false;
	//turno [2]=false;
}

public void asignarTurno (int i){
	try {
	turno[i]=true;
	}catch (ArrayIndexOutOfBoundsException ex){
		turno[0]=true;
}}

public void quitarTurno(int i){
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
		}
		}
}
}
