package Punto1;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 1
 * Maria Mendez - Marcos Molina
 */

public class VerificarCuenta implements Runnable {
private CuentaBanco cb = new CuentaBanco();

private void HacerRetiro ( int cantidad) {
	synchronized (cb){
		if (cb.getBalance() >= cantidad){
		System.out.println ( Thread.currentThread().getName() + "está realizando un retiro de: " + cantidad + "." );
		cb.retiroBancario(cantidad);
		System.out.println(Thread.currentThread().getName() + ":Retiro realizado." );
		System.out.println(Thread.currentThread().getName() + ": Los fondos son de: " + cb.getBalance());
	} else {
		System.out.println( "No hay suficiente dinero en la cuenta para realizar el retiro Sr." + Thread.currentThread().getName());
		System.out.println( "Su saldo actual es de" + cb.getBalance());
	}}
	} // de hacer retiro

public void run () {
	for ( int i = 0 ; i <= 3 ; i++) {
		    this .HacerRetiro( 10 );
			if (cb.getBalance() < 0 ){
				System.out.println( "La cuenta está sobregirada." );
			}
}
}
}