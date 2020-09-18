package Punto4;
/*
 * Facultad de Informática
 * Programación Concurrente - Departamento de Programación - 2020
 * Trabajo práctico Nº 3 - Synchronized
 * Ejercicio Nº 4 
 * Maria Mendez - Marcos Molina
 */

public class Auto extends Vehiculo {
	int kmFaltantesParaElService;
	private double combustible;
	Surtidor surtidor;
	
	public Auto(String p, String mod, String m, int kmpServ, double c, Surtidor s){
		super(p, mod, m);
		kmFaltantesParaElService=kmpServ;
		combustible=c;
		surtidor=s;	
	}
	
	private boolean avanzar(){
		return combustible>10;
	}
	
	public void run(){
		while(true){
		while (avanzar()){
			combustible= combustible -0.29;
			kmFaltantesParaElService --;
			System.out.println(marca +" "+modelo+" avanzando");
		}
		System.out.println(marca +" "+modelo+" llego a la reserva se recomienda no avanzar");
		combustible=surtidor.cargar();
	}
}}
