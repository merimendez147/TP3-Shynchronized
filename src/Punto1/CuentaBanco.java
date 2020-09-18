package Punto1;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 1 
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