package Punto1;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 1
 * Maria Mendez - Marcos Molina
 */

public class Main {
public static void main (String[] args) {
	VerificarCuenta vc = new VerificarCuenta();
	Thread Luis = new Thread(vc, "Luis" );
	Thread Manuel = new Thread(vc, "Manuel" );
	Luis.start();
	Manuel.start();
}
}