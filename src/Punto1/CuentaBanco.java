package Punto1;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 1 
 * Maria Mendez - Marcos Molina
 */

public class CuentaBanco {
	private int balance = 50 ;
	public CuentaBanco (){
	}
	public  int getBalance (){
		return balance;
	}
	public void retiroBancario ( int retiro){
		balance = balance - retiro;
	}
}