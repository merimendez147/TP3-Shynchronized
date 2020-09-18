package Punto1;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 1
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